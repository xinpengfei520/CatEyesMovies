package com.xpf.cateyesmovies.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.xpf.cateyesmovies.R;
import com.xpf.cateyesmovies.common.BaseFragment;
import com.xpf.cateyesmovies.fragment.DescoverFragment;
import com.xpf.cateyesmovies.fragment.MovieFragment;
import com.xpf.cateyesmovies.fragment.MovieTheatreFragment;
import com.xpf.cateyesmovies.fragment.MyFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends FragmentActivity {

    private static final int MESSAGE_BACK = 1;
    public static final String FRAGMENT_TAG = "moviefragment";
    @BindView(R.id.fl_container)
    FrameLayout flContainer;
    @BindView(R.id.rb_movie)
    RadioButton rbMovie;
    @BindView(R.id.rb_theatre)
    RadioButton rbTheatre;
    @BindView(R.id.rb_descover)
    RadioButton rbDescover;
    @BindView(R.id.rb_my)
    RadioButton rbMy;
    @BindView(R.id.rg_main)
    RadioGroup rgMain;

    private List<BaseFragment> fragments;
    private int currentPosition = 0; // 默认为位置为0
    private Fragment tempFragment; // 用于存储临时的Fragment

    private boolean isFlag = true;
    private Handler handler = new Handler() {
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case MESSAGE_BACK:
                    isFlag = true; // 在2s时,恢复isFlag的变量值
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initFragment();
        initListener();
        rgMain.check(R.id.rb_movie); // 默认选中电影页面
    }

    private void initFragment() {
        fragments = new ArrayList<>();
        fragments.add(new MovieFragment());
        fragments.add(new MovieTheatreFragment());
        fragments.add(new DescoverFragment());
        fragments.add(new MyFragment());
    }

    private void initListener() {
        rgMain.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_movie:
                        currentPosition = 0;
                        break;
                    case R.id.rb_theatre:
                        currentPosition = 1;
                        break;
                    case R.id.rb_descover:
                        currentPosition = 2;
                        break;
                    case R.id.rb_my:
                        currentPosition = 3;
                        break;
                }
                BaseFragment fragment = getFragmentByPosition(currentPosition);
                switchFragment(tempFragment, fragment);
            }
        });
    }

    private void switchFragment(Fragment fromFragment, Fragment toFragment) {

        if (tempFragment != toFragment) {
            tempFragment = toFragment;
            if (toFragment != null) {
                // 开启事务
                FragmentTransaction transaction = this.getSupportFragmentManager().beginTransaction();

                // 判断要显示的Fragment是否已经被添加
                if (!toFragment.isAdded()) {
                    if (fromFragment != null) {
                        transaction.hide(fromFragment); // 隐藏当前的
                    }
                    if (toFragment instanceof MovieFragment) { // 判断如果要添加的Fragment是MovieFragment就给它设置一个TAG
                        transaction.add(R.id.fl_container, toFragment, FRAGMENT_TAG).commit();// 添加新的
                    } else {
                        transaction.add(R.id.fl_container, toFragment).commit(); // 添加新的
                    }
                } else {
                    if (fromFragment != null) {
                        transaction.hide(fromFragment);
                    }
                    transaction.show(toFragment).commit();
                }
            }
        }
    }

    private BaseFragment getFragmentByPosition(int position) {
        if (fragments != null && fragments.size() > 0) {
            return fragments.get(position);
        }
        return null;
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK && isFlag) {
            isFlag = false;
            Toast.makeText(MainActivity.this, "再次点击返回键退出应用", Toast.LENGTH_SHORT).show();
            handler.sendEmptyMessageDelayed(MESSAGE_BACK, 2000);
            return true;
        }
        return super.onKeyUp(keyCode, event);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // 保证在activity退出前,移除所有未被执行的消息和回调方法,避免出现内存泄漏!
        handler.removeCallbacksAndMessages(null);
    }

    /**
     * ///////////////以下的几个方法用来，让fragment能够监听touch事件////////////////////////
     */
    private ArrayList<MyOnTouchListener> onTouchListeners = new ArrayList<MyOnTouchListener>(10);

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        for (MyOnTouchListener listener : onTouchListeners) {
            listener.onTouch(ev);
        }
        return super.dispatchTouchEvent(ev);
    }

    // 注册触摸事件的监听
    public void registerMyOnTouchListener(MyOnTouchListener myOnTouchListener) {
        onTouchListeners.add(myOnTouchListener);
    }

    // 解注册触摸事件的监听
    public void unregisterMyOnTouchListener(MyOnTouchListener myOnTouchListener) {
        onTouchListeners.remove(myOnTouchListener);
    }

    // 触摸事件的监听器
    public interface MyOnTouchListener {
        boolean onTouch(MotionEvent ev);
    }
}
