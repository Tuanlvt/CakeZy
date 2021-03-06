package com.fstyle.cakezy.data.model;

import android.graphics.Bitmap;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by Tuanlvt on 10/11/2017.
 */
@AllArgsConstructor
@Getter
public class DrawImage extends BaseModel {
    private Bitmap imageCreamDecorations;
    private Bitmap imageCandleDecorations;
    private int colorFaceCakeDecorations;
}
