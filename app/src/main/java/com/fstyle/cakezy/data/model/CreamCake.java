package com.fstyle.cakezy.data.model;

import android.graphics.Bitmap;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.Accessors;

/**
 * Created by Tuanlvt on 08/11/2017.
 */
@AllArgsConstructor
@Getter
@Accessors(prefix = "m")
public class CreamCake extends BaseModel {
    private Bitmap mCreamCakeDecorations;
}
