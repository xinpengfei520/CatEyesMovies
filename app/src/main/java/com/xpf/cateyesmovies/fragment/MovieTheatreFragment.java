package com.xpf.cateyesmovies.fragment;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.flyco.tablayout.SegmentTabLayout;
import com.xpf.cateyesmovies.R;
import com.xpf.cateyesmovies.activity.SearchActivity;
import com.xpf.cateyesmovies.activity.SelectCityActivity;
import com.xpf.cateyesmovies.common.BaseFragment;
import com.xpf.cateyesmovies.utils.AppNetConfig;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;

/**
 * Created by xpf on 2016/11/30 :)
 * Wechat:18091383534
 * Function:影院页面的Fragment
 */

public class MovieTheatreFragment extends BaseFragment {

    @BindView(R.id.tv_select_city)
    TextView tvSelectCity;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.segTabLayout)
    SegmentTabLayout segTabLayout;
    @BindView(R.id.iv_search)
    ImageView ivSearch;
    //    @BindView(R.id.filterView)
//    FilterView filterView;
    @BindView(R.id.smoothListView)
    ListView smoothListView;

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

        getTheatreDataFromNet();
    }

    // 联网获取影院数据
    private void getTheatreDataFromNet() {

        OkHttpUtils
                .get()
                .url(AppNetConfig.MOVIETHEATREURL)
                .build()
                .execute(new MyStringCallBack());
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

        // 设置适配器
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
