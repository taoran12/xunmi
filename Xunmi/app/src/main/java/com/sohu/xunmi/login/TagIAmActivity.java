package com.sohu.xunmi.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sohu.xunmi.R;


public class TagIAmActivity extends AppCompatActivity implements View.OnClickListener {
    private String lableName[] = {"a", "b", "c"
    };
    private String lableName1[] = {"d", "e", "f", "g", "h"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_tag_iam_activity);
        initData();
        initView();
    }

    public void initData() {
    }

    LabelLayout labelLayout, labelLayoutall;
    ViewGroup.MarginLayoutParams lp;

    private void initView() {

        lp = new ViewGroup.MarginLayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.leftMargin = 5;
        lp.rightMargin = 5;
        lp.topMargin = 5;
        lp.bottomMargin = 5;

        labelLayout = (LabelLayout) findViewById(R.id.flow);
        labelLayoutall = (LabelLayout) findViewById(R.id.flow_all);
        for (String aLableName : lableName) {
            TextView view = new TextView(this);
            view.setText(aLableName);
            //view.setBackgroundDrawable(getResources().getDrawable(shape_file_pressed));
            view.setBackgroundColor(0);
            view.setTag("up");
            labelLayout.addView(view, lp);
            view.setOnClickListener(this);
        }

        for (String aLableName : lableName1) {
            TextView view = new TextView(this);
            view.setText(aLableName);
            //view.setBackgroundDrawable(getResources().getDrawable(shape_file_pressed));
            view.setBackgroundColor(0);
            view.setTag("down");
            labelLayoutall.addView(view, lp);
            view.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        String txt = ((TextView) view).getText().toString();
        if (view.getTag().equals("up")) {
            labelLayout.removeView(view);
            labelLayout.invalidate();

            TextView view1 = new TextView(this);
            view1.setText(txt);
            //view1.setBackgroundDrawable(getResources().getDrawable(shape_file_pressed));
            view.setBackgroundColor(0);
            view1.setTag("down");
            view1.setOnClickListener(this);

            labelLayoutall.addView(view1, lp);
            labelLayoutall.invalidate();

        } else if (view.getTag().equals("down")) {
            labelLayoutall.removeView(view);
            labelLayoutall.invalidate();

            TextView view1 = new TextView(this);
            view1.setText(txt);
            //view1.setBackgroundDrawable(getResources().getDrawable(shape_file_pressed));
            view.setBackgroundColor(0);
            view1.setTag("up");
            view1.setOnClickListener(this);

            labelLayout.addView(view1, lp);
            labelLayout.invalidate();
        }
    }
}

