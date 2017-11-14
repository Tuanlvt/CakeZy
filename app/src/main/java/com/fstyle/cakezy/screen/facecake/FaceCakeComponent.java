package com.fstyle.cakezy.screen.facecake;

import com.fstyle.cakezy.AppComponent;
import com.fstyle.cakezy.utils.dagger.ActivityScope;
import dagger.Component;

/**
 * This is a Dagger component. Refer to {@link com.fstyle.cakezy.MainApplication} for the list of
 * Dagger components
 * used in this application.
 */
@ActivityScope
@Component(dependencies = AppComponent.class, modules = FaceCakeModule.class)
public interface FaceCakeComponent {
    void inject(FaceCakeActivity facecakeActivity);
}
