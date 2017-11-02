package com.fstyle.cakezy.data.source.datasource.impl;

import com.fstyle.cakezy.data.model.CakeModel;
import com.fstyle.cakezy.data.source.datasource.CakeDataSource;
import com.fstyle.cakezy.data.source.local.BaseLocalDataSource;
import com.fstyle.cakezy.data.source.local.sharedprf.SharedPrefsApi;

import javax.inject.Inject;

import io.reactivex.Completable;
import io.reactivex.Single;

/**
 * Created by daolq on 10/31/17.
 */

public class CakeLocalDataSourceImpl extends BaseLocalDataSource implements CakeDataSource.LocalDataSource {

    @Inject
    public CakeLocalDataSourceImpl(SharedPrefsApi prefsApi) {
        super(prefsApi);
    }

    @Override
    public Completable saveCakeToLocalData(CakeModel cakeModel) {
        return null;
    }

    @Override
    public Single<CakeModel> loadCakeFromLocalData(int cakeId) {
        return null;
    }
}
