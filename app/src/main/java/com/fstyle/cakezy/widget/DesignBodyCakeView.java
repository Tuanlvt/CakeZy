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
import com.fstyle.cakezy.utils.Constant;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tuanlvt on 06/11/2017.
 */

public class DesignBodyCakeView extends View {
    private Bitmap mBitmapCake;
    private Bitmap mBitmapCream;
    private Bitmap mBitmapCandle;
    private Paint mPaint;
    private List<DrawImage> mDrawImages = new ArrayList<>();
    private CreamCake mCreamCake;
    private CandleCake mCandleCake;

    public DesignBodyCakeView(Context context) {
        super(context);
    }

    public DesignBodyCakeView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DesignBodyCakeView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @SuppressLint({ "DrawAllocation", "ResourceAsColor" })
    @Override
    protected void onDraw(Canvas canvas) {
        mBitmapCake = BitmapFactory.decodeResource(getResources(), R.drawable.cake_design_1);
        final float leftCake = (getWidth() - mBitmapCake.getWidth())
                / Constant.NumberIntegerAndNumberFloat.NUMBER_TWO;
        final float topCake = getHeight() - mBitmapCake.getHeight();

        canvas.drawBitmap(mBitmapCake, leftCake, topCake, mPaint);

        if (mCreamCake != null) {
            final float topCream = getHeight()
                    - mBitmapCake.getHeight()
                    / Constant.NumberIntegerAndNumberFloat.NUMBER_ONE_POINT_FIFTY_SIX;

            mDrawImages.clear();
            mDrawImages.add(new DrawImage(mCreamCake.getCreamCakeDecorations(), null, 0));
            mBitmapCream = mDrawImages.get(Constant.NumberIntegerAndNumberFloat.NUMBER_ZERO)
                    .getImageCreamDecorations();
            canvas.drawBitmap(mBitmapCream, leftCake, topCream, mPaint);
        }

        if (mCandleCake != null) {
            final float leftCandle = getWidth()
                    - mBitmapCake.getWidth()
                    / Constant.NumberIntegerAndNumberFloat.NUMBER_ONE_POINT_FIFTY_FIVE;
            final float topCandle = getHeight()
                    - mBitmapCake.getHeight()
                    / Constant.NumberIntegerAndNumberFloat.NUMBER_ONE_POINT_FIFTEEN;
            mDrawImages.clear();
            mDrawImages.add(new DrawImage(null, mCandleCake.getCandleImageDecorations(), 0));
            mBitmapCandle = mDrawImages.get(Constant.NumberIntegerAndNumberFloat.NUMBER_ZERO)
                    .getImageCandleDecorations();
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
