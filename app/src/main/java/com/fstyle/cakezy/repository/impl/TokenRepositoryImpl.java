package com.fstyle.cakezy.repository.impl;

import com.fstyle.cakezy.data.source.datasource.TokenDataSource;
import com.fstyle.cakezy.data.source.datasource.impl.TokenLocalDataSourceImpl;
import com.fstyle.cakezy.repository.TokenRepository;

import javax.inject.Inject;

public class TokenRepositoryImpl implements TokenRepository {

    private TokenDataSource.LocalDataSource mLocalDataSource;

    @Inject
    public TokenRepositoryImpl(TokenLocalDataSourceImpl localDataSource) {
        mLocalDataSource = localDataSource;
    }

    @Override
    public void saveToken(String token) {
        mLocalDataSource.saveToken(token);
    }

    @Override
    public String getToken() {
        return mLocalDataSource.getToken();
    }
}
