package com.fstyle.cakezy.screen.decorationscake;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import com.fstyle.cakezy.MainApplication;
import com.fstyle.cakezy.R;
import com.fstyle.cakezy.databinding.ActivityDecorationsCakeBinding;
import com.fstyle.cakezy.screen.BaseActivity;
import javax.inject.Inject;

/**
 * decorationscake Screen.
 */
public class DecorationsCakeActivity extends BaseActivity {

    @Inject
    DecorationsCakeContract.ViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setUpActionBar(true, R.string.decorations_body_cake);

        DaggerDecorationsCakeComponent.builder()
                .appComponent(((MainApplication) getApplication()).getAppComponent())
                .decorationsCakeModule(new DecorationsCakeModule(this))
                .build()
                .inject(this);

        ActivityDecorationsCakeBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_decorations_cake);
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
