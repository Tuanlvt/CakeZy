package com.fstyle.cakezy.screen.decorationscake;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
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
        setUpActionBar(true, R.string.decorations_cake);

        DaggerDecorationsCakeComponent.builder()
                .appComponent(((MainApplication) getApplication()).getAppComponent())
                .decorationsCakeModule(new DecorationsCakeModule(this))
                .build()
                .inject(this);

        ActivityDecorationsCakeBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_decorations_cake);
        binding.setViewModel((DecorationsCakeViewModel) mViewModel);
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
                Toast.makeText(getApplicationContext(), R.string.decorations_cake,
                        Toast.LENGTH_SHORT).show();
                break;
            case android.R.id.home:
                finish();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
