package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MTestRelativeLayoutActivity extends AppCompatActivity {

    TextView tvTop;
    TextView tvBottom;
    TextView tvLeft;
    TextView tvRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_relativelayout);

        tvTop = findViewById(R.id.tvTop);
        tvTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        tvBottom = findViewById(R.id.tvBottom);
        tvBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        tvLeft = findViewById(R.id.tvLeft);
        tvLeft.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        });

        tvRight = findViewById(R.id.tvRight);
        tvRight.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        });
    }
}
