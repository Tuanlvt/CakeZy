package com.fstyle.cakezy.screen.choosestylecake;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.fstyle.cakezy.utils.dagger.ActivityScope;
import com.fstyle.cakezy.utils.navigator.Navigator;
import dagger.Module;
import dagger.Provides;

/**
 * This is a Dagger module. We use this to pass in the View dependency to
 * the {@link ChooseStyleCakePresenter}.
 */
@Module
public class ChooseStyleCakeModule {

    private Activity mActivity;

    public ChooseStyleCakeModule(@NonNull Activity activity) {
        this.mActivity = activity;
    }

    @ActivityScope
    @Provides
    public ChooseStyleCakeContract.ViewModel provideViewModel(Navigator navigator,
            ChooseStyleCakeContract.Presenter presenter) {
        return new ChooseStyleCakeViewModel(navigator, presenter);
    }

    @ActivityScope
    @Provides
    public ChooseStyleCakeContract.Presenter providePresenter() {
        return new ChooseStyleCakePresenter();
    }

    @ActivityScope
    @Provides
    public Navigator provideNavigator() {
        return new Navigator(mActivity);
    }
}
