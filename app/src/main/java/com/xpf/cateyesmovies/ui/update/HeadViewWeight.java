package com.xpf.cateyesmovies.ui.update;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.LinearLayout;

import com.xpf.cateyesmovies.utils.DensityUtil;

// 刷新头的View
public class HeadViewWeight extends LinearLayout {

    private RefreshView refreshView;
    private static final float defaultSize = 30f;
    private static final float defaultMargin = 10f;

    public HeadViewWeight(Context context) {
        this(context, null);
    }

    public HeadViewWeight(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public HeadViewWeight(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.setOrientation(LinearLayout.VERTICAL);
        this.setGravity(Gravity.CENTER);
        addCatRefreshView();
    }

    private void addCatRefreshView() {
        refreshView = new RefreshView(getContext());
        int size = DensityUtil.dp2px(getContext(), defaultSize);
        LayoutParams params = new LayoutParams(size, size);
        int margin = DensityUtil.dp2px(getContext(), defaultMargin);
        params.bottomMargin = margin;
        params.topMargin = margin;
        refreshView.setLayoutParams(params);
        this.addView(refreshView);
    }

    public RefreshView getRefreshView() {
        return refreshView;
    }
}
