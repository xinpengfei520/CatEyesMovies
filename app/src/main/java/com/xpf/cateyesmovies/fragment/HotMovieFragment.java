package com.xpf.cateyesmovies.fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.alibaba.fastjson.JSONObject;
import com.bumptech.glide.Glide;
import com.xpf.cateyesmovies.R;
import com.xpf.cateyesmovies.activity.SearchActivity;
import com.xpf.cateyesmovies.adapter.HotMoviesListViewAdapter;
import com.xpf.cateyesmovies.common.BaseFragment;
import com.xpf.cateyesmovies.domain.HotMovieListViewBean;
import com.xpf.cateyesmovies.domain.HotMovieViewPagerBean;
import com.xpf.cateyesmovies.ui.update.UpdateListView;
import com.xpf.cateyesmovies.utils.AppNetConfig;
import com.youth.banner.Banner;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerClickListener;
import com.youth.banner.listener.OnLoadImageListener;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Call;

/**
 * Created by xpf on 2016/11/30 :)
 * Wechat:18091383534
 * Function:热映页面的Fragment
 */

public class HotMovieFragment extends BaseFragment implements UpdateListView.UpdateDataListener {

    @BindView(R.id.listView)
    UpdateListView listView;
    private Banner banner;
    private LinearLayout ll_search;
    private List<HotMovieViewPagerBean.DataBean> datas;
    private List<HotMovieListViewBean.DataBean.MoviesBean> moviesBean;
    private HotMoviesListViewAdapter adapter;

    private static final int REFRESH_OK = 0;
    private static final int LOAD_OK = 1;

    @SuppressLint("HandlerLeak")
    private Handler mHandler = new Handler() {
        public void handleMessage(android.os.Message msg) {
            switch (msg.what) {
                case REFRESH_OK:
                    moviesBean.clear();
                    adapter.notifyDataSetChanged();
                    listView.setCurrentHeaderState(UpdateListView.UpdateViewState.REFRESH_DONE);
                    listView.refreshViewByRefreshingState();
                    break;
                case LOAD_OK:
                    break;
            }
        }
    };

    @Override
    protected View initView() {
        Log.e("TAG", "热映页面的布局初始化了");
        View view = View.inflate(mContext, R.layout.fragment_hotmovie, null);
        ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public void initData() {
        super.initData();
        Log.e("TAG", "热映页面的数据初始化了");

        // 给ListView添加搜索头布局
        View searchView = View.inflate(mContext, R.layout.common_search, null);
        ll_search = (LinearLayout) searchView.findViewById(R.id.ll_search);
        listView.addHeaderView(searchView);

        // 给ListView添加banner头布局
        View bannerView = View.inflate(mContext, R.layout.item_hotviewpager, null);
        banner = (Banner) bannerView.findViewById(R.id.banner);
        listView.addHeaderView(bannerView);

        initListener();
        getDataFromNet();
    }

    private void initListener() {

        // 设置ListView刷新的监听
        listView.setOnUpdateListener(this);

        // 设置搜索框的点击事件
        ll_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mContext, SearchActivity.class));
            }
        });

        // 设置listView滑动的监听
        listView.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {

            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                if (firstVisibleItem != 0) {
//                    MainActivity mainActivity = new MainActivity();
//                    mainActivity.setFirstShow(false);
                    if (onStateChangeListener != null) {
                        Log.e("TAG", "onScroll()===" + firstVisibleItem);
                        onStateChangeListener.onChange(true);
                    }
                }
            }
        });
    }

    private void getDataFromNet() {

        // 联网请求banner数据
        OkHttpUtils
                .get()
                .url(AppNetConfig.HOTMOVIEVIEWPAGERURL)
                .build()
                .execute(new MyStringCallback());

        OkHttpUtils
                .get()
                .url(AppNetConfig.HOTMOVIEURL)
                .build()
                .execute(new MyStringCallback2());
    }

    // 下拉刷新的回调
    @Override
    public void refreshing() {
        new Thread() {

            @Override
            public void run() {
                try {
                    sleep(3000);
                    mHandler.sendEmptyMessage(REFRESH_OK);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }.start();
    }

    // 加载更多的回调
    @Override
    public void loading() {

    }

    class MyStringCallback extends StringCallback {

        @Override
        public void onError(Call call, Exception e, int id) {
            Log.e("TAG", "联网请求失败===" + e.toString());
        }

        @Override
        public void onResponse(String response, int id) {
//            Log.e("TAG", "联网请求成功===" + response);
            processData(response);
        }
    }

    class MyStringCallback2 extends StringCallback {

        @Override
        public void onError(Call call, Exception e, int id) {
            Log.e("TAG", "联网请求失败===" + e.toString());
        }

        @Override
        public void onResponse(String response, int id) {
//            Log.e("TAG", "联网请求成功===" + response);
            processData2(response);
        }
    }

    private void processData2(String json) {
        HotMovieListViewBean hotMovieListViewBean = JSONObject.parseObject(json, HotMovieListViewBean.class);
        moviesBean = hotMovieListViewBean.getData().getMovies();

        if (moviesBean != null && moviesBean.size() > 0) { // 有数据
            adapter = new HotMoviesListViewAdapter(mContext, moviesBean);
            // 设置适配器
            listView.setAdapter(adapter);
        } else {// 没有数据

        }
    }

    private void processData(String json) {
        HotMovieViewPagerBean hotMovieViewPagerBean = JSONObject.parseObject(json, HotMovieViewPagerBean.class);
        datas = hotMovieViewPagerBean.getData();

        if (datas != null && datas.size() > 0) { // 有数据
            setData();

        } else {// 没有数据

        }
    }

    public void setData() {
        final List<String> imageUrls = new ArrayList<>();
        if (datas != null && datas.size() > 0) {
            for (int i = 0; i < datas.size(); i++) {
                imageUrls.add(datas.get(i).getImgUrl());
            }
        }

        // 设置BANNER的切换的样式
        banner.setBannerAnimation(Transformer.DepthPage);
        // 设置加载banner的图片显示
        banner.setImages(imageUrls, new OnLoadImageListener() {
            @Override
            public void OnLoadImage(ImageView view, Object url) {
                // 异步联网请求图片
                Glide.with(mContext).load(url).into(view);
            }
        });

        // 设置banner的点击事件
        banner.setOnBannerClickListener(new OnBannerClickListener() {
            @Override
            public void OnBannerClick(int position) {
                Toast.makeText(mContext, "position===" + position, Toast.LENGTH_SHORT).show();

                // 预留跳转到详情页面-------------
            }
        });
    }

    private OnStateChangeListener onStateChangeListener;

    public void setOnStateChangeListener(OnStateChangeListener onStateChangeListener) {
        this.onStateChangeListener = onStateChangeListener;
    }

    // 状态改变的监听器
    public interface OnStateChangeListener {
        // 当状态改变的时候回调
        void onChange(boolean isChange);
    }
}
