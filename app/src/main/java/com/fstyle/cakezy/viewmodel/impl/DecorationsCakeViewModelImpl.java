package com.fstyle.cakezy.viewmodel.impl;

import android.content.Context;
import android.databinding.BaseObservable;
import com.fstyle.cakezy.repository.CakeRepository;
import com.fstyle.cakezy.viewmodel.DecorationsCakeViewModel;

/**
 * Created by Tuanlvt on 06/11/2017.
 */

public class DecorationsCakeViewModelImpl extends BaseObservable
        implements DecorationsCakeViewModel {
    private Context mContext;
    private CakeRepository mCakeRepository;

    public DecorationsCakeViewModelImpl(Context context, CakeRepository cakeRepository) {
        mContext = context;
        mCakeRepository = cakeRepository;
    }

    @Override
    public void onStart() {
    }

    @Override
    public void onStop() {
    }
}
