package com.sohu.xunmi.login;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sohu.xunmi.R;
import com.zhy.view.flowlayout.FlowLayout;
import com.zhy.view.flowlayout.TagAdapter;
import com.zhy.view.flowlayout.TagFlowLayout;

import java.util.ArrayList;


public class TagIAmActivity extends Activity {
    TagFlowLayout tagFlowLayout;
    Button iwantButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ArrayList<String> iamTags = new ArrayList<String>();

        iamTags.add("a");
        iamTags.add("b");
        super.onCreate(savedInstanceState);
        tagFlowLayout = (TagFlowLayout)findViewById(R.id.iam_flowlayout);
        tagFlowLayout.setAdapter(new TagAdapter<String>(iamTags)
        {
            @Override
            public View getView(FlowLayout parent, int position, String s) {
                return null;
            }
        });
        //flowLayout = (FlowLayout)findViewById(R.id.);

        //iwantButton = (Button)findViewById(R.id.iwant)
    }
}