package com.fstyle.cakezy.view;

import android.support.v4.app.Fragment;

import com.fstyle.cakezy.AppComponent;
import com.fstyle.cakezy.MainApplication;

public abstract class BaseFragment extends Fragment {

    abstract protected void onStarted();

    abstract protected void onStopped();

    @Override
    public void onStart() {
        super.onStart();
        onStarted();
    }

    @Override
    public void onStop() {
        super.onStop();
        onStopped();
    }

    protected AppComponent getAppComponent() {
        return ((MainApplication)getActivity().getApplication()).getAppComponent();
    }
}
