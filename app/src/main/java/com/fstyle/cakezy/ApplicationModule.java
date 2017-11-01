package com.fstyle.cakezy;

import android.content.Context;
import com.fstyle.cakezy.utils.dagger.AppScope;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Tuanlvt on 31/10/2017.
 */

@Module
public class ApplicationModule {

    private Context mContext;

    public ApplicationModule(Context mContext) {
        this.mContext = mContext;
    }

    @Provides
    @AppScope
    public Context provideApplicationContext() {
        return mContext;
    }
}
