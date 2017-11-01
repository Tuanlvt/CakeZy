package com.fstyle.cakezy.viewmodel.impl;

import android.content.Context;
import android.databinding.BaseObservable;

import com.fstyle.cakezy.repository.CakeRepository;
import com.fstyle.cakezy.viewmodel.CakeViewModel;

/**
 * Created by Tuanlvt on 31/10/2017.
 */

public class CakeViewModelImpl extends BaseObservable
        implements CakeViewModel {
    private Context mContext;
    private CakeRepository mCakeRepository;

    public CakeViewModelImpl(Context context, CakeRepository cakeRepository) {
        mContext = context;
        mCakeRepository = cakeRepository;
    }

    @Override
    public void onStart() {
    }

    @Override
    public void onStop() {
    }

    @Override
    public String getTextSample() {
        return "Đạo Đại Ca =))";
    }
}
