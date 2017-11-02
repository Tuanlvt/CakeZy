package com.fstyle.cakezy.repository;

import com.fstyle.cakezy.data.source.datasource.CakeDataSource;

public interface CakeRepository extends CakeDataSource.RemoteDataSource, CakeDataSource.LocalDataSource {
}
