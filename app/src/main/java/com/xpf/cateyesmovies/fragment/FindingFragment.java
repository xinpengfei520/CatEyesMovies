package com.xpf.cateyesmovies.fragment;

import android.content.Intent;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

import com.google.gson.Gson;
import com.xpf.cateyesmovies.R;
import com.xpf.cateyesmovies.activity.SearchActivity;
import com.xpf.cateyesmovies.adapter.FindingPagerAdapter;
import com.xpf.cateyesmovies.common.BaseFragment;
import com.xpf.cateyesmovies.domain.FindTagDataBean;
import com.xpf.cateyesmovies.utils.AppNetConfig;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;

/**
 * Created by xpf on 2016/12/8 :)
 * GitHub:xinpengfei520
 * Function:找片页面的实现方式二:(RecyclerView)
 */

public class FindingFragment extends BaseFragment {

    @BindView(R.id.ll_search)
    LinearLayout llSearch;
    @BindView(R.id.mRecyclerView)
    RecyclerView mRecyclerView;
    private List<FindTagDataBean.DataBean> tagData;
    private FindingPagerAdapter findingPagerAdapter;

    @Override
    protected View initView() {
        View view = View.inflate(mContext, R.layout.fragment_finding, null);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void initData() {
        super.initData();

        getDataFromNet();
    }

    private void getDataFromNet() {
        OkHttpUtils
                .get()
                .url(AppNetConfig.FINDINGTAG)
                .build()
                .execute(new MyStringCallBack());
    }

    class MyStringCallBack extends StringCallback {

        @Override
        public void onError(Call call, Exception e, int id) {

        }

        @Override
        public void onResponse(String response, int id) {
            parseJson(response);
        }
    }

    private void parseJson(String json) {
        FindTagDataBean findTagDataBean = new Gson().fromJson(json, FindTagDataBean.class);
        tagData = findTagDataBean.getData();
        if (tagData != null && tagData.size() > 0) {
            findingPagerAdapter = new FindingPagerAdapter(mContext, tagData);
            // 设置适配器
            mRecyclerView.setAdapter(findingPagerAdapter);

            // 设置布局管理器
            GridLayoutManager manager = new GridLayoutManager(mContext, 2);
            manager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                @Override
                public int getSpanSize(int position) {
                    if (position < 3) {
                        return 2;
                    } else if (position < 7) {
                        return 1;
                    }
                    return 2;
                }
            });
            mRecyclerView.setLayoutManager(manager);
        }
    }

    @OnClick(R.id.ll_search)
    public void onClick() {
        startActivity(new Intent(mContext, SearchActivity.class));
    }
}
