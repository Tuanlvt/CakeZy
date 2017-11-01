package com.fstyle.cakezy.screen.createcakepage.createcake;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import com.fstyle.cakezy.utils.dagger.FragmentScope;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Tuanlvt on 01/11/2017.
 */
@Module
class CreateCakeModule {

    private Fragment mFragment;

    public CreateCakeModule(@NonNull Fragment fragment) {
        this.mFragment = fragment;
    }

    @FragmentScope
    @Provides
    public CreateCakeContract.ViewModel provideViewModel() {
        return new CreateCakeViewModel(mFragment.getContext());
    }
}
