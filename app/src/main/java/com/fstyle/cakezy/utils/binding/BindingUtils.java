package com.fstyle.cakezy.utils.binding;

import android.databinding.BindingAdapter;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import com.fstyle.cakezy.data.model.CandleCake;
import com.fstyle.cakezy.data.model.CreamCake;
import com.fstyle.cakezy.widget.DesignCakeView;

/**
 * Created by Tuanlvt on 02/11/2017.
 */

public final class BindingUtils {
    private BindingUtils() {
    }

    @BindingAdapter({ "recyclerAdapter" })
    public static void setAdapterForRecyclerView(RecyclerView recyclerView,
            RecyclerView.Adapter adapter) {
        recyclerView.setAdapter(adapter);
    }

    @BindingAdapter("imageBitmap")
    public static void loadImageBitmap(ImageView imageView, Bitmap id) {
        imageView.setImageBitmap(id);
    }

    @BindingAdapter({ "setCreamCake", "setCandleCake" })
    public static void setCreamCake(DesignCakeView cakeView, CreamCake creamCake,
            CandleCake candleCake) {
        if (creamCake == null && candleCake == null) {
            return;
        }
        if (creamCake != null) {
            cakeView.setCreamCake(creamCake);
        }
        if (candleCake != null) {
            cakeView.setCandleCake(candleCake);
        }
        cakeView.invalidate();
    }
}
