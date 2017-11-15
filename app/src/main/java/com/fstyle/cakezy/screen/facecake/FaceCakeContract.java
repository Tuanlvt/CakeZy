package com.fstyle.cakezy.screen.facecake;

import android.databinding.ObservableField;
import com.fstyle.cakezy.data.model.ColorCake;
import com.fstyle.cakezy.data.model.DecorationsCake;
import com.fstyle.cakezy.screen.BasePresenter;
import com.fstyle.cakezy.screen.BaseViewModel;
import com.fstyle.cakezy.screen.facecake.adaptercolorcake.ColorFaceCakeAdapter;
import com.fstyle.cakezy.screen.facecake.adapterdecorations.DecorationsCakeAdapter;

/**
 * This specifies the contract between the view and the presenter.
 */
public interface FaceCakeContract {
    /**
     * View.
     */
    interface ViewModel extends BaseViewModel {
        //XML
        ColorFaceCakeAdapter getColorAdapter();

        DecorationsCakeAdapter getDecorationsAdapter();

        ObservableField<ColorCake> getColorCake();

        ObservableField<DecorationsCake> getDecorationsCake();

        void onNextButtonClick();
        //From toPresenter
    }

    /**
     * Presenter.
     */
    interface Presenter extends BasePresenter<ViewModel> {
    }
}
