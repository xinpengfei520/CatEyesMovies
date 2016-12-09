package com.xpf.cateyesmovies.fragment;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import com.alibaba.fastjson.JSONObject;
import com.xpf.cateyesmovies.R;
import com.xpf.cateyesmovies.activity.SearchActivity;
import com.xpf.cateyesmovies.adapter.DescoverListDataAdapter;
import com.xpf.cateyesmovies.common.BaseFragment;
import com.xpf.cateyesmovies.domain.DescoverListBean;
import com.xpf.cateyesmovies.ui.DividerItemDecoration;
import com.xpf.cateyesmovies.ui.update.CustomProgressDrawable;
import com.xpf.cateyesmovies.ui.update.CustomSwipeRefreshLayout;
import com.xpf.cateyesmovies.utils.AppNetConfig;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;

/**
 * Created by xpf on 2016/11/30 :)
 * Wechat:18091383534
 * Function:发现页面的Fragment
 */

public class DescoverFragment extends BaseFragment {
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.ll_search)
    LinearLayout llSearch;
    @BindView(R.id.refresh)
    CustomSwipeRefreshLayout refresh;
    private List<DescoverListBean.DataBean.FeedsBean> feedsBeanList;
    private DescoverListDataAdapter descoverListDataAdapter;
    private GridLayoutManager gridLayoutManager;
    private int offset = 10; // URL中的offset
    private boolean isLoadMore = false; // 是否加载更多

    @Override
    protected View initView() {
        Log.e("TAG", "发现页面的布局初始化了");
        View view = View.inflate(mContext, R.layout.fragment_descover, null);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void initData() {
        super.initData();
        Log.e("TAG", "发现页面的数据初始化了");
        initListener();
        getDataFromNet();
    }

    private void initListener() {
        CustomProgressDrawable mprogressview = new CustomProgressDrawable(mContext, refresh);
        mprogressview.setProgressResource(mContext, R.drawable.a_a);
        refresh.setProgressView(mprogressview, R.drawable.progress_bg);
        refresh.setOnRefreshListener(new CustomSwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (refresh.isRefreshing()) {
                            refresh.setRefreshing(false);
                        }
                    }
                }, 3000);
            }
        });

        // 设置RecyclerView滑动时的监听
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            // 当滑动状态改变的时候回调
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            // 当滑动的时候回调
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                // 获取总的Item数
                int totalItemCount = gridLayoutManager.getItemCount();
                // 获取最后一个可见的Item的位置(从0开始)
                int lastVisibleItem = gridLayoutManager.findLastVisibleItemPosition();
                Log.e("TAG", "totalItemCount===" + totalItemCount + ",lastVisibleItem" + lastVisibleItem);

                // 把当前最后一个可见的Item的位置传递过去
                descoverListDataAdapter.setCurrentMaxPosition(lastVisibleItem);
                isLoadMore = false;
                // 判断最后一个可见Item的位置是最后一个Item
                if (lastVisibleItem == totalItemCount - 1) {
                    // 设置加载类型的状态-->显示加载视图
                    descoverListDataAdapter.setCurrentState(101);
                    // 需不要刷新适配器 ?
                    if (!isLoadMore) {
                        getLoadMoreDataFromNet(); // 联网请求数据
                    }
                }
            }
        });
    }

    // 请求加载更多的联网请求
    private void getLoadMoreDataFromNet() {
        OkHttpUtils
                .get()
                .url((AppNetConfig.DESCOVERLISTDATA).replace("offset=0", "offset=" + offset))
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Log.e("TAG", "联网请求更多数据失败===" + e.toString());
                        descoverListDataAdapter.setCurrentState(102); // 当联网失败时,设置LoadMore类型的状态为error
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        Log.e("TAG", "联网请求MORE数据成功===" + response);
                        DescoverListBean descoverListBean2 = JSONObject.parseObject(response, DescoverListBean.class);
                        List<DescoverListBean.DataBean.FeedsBean> feedsBeen2 = descoverListBean2.getData().getFeeds();
                        if (feedsBeen2 != null && feedsBeen2.size() > 0) {
                            // 添加到之前的集合中去
                            descoverListDataAdapter.addData(feedsBeen2);
                            // 隐藏加载视图
                            descoverListDataAdapter.setCurrentState(103);
                            // 刷新适配器(也可以在适配器中刷新)
//                            descoverListDataAdapter.notifyDataSetChanged();

                        } else { //如果获取不到数据就设置LoadMore类型的状态为 no more data
                            descoverListDataAdapter.setCurrentState(103);
                        }
                    }
                });
        Log.e("TAG", "LoadMore URL===" + (AppNetConfig.DESCOVERLISTDATA).replace("offset=0", "offset=" + offset));
        offset += 10;      // 让url中的offset每次都加10
        isLoadMore = true; // 记录当前已经加载更多
    }

    private void getDataFromNet() {
        OkHttpUtils
                .get()
                .url(AppNetConfig.DESCOVERLISTDATA)
                .build()
                .execute(new MyStringCallBack());
    }

    @OnClick(R.id.ll_search)
    public void onClick() {
        startActivity(new Intent(mContext, SearchActivity.class));
    }

    class MyStringCallBack extends StringCallback {

        @Override
        public void onError(Call call, Exception e, int id) {
//            Log.e("TAG", "联网请求DescoverListData失败===" + e.toString());
        }

        @Override
        public void onResponse(String response, int id) {
//            Log.e("TAG", "联网请求DescoverListData成功===" + response);
            processData(response);
        }
    }

    private void processData(String json) {
        DescoverListBean descoverListBean = JSONObject.parseObject(json, DescoverListBean.class);
        feedsBeanList = descoverListBean.getData().getFeeds();
        if (feedsBeanList != null && feedsBeanList.size() > 0) {

            descoverListDataAdapter = new DescoverListDataAdapter(mContext, feedsBeanList);
            // 设置适配器
            recyclerView.setAdapter(descoverListDataAdapter);
            // 设置布局管理器
            gridLayoutManager = new GridLayoutManager(mContext, 4);
            // 设置跨度大小监听
            gridLayoutManager.setSpanSizeLookup(
                    new GridLayoutManager.SpanSizeLookup() {
                        @Override
                        public int getSpanSize(int position) {
                            if (position <= 3) { // 前四个跨列为1
                                return 1;
                            }
                            return 4; // 其他跨列为4
                        }
                    }
            );
            recyclerView.setLayoutManager(gridLayoutManager);
            recyclerView.addItemDecoration(new DividerItemDecoration(mContext, DividerItemDecoration.VERTICAL_LIST));
        }
    }

}
