package com.fstyle.cakezy.data.source.local;

import com.fstyle.cakezy.data.source.local.sharedprf.SharedPrefsApi;

public abstract class BaseLocalDataSource {
    protected SharedPrefsApi mPrefsApi;

    public BaseLocalDataSource(SharedPrefsApi mPrefsApi) {
        this.mPrefsApi = mPrefsApi;
    }
}
