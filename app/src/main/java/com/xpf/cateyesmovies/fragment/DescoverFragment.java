package com.xpf.cateyesmovies.fragment;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.xpf.cateyesmovies.R;
import com.xpf.cateyesmovies.common.BaseFragment;

/**
 * Created by xpf on 2016/11/30 :)
 * Wechat:18091383534
 * Function:发现页面的Fragment
 */

public class DescoverFragment extends BaseFragment {

    private TextView textView;

    @Override
    protected View initView() {
        Log.e("TAG", "发现页面的布局初始化了");
        View view = View.inflate(mContext, R.layout.fragment_descover, null);
        return view;
    }

    @Override
    public void initData() {
        super.initData();
        Log.e("TAG", "发现页面的数据初始化了");
    }
}
