package com.xpf.cateyesmovies.activity;

import android.app.Activity;
import android.os.Bundle;

import com.xpf.cateyesmovies.R;

// 电影详情页面(非H5页面)
public class MovieDetailsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);
    }
}
