package com.fstyle.cakezy.view.createcake;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import com.fstyle.cakezy.repository.CakeRepository;
import com.fstyle.cakezy.utils.dagger.FragmentScope;
import com.fstyle.cakezy.utils.navigator.Navigator;
import com.fstyle.cakezy.viewmodel.CakeViewModel;
import com.fstyle.cakezy.viewmodel.impl.CakeViewModelImpl;
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
    public CakeViewModel provideViewModel(Context context, CakeRepository repository) {
        return new CakeViewModelImpl(context, provideNavigator(), repository);
    }

    @FragmentScope
    @Provides
    public Navigator provideNavigator() {
        return new Navigator(mFragment);
    }
}
