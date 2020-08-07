package com.example.family1.as_app;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import java.util.Calendar;

public class WorkRing extends View {

    private int mHeight, mWidth = 0;
    private int mPadding = 0;
    private int mNumeralSpacing = 0;


    private int mRadius = 0;
    private Paint mPaint;
    private boolean isInit;
    //

        public WorkRing(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        public WorkRing(Context context, AttributeSet attrs, int defStyleAttr) {
            super(context, attrs, defStyleAttr);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (!isInit) {
                mPaint = new Paint();
                mHeight = getHeight();
                mWidth = getWidth();
                mPadding = mNumeralSpacing + 50;
                int minAttr = Math.min(mHeight, mWidth);
                mRadius = minAttr / 2 - mPadding;

                isInit = true;
            }

            mPaint.reset();
            mPaint.setColor(Color.WHITE);
            mPaint.setStyle(Paint.Style.STROKE);
            mPaint.setStrokeWidth(15);
            mPaint.setAntiAlias(true);
            canvas.drawCircle(mWidth / 2, mHeight / 2, mRadius + mPadding - 10, mPaint);

        }


}
