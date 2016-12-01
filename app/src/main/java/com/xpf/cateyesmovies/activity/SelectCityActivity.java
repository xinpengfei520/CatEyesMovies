package com.xpf.cateyesmovies.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.xpf.cateyesmovies.R;
import com.xpf.cateyesmovies.adapter.CityListAdapter;
import com.xpf.cateyesmovies.ui.IndexView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

// 选择城市页面
public class SelectCityActivity extends Activity {

    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.et_input)
    EditText etInput;
    @BindView(R.id.listView)
    ListView listView;
    @BindView(R.id.indexView)
    IndexView indexView;
    private TextView tv_location;
    private CityListAdapter adapter;

    private List<String> city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_city);
        ButterKnife.bind(this);

        initView();
        initData();
        initListener();
    }

    private void initData() {
        city = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            city.add("北京");
        }
        adapter = new CityListAdapter(this, city);
        listView.setAdapter(adapter);
    }

    private void initView() {
        View cityHeadView = View.inflate(this, R.layout.city_head, null);
        tv_location = (TextView) cityHeadView.findViewById(R.id.tv_location);
        listView.addHeaderView(cityHeadView);
    }

    private void initListener() {

        // 设置输入框文本变化的监听
        etInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @OnClick(R.id.iv_back)
    public void onClick() {
        finish();
    }
}
