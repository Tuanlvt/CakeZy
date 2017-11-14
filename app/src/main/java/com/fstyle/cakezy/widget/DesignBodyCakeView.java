package com.fstyle.cakezy.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
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
        final Bitmap bitmapCake =
                BitmapFactory.decodeResource(getResources(), R.drawable.cake_design_1);
        final float leftCake = (getWidth() - bitmapCake.getWidth())
                / Constant.NumberIntegerAndNumberFloat.NUMBER_TWO;
        final float topCake = getHeight() - bitmapCake.getHeight();

        canvas.drawBitmap(bitmapCake, leftCake, topCake, null);

        if (mCreamCake != null) {
            final float topCream = getHeight()
                    - bitmapCake.getHeight()
                    / Constant.NumberIntegerAndNumberFloat.NUMBER_ONE_POINT_FIFTY_SIX;

            mDrawImages.clear();
            mDrawImages.add(new DrawImage(mCreamCake.getCreamCakeDecorations(), null,
                    Constant.NumberIntegerAndNumberFloat.NUMBER_ZERO));
            final Bitmap bitmapCream =
                    mDrawImages.get(Constant.NumberIntegerAndNumberFloat.NUMBER_ZERO)
                            .getImageCreamDecorations();
            canvas.drawBitmap(bitmapCream, leftCake, topCream, null);
        }

        if (mCandleCake != null) {
            final float leftCandle = getWidth()
                    - bitmapCake.getWidth()
                    / Constant.NumberIntegerAndNumberFloat.NUMBER_ONE_POINT_FIFTY_FIVE;
            final float topCandle = getHeight()
                    - bitmapCake.getHeight()
                    / Constant.NumberIntegerAndNumberFloat.NUMBER_ONE_POINT_FIFTEEN;
            mDrawImages.clear();
            mDrawImages.add(new DrawImage(null, mCandleCake.getCandleImageDecorations(),
                    Constant.NumberIntegerAndNumberFloat.NUMBER_ZERO));
            final Bitmap bitmapCandle =
                    mDrawImages.get(Constant.NumberIntegerAndNumberFloat.NUMBER_ZERO)
                            .getImageCandleDecorations();
            canvas.drawBitmap(bitmapCandle, leftCandle, topCandle, null);
        }
    }

    public void setCreamCake(CreamCake creamCake) {
        mCreamCake = creamCake;
    }

    public void setCandleCake(CandleCake candleCake) {
        mCandleCake = candleCake;
    }
}
