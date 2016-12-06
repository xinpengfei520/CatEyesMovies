package com.xpf.cateyesmovies.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
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

// banner的详情页面
public class BannerDetailActivity extends Activity {

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
//    @BindView(R.id.videoView)
//    VideoView videoView;
//    @BindView(R.id.indicator)
//    TabPageIndicator indicator;
//    @BindView(R.id.viewPager)
//    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner_detail);
        ButterKnife.bind(this);

        initView();
    }

    private void initView() {
        // meituanmovie://www.meituan.com/videolist?id=1196913&amp;name=我在故宫修文物&amp;videoId=82288
        String url = getIntent().getStringExtra("url");

        String[] split = url.split("videoId=", 2); // 以 “ = ” 分割字符串,获取后面的5个数字(猜测为文章的编号)

        Log.e("TAG", "BannerDetailsActivity split===" + split[1].toString());

        // 通过复制文章的连接查看请求文章的url其中的数字为文章的编号
        url = "http://m.maoyan.com/prevue/" + split[1].toString() + "?_v_=yes";

        webView.loadUrl(url);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true); // 设置使用javaScript
        settings.setUseWideViewPort(true);   // 设置支持双击页面变大
        settings.setPluginState(WebSettings.PluginState.ON);
        // 设置优先使用网络缓存
        settings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        // 关键的部分就是在这里设置Client
        webView.setWebChromeClient(new WebChromeClient());

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true; // 返回值为true的时候表示使用webview打开,为false表示使用系统的浏览器或者使用第三方的浏览器打开
            }
        });
    }

    @OnClick({R.id.iv_back, R.id.iv_share})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.iv_share:
                break;
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        webView.onPause(); // 暂停
    }
}
