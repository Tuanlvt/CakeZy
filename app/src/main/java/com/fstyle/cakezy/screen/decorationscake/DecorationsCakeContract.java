package com.fstyle.cakezy.screen.decorationscake;

import android.databinding.ObservableField;
import com.fstyle.cakezy.data.model.CandleCake;
import com.fstyle.cakezy.data.model.CreamCake;
import com.fstyle.cakezy.screen.BasePresenter;
import com.fstyle.cakezy.screen.BaseViewModel;
import com.fstyle.cakezy.screen.decorationscake.adaptercandle.CandleAdapter;
import com.fstyle.cakezy.screen.decorationscake.adaptercream.CreamAdapter;

/**
 * This specifies the contract between the view and the presenter.
 */
public interface DecorationsCakeContract {
    /**
     * View.
     */
    interface ViewModel extends BaseViewModel {
        //XML
        CreamAdapter getCreamAdapter();

        CandleAdapter getCandleAdapter();

        ObservableField<CreamCake> getCreamCake();

        ObservableField<CandleCake> getCandleCake();

        void onNextButtonClick();
        //From to Presenter
    }

    /**
     * Presenter.
     */
    interface Presenter extends BasePresenter<ViewModel> {
    }
}
