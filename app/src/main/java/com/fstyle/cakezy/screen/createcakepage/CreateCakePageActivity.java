package com.fstyle.cakezy.screen.createcakepage;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import com.fstyle.cakezy.MainApplication;
import com.fstyle.cakezy.R;
import com.fstyle.cakezy.databinding.ActivityCreateCakeBinding;
import javax.inject.Inject;

/**
 * Created by Tuanlvt on 31/10/2017.
 */

public class CreateCakePageActivity extends AppCompatActivity {
    @Inject
    CreateCakePageContract.ViewModel mViewModel;
    private CreateCakePageComponent mCreateCakePageComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCreateCakePageComponent = DaggerCreateCakePageComponent.builder()
                .appComponent(((MainApplication) getApplication()).getAppComponent())
                .createCakePageModule(new CreateCakePageModule(this))
                .build();
        mCreateCakePageComponent.inject(this);

        ActivityCreateCakeBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_create_cake);
        binding.setViewModel((CreateCakePageViewModel) mViewModel);
        setSupportActionBar(binding.toolbar);
        fillData();
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_create_cake, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.save:
                Toast.makeText(getApplicationContext(), R.string.create_cake, Toast.LENGTH_SHORT)
                        .show();
        }
        return super.onOptionsItemSelected(item);
    }

    private void fillData() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setTitle(R.string.create_cake);
    }

    public CreateCakePageComponent getCreateCakePageComponent() {
        return mCreateCakePageComponent;
    }
}
