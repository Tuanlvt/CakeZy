package com.fstyle.cakezy.screen.decorationscake;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.fstyle.cakezy.utils.dagger.ActivityScope;
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
    public DecorationsCakeContract.ViewModel provideViewModel(
            DecorationsCakeContract.Presenter presenter) {
        return new DecorationsCakeViewModel(presenter);
    }

    @ActivityScope
    @Provides
    public DecorationsCakeContract.Presenter providePresenter() {
        return new DecorationsCakePresenter();
    }
}
