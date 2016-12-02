package com.xpf.cateyesmovies.ui;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by xpf on 2016/12/2 :)
 * Wechat:18091383534
 * Function:自定义屏蔽ViewPager的滑动事件
 */

public class NoScrollViewPager extends ViewPager {

    private boolean noScroll = false; // false表示不屏蔽,true表示屏蔽滑动

    // 对外提供set方法,在某些情况下动态的设置ViewPager的滑动与否
    public void setNoScroll(boolean noScroll) {
        this.noScroll = noScroll;
    }

    public NoScrollViewPager(Context context) {
        super(context);
    }

    public NoScrollViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void scrollTo(int x, int y) {
        super.scrollTo(x, y);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        if (noScroll) {
            return true; // 把事件消费了
        }
        return super.onTouchEvent(ev);
    }

    // 是否拦截子view的事件
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (noScroll) {
            return false; // 当屏蔽ViewPager的滑动时,对子View的事件不进行拦截,即让子View去消费事件
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public void setCurrentItem(int item) {
        super.setCurrentItem(item);
    }

    @Override
    public void setCurrentItem(int item, boolean smoothScroll) {
        super.setCurrentItem(item, smoothScroll);
    }
}
