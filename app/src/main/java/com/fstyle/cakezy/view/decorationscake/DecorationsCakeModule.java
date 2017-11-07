package com.fstyle.cakezy.view.decorationscake;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import com.fstyle.cakezy.repository.CakeRepository;
import com.fstyle.cakezy.utils.dagger.FragmentScope;
import com.fstyle.cakezy.viewmodel.DecorationsCakeViewModel;
import com.fstyle.cakezy.viewmodel.impl.DecorationsCakeViewModelImpl;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Tuanlvt on 06/11/2017.
 */

@Module
public class DecorationsCakeModule {

    private Fragment mFragment;

    public DecorationsCakeModule(@NonNull Fragment fragment) {
        this.mFragment = fragment;
    }

    @FragmentScope
    @Provides
    public DecorationsCakeViewModel provideViewModel(Context context, CakeRepository repository) {
        return new DecorationsCakeViewModelImpl(context, repository);
    }
}
