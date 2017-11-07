package com.fstyle.cakezy.screen.decorationscake;

/**
 * Listens to user actions from the UI ({@link DecorationsCakeActivity}), retrieves the data and
 * updates
 * the UI as required.
 */
final class DecorationsCakePresenter implements DecorationsCakeContract.Presenter {
    private static final String TAG = DecorationsCakePresenter.class.getName();

    private DecorationsCakeContract.ViewModel mViewModel;

    DecorationsCakePresenter() {
    }

    @Override
    public void onStart() {
    }

    @Override
    public void onStop() {
    }

    @Override
    public void setViewModel(DecorationsCakeContract.ViewModel viewModel) {
        mViewModel = viewModel;
    }
}
