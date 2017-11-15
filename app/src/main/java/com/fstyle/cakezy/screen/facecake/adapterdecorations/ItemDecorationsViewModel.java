package com.fstyle.cakezy.screen.facecake.adapterdecorations;

import android.databinding.BaseObservable;
import android.graphics.Bitmap;
import android.view.View;
import com.fstyle.cakezy.data.model.DecorationsCake;
import com.fstyle.cakezy.screen.BaseRecyclerViewAdapter;

/**
 * Created by Tuanlvt on 15/11/2017.
 */

public class ItemDecorationsViewModel extends BaseObservable {

    private DecorationsCake mDecorationsCake;
    private final BaseRecyclerViewAdapter.OnRecyclerViewItemClickListener<Object>
            mItemClickListener;

    ItemDecorationsViewModel(DecorationsCake decorationsCake,
            BaseRecyclerViewAdapter.OnRecyclerViewItemClickListener<Object> listener) {
        mDecorationsCake = decorationsCake;
        mItemClickListener = listener;
    }

    public Bitmap getImageDecorations() {
        return mDecorationsCake.getImageDecorations();
    }

    public void onItemClick(View view) {
        if (mItemClickListener == null) {
            return;
        }
        mItemClickListener.onItemRecyclerViewClick(mDecorationsCake);
    }
}
