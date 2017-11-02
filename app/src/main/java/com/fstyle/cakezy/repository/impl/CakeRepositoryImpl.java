package com.fstyle.cakezy.repository.impl;


import com.fstyle.cakezy.data.model.CakeModel;
import com.fstyle.cakezy.data.source.datasource.CakeDataSource;
import com.fstyle.cakezy.repository.CakeRepository;

import javax.inject.Inject;

import io.reactivex.Completable;
import io.reactivex.Single;

public class CakeRepositoryImpl implements CakeRepository {

    private CakeDataSource.LocalDataSource mLocalDataSource;
    private CakeDataSource.RemoteDataSource mRemoteDataSource;

    @Inject
    public CakeRepositoryImpl(CakeDataSource.LocalDataSource mLocalDataSource, CakeDataSource.RemoteDataSource mRemoteDataSource) {
        this.mLocalDataSource = mLocalDataSource;
        this.mRemoteDataSource = mRemoteDataSource;
    }

    @Override
    public Completable saveCakeToLocalData(CakeModel cakeModel) {
        return mLocalDataSource.saveCakeToLocalData(cakeModel);
    }

    @Override
    public Single<CakeModel> loadCakeFromLocalData(int cakeId) {
        return mLocalDataSource.loadCakeFromLocalData(cakeId);
    }

    @Override
    public Completable doUploadCakeToServer(CakeModel cakeModel) {
        return mRemoteDataSource.doUploadCakeToServer(cakeModel);
    }
}
