package com.fstyle.cakezy.view.decorationscake;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import com.fstyle.cakezy.R;
import com.fstyle.cakezy.view.BaseActivity;

/**
 * Created by Tuanlvt on 07/11/2017.
 */

public class DecorationsCakeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setUpActionBar(true, R.string.decorations_cake);
        setContentView(R.layout.activity_decorations_cake);
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

