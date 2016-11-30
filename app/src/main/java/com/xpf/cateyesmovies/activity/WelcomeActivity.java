package com.xpf.cateyesmovies.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.xpf.cateyesmovies.R;
import com.xpf.cateyesmovies.utils.AppNetConfig;

// 欢迎页面
public class WelcomeActivity extends Activity {

    private ImageView iv_welcome;

    private Handler handler = new Handler() {
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 0:
                    if (isFinishing()) { // 当前Activity已经销毁
                        return;
                    }
                    initWelcomeView(); // 加载图片替换默认图片
                    break;

                case 1: // 并跳转到主页面,结束当前页面
                    startActivity(new Intent(WelcomeActivity.this, MainActivity.class));
                    finish();
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        iv_welcome = (ImageView) findViewById(R.id.iv_welcome);
        // 发送一个延时2s的消息
        handler.sendEmptyMessageDelayed(0, 2000);
    }

    private void initWelcomeView() {
        Glide.with(this).load(AppNetConfig.WELCOMEPICURL).into(iv_welcome);
        handler.sendEmptyMessageDelayed(1, 3000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }
}
