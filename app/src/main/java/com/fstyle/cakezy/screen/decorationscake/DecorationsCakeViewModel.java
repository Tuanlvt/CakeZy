package com.fstyle.cakezy.screen.decorationscake;

/**
 * Exposes the data to be used in the decorationscake screen.
 */

public class DecorationsCakeViewModel implements DecorationsCakeContract.ViewModel {

    private DecorationsCakeContract.Presenter mPresenter;

    public DecorationsCakeViewModel(DecorationsCakeContract.Presenter presenter) {
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
}
