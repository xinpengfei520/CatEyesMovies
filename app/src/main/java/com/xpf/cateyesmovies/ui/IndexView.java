package com.xpf.cateyesmovies.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.xpf.cateyesmovies.utils.DensityUtil;

/**
 * 自定义城市快速索引的View
 */

public class IndexView extends View {

    // 初始化字符数据
    private String[] words = {"#", "A", "B", "C", "D", "E", "F", "G", "H", "I",
            "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
            "W", "X", "Y", "Z"};

    private int itemWidth;
    private int itemHeight;
    private Paint mPaint; // 初始化画笔
//    private float startY;
    private int touchIndex = -1;

    public IndexView(Context context, AttributeSet attrs) {
        super(context, attrs);

        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG);
        mPaint.setTypeface(Typeface.DEFAULT_BOLD); //设置字体加粗
        mPaint.setTextSize(DensityUtil.dp2px(context, 15));
        mPaint.setColor(Color.GRAY);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        super.onTouchEvent(event);
        switch (event.getAction()) {

            // 当按下和移动的时候就触发事件的执行
            case MotionEvent.ACTION_DOWN:
            case MotionEvent.ACTION_MOVE:
                // 得到触摸所在item的位置(相当于屏幕?)
                int position = (int) (event.getY() / itemHeight);
                Log.e("pos", event.getY() + "");
                if (touchIndex != position) {
                    touchIndex = position;

                    // 调用接口的方法回传数据（字母）
                    if (mListener != null && touchIndex < words.length) {
                        mListener.onWordChange(words[touchIndex]);
                    }
                    invalidate(); // 重绘
                }
                break;

            case MotionEvent.ACTION_UP:
                touchIndex = -1;
                invalidate();
                break;
        }
        return true;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        // 得到每条的宽和高
        itemWidth = getMeasuredWidth();
        itemHeight = getMeasuredHeight() / words.length;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        for (int i = 0; i < words.length; i++) {

            if (touchIndex == i) {
                mPaint.setColor(Color.GRAY);
            } else {
                mPaint.setColor(Color.BLACK);
            }
            String word = words[i];

            Rect rect = new Rect(); // 得到字母的宽高
            mPaint.getTextBounds(word, 0, 1, rect);
            int wordWidth = rect.width();
            int wordHeight = rect.height();

            // 得到字母的坐标
            float wordX = itemWidth / 2 - wordWidth / 2;
            float wordY = itemHeight / 2 + wordHeight / 2 + i * itemHeight;

            canvas.drawText(word, wordX, wordY, mPaint);
        }
    }

    private onWordChangeListener mListener;

    public interface onWordChangeListener {
        void onWordChange(String word);
    }

    // 设置字母改变的监听
    public void setOnWordChangeListener(onWordChangeListener listener) {
        this.mListener = listener;
    }
}
