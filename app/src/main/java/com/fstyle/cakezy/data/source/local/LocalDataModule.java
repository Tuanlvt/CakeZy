package com.fstyle.cakezy.data.source.local;

import android.content.Context;

import com.fstyle.cakezy.data.source.local.sharedprf.SharedPrefsApi;
import com.fstyle.cakezy.data.source.local.sharedprf.SharedPrefsImpl;
import com.fstyle.cakezy.utils.dagger.AppScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by daolq on 11/2/17.
 */

@Module
public class LocalDataModule {

    @AppScope
    @Provides
    public SharedPrefsApi provideSharedPrefsApi(Context context) {
        return new SharedPrefsImpl(context);
    }
}
