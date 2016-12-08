package com.xpf.cateyesmovies.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.xpf.cateyesmovies.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

// 实时票房页面
public class TicketsActivity extends Activity {

    @BindView(R.id.tv_back)
    TextView tvBack;
    @BindView(R.id.iv_share)
    ImageView ivShare;
    @BindView(R.id.webView)
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tickets);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        String url = "http://piaofang.maoyan.com/";
        webView.loadUrl(url);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true); // 设置使用javaScript
        settings.setUseWideViewPort(true);   // 设置支持双击页面变大
        // 设置优先使用网络缓存
        settings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true; // 返回值为true的时候表示使用webView打开,为false表示使用系统的浏览器或者使用第三方的浏览器打开
            }
        });
    }

    @OnClick({R.id.tv_back, R.id.iv_share})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_back:
                finish();
                break;
            case R.id.iv_share:
                Toast.makeText(TicketsActivity.this, "分享", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
