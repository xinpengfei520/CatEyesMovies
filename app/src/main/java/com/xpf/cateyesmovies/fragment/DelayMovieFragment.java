package com.xpf.cateyesmovies.fragment;

import android.graphics.Color;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.xpf.cateyesmovies.common.BaseFragment;

/**
 * Created by xpf on 2016/11/30 :)
 * Wechat:18091383534
 * Function:待映页面的Fragment
 */

public class DelayMovieFragment extends BaseFragment {

    private TextView textView;

    @Override
    protected View initView() {
        Log.e("TAG", "待映页面的布局初始化了");
        textView = new TextView(mContext);
        textView.setText("待映页面");
        textView.setTextColor(Color.RED);
        textView.setTextSize(30);
        textView.setGravity(Gravity.CENTER);
        return textView;
    }

    @Override
    public void initData() {
        super.initData();
        Log.e("TAG", "待映页面的数据初始化了");
    }
}
