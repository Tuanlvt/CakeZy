package com.fstyle.cakezy.data.source;

import com.fstyle.cakezy.data.source.datasource.impl.CakeLocalDataSourceImpl;
import com.fstyle.cakezy.data.source.datasource.impl.CakeRemoteDataSourceImpl;
import com.fstyle.cakezy.repository.CakeRepository;
import com.fstyle.cakezy.repository.impl.CakeRepositoryImpl;
import com.fstyle.cakezy.utils.dagger.AppScope;
import com.fstyle.cakezy.utils.rx.BaseSchedulerProvider;
import com.fstyle.cakezy.utils.rx.SchedulerProvider;

import dagger.Module;
import dagger.Provides;

@Module
public class RepositoryModule {

    @Provides
    @AppScope
    public BaseSchedulerProvider provideBaseSchedulerProvider() {
        return SchedulerProvider.getInstance();
    }

    @Provides
    @AppScope
    public CakeRepository provideCakeRepository(CakeLocalDataSourceImpl cakeLocalDataSource, CakeRemoteDataSourceImpl cakeRemoteDataSource) {
        return new CakeRepositoryImpl(cakeLocalDataSource, cakeRemoteDataSource);
    }
}
