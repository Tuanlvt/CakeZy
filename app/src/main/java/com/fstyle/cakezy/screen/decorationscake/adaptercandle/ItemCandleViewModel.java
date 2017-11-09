package com.fstyle.cakezy.screen.decorationscake.adaptercandle;

import android.databinding.BaseObservable;
import android.graphics.Bitmap;
import android.view.View;
import com.fstyle.cakezy.data.model.CandleCake;
import com.fstyle.cakezy.screen.BaseRecyclerViewAdapter;

/**
 * Created by Tuanlvt on 08/11/2017.
 */

public class ItemCandleViewModel extends BaseObservable {

    private CandleCake mCandleCake;
    private final BaseRecyclerViewAdapter.OnRecyclerViewItemClickListener<Object>
            mItemClickListener;

    ItemCandleViewModel(CandleCake candleCake,
            BaseRecyclerViewAdapter.OnRecyclerViewItemClickListener<Object> listener) {
        mCandleCake = candleCake;
        mItemClickListener = listener;
    }

    public Bitmap getImageCandle() {
        return mCandleCake.getMCandleImage();
    }

    public void onItemClick(View view) {
        if (mItemClickListener == null) {
            return;
        }
        mItemClickListener.onItemRecyclerViewClick(mCandleCake);
    }
}
