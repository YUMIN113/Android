package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MTVActivity4 extends AppCompatActivity {

    TextView tvBtnTopRight;
    LinearLayout layout02;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mtv4);

        layout02 = findViewById(R.id.layout02);
        tvBtnTopRight = findViewById(R.id.tvBtnTopRight);
        tvBtnTopRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 if (layout02.getVisibility() != View.INVISIBLE) {
                     layout02.setVisibility(View.INVISIBLE);
                 } else {
                     layout02.setVisibility(View.GONE);
                 }
            }
        });
    }
}
