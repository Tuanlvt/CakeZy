package com.fstyle.cakezy.screen.decorationscake.adaptercream;

import android.databinding.BaseObservable;
import android.graphics.Bitmap;
import android.view.View;
import com.fstyle.cakezy.data.model.CreamCake;
import com.fstyle.cakezy.screen.BaseRecyclerViewAdapter;

/**
 * Created by Tuanlvt on 08/11/2017.
 */

public class ItemDecorationViewModel extends BaseObservable {

    private CreamCake mCreamCake;
    private final BaseRecyclerViewAdapter.OnRecyclerViewItemClickListener<Object>
            mItemClickListener;

    ItemDecorationViewModel(CreamCake creamCakeBitmap,
            BaseRecyclerViewAdapter.OnRecyclerViewItemClickListener<Object> listener) {
        mCreamCake = creamCakeBitmap;
        mItemClickListener = listener;
    }

    public Bitmap getImageCreamDecorations() {
        return mCreamCake.getCreamCakeDecorations();
    }

    public void onItemClick(View view) {
        if (mItemClickListener == null) {
            return;
        }
        mItemClickListener.onItemRecyclerViewClick(mCreamCake);
    }
}
