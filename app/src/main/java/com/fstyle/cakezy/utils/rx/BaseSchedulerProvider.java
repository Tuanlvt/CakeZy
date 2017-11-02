package com.fstyle.cakezy.utils.rx;

import android.support.annotation.NonNull;
import io.reactivex.Scheduler;

/**
 * Created by Tuanlvt on 01/11/2017.
 */

public interface BaseSchedulerProvider {
    @NonNull
    Scheduler comScheduler();

    @NonNull
    Scheduler io();

    @NonNull
    Scheduler ui();
}
