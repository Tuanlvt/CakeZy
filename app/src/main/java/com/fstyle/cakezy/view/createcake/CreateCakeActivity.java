package com.fstyle.cakezy.view.createcake;

import android.os.Bundle;
import com.fstyle.cakezy.R;
import com.fstyle.cakezy.view.BaseActivity;

/**
 * Created by Tuanlvt on 31/10/2017.
 */

public class CreateCakeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setUpActionBar(false, R.string.choose_style_cake);
        setContentView(R.layout.activity_create_cake);
    }
}
