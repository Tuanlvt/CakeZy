package com.fstyle.cakezy.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import com.fstyle.cakezy.data.model.ColorCake;
import com.fstyle.cakezy.data.model.DrawImage;
import com.fstyle.cakezy.utils.ColorManager;
import com.fstyle.cakezy.utils.Constant;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tuanlvt on 13/11/2017.
 */

public class DesignFaceCakeView extends View {
    private Paint mPaintBorder = new Paint();
    private Paint mPaintStroke = new Paint();
    private Paint mPaintStrokeCakeChange = new Paint();
    private ColorCake mColorCake;
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
        if (mColorCake != null) {
            mDrawImage.clear();
            mDrawImage.add(new DrawImage(null, null, mColorCake.getColorCakeDecorations()));
            mPaintStrokeCakeChange.setColor(mDrawImage.get(0).getColorFaceCakeDecorations());
            canvas.drawCircle(getWidth() / Constant.NumberIntegerAndNumberFloat.NUMBER_TWO,
                    getHeight() / Constant.NumberIntegerAndNumberFloat.NUMBER_TWO,
                    getWidth() / Constant.NumberIntegerAndNumberFloat.NUMBER_TWO_POINT_OH_SEVEN,
                    mPaintStrokeCakeChange);
        }
    }

    public void setColorCake(ColorCake colorCake) {
        mColorCake = colorCake;
    }
}
