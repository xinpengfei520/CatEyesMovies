package com.xpf.cateyesmovies.fragment;

import android.util.Log;
import android.view.View;
import android.widget.ListView;

import com.alibaba.fastjson.JSONObject;
import com.meetme.android.horizontallistview.HorizontalListView;
import com.xpf.cateyesmovies.R;
import com.xpf.cateyesmovies.adapter.BestWishMoiveAdapter;
import com.xpf.cateyesmovies.adapter.DelayMoviesListAdapter;
import com.xpf.cateyesmovies.common.BaseFragment;
import com.xpf.cateyesmovies.domain.DelayBestWishMovieBean;
import com.xpf.cateyesmovies.domain.DelayMovieListBean;
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
 * Function:待映页面的Fragment
 */

public class DelayMovieFragment extends BaseFragment {

    @BindView(R.id.lv_delay)
    ListView lvDelay;
    private ListView lv_recommend;
    private HorizontalListView lv_bestWish;
    private DelayMoviesListAdapter delayMoviesListAdapter;
    private BestWishMoiveAdapter bestWishMoiveAdapter;
    private List<DelayMovieListBean.DataBean.ComingBean> comingMovieBean;
    private List<DelayBestWishMovieBean.DataBean.MoviesBean> bestWishmovies;

    @Override
    protected View initView() {
        Log.e("TAG", "待映页面的布局初始化了");
        View view = View.inflate(mContext, R.layout.fragment_delaymovie, null);
        ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public void initData() {
        super.initData();
        Log.e("TAG", "待映页面的数据初始化了");


        // 给ListView添加推荐头布局(暂无数据)
//        View RecommendView = View.inflate(mContext, R.layout.delayrecommend_head, null);
//        lv_recommend = (ListView) RecommendView.findViewById(R.id.lv_recommend);
//        lvDelay.addHeaderView(RecommendView);
//
        // 给ListView添加最受期待的头布局
        View BestWishView = View.inflate(mContext, R.layout.recentbestwishmovies, null);
        lv_bestWish = (HorizontalListView) BestWishView.findViewById(R.id.lv_bestWish);
        lvDelay.addHeaderView(BestWishView);

        // 设置当lv_bestWish滑动到第一个或者最后一个的时候取消ViewPager屏蔽
        // 应该考虑滑动的方向和滑动的变量,参考“北京新闻”中的处理

        getDelayDataFromNet();
    }

    // 联网获取待映数据
    private void getDelayDataFromNet() {

        // 待映
        OkHttpUtils
                .get()
                .url(AppNetConfig.DELAYMOVIEURL)
                .build()
                .execute(new MyStringCallback());

        // 最受期待的
        OkHttpUtils
                .get()
                .url(AppNetConfig.BESTWISHMOVIES)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Log.e("TAG", "联网请求BestWishData失败===" + e.toString());
                    }

                    @Override
                    public void onResponse(String response, int id) {
//                        Log.e("TAG", "联网请求BestWishData成功===" + response);
                        processBestWishData(response);
                    }
                });
    }

    // 解析最受期待的数据
    private void processBestWishData(String json) {

        DelayBestWishMovieBean delayBestWishMovieBean = JSONObject.parseObject(json, DelayBestWishMovieBean.class);
        bestWishmovies = delayBestWishMovieBean.getData().getMovies();
        if (bestWishmovies != null && bestWishmovies.size() > 0) {
            // 有数据
            bestWishMoiveAdapter = new BestWishMoiveAdapter(mContext, bestWishmovies);
            // 设置适配器
            lv_bestWish.setAdapter(bestWishMoiveAdapter);
        }
    }

    class MyStringCallback extends StringCallback {

        @Override
        public void onError(Call call, Exception e, int id) {
            Log.e("TAG", "联网请求DelayData失败===" + e.toString());
        }

        @Override
        public void onResponse(String response, int id) {
//            Log.e("TAG", "联网请求DelayData成功===" + response);
            processData(response);
            getRecommendDataFromNet();
        }
    }

    private void getRecommendDataFromNet() {
        OkHttpUtils
                .get()
                .url(AppNetConfig.DEARCOMMENTS)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Log.e("TAG", "RecommendData联网请求失败===" + e.toString());
                    }

                    @Override
                    public void onResponse(String response, int id) {
//                        Log.e("TAG", "RecommendData联网请求成功===" + response);
                        parseRecommendData(response);
                    }
                });
    }

    // 解析推荐数据
    private void parseRecommendData(String json) {

        // 推荐头数据有问题(预留)

    }

    // 解析数据
    private void processData(String json) {
        DelayMovieListBean delayMovieListBean = JSONObject.parseObject(json, DelayMovieListBean.class);
        comingMovieBean = delayMovieListBean.getData().getComing();

        if (comingMovieBean != null && comingMovieBean.size() > 0) {
            // 有数据
            delayMoviesListAdapter = new DelayMoviesListAdapter(mContext, comingMovieBean);
            // 设置适配器
            lvDelay.setAdapter(delayMoviesListAdapter);
        }
    }

}
