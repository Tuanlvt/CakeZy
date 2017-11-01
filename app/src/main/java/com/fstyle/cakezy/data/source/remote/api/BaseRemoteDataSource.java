package com.fstyle.cakezy.data.source.remote.api;

import com.fstyle.cakezy.data.source.remote.api.service.CakezyApi;

/**
 * Created by Tuanlvt on 01/11/2017.
 */

public abstract class BaseRemoteDataSource {

    CakezyApi mCakezyApi;

    public BaseRemoteDataSource(CakezyApi api) {
        mCakezyApi = api;
    }
}
