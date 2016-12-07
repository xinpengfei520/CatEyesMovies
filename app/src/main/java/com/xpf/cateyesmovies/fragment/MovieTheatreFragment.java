package com.xpf.cateyesmovies.fragment;

import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.flyco.tablayout.SegmentTabLayout;
import com.google.gson.Gson;
import com.xpf.cateyesmovies.R;
import com.xpf.cateyesmovies.activity.SearchActivity;
import com.xpf.cateyesmovies.activity.SelectCityActivity;
import com.xpf.cateyesmovies.adapter.MovieTheatreDataAdapter;
import com.xpf.cateyesmovies.common.BaseFragment;
import com.xpf.cateyesmovies.domain.CinemaContainer;
import com.xpf.cateyesmovies.ui.adapter.TravelingAdapter;
import com.xpf.cateyesmovies.ui.model.FilterData;
import com.xpf.cateyesmovies.ui.model.FilterEntity;
import com.xpf.cateyesmovies.ui.model.FilterTwoEntity;
import com.xpf.cateyesmovies.ui.model.ModelUtil;
import com.xpf.cateyesmovies.ui.model.TravelingEntity;
import com.xpf.cateyesmovies.ui.view.FilterView;
import com.xpf.cateyesmovies.ui.view.HeaderFilterView;
import com.xpf.cateyesmovies.ui.view.SmoothListView;
import com.xpf.cateyesmovies.utils.AppNetConfig;
import com.xpf.cateyesmovies.utils.DensityUtil;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;

/**
 * Created by xpf on 2016/11/30 :)
 * Wechat:18091383534
 * Function:影院页面的Fragment
 */

