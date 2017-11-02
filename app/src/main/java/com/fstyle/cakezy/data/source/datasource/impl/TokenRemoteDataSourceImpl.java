package com.fstyle.cakezy.data.source.datasource.impl;

import com.fstyle.cakezy.data.source.datasource.TokenDataSource;
import com.fstyle.cakezy.data.source.remote.BaseRemoteDataSource;
import com.fstyle.cakezy.data.source.remote.api.service.CakeZyApi;

/**
 * Created by daolq on 10/31/17.
 */

public class TokenRemoteDataSourceImpl extends BaseRemoteDataSource implements TokenDataSource.RemoteDataSource {

    public TokenRemoteDataSourceImpl(CakeZyApi api) {
        super(api);
    }
}
