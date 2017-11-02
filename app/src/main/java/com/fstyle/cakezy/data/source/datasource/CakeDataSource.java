package com.fstyle.cakezy.data.source.datasource;

import com.fstyle.cakezy.data.model.CakeModel;

import io.reactivex.Completable;
import io.reactivex.Single;

public interface CakeDataSource {
    /**
     * LocalData For Cake
     */
    interface LocalDataSource {
        Completable saveCakeToLocalData(CakeModel cakeModel);

        Single<CakeModel> loadCakeFromLocalData(int cakeId);
    }

    /**
     * RemoteData For Cake
     */
    interface RemoteDataSource {
        Completable doUploadCakeToServer(CakeModel cakeModel);
    }
}
