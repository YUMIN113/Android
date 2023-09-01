package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.databinding.ActivityTestRecyclerviewlayoutBinding;
import com.example.myapplication.str.MStudent;

import java.util.ArrayList;
import java.util.List;

public class MTestRecyclerViewLayoutActivity extends AppCompatActivity {

    RecyclerView.LayoutManager layoutManager;
    RecyclerView recyclerView;
    CustomAdapter customAdapter;
    TextView mtvBtn;

    // data
    List<MStudent> mStudentList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_recyclerviewlayout);

        for (int i = 0; i < mStudentList.size(); i++) {
            MStudent _str = new MStudent();
            _str.mName = "for i : " + i;
            mStudentList.add(_str);
        }

        customAdapter = new CustomAdapter(mStudentList);
        recyclerView = findViewById(R.id.list);
        recyclerView.setAdapter(customAdapter);

        layoutManager = new LinearLayoutManager(this);

        mtvBtn = findViewById(R.id.mtvBtnTopRight);
        mtvBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recyclerView.setLayoutManager(layoutManager);
            }
        });
    }
}
