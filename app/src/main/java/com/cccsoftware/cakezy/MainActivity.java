package com.cccsoftware.cakezy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView helloWorldTxt = findViewById(R.id.helloWorldTxt);
        helloWorldTxt.setOnClickListener(view -> Toast.makeText(MainActivity.this, "Hello World!", Toast.LENGTH_LONG).show());
    }
}

