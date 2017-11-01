package com.fstyle.cakezy.data.source.datasource.impl;

import com.fstyle.cakezy.data.model.CakeModel;
import com.fstyle.cakezy.data.source.datasource.CakeDataSource;
import com.fstyle.cakezy.data.source.remote.BaseRemoteDataSource;
import com.fstyle.cakezy.data.source.remote.api.service.CakeZyApi;

import javax.inject.Inject;

import io.reactivex.Completable;

/**
 * Created by daolq on 10/31/17.
 */

public class CakeRemoteDataSourceImpl extends BaseRemoteDataSource implements CakeDataSource.RemoteDataSource {

    @Inject
    public CakeRemoteDataSourceImpl(CakeZyApi api) {
        super(api);
    }

    @Override
    public Completable doUploadCakeToServer(CakeModel cakeModel) {
        // api call upload cakeModel to server in here!
        return null;
    }
}
