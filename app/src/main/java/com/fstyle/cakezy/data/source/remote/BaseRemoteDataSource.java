package com.fstyle.cakezy.data.source.remote;

import com.fstyle.cakezy.data.source.remote.api.service.CakeZyApi;

public abstract class BaseRemoteDataSource {

    CakeZyApi mCakeZyApi;

    public BaseRemoteDataSource(CakeZyApi api) {
        mCakeZyApi = api;
    }
}
