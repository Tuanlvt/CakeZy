package com.fstyle.cakezy.screen.createcakepage.createcake;

import com.fstyle.cakezy.screen.createcakepage.CreateCakePageComponent;
import com.fstyle.cakezy.utils.dagger.FragmentScope;
import dagger.Component;

/**
 * Created by Tuanlvt on 01/11/2017.
 */
@FragmentScope
@Component(dependencies = CreateCakePageComponent.class, modules = CreateCakeModule.class)
public interface CreateCakeComponent {
    void inject(CreateCakeFragment createCakeFragment);
}
