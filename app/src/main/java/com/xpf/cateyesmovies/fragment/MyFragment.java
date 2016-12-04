package com.xpf.cateyesmovies.fragment;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.xpf.cateyesmovies.R;
import com.xpf.cateyesmovies.common.BaseFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by xpf on 2016/11/30 :)
 * Wechat:18091383534
 * Function:我的页面的Fragment
 */

public class MyFragment extends BaseFragment {

    @BindView(R.id.iv_usericon)
    ImageView ivUsericon;
    @BindView(R.id.tv_login)
    TextView tvLogin;
    @BindView(R.id.tv_look)
    TextView tvLook;
    @BindView(R.id.looked)
    TextView looked;
    @BindView(R.id.tv_moviecommetn)
    TextView tvMoviecommetn;
    @BindView(R.id.tv_topic)
    TextView tvTopic;
    @BindView(R.id.tv_order)
    TextView tvOrder;
    @BindView(R.id.tv_noconsume)
    TextView tvNoconsume;
    @BindView(R.id.tv_nopay)
    TextView tvNopay;
    @BindView(R.id.tv_nocomment)
    TextView tvNocomment;
    @BindView(R.id.tv_backmoney)
    TextView tvBackmoney;
    @BindView(R.id.tv_mymessage)
    TextView tvMymessage;
    @BindView(R.id.tv_mycollection)
    TextView tvMycollection;
    @BindView(R.id.tv_vipcenter)
    TextView tvVipcenter;
    @BindView(R.id.tv_myachievement)
    TextView tvMyachievement;
    @BindView(R.id.tv_mywallet)
    TextView tvMywallet;
    @BindView(R.id.tv_banlance)
    TextView tvBanlance;
    @BindView(R.id.tv_mydiscount)
    TextView tvMydiscount;
    @BindView(R.id.tv_shoppingmall)
    TextView tvShoppingmall;
    @BindView(R.id.tv_setting)
    TextView tvSetting;

    @Override
    protected View initView() {
        Log.e("TAG", "我的页面的布局初始化了");
        View view = View.inflate(mContext, R.layout.fragment_my, null);
        ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public void initData() {
        super.initData();
        Log.e("TAG", "我的页面的数据初始化了");
    }

    @OnClick({R.id.iv_usericon, R.id.tv_login, R.id.tv_look, R.id.looked, R.id.tv_moviecommetn,
            R.id.tv_topic, R.id.tv_order, R.id.tv_noconsume, R.id.tv_nopay, R.id.tv_nocomment,
            R.id.tv_backmoney, R.id.tv_mymessage, R.id.tv_mycollection, R.id.tv_vipcenter,
            R.id.tv_myachievement, R.id.tv_mywallet, R.id.tv_banlance, R.id.tv_mydiscount,
            R.id.tv_shoppingmall, R.id.tv_setting})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_usericon:
                break;
            case R.id.tv_login:
                break;
            case R.id.tv_look:
                break;
            case R.id.looked:
                break;
            case R.id.tv_moviecommetn:
                break;
            case R.id.tv_topic:
                break;
            case R.id.tv_order:
                break;
            case R.id.tv_noconsume:
                break;
            case R.id.tv_nopay:
                break;
            case R.id.tv_nocomment:
                break;
            case R.id.tv_backmoney:
                break;
            case R.id.tv_mymessage:
                break;
            case R.id.tv_mycollection:
                break;
            case R.id.tv_vipcenter:
                break;
            case R.id.tv_myachievement:
                break;
            case R.id.tv_mywallet:
                break;
            case R.id.tv_banlance:
                break;
            case R.id.tv_mydiscount:
                break;
            case R.id.tv_shoppingmall:
                break;
            case R.id.tv_setting:
                break;
        }
    }
}
