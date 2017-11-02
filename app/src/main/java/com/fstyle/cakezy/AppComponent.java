package com.fstyle.cakezy;

import android.content.Context;

import com.fstyle.cakezy.data.source.RepositoryModule;
import com.fstyle.cakezy.data.source.local.LocalDataModule;
import com.fstyle.cakezy.data.source.remote.RemoteDataModule;
import com.fstyle.cakezy.repository.CakeRepository;
import com.fstyle.cakezy.utils.dagger.AppScope;
import com.fstyle.cakezy.utils.rx.BaseSchedulerProvider;

import dagger.Component;

/**
 * Created by Tuanlvt on 31/10/2017.
 */

@AppScope
@Component(modules = { ApplicationModule.class, RemoteDataModule.class, RepositoryModule.class, LocalDataModule.class})
public interface AppComponent {

    //============== Region for Repository ================//

    CakeRepository cakeRepository();

    //=============== Region for common ===============//

    Context applicationContext();

    BaseSchedulerProvider baseSchedulerProvider();
}