public class MovieTheatreFragment extends BaseFragment implements SmoothListView.ISmoothListViewListener {
    @BindView(R.id.tv_select_city)
    TextView tvSelectCity;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.segTabLayout)
    SegmentTabLayout segTabLayout;
    @BindView(R.id.iv_search)
    ImageView ivSearch;
    @BindView(R.id.filterView)
    FilterView filterView;
    @BindView(R.id.smoothListView)
    SmoothListView smoothListView;
    private MovieTheatreDataAdapter adapter;
    private List<CinemaContainer.Databean.Chaoyangbean> chaoyang;
    private int mScreenHeight; // 屏幕高度
    private TravelingAdapter mAdapter; // 主页数据
    private List<TravelingEntity> travelingList = new ArrayList<>(); // ListView数据
    private HeaderFilterView headerFilterView; // 分类筛选视图
    private int filterPosition = -1;    // 点击FilterView的位置：分类(0)、品牌(1)、好评(2)、特色(3)
    private boolean isSmooth = false;   // 没有吸附的前提下，是否在滑动
    private boolean isStickyTop = false;// 是否吸附在顶部
    private int filterViewPosition = 4; // 筛选视图的位置
    private int titleViewHeight = 65;   // 标题栏的高度
    private int filterViewTopMargin;    // 筛选视图距离顶部的距离
    private FilterData filterData;      // 筛选数据

    @Override
    protected View initView() {
        Log.e("TAG", "影院页面的布局初始化了");
        View view = View.inflate(mContext, R.layout.fragment_theatre, null);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void initData() {
        super.initData();
        Log.e("TAG", "影院页面的数据初始化了");
        segTabLayout.setVisibility(View.GONE);
        tvTitle.setText("影院");
        ivSearch.setVisibility(View.VISIBLE);

        mScreenHeight = DensityUtil.getWindowHeight(getActivity());
        // 设置假FilterView数据
        headerFilterView = new HeaderFilterView(getActivity());
        headerFilterView.fillView(new Object(), smoothListView);
        // ListView数据
        travelingList = ModelUtil.getTravelingData();
        // 筛选数据
        filterData = new FilterData();
        filterData.setCategory(ModelUtil.getCategoryData());
        filterData.setSorts(ModelUtil.getSortData());
        filterData.setFilters(ModelUtil.getFilterData());
        // 设置真FilterView数据
        filterView.setFilterData(getActivity(), filterData);
        filterView.setVisibility(View.GONE);
        // 设置ListView数据
        mAdapter = new TravelingAdapter(mContext, travelingList);
        smoothListView.setAdapter(mAdapter);
        filterViewPosition = smoothListView.getHeaderViewsCount() - 1;
        initListener();
        getTheatreDataFromNet();
    }

    private void initListener() {

        // (假的ListView头部展示的)筛选视图点击
        headerFilterView.setOnFilterClickListener(new HeaderFilterView.OnFilterClickListener() {
            @Override
            public void onFilterClick(int position) {
                filterPosition = position;
                isSmooth = true;
                smoothListView.smoothScrollToPositionFromTop(filterViewPosition, DensityUtil.dp2px(mContext, titleViewHeight));
            }
        });

        // (真正的)筛选视图点击
        filterView.setOnFilterClickListener(new FilterView.OnFilterClickListener() {
            @Override
            public void onFilterClick(int position) {
                if (isStickyTop) {
                    filterPosition = position;
                    filterView.show(position);
                    if (titleViewHeight - 3 > filterViewTopMargin || filterViewTopMargin > titleViewHeight + 3) {
                        smoothListView.smoothScrollToPositionFromTop(filterViewPosition, DensityUtil.dp2px(mContext, titleViewHeight));
                    }
                }
            }
        });

        // 分类Item点击
        filterView.setOnItemCategoryClickListener(new FilterView.OnItemCategoryClickListener() {
            @Override
            public void onItemCategoryClick(FilterTwoEntity leftEntity, FilterEntity rightEntity) {
                fillAdapter(ModelUtil.getCategoryTravelingData(leftEntity, rightEntity));
            }
        });

        // 排序Item点击
        filterView.setOnItemSortClickListener(new FilterView.OnItemSortClickListener() {
            @Override
            public void onItemSortClick(FilterEntity entity) {
                fillAdapter(ModelUtil.getSortTravelingData(entity));
            }
        });

        // 筛选Item点击
        filterView.setOnItemFilterClickListener(new FilterView.OnItemFilterClickListener() {
            @Override
            public void onItemFilterClick(FilterEntity entity) {
                fillAdapter(ModelUtil.getFilterTravelingData(entity));
            }
        });
    }

    // 填充数据
    private void fillAdapter(List<TravelingEntity> list) {
        if (list == null || list.size() == 0) {
            smoothListView.setLoadMoreEnable(false);
            int height = mScreenHeight - DensityUtil.dp2px(mContext, 95); // 95 = 标题栏高度 ＋ FilterView的高度
            mAdapter.setData(ModelUtil.getNoDataEntity(height));
        } else {
            smoothListView.setLoadMoreEnable(list.size() > TravelingAdapter.ONE_REQUEST_COUNT);
            mAdapter.setData(list);
        }
    }

    // 联网获取影院数据
    private void getTheatreDataFromNet() {

        OkHttpUtils
                .get()
                .url(AppNetConfig.MOVIETHEATREURL)
                .build()
                .execute(new MyStringCallBack());
    }

    // 下拉刷新
    @Override
    public void onRefresh() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                smoothListView.stopRefresh();
                smoothListView.setRefreshTime("刚刚"); // 设置刷新时间,计算当前系统的时间
                Toast.makeText(mContext, "刷新成功", Toast.LENGTH_SHORT).show();
            }
        }, 2000);
    }

    // 加载更多
    @Override
    public void onLoadMore() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                smoothListView.stopLoadMore();
                Toast.makeText(mContext, "加载更多成功", Toast.LENGTH_SHORT).show();
            }
        }, 2000);
    }

    class MyStringCallBack extends StringCallback {

        @Override
        public void onError(Call call, Exception e, int id) {
            Log.e("TAG", "联网请求TheatreData失败===" + e.toString());
        }

        @Override
        public void onResponse(String response, int id) {
            Log.e("TAG", "联网请求TheatreData成功===" + response);
            processData(response);
        }
    }

    private void processData(String json) {
        // 解析数据
        CinemaContainer cinemaContainer = new Gson().fromJson(json, CinemaContainer.class);
        chaoyang = cinemaContainer.getData().getChaoyang();
        if (chaoyang != null && chaoyang.size() > 0) {
            // 设置适配器
            adapter = new MovieTheatreDataAdapter(mContext, chaoyang);
            smoothListView.setAdapter(adapter);
        }
    }

    @OnClick({R.id.tv_select_city, R.id.iv_search})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_select_city:
                startActivity(new Intent(mContext, SelectCityActivity.class));
                break;
            case R.id.iv_search:
                startActivity(new Intent(mContext, SearchActivity.class));
                break;
        }
    }

}
