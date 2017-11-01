package com.fstyle.cakezy.screen.createcakepage;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.fstyle.cakezy.utils.dagger.ActivityScope;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Tuanlvt on 01/11/2017.
 */

@Module
public class CreateCakePageModule {

    private Activity mActivity;

    public CreateCakePageModule(@NonNull Activity activity) {
        this.mActivity = activity;
    }

    @ActivityScope
    @Provides
    public CreateCakePageContract.ViewModel provideViewModel() {
        return new CreateCakePageViewModel(mActivity);
    }
}
