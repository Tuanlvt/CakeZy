package com.fstyle.cakezy.screen.choosestylecake;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import com.fstyle.cakezy.MainApplication;
import com.fstyle.cakezy.R;
import com.fstyle.cakezy.databinding.ActivityChooseStyleCakeBinding;
import com.fstyle.cakezy.screen.BaseActivity;
import javax.inject.Inject;

/**
 * choosestylecake Screen.
 */
public class ChooseStyleCakeActivity extends BaseActivity {

    @Inject
    ChooseStyleCakeContract.ViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setUpActionBar(false, R.string.choose_style_cake);

        DaggerChooseStyleCakeComponent.builder()
                .appComponent(((MainApplication) getApplication()).getAppComponent())
                .chooseStyleCakeModule(new ChooseStyleCakeModule(this))
                .build()
                .inject(this);

        ActivityChooseStyleCakeBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_choose_style_cake);
        binding.setViewModel(mViewModel);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mViewModel.onStart();
    }

    @Override
    protected void onStop() {
        mViewModel.onStop();
        super.onStop();
    }
}
