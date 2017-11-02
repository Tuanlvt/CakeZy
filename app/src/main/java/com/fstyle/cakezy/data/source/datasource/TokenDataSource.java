package com.fstyle.cakezy.data.source.datasource;

public interface TokenDataSource {

    interface RemoteDataSource {

    }

    interface LocalDataSource {
        void saveToken(String token);

        String getToken();
    }
}
