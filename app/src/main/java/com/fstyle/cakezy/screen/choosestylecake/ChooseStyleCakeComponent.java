package com.fstyle.cakezy.screen.choosestylecake;

import com.fstyle.cakezy.AppComponent;
import com.fstyle.cakezy.utils.dagger.ActivityScope;
import dagger.Component;

/**
 * This is a Dagger component. Refer to {@link com.fstyle.cakezy.MainApplication} for the list of
 * Dagger components
 * used in this application.
 */
@ActivityScope
@Component(dependencies = AppComponent.class, modules = ChooseStyleCakeModule.class)
public interface ChooseStyleCakeComponent {
    void inject(ChooseStyleCakeActivity choosestylecakeActivity);
}
