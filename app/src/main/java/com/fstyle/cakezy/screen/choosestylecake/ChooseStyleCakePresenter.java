package com.fstyle.cakezy.screen.choosestylecake;

/**
 * Listens to user actions from the UI ({@link ChooseStyleCakeActivity}), retrieves the data and
 * updates
 * the UI as required.
 */
final class ChooseStyleCakePresenter implements ChooseStyleCakeContract.Presenter {
    private static final String TAG = ChooseStyleCakePresenter.class.getName();

    private ChooseStyleCakeContract.ViewModel mViewModel;

    ChooseStyleCakePresenter() {
    }

    @Override
    public void onStart() {
    }

    @Override
    public void onStop() {
    }

    @Override
    public void setViewModel(ChooseStyleCakeContract.ViewModel viewModel) {
        mViewModel = viewModel;
    }
}
