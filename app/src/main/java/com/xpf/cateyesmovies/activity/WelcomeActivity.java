package com.xpf.cateyesmovies.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.xpf.cateyesmovies.R;

// 欢迎页面
public class WelcomeActivity extends Activity {

    private RelativeLayout rl_welcome;
    private ImageView iv_welcome;

    private Handler handler = new Handler() {
        public void handleMessage(Message msg) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        rl_welcome = (RelativeLayout) findViewById(R.id.rl_welcome);
        iv_welcome = (ImageView) findViewById(R.id.iv_welcome);
    }
}
