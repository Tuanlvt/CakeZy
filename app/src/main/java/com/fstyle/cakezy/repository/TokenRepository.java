package com.fstyle.cakezy.repository;

import com.fstyle.cakezy.data.source.datasource.TokenDataSource;

public interface TokenRepository extends TokenDataSource.LocalDataSource, TokenDataSource.RemoteDataSource {
}
