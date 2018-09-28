package com.example.framgiaphanvanlinh.androidlayoutparams;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ConstraintLayoutActivity extends AppCompatActivity {

    TextView tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_layout);

        tvTitle = findViewById(R.id.text_title);
        ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams)tvTitle.getLayoutParams();
        params.setMargins(0, 10, 10, 0); //substitute parameters for left, top, right, bottom
//        tv.setLayoutParams(params);

//        params.topMargin = 20;
//        tvTitle.setLayoutParams(params);

//        tvTitle.getLayoutParams().width = LinearLayout.LayoutParams.MATCH_PARENT;


//        ((ConstraintLayout.LayoutParams) tvTitle.getLayoutParams()).topMargin = 10;
    }


}
