package com.xpf.cateyesmovies;

import android.app.Application;
import android.content.Context;

import com.zhy.http.okhttp.OkHttpUtils;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

/**
 * Created by xpf on 2016/11/29 :)
 * Wechat:18091383534
 * Function:代表整个应用的实例及初始化相关操作
 */

public class MyApplication extends Application {

    public static Context mContext;

    public static Context getmContext() {
        return mContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;

        // 初始化okhttpClient
        initOkhttpClient();
    }

    private void initOkhttpClient() {

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(10000L, TimeUnit.MILLISECONDS)
                .readTimeout(10000L, TimeUnit.MILLISECONDS)
                .build(); // 其他配置

        OkHttpUtils.initClient(okHttpClient);
    }
}
