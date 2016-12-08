package com.xpf.cateyesmovies.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.xpf.cateyesmovies.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

// 搜索页面
public class SearchActivity extends Activity {
    @BindView(R.id.et_input)
    EditText etInput;
    @BindView(R.id.ll_search)
    LinearLayout llSearch;
    @BindView(R.id.tv_cancel)
    TextView tvCancel;
    @BindView(R.id.ll_zhaopian)
    LinearLayout llZhaopian;
    @BindView(R.id.ll_yingren)
    LinearLayout llYingren;
    @BindView(R.id.ll_yingyuan)
    LinearLayout llYingyuan;
    @BindView(R.id.ll_xinwen)
    LinearLayout llXinwen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.ll_search, R.id.tv_cancel, R.id.ll_zhaopian, R.id.ll_yingren, R.id.ll_yingyuan, R.id.ll_xinwen})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ll_search:
                break;
            case R.id.tv_cancel:
                finish();
                break;
            case R.id.ll_zhaopian:
                break;
            case R.id.ll_yingren:
                break;
            case R.id.ll_yingyuan:
                break;
            case R.id.ll_xinwen:
                break;
        }
    }
}
