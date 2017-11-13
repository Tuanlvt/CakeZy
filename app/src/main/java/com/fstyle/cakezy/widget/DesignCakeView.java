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
import com.fstyle.cakezy.data.model.CandleCake;
import com.fstyle.cakezy.data.model.CreamCake;
import com.fstyle.cakezy.data.model.DrawImage;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tuanlvt on 06/11/2017.
 */

public class DesignCakeView extends View {
    private Bitmap mBitmapCake;
    private Bitmap mBitmapCream;
    private Bitmap mBitmapCandle;
    private Paint mPaint;
    private List<DrawImage> mDrawImages = new ArrayList<>();
    private CreamCake mCreamCake;
    private CandleCake mCandleCake;

    public DesignCakeView(Context context) {
        super(context);
    }

    public DesignCakeView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DesignCakeView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @SuppressLint({ "DrawAllocation", "ResourceAsColor" })
    @Override
    protected void onDraw(Canvas canvas) {
        mBitmapCake = BitmapFactory.decodeResource(getResources(), R.drawable.cake_design_1);
        final float leftCake = (getWidth() - mBitmapCake.getWidth()) / 2.0f;
        final float topCake = getHeight() - mBitmapCake.getHeight();

        canvas.drawBitmap(mBitmapCake, leftCake, topCake, mPaint);

        if (mCreamCake != null) {
            final float topCream = getHeight() - mBitmapCake.getHeight() / 1.56f;

            mDrawImages.clear();
            mDrawImages.add(new DrawImage(mCreamCake.getMCreamCake(), null));
            mBitmapCream = mDrawImages.get(0).getMImageCream();
            canvas.drawBitmap(mBitmapCream, leftCake, topCream, mPaint);
        }

        if (mCandleCake != null) {
            final float leftCandle = getWidth() - mBitmapCake.getWidth() / 1.55f;
            final float topCandle = getHeight() - mBitmapCake.getHeight() / 1.15f;
            mDrawImages.clear();
            mDrawImages.add(new DrawImage(null, mCandleCake.getMCandleImage()));
            mBitmapCandle = mDrawImages.get(0).getMImageCandle();
            canvas.drawBitmap(mBitmapCandle, leftCandle, topCandle, mPaint);
        }
    }

    public void setCreamCake(CreamCake creamCake) {
        mCreamCake = creamCake;
    }

    public void setCandleCake(CandleCake candleCake) {
        mCandleCake = candleCake;
    }
}
