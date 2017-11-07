package com.fstyle.cakezy.view;

import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    protected void setUpActionBar(Boolean setButtonBack, int title) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(setButtonBack);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setTitle(title);
    }
}
