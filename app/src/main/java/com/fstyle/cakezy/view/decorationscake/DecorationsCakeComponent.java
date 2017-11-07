package com.fstyle.cakezy.view.decorationscake;

import com.fstyle.cakezy.AppComponent;
import com.fstyle.cakezy.utils.dagger.FragmentScope;
import dagger.Component;

/**
 * Created by Tuanlvt on 06/11/2017.
 */

@FragmentScope
@Component(dependencies = AppComponent.class, modules = DecorationsCakeModule.class)
public interface DecorationsCakeComponent {
    void inject(DecorationsCakeFragment decorationsCakeFragment);
}
