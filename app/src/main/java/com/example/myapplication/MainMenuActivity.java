package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainMenuActivity extends AppCompatActivity {

    TextView mTV1, mTV2, mTV3, mTV4;

    Button mBtn1;
    CheckBox mcb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        mTV1 = findViewById(R.id.mTV1);
        mTV2 = findViewById(R.id.mTV2);
        mTV3 = findViewById(R.id.mTV3);
        mTV4 = findViewById(R.id.mTV4);


        mTV1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MDebug.d_("mTV1 click!");

                Intent _intent = new Intent(MainMenuActivity.this, MTestRecyclerViewLayoutActivity.class);
                startActivity(_intent);
            }
        });

        mTV2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MDebug.d_("mTV2 click!");

                Intent _intent = new Intent(MainMenuActivity.this, MTestRelativeLayoutActivity.class);
                startActivity(_intent);
            }
        });

        mTV3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MDebug.d_("mTV3 click!");
                Intent _intent = new Intent(MainMenuActivity.this, MTVActivity3.class);
                startActivity(_intent);
            }
        });

        mTV4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MDebug.d_("mTV4 click!");
                Intent _intent = new Intent(MainMenuActivity.this, MTVActivity4.class);
                startActivity(_intent);
            }
        });

        MDebug.d_("onCreate!");
    }


    @Override
    protected void onResume() {
        super.onResume();
        MDebug.d_("In onResume!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        MDebug.d_("In onPause!");
    }
}