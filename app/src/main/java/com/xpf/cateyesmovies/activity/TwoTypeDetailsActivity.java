package com.xpf.cateyesmovies.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.xpf.cateyesmovies.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

// 发现页面 feedType = 2 的详情页面
public class TwoTypeDetailsActivity extends Activity {

    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.iv_edit)
    ImageView ivEdit;
    @BindView(R.id.iv_collection)
    ImageView ivCollection;
    @BindView(R.id.webView)
    WebView webView;
    @BindView(R.id.et_comment)
    EditText etComment;
    @BindView(R.id.btn_send)
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven_type_details);
        ButterKnife.bind(this);

        initView();
    }

    private void initView() {
        String url = getIntent().getStringExtra("url"); // meituanmovie://www.meituan.com/forum/postDetail?postID=120094

        String[] split = url.split("=", 2); // 以 “ = ” 分割字符串,获取后面的5个数字(猜测为文章的编号)

        Log.e("TAG", "SevenTypeDetailsActivity split===" + split[1].toString());

        // 通过复制文章的连接查看请求文章的url其中的数字为文章的编号
        url = "http://m.maoyan.com/topic/" + split[1].toString() + "?_v_=yes&share=Android";

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

    @OnClick({R.id.iv_back, R.id.iv_edit, R.id.iv_collection, R.id.btn_send})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.iv_edit: // 分享
                break;
            case R.id.iv_collection: // 收藏
                // 图标变为实心
                // 保存到服务器和本地
                break;
            case R.id.btn_send:
                break;
        }
    }
}
