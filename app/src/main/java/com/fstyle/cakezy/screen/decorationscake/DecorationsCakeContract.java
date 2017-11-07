package com.fstyle.cakezy.screen.decorationscake;

import com.fstyle.cakezy.screen.BasePresenter;
import com.fstyle.cakezy.screen.BaseViewModel;

/**
 * This specifies the contract between the view and the presenter.
 */
interface DecorationsCakeContract {
    /**
     * View.
     */
    interface ViewModel extends BaseViewModel {
    }

    /**
     * Presenter.
     */
    interface Presenter extends BasePresenter<ViewModel> {
    }
}
