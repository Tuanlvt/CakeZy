package com.fstyle.cakezy.data.source.datasource.impl;

import android.support.annotation.NonNull;

import com.fstyle.cakezy.data.source.datasource.TokenDataSource;
import com.fstyle.cakezy.data.source.local.BaseLocalDataSource;
import com.fstyle.cakezy.data.source.local.sharedprf.SharedPrefsApi;
import com.fstyle.cakezy.data.source.local.sharedprf.SharedPrefsKey;

import javax.inject.Inject;

public class TokenLocalDataSourceImpl extends BaseLocalDataSource implements TokenDataSource.LocalDataSource {

    @Inject
    public TokenLocalDataSourceImpl(@NonNull SharedPrefsApi prefsApi) {
        super(prefsApi);
    }

    @Override
    public void saveToken(String token) {
        mPrefsApi.put(SharedPrefsKey.KEY_TOKEN, token);
    }

    @Override
    public String getToken() {
        return mPrefsApi.get(SharedPrefsKey.KEY_TOKEN, String.class);
    }
}
