package com.example.family1.as_app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import java.util.Calendar;


public class ClockView extends View {

    private int mHeight, mWidth = 0;
    private int mPadding = 0;
    private int mNumeralSpacing = 0;
    private int mHandTruncation, mHourHandTruncation = 0;
    private int mRadius = 0;
    private Paint mPaint;
    private boolean isInit;


    public ClockView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ClockView(Context context, AttributeSet attrs, int defStyleAttr) {
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
            mHandTruncation = minAttr / 20;
            mHourHandTruncation = minAttr / 7;

            isInit = true;

        }

        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(mWidth / 2, mHeight / 2, 12, mPaint);

        Calendar calendar = Calendar.getInstance();
        float hour = calendar.get(Calendar.HOUR_OF_DAY);
        hour = hour > 12 ? hour - 12 : hour;

        drawHandLine(canvas, (hour + calendar.get(Calendar.MINUTE) / 60) * 5f, true, false);
        drawHandLine(canvas, calendar.get(Calendar.MINUTE), false, false);
        drawHandLine(canvas, calendar.get(Calendar.SECOND), false, true);

        postInvalidateDelayed(500);
        invalidate();


        mPaint.setColor(Color.WHITE);
        mPaint.setStrokeWidth(7);

    }

    private void drawHandLine(Canvas canvas, double moment, boolean isHour, boolean isSecond) {
        double angle = Math.PI * moment / 30 - Math.PI / 2;
        int handRadius = isHour ? mRadius - mHandTruncation - mHourHandTruncation : mRadius - mHandTruncation;
        if (isSecond) mPaint.setColor(Color.RED);
        if (isSecond) mPaint.setStrokeWidth(3);

        canvas.drawLine(mWidth / 2, mHeight / 2,
                (float) (mWidth / 2 + Math.cos(angle) * handRadius),
                (float) (mHeight / 2 + Math.sin(angle) * handRadius), mPaint);


    }

    }


