package com.xpf.cateyesmovies.common;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by xpf on 2016/11/30 :)
 * Wechat:18091383534
 * Function:各个Fragment的基类
 */

public abstract class BaseFragment extends Fragment {

    protected Context mContext;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mContext = getActivity();
        return initView();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
    }

    // 由子类自己去实现自己的视图
    protected abstract View initView();

    // 当子类需要联网绑定数据到页面的时候去重写
    public void initData() {

    }
}
