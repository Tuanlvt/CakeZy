package com.fstyle.cakezy.screen.choosestylecake;

import com.fstyle.cakezy.screen.decorationscake.DecorationsCakeActivity;
import com.fstyle.cakezy.utils.navigator.Navigator;

/**
 * Exposes the data to be used in the choosestylecake screen.
 */

public class ChooseStyleCakeViewModel implements ChooseStyleCakeContract.ViewModel {

    private Navigator mNavigator;
    private ChooseStyleCakeContract.Presenter mPresenter;

    public ChooseStyleCakeViewModel(Navigator navigator,
            ChooseStyleCakeContract.Presenter presenter) {
        mNavigator = navigator;
        mPresenter = presenter;
        mPresenter.setViewModel(this);
    }

    @Override
    public void onStart() {
        mPresenter.onStart();
    }

    @Override
    public void onStop() {
        mPresenter.onStop();
    }

    @Override
    public void onNextButtonClick() {
        mNavigator.startActivity(DecorationsCakeActivity.class);
    }
}
