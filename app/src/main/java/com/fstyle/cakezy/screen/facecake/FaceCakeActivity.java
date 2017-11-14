package com.fstyle.cakezy.screen.facecake;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import com.fstyle.cakezy.MainApplication;
import com.fstyle.cakezy.R;
import com.fstyle.cakezy.databinding.ActivityFaceCakeBinding;
import com.fstyle.cakezy.screen.BaseActivity;
import javax.inject.Inject;

/**
 * facecake Screen.
 */
public class FaceCakeActivity extends BaseActivity {

    @Inject
    FaceCakeContract.ViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setUpActionBar(true, R.string.decorations_face_cake);

        DaggerFaceCakeComponent.builder()
                .appComponent(((MainApplication) getApplication()).getAppComponent())
                .faceCakeModule(new FaceCakeModule(this))
                .build()
                .inject(this);

        ActivityFaceCakeBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_face_cake);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_create_cake, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.save:
                Toast.makeText(getApplicationContext(), R.string.decorations_face_cake,
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
