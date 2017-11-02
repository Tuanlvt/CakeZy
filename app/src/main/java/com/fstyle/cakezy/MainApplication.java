package com.fstyle.cakezy;

import android.app.Application;
import android.support.v7.app.AppCompatDelegate;

import com.fstyle.cakezy.data.source.RepositoryModule;
import com.fstyle.cakezy.data.source.local.LocalDataModule;
import com.fstyle.cakezy.data.source.remote.RemoteDataModule;

/**
 * Created by Tuanlvt on 31/10/2017.
 */

public class MainApplication extends Application {

    private AppComponent mAppComponent;

    public AppComponent getAppComponent() {
        if (mAppComponent == null) {
            mAppComponent = DaggerAppComponent.builder()
                    .applicationModule(new ApplicationModule(getApplicationContext()))
                    .localDataModule(new LocalDataModule())
                    .remoteDataModule(new RemoteDataModule(this))
                    .repositoryModule(new RepositoryModule())
                    .build();
        }
        return mAppComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }
}
