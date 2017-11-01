package com.fstyle.cakezy.screen.createcakepage;

import com.fstyle.cakezy.AppComponent;
import com.fstyle.cakezy.utils.dagger.ActivityScope;
import dagger.Component;

/**
 * Created by Tuanlvt on 01/11/2017.
 */

@ActivityScope
@Component(dependencies = AppComponent.class, modules = CreateCakePageModule.class)
public interface CreateCakePageComponent {
    void inject(CreateCakePageActivity createCakePageActivity);
}
