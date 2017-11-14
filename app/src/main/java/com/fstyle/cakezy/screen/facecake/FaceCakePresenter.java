package com.fstyle.cakezy.screen.facecake;

/**
 * Listens to user actions from the UI ({@link FaceCakeActivity}), retrieves the data and updates
 * the UI as required.
 */
final class FaceCakePresenter implements FaceCakeContract.Presenter {
    private static final String TAG = FaceCakePresenter.class.getName();

    private FaceCakeContract.ViewModel mViewModel;

    FaceCakePresenter() {
    }

    @Override
    public void onStart() {
    }

    @Override
    public void onStop() {
    }

    @Override
    public void setViewModel(FaceCakeContract.ViewModel viewModel) {
        mViewModel = viewModel;
    }
}
