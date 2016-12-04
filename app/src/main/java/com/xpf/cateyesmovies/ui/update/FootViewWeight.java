package com.xpf.cateyesmovies.ui.update;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.xpf.cateyesmovies.R;
import com.xpf.cateyesmovies.utils.DensityUtil;

// 底部加载更多的View
public class FootViewWeight extends LinearLayout {

    private static final float defaultMargin = 10f;
    private static final float defaultTextSize = 16f;
    private TextView loadTextView;
    private String loadReadyTip, loadingTip, loadedTip;

    public static enum LoadTip {
        LOADREADY, LOADING, LOADED
    }

    public FootViewWeight(Context context) {
        this(context, null);
    }

    public FootViewWeight(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FootViewWeight(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.setOrientation(LinearLayout.VERTICAL);
        this.setGravity(Gravity.CENTER);
        this.loadReadyTip = getResources().getString(R.string.load_ready);
        this.loadingTip = getResources().getString(R.string.loading);
        this.loadedTip = getResources().getString(R.string.loaded);
        addLoadView();
    }

    private void addLoadView() {
        loadTextView = new TextView(getContext());
        int size = DensityUtil.dp2px(getContext(), defaultTextSize);
        LayoutParams params = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        int margin = DensityUtil.dp2px(getContext(), defaultMargin);
        params.bottomMargin = margin;
        params.topMargin = margin;
        loadTextView.setTextSize(TypedValue.COMPLEX_UNIT_PX, size);
        loadTextView.setLayoutParams(params);
        this.setLoadTip(LoadTip.LOADREADY);
        this.addView(loadTextView);
    }

    // 设置加载文字提示
    public void setLoadTip(LoadTip tip) {
        switch (tip) {
            case LOADREADY:
                loadTextView.setText(loadReadyTip);
                break;
            case LOADING:
                loadTextView.setText(loadingTip);
                break;
            case LOADED:
                loadTextView.setText(loadedTip);
                break;
        }
    }

}
