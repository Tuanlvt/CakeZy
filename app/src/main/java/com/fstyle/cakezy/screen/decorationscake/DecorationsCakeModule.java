package com.fstyle.cakezy.screen.decorationscake;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.fstyle.cakezy.screen.decorationscake.adaptercandle.CandleAdapter;
import com.fstyle.cakezy.screen.decorationscake.adaptercream.CreamAdapter;
import com.fstyle.cakezy.utils.dagger.ActivityScope;
import com.fstyle.cakezy.utils.navigator.Navigator;
import dagger.Module;
import dagger.Provides;

/**
 * This is a Dagger module. We use this to pass in the View dependency to
 * the {@link DecorationsCakePresenter}.
 */
@Module
public class DecorationsCakeModule {

    private Activity mActivity;

    public DecorationsCakeModule(@NonNull Activity activity) {
        this.mActivity = activity;
    }

    @ActivityScope
    @Provides
    public DecorationsCakeContract.ViewModel provideViewModel(Navigator navigator,
            DecorationsCakeContract.Presenter presenter, CreamAdapter creamAdapter,
            CandleAdapter candleAdapter) {
        return new DecorationsCakeViewModel(mActivity, navigator, creamAdapter, candleAdapter,
                presenter);
    }

    @ActivityScope
    @Provides
    public DecorationsCakeContract.Presenter providePresenter() {
        return new DecorationsCakePresenter();
    }

    @ActivityScope
    @Provides
    public Navigator provideNavigator() {
        return new Navigator(mActivity);
    }

    @ActivityScope
    @Provides
    public CreamAdapter provideCreamAdapter() {
        return new CreamAdapter(mActivity);
    }

    @ActivityScope
    @Provides
    public CandleAdapter provideCandleAdapter() {
        return new CandleAdapter(mActivity);
    }
}
