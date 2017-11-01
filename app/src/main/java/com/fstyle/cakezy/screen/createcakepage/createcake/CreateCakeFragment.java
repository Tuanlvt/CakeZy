package com.fstyle.cakezy.screen.createcakepage.createcake;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fstyle.cakezy.R;
import com.fstyle.cakezy.databinding.FragmentCreateCakeBinding;
import com.fstyle.cakezy.screen.BaseFragment;
import com.fstyle.cakezy.screen.createcakepage.CreateCakePageActivity;
import javax.inject.Inject;

/**
 * Created by Tuanlvt on 01/11/2017.
 */

public class CreateCakeFragment extends BaseFragment {

    @Inject
    CreateCakeContract.ViewModel mViewModel;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {

        DaggerCreateCakeComponent.builder()
                .createCakePageComponent(
                        ((CreateCakePageActivity) getActivity()).getCreateCakePageComponent())
                .createCakeModule(new CreateCakeModule(this))
                .build()
                .inject(this);

        FragmentCreateCakeBinding binding =
                DataBindingUtil.inflate(inflater, R.layout.fragment_create_cake, container, false);
        binding.setViewModel((CreateCakeViewModel) mViewModel);
        return binding.getRoot();
    }

    @Override
    public void onStart() {
        super.onStart();
        mViewModel.onStart();
    }

    @Override
    public void onStop() {
        mViewModel.onStop();
        super.onStop();
    }
}
