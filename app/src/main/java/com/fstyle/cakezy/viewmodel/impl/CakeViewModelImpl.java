package com.fstyle.cakezy.viewmodel.impl;

import android.content.Context;
import android.databinding.BaseObservable;
import com.fstyle.cakezy.repository.CakeRepository;
import com.fstyle.cakezy.utils.navigator.Navigator;
import com.fstyle.cakezy.view.decorationscake.DecorationsCakeActivity;
import com.fstyle.cakezy.viewmodel.CakeViewModel;

/**
 * Created by Tuanlvt on 31/10/2017.
 */

public class CakeViewModelImpl extends BaseObservable implements CakeViewModel {
    private Context mContext;
    private Navigator mNavigator;
    private CakeRepository mCakeRepository;

    public CakeViewModelImpl(Context context, Navigator navigator, CakeRepository cakeRepository) {
        mContext = context;
        mNavigator = navigator;
        mCakeRepository = cakeRepository;
    }

    @Override
    public void onStart() {
    }

    @Override
    public void onStop() {
    }

    @Override
    public void onClickNext() {
        mNavigator.startActivity(DecorationsCakeActivity.class);
    }
}
