package com.example.framgiaphanvanlinh.androidlayoutparams;

import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LinearLayoutActivity extends AppCompatActivity {

    TextView tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        tvTitle = findViewById(R.id.text_title);

        findViewById(R.id.button_change).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMargins(tvTitle, 40,null,null,null);
            }
        });
//        setMargins(tvTitle, 20,30,40,50);
    }

    private void setMargins(View view, @Nullable Integer start, @Nullable Integer top,
            @Nullable Integer end, @Nullable Integer bottom) {
        ViewGroup.MarginLayoutParams layoutParams =
                (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (start != null) {
            layoutParams.setMarginStart(start);
        }
        if (top != null) {
            layoutParams.topMargin = top;
        }
        if (end != null) {
            layoutParams.setMarginEnd(end);
        }
        if (bottom != null) {
            layoutParams.bottomMargin = bottom;
        }
        view.setLayoutParams(layoutParams); // for redraw your view
    }
}
