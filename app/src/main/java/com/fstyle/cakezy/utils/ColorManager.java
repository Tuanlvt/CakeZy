package com.fstyle.cakezy.utils;

import android.graphics.Color;

/**
 * Created by Tuanlvt on 13/11/2017.
 */
public final class ColorManager {
    private static final String COLOR_WHITE = "#FFFFFF";
    private static final String COLOR_GREY_100 = "#F5F5F5";
    private static final String COLOR_GREY_200 = "#EEEEEE";
    private static final String COLOR_BROWN_100 = "#D7CCC8";
    private static final String COLOR_BROWN_200 = "#BCAAA4";
    private static final String COLOR_BROWN_300 = "#A1887F";
    private static final String COLOR_RED_100 = "#FFCDD2";
    private static final String COLOR_PURPLE_50 = "#F3E5F5";
    private static final String COLOR_PURPLE_100 = "#E1BEE7";
    private static final String COLOR_PINK_50 = "#FCE4EC";
    private static final String COLOR_PINK_100 = "#F8BBD0";
    private static final String COLOR_BROWN_50 = "#EFEBE9";
    private static final String COLOR_ORANGE_50 = "#FFF3E0";
    private static final String COLOR_ORANGE_100 = "#FFE0B2";
    private static final String COLOR_GREEN_100 = "#C8E6C9";

    private ColorManager() {
        // No-op
    }

    public static int getColorWhite() {
        return Color.parseColor(COLOR_WHITE);
    }

    public static int getColorGrey100() {
        return Color.parseColor(COLOR_GREY_100);
    }

    public static int getColorGrey200() {
        return Color.parseColor(COLOR_GREY_200);
    }

    public static int getColorBrown100() {
        return Color.parseColor(COLOR_BROWN_100);
    }

    public static int getColorBrown200() {
        return Color.parseColor(COLOR_BROWN_200);
    }

    public static int getColorBrown300() {
        return Color.parseColor(COLOR_BROWN_300);
    }

    public static int getColorRed100() {
        return Color.parseColor(COLOR_RED_100);
    }

    public static int getColorPurple50() {
        return Color.parseColor(COLOR_PURPLE_50);
    }

    public static int getColorPurple100() {
        return Color.parseColor(COLOR_PURPLE_100);
    }

    public static int getColorPink50() {
        return Color.parseColor(COLOR_PINK_50);
    }

    public static int getColorPink100() {
        return Color.parseColor(COLOR_PINK_100);
    }

    public static int getColorBrown50() {
        return Color.parseColor(COLOR_BROWN_50);
    }

    public static int getColorOrange50() {
        return Color.parseColor(COLOR_ORANGE_50);
    }

    public static int getColorOrange100() {
        return Color.parseColor(COLOR_ORANGE_100);
    }

    public static int getColorGreen100() {
        return Color.parseColor(COLOR_GREEN_100);
    }
}
