package com.fstyle.cakezy.screen.choosestylecake;

import com.fstyle.cakezy.screen.BasePresenter;
import com.fstyle.cakezy.screen.BaseViewModel;

/**
 * This specifies the contract between the view and the presenter.
 */
public interface ChooseStyleCakeContract {
    /**
     * View.
     */
    interface ViewModel extends BaseViewModel {
        //XML
        void onNextButtonClick();

        //From To Presenter
    }

    /**
     * Presenter.
     */
    interface Presenter extends BasePresenter<ViewModel> {
    }
}
