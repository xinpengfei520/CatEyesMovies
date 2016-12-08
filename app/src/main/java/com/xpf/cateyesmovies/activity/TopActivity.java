package com.xpf.cateyesmovies.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.xpf.cateyesmovies.R;
import com.xpf.cateyesmovies.adapter.TopMovieAdapter;
import com.xpf.cateyesmovies.domain.TopDataBean;
import com.xpf.cateyesmovies.ui.DividerItemDecoration;
import com.xpf.cateyesmovies.utils.AppNetConfig;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;

// 今日TOP100页面
public class TopActivity extends Activity {

    @BindView(R.id.tv_back)
    TextView tvBack;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    private List<TopDataBean.DataBean.MoviesBean> movies;
    private TopMovieAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top);
        ButterKnife.bind(this);

        bindData();
    }

    private void bindData() {
        OkHttpUtils
                .get()
                .url(AppNetConfig.TOPHUNDRED)
                .build()
                .execute(new MyStringCallBack());
    }

    class MyStringCallBack extends StringCallback {

        @Override
        public void onError(Call call, Exception e, int id) {

        }

        @Override
        public void onResponse(String response, int id) {
            processData(response);
        }
    }

    private void processData(String json) {
        TopDataBean topDataBean = new Gson().fromJson(json, TopDataBean.class);
        movies = topDataBean.getData().getMovies();
        if (movies != null && movies.size() > 0) {
            adapter = new TopMovieAdapter(this, movies);
            // 设置适配器
            recyclerView.setAdapter(adapter);

            // 设置布局管理器
            LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
            recyclerView.setLayoutManager(manager);

            // 设置RecyclerView的Item之间的分割线
            recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST));
        }
    }

    @OnClick(R.id.tv_back)
    public void onClick() {
        finish();
    }
}
