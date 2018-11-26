package com.cumulations.implicitintentrx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString(Intent.EXTRA_TEXT);
            textView.setText(value);
        }
    }
}
