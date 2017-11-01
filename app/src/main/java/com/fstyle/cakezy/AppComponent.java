package com.fstyle.cakezy;

import com.fstyle.cakezy.utils.dagger.AppScope;
import dagger.Component;

/**
 * Created by Tuanlvt on 31/10/2017.
 */

@AppScope
@Component(modules = { ApplicationModule.class })
public interface AppComponent {
}
