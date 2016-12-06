package com.xpf.cateyesmovies.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.xpf.cateyesmovies.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

// 电影详情页面(H5页面)
public class MoviesH5Activity extends Activity {

    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.iv_share)
    ImageView ivShare;
    @BindView(R.id.rl_title)
    RelativeLayout rlTitle;
    @BindView(R.id.webView)
    WebView webView;
    @BindView(R.id.tv_buy)
    TextView tvBuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies_h5);
        ButterKnife.bind(this);

        initView();
    }

    private void initView() {
        String url = getIntent().getStringExtra("url");

        // 通过复制文章的连接查看请求文章的url其中的数字为文章的编号
        url = "http://m.maoyan.com/movie/" + url + "?_v_=yes";
        Log.e("TAG", "MoviesH5Activity url===" + url);

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
                return true; // 返回值为true的时候表示使用webview打开,为false表示使用系统的浏览器或者使用第三方的浏览器打开
            }
        });
    }

    @OnClick({R.id.iv_back, R.id.iv_share, R.id.tv_buy})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.iv_share:
                break;
            case R.id.tv_buy:
                break;
        }
    }
}
