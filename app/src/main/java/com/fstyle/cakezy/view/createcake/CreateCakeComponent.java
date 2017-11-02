package com.fstyle.cakezy.view.createcake;

import com.fstyle.cakezy.AppComponent;
import com.fstyle.cakezy.utils.dagger.FragmentScope;

import dagger.Component;

/**
 * Created by Tuanlvt on 01/11/2017.
 */
@FragmentScope
@Component(dependencies = AppComponent.class, modules = CreateCakeModule.class)
public interface CreateCakeComponent {
    void inject(CreateCakeFragment createCakeFragment);
}
