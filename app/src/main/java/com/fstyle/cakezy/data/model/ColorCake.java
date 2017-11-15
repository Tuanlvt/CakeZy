package com.fstyle.cakezy.data.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.Accessors;

/**
 * Created by Tuanlvt on 14/11/2017.
 */
@Getter
@AllArgsConstructor
@Accessors(prefix = "m")
public class ColorCake extends BaseModel {
    private int mColorCakeDecorations;
}
