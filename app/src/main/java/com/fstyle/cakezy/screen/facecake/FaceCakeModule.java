package com.fstyle.cakezy.screen.facecake;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.fstyle.cakezy.screen.facecake.adapter.ColorFaceCakeAdapter;
import com.fstyle.cakezy.utils.dagger.ActivityScope;
import dagger.Module;
import dagger.Provides;

/**
 * This is a Dagger module. We use this to pass in the View dependency to
 * the {@link FaceCakePresenter}.
 */
@Module
public class FaceCakeModule {

    private Activity mActivity;

    public FaceCakeModule(@NonNull Activity activity) {
        this.mActivity = activity;
    }

    @ActivityScope
    @Provides
    public FaceCakeContract.ViewModel provideViewModel(ColorFaceCakeAdapter adapter,
            FaceCakeContract.Presenter presenter) {
        return new FaceCakeViewModel(adapter, presenter);
    }

    @ActivityScope
    @Provides
    public FaceCakeContract.Presenter providePresenter() {
        return new FaceCakePresenter();
    }

    @ActivityScope
    @Provides
    public ColorFaceCakeAdapter provideColorFaceAdapter() {
        return new ColorFaceCakeAdapter(mActivity);
    }
}
