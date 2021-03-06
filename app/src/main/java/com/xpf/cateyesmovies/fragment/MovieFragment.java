package com.xpf.cateyesmovies.fragment;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.flyco.tablayout.SegmentTabLayout;
import com.flyco.tablayout.listener.OnTabSelectListener;
import com.xpf.cateyesmovies.R;
import com.xpf.cateyesmovies.activity.SearchActivity;
import com.xpf.cateyesmovies.activity.SelectCityActivity;
import com.xpf.cateyesmovies.common.BaseFragment;
import com.xpf.cateyesmovies.ui.NoScrollViewPager;

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
    NoScrollViewPager viewPager;
    @BindView(R.id.tv_select_city)
    TextView tvSelectCity;
    @BindView(R.id.segTabLayout)
    SegmentTabLayout segTabLayout;
    @BindView(R.id.iv_search)
    ImageView ivSearch;
    private String[] tlTitles = {"热映", "待映", "找片"};
    private List<BaseFragment> fragments;
    private HotMovieFragment hotMovieFragment;

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
        fragments = new ArrayList<>();
        hotMovieFragment = new HotMovieFragment();
        fragments.add(hotMovieFragment);
        fragments.add(new DelayMovieFragment());
//        fragments.add(new FindMovieFragment());
        fragments.add(new FindingFragment());
    }

    private void initListener() {

        // 设置hotMovieFragment里面ListView滑动状态改变的监听
        hotMovieFragment.setOnStateChangeListener(new HotMovieFragment.OnStateChangeListener() {
            @Override
            public void onChange(boolean isChange) {
                ivSearch.setVisibility(isChange ? View.VISIBLE : View.INVISIBLE);
            }
        });

        // 设置ViewPager的适配器
        viewPager.setAdapter(new MyViewPagerAdapter(getFragmentManager()));

        // 设置Tab指示器选择的监听
        segTabLayout.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                viewPager.setCurrentItem(position);
            }

            @Override
            public void onTabReselect(int position) {

            }
        });

        // 设置ViewPager页面改变的监听
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                Log.e("TAG", "onPageScrolled===" + position);
            }

            @Override
            public void onPageSelected(int position) {
                segTabLayout.setCurrentTab(position);
                Log.e("TAG", "onPageSelected()===" + position);
                if (position == 1) {
                    viewPager.setNoScroll(true); // 屏蔽滑动
                } else {
                    viewPager.setNoScroll(false);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        viewPager.setCurrentItem(0); // 默认在第一页
    }

    // 设置ViewPager的滑动事件
    public void setViewPagerState(boolean isScroll) {
        viewPager.setNoScroll(isScroll);
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
            return fragments == null ? 0 : fragments.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tlTitles[position];
        }
    }

    @OnClick({R.id.tv_select_city, R.id.iv_search})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_select_city:
                startActivity(new Intent(mContext, SelectCityActivity.class));
                break;
            case R.id.iv_search:
                startActivity(new Intent(mContext, SearchActivity.class));
                break;
        }
    }

}
