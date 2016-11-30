package com.xpf.cateyesmovies.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.flyco.tablayout.SegmentTabLayout;
import com.flyco.tablayout.listener.OnTabSelectListener;
import com.xpf.cateyesmovies.R;
import com.xpf.cateyesmovies.common.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by xpf on 2016/11/30 :)
 * Wechat:18091383534
 * Function:电影页面的Fragment
 */

public class MovieFragment extends BaseFragment {

    @BindView(R.id.viewPager)
    ViewPager viewPager;
    @BindView(R.id.tv_select_city)
    TextView tvSelectCity;
    @BindView(R.id.segTabLayout)
    SegmentTabLayout segTabLayout;
    @BindView(R.id.ll_search)
    LinearLayout llSearch;
    private String[] tlTitles = {"热映", "待映", "找片"};
    private List<BaseFragment> fragments = new ArrayList<>();

    @Override
    protected View initView() {
        View view = View.inflate(mContext, R.layout.fragment_movie, null);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void initData() {
        super.initData();
        Log.e("TAG", "电影页面的数据初始化了");

        segTabLayout.setTabData(tlTitles);
        initFragment();
        initListener();
    }

    private void initFragment() {

        fragments.add(new HotMovieFragment());
        fragments.add(new DelayMovieFragment());
        fragments.add(new FindMovieFragment());
    }

    private void initListener() {

        viewPager.setAdapter(new MyViewPagerAdapter(getFragmentManager()));

        // 设置Tab选择的监听
        segTabLayout.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                viewPager.setCurrentItem(position);
            }

            @Override
            public void onTabReselect(int position) {

            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                segTabLayout.setCurrentTab(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        viewPager.setCurrentItem(1);
    }

    class MyViewPagerAdapter extends FragmentPagerAdapter {

        public MyViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tlTitles[position];
        }
    }

    @OnClick({R.id.tv_select_city, R.id.ll_search})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_select_city:
                break;
            case R.id.ll_search:
                break;
        }
    }
}
