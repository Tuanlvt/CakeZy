package com.fstyle.cakezy.view.decorationscake;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fstyle.cakezy.R;
import com.fstyle.cakezy.databinding.FragmentDecorationsCakeBinding;
import com.fstyle.cakezy.view.BaseFragment;
import com.fstyle.cakezy.viewmodel.DecorationsCakeViewModel;
import javax.inject.Inject;

/**
 * Created by Tuanlvt on 06/11/2017.
 */

public class DecorationsCakeFragment extends BaseFragment {
    @Inject
    DecorationsCakeViewModel mViewModel;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {

        DaggerDecorationsCakeComponent.builder()
                .appComponent(getAppComponent())
                .decorationsCakeModule(new DecorationsCakeModule(this))
                .build()
                .inject(this);

        FragmentDecorationsCakeBinding binding =
                DataBindingUtil.inflate(inflater, R.layout.fragment_decorations_cake, container,
                        false);
        binding.setViewModel(mViewModel);

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
