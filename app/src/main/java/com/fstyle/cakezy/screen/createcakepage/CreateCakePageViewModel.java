package com.fstyle.cakezy.screen.createcakepage;

import android.content.Context;
import android.databinding.BaseObservable;

/**
 * Created by Tuanlvt on 31/10/2017.
 */

public class CreateCakePageViewModel extends BaseObservable
        implements CreateCakePageContract.ViewModel {
    private Context mContext;

    public CreateCakePageViewModel(Context context) {
        mContext = context;
    }

    @Override
    public void onStart() {
    }

    @Override
    public void onStop() {
    }
}
