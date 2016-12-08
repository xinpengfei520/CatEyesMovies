package com.xpf.cateyesmovies.fragment;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.alibaba.fastjson.JSONObject;
import com.meetme.android.horizontallistview.HorizontalListView;
import com.xpf.cateyesmovies.R;
import com.xpf.cateyesmovies.activity.SearchActivity;
import com.xpf.cateyesmovies.adapter.AwardsMoviesAdapter;
import com.xpf.cateyesmovies.adapter.TagTextAdapter;
import com.xpf.cateyesmovies.common.BaseFragment;
import com.xpf.cateyesmovies.domain.FindAwardsMovieBean;
import com.xpf.cateyesmovies.utils.AppNetConfig;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;

/**
 * Created by xpf on 2016/11/30 :)
 * Wechat:18091383534
 * Function:找片页面的Fragment
 */

public class FindMovieFragment extends BaseFragment {

    @BindView(R.id.hz_ListView1)
    HorizontalListView hzListView1;
    @BindView(R.id.hz_ListView2)
    HorizontalListView hzListView2;
    @BindView(R.id.hz_ListView3)
    HorizontalListView hzListView3;
    @BindView(R.id.hz_ListView4)
    HorizontalListView hzListView4;
    List<String> typeString = new ArrayList<>();    // 类型
    List<String> destrictString = new ArrayList<>();// 地区
    List<String> timeString = new ArrayList<>();    // 年代
    @BindView(R.id.ll_search)
    LinearLayout llSearch;
    @BindView(R.id.ll_first)
    LinearLayout llFirst;
    @BindView(R.id.ll_two)
    LinearLayout llTwo;
    @BindView(R.id.ll_three)
    LinearLayout llThree;
    @BindView(R.id.ll_four)
    LinearLayout llFour;
    @BindView(R.id.tv_allAwards)
    TextView tvAllAwards;
    private TagTextAdapter tagTextAdapter;
    private List<FindAwardsMovieBean.DataBean> awardsDataBean;
    private AwardsMoviesAdapter awardsMoviesAdapter;

    @Override
    protected View initView() {
        Log.e("TAG", "找片页面的布局初始化了");
        View view = View.inflate(mContext, R.layout.fragment_findmovie, null);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void initData() {
        super.initData();
        Log.e("TAG", "找片页面的数据初始化了");

        initListener();
        inittypeString();
        initdestrictString();
        inittimeString();
        setData();
    }

    private void initListener() {
    }

    private void inittypeString() {
        typeString.add("类型");
        typeString.add("爱情");
        typeString.add("喜剧");
        typeString.add("动画");
        typeString.add("剧情");
        typeString.add("恐怖");
        typeString.add("惊悚");
        typeString.add("科幻");
        typeString.add("动作");
        typeString.add("悬疑");
        typeString.add("犯罪");
        typeString.add("冒险");
        typeString.add("战争");
        typeString.add("奇幻");
        typeString.add("运动");
        typeString.add("家庭");
        typeString.add("古装");
        typeString.add("武侠");
        typeString.add("西部");
        typeString.add("历史");
        typeString.add("传记");
        typeString.add("情色");
        typeString.add("歌舞");
        typeString.add("短片");
        typeString.add("纪录片");
        typeString.add("黑色电影");
        typeString.add("其他");
    }

    private void initdestrictString() {
        destrictString.add("地区");
        destrictString.add("大陆");
        destrictString.add("美国");
        destrictString.add("韩国");
        destrictString.add("日本");
        destrictString.add("中国香港");
        destrictString.add("中国台湾");
        destrictString.add("泰国");
        destrictString.add("印度");
        destrictString.add("法国");
        destrictString.add("英国");
        destrictString.add("俄罗斯");
        destrictString.add("意大利");
        destrictString.add("西班牙");
        destrictString.add("德国");
        destrictString.add("波兰");
        destrictString.add("澳大利亚");
        destrictString.add("伊朗");
        destrictString.add("其他");
    }

    private void inittimeString() {
        timeString.add("年代");
        timeString.add("2017以后");
        timeString.add("2017");
        timeString.add("2016");
        timeString.add("2015");
        timeString.add("2014");
        timeString.add("2013");
        timeString.add("2012");
        timeString.add("2011");
        timeString.add("2000-2010");
        timeString.add("90年代");
        timeString.add("80年代");
        timeString.add("70年代");
        timeString.add("更早");
    }

    private void setData() {
        if (typeString != null && typeString.size() > 0) {
            // 设置适配器
            tagTextAdapter = new TagTextAdapter(mContext, typeString);
            hzListView1.setAdapter(tagTextAdapter);
        }

        if (destrictString != null && destrictString.size() > 0) {
            // 设置适配器
            tagTextAdapter = new TagTextAdapter(mContext, destrictString);
            hzListView2.setAdapter(tagTextAdapter);
        }

        if (timeString != null && timeString.size() > 0) {
            // 设置适配器
            tagTextAdapter = new TagTextAdapter(mContext, timeString);
            hzListView3.setAdapter(tagTextAdapter);
        }
        getDataFromNet();
    }

    private void getDataFromNet() {
        OkHttpUtils
                .get()
                .url(AppNetConfig.FINDMOVIEAWARDSURL)
                .build()
                .execute(new MyStringCallback());
    }

    class MyStringCallback extends StringCallback {

        @Override
        public void onError(Call call, Exception e, int id) {
            Log.e("TAG", "联网请求失败===" + e.toString());
        }

        @Override
        public void onResponse(String response, int id) {
            Log.e("TAG", "联网请求成功===" + response);
            processData(response);
        }
    }

    // 解析获奖电影的数据
    private void processData(String json) {
        FindAwardsMovieBean findAwardsMovieBean = JSONObject.parseObject(json, FindAwardsMovieBean.class);
        awardsDataBean = findAwardsMovieBean.getData();
        if (awardsDataBean != null && awardsDataBean.size() > 0) {
            awardsMoviesAdapter = new AwardsMoviesAdapter(mContext, awardsDataBean);
            hzListView4.setAdapter(awardsMoviesAdapter);
        }
    }

    @OnClick({R.id.ll_search, R.id.ll_first, R.id.ll_two, R.id.ll_three, R.id.ll_four, R.id.tv_allAwards})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ll_search:
                startActivity(new Intent(mContext, SearchActivity.class));
                break;
            case R.id.ll_first:
                break;
            case R.id.ll_two:
                break;
            case R.id.ll_three:
                break;
            case R.id.ll_four:
                break;
            case R.id.tv_allAwards:
                break;
        }
    }
}
