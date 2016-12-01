package com.xpf.cateyesmovies.fragment;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.alibaba.fastjson.JSONObject;
import com.xpf.cateyesmovies.R;
import com.xpf.cateyesmovies.adapter.HotMoviesAdapter;
import com.xpf.cateyesmovies.common.BaseFragment;
import com.xpf.cateyesmovies.domain.HotMovieListViewBean;
import com.xpf.cateyesmovies.domain.HotMovieViewPagerBean;
import com.xpf.cateyesmovies.utils.AppNetConfig;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Call;

/**
 * Created by xpf on 2016/11/30 :)
 * Wechat:18091383534
 * Function:热映页面的Fragment
 */

public class HotMovieFragment extends BaseFragment {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    private List<HotMovieViewPagerBean.DataBean> datas;
    private HotMoviesAdapter adapter;
    private List<HotMovieListViewBean.DataBean.MoviesBean> moviesBean;

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

        getDataFromNet();
    }

    private void getDataFromNet() {

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

    class MyStringCallback extends StringCallback {

        @Override
        public void onError(Call call, Exception e, int id) {
            Log.e("TAG", "联网请求失败===" + e.toString());
        }

        @Override
        public void onResponse(String response, int id) {
            Log.e("TAG", "联网请求成功===" + response);
            processData(response);
        }
    }

    class MyStringCallback2 extends StringCallback {

        @Override
        public void onError(Call call, Exception e, int id) {
            Log.e("TAG", "联网请求失败2===" + e.toString());
        }

        @Override
        public void onResponse(String response, int id) {
            Log.e("TAG", "联网请求成功===" + response);
            processData2(response);
        }
    }

    private void processData2(String json) {
        HotMovieListViewBean hotMovieListViewBean = JSONObject.parseObject(json, HotMovieListViewBean.class);
        moviesBean = hotMovieListViewBean.getData().getMovies();

        if (moviesBean != null && moviesBean.size() > 0) { // 有数据
            adapter.setMoviesBean(moviesBean);
        } else {// 没有数据

        }
    }

    private void processData(String json) {
        HotMovieViewPagerBean hotMovieViewPagerBean = JSONObject.parseObject(json, HotMovieViewPagerBean.class);
        datas = hotMovieViewPagerBean.getData();

        if (datas != null && datas.size() > 0) { // 有数据

            adapter = new HotMoviesAdapter(mContext, datas);
            // 设置适配器
            recyclerView.setAdapter(adapter);

            GridLayoutManager manager = new GridLayoutManager(mContext, 1);
            recyclerView.setLayoutManager(manager);

        } else {// 没有数据

        }
    }
}
