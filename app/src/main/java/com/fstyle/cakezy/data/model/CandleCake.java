package com.fstyle.cakezy.data.model;

import android.graphics.Bitmap;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.Accessors;

/**
 * Created by Tuanlvt on 10/11/2017.
 */
@AllArgsConstructor
@Getter
@Accessors(prefix = "m")
public class CandleCake extends BaseModel {
    private Bitmap mCandleImageDecorations;
}
