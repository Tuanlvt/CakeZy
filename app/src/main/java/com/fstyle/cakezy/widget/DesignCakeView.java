package com.fstyle.cakezy.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import com.fstyle.cakezy.R;

/**
 * Created by Tuanlvt on 06/11/2017.
 */

public class DesignCakeView extends View {
    private Bitmap mBitmap;
    private Paint mPaint;

    public DesignCakeView(Context context) {
        super(context);
    }

    public DesignCakeView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DesignCakeView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @SuppressLint("DrawAllocation")
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.cake_design_1);
        float left = (getWidth() - mBitmap.getWidth()) / 2.0f;
        float top = getHeight() - mBitmap.getHeight();
        canvas.drawBitmap(mBitmap, left, top, mPaint);
    }
}
