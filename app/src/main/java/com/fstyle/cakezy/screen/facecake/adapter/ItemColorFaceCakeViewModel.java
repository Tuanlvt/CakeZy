package com.fstyle.cakezy.screen.facecake.adapter;

import android.databinding.BaseObservable;
import android.view.View;
import com.fstyle.cakezy.data.model.ColorCake;
import com.fstyle.cakezy.screen.BaseRecyclerViewAdapter;

/**
 * Created by Tuanlvt on 13/11/2017.
 */

public class ItemColorFaceCakeViewModel extends BaseObservable {

    private ColorCake mColorCake;
    private final BaseRecyclerViewAdapter.OnRecyclerViewItemClickListener<Object>
            mItemClickListener;

    ItemColorFaceCakeViewModel(ColorCake colorCake,
            BaseRecyclerViewAdapter.OnRecyclerViewItemClickListener<Object> listener) {
        mColorCake = colorCake;
        mItemClickListener = listener;
    }

    public int getColorCake() {
        return mColorCake.getColorCakeDecorations();
    }

    public void onItemClick(View view) {
        if (mItemClickListener == null) {
            return;
        }
        mItemClickListener.onItemRecyclerViewClick(mColorCake);
    }
}
