package com.fstyle.cakezy.screen;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by Tuanlvt on 07/11/2017.
 */

public abstract class BaseActivity extends AppCompatActivity {

    protected void setUpActionBar(Boolean setButtonBack, int title) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(setButtonBack);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setTitle(title);
    }
}
