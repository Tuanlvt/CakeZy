package com.fstyle.cakezy.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.fstyle.cakezy.data.model.ColorCake;
import com.fstyle.cakezy.data.model.DecorationsCake;
import com.fstyle.cakezy.data.model.DrawImage;
import com.fstyle.cakezy.utils.ColorManager;
import com.fstyle.cakezy.utils.Constant;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tuanlvt on 13/11/2017.
 */

public class DesignFaceCakeView extends View {
    private float mDecorationsX;
    private float mDecorationsY;
    private ColorCake mColorCake;
    private DecorationsCake mDecorationsCake;
    private Paint mPaintBorder = new Paint();
    private Paint mPaintStroke = new Paint();
    private Paint mPaintStrokeCakeChange = new Paint();
    private List<DrawImage> mDrawImage = new ArrayList<>();

    public DesignFaceCakeView(Context context) {
        super(context);
    }

    public DesignFaceCakeView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DesignFaceCakeView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @SuppressLint("DrawAllocation")
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaintBorder.setColor(Color.GRAY);
        mPaintBorder.setStyle(Paint.Style.STROKE);
        mPaintBorder.setStrokeWidth(Constant.NumberIntegerAndNumberFloat.NUMBER_TEN);
        canvas.drawCircle(getWidth() / Constant.NumberIntegerAndNumberFloat.NUMBER_TWO,
                getHeight() / Constant.NumberIntegerAndNumberFloat.NUMBER_TWO,
                getWidth() / Constant.NumberIntegerAndNumberFloat.NUMBER_TWO_POINT_OH_FIVE,
                mPaintBorder);
        mPaintStroke.setColor(ColorManager.getColorWhite());
        canvas.drawCircle(getWidth() / Constant.NumberIntegerAndNumberFloat.NUMBER_TWO,
                getHeight() / Constant.NumberIntegerAndNumberFloat.NUMBER_TWO,
                getWidth() / Constant.NumberIntegerAndNumberFloat.NUMBER_TWO_POINT_OH_SEVEN,
                mPaintBorder);

        // Select Color Face Cake
        if (mColorCake != null) {
            mDrawImage.clear();
            mDrawImage.add(DrawImage.imageBuilder()
                    .colorFaceCakeDecorations(mColorCake.getColorCakeDecorations())
                    .build());
            mPaintStrokeCakeChange.setColor(
                    mDrawImage.get(Constant.NumberIntegerAndNumberFloat.NUMBER_ZERO)
                            .getColorFaceCakeDecorations());
            canvas.drawCircle(getWidth() / Constant.NumberIntegerAndNumberFloat.NUMBER_TWO,
                    getHeight() / Constant.NumberIntegerAndNumberFloat.NUMBER_TWO,
                    getWidth() / Constant.NumberIntegerAndNumberFloat.NUMBER_TWO_POINT_OH_SEVEN,
                    mPaintStrokeCakeChange);
        }

        //Draw Decorations in Face Cake
        if (mDecorationsCake != null) {
            mDrawImage.clear();
            mDrawImage.add(DrawImage.imageBuilder()
                    .imageDecorationsFaceCake(mDecorationsCake.getImageDecorations())
                    .build());
            Bitmap bitmapDecorationsFaceCake =
                    mDrawImage.get(Constant.NumberIntegerAndNumberFloat.NUMBER_ZERO)
                            .getImageDecorationsFaceCake();
            if (mDecorationsX == Constant.NumberIntegerAndNumberFloat.NUMBER_ZERO
                    || mDecorationsY == Constant.NumberIntegerAndNumberFloat.NUMBER_ZERO) {
                mDecorationsX = bitmapDecorationsFaceCake.getWidth()
                        / Constant.NumberIntegerAndNumberFloat.NUMBER_TWO;
                mDecorationsY = bitmapDecorationsFaceCake.getHeight()
                        / Constant.NumberIntegerAndNumberFloat.NUMBER_TWO;
            }
            canvas.drawBitmap(bitmapDecorationsFaceCake, mDecorationsX, mDecorationsY, null);
        }
    }

    @SuppressLint("ClickableViewAccessibility")
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean value = super.onTouchEvent(event);
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                mDecorationsX = event.getX() / Constant.NumberIntegerAndNumberFloat.NUMBER_FOUR;
                mDecorationsY = event.getY() / Constant.NumberIntegerAndNumberFloat.NUMBER_FOUR;
                return true;
            case MotionEvent.ACTION_MOVE:
                mDecorationsX = event.getX() / Constant.NumberIntegerAndNumberFloat.NUMBER_TWO;
                mDecorationsY = event.getY() / Constant.NumberIntegerAndNumberFloat.NUMBER_FOUR;
                postInvalidate();
                return true;
        }
        return value;
    }

    public void setColorCake(ColorCake colorCake) {
        mColorCake = colorCake;
    }

    public void setDecorationsCake(DecorationsCake decorationsCake) {
        mDecorationsCake = decorationsCake;
    }
}
