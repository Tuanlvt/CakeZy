package com.fstyle.cakezy.data.model;

import android.graphics.Bitmap;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Created by Tuanlvt on 10/11/2017.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Accessors(prefix = "m")
@Builder(builderMethodName = "imageBuilder")
public class DrawImage extends BaseModel {
    private Bitmap mImageCreamDecorations;
    private Bitmap mImageCandleDecorations;
    private int mColorFaceCakeDecorations;
    private Bitmap mImageDecorationsFaceCake;
}
