package com.fstyle.cakezy.view.createcake;

import android.app.ActionBar;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fstyle.cakezy.R;
import com.fstyle.cakezy.databinding.FragmentCreateCakeBinding;
import com.fstyle.cakezy.view.BaseFragment;
import com.fstyle.cakezy.viewmodel.CakeViewModel;
import javax.inject.Inject;

/**
 * Created by Tuanlvt on 01/11/2017.
 */

public class CreateCakeFragment extends BaseFragment {

    @Inject
    CakeViewModel mViewModel;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {

        DaggerCreateCakeComponent.builder()
                .appComponent(getAppComponent())
                .createCakeModule(new CreateCakeModule(this))
                .build()
                .inject(this);

        FragmentCreateCakeBinding binding =
                DataBindingUtil.inflate(inflater, R.layout.fragment_create_cake, container, false);
        binding.setViewModel(mViewModel);
        ActionBar.LayoutParams layoutParams =
                new ActionBar.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT);
        return binding.getRoot();
    }

    @Override
    protected void onStarted() {
        mViewModel.onStart();
    }

    @Override
    protected void onStopped() {
        mViewModel.onStop();
    }
}
