package com.xpf.cateyesmovies.fragment;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.alibaba.fastjson.JSONObject;
import com.bumptech.glide.Glide;
import com.xpf.cateyesmovies.R;
import com.xpf.cateyesmovies.adapter.HotMoviesListViewAdapter;
import com.xpf.cateyesmovies.common.BaseFragment;
import com.xpf.cateyesmovies.domain.HotMovieListViewBean;
import com.xpf.cateyesmovies.domain.HotMovieViewPagerBean;
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

public class HotMovieFragment extends BaseFragment {

    @BindView(R.id.listView)
    ListView listView;
    private Banner banner;
    private List<HotMovieViewPagerBean.DataBean> datas;
    private List<HotMovieListViewBean.DataBean.MoviesBean> moviesBean;
    private HotMoviesListViewAdapter adapter;

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


        View bannerView = View.inflate(mContext, R.layout.item_hotviewpager, null);
        banner = (Banner) bannerView.findViewById(R.id.banner);
        listView.addHeaderView(bannerView);

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
            adapter = new HotMoviesListViewAdapter(mContext, moviesBean);
//            adapter.setMoviesBean(moviesBean);
            // 设置适配器
            listView.setAdapter(adapter);
//            GridLayoutManager manager = new GridLayoutManager(mContext, 1);
//            recyclerView.setLayoutManager(manager);
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
}
