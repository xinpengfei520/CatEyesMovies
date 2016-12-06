package com.xpf.cateyesmovies.fragment;

import android.content.Intent;
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
    private List<DescoverListBean.DataBean.FeedsBean> feedsBeanList;
    private DescoverListDataAdapter descoverListDataAdapter;

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
        getDataFromNet();
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
            Log.e("TAG", "联网请求DescoverListData失败===" + e.toString());
        }

        @Override
        public void onResponse(String response, int id) {
            Log.e("TAG", "联网请求DescoverListData成功===" + response);
            processData(response);
        }
    }

    private void processData(String json) {
        DescoverListBean descoverListBean = JSONObject.parseObject(json, DescoverListBean.class);
        feedsBeanList = descoverListBean.getData().getFeeds();
        if (feedsBeanList != null && feedsBeanList.size() > 0) {
            // 设置适配器
            descoverListDataAdapter = new DescoverListDataAdapter(mContext, feedsBeanList);
            recyclerView.setAdapter(descoverListDataAdapter);
            // 设置布局管理器
            GridLayoutManager manager = new GridLayoutManager(mContext, 4);
            // 设置跨度大小监听
            manager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                @Override
                public int getSpanSize(int position) {
                    if (position <= 3) { // 前四个跨列为1
                        return 1;
                    }
                    return 4; // 其他跨列为4
                }
            });
            recyclerView.setLayoutManager(manager);
        }
    }

}
