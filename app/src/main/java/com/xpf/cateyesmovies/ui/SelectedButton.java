package com.xpf.cateyesmovies.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.xpf.cateyesmovies.R;

/**
 * Created by xpf on 2016/12/4 :)
 * GitHub:xinpengfei520
 * Function:自定义控件之自定义带有选择器的Button
 */

public class SelectedButton extends Button implements View.OnTouchListener {

    private int normalTextColor, pressedTextColor;
    private int normalBack, pressedBack;

    public SelectedButton(Context context) {
        this(context, null);
    }

    public SelectedButton(Context context, AttributeSet attrs) {
        this(context, attrs, 0);

    }

    public SelectedButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        Resources res = getContext().getResources();
        normalTextColor = res.getColor(R.color.ButtonTextColorNormal);
        pressedTextColor = res.getColor(R.color.ButtonTextColorPressed);
        TypedArray array = getContext().obtainStyledAttributes(attrs, R.styleable.SelectButton);
        normalBack = array.getResourceId(R.styleable.SelectButton_background_normal, -1);
        pressedBack = array.getResourceId(R.styleable.SelectButton_background_select, -1);
        array.recycle();
        this.setGravity(Gravity.CENTER);
        this.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                this.setTextColor(pressedTextColor);
                if (pressedBack != -1) {
                    this.setBackgroundResource(pressedBack);
                }
                break;
            case MotionEvent.ACTION_UP:
                if (mListener != null) {
                    mListener.onClick(this);
                }
                break;
        }
        return true;
    }

    public void setNormalState() {
        this.setTextColor(normalTextColor);
        if (normalBack != -1) {
            this.setBackgroundResource(normalBack);
        }
    }

    private ViewClickListener mListener;

    // 设置视图被点击事件的监听器
    public void setmListener(ViewClickListener mListener) {
        this.mListener = mListener;
    }

    // 视图被点击事件的监听器
    public interface ViewClickListener {
        void onClick(View view); // 当视图被点击的时候回调
    }
}
