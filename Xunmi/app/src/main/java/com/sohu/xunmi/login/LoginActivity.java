package com.sohu.xunmi.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.sohu.xunmi.R;


/**
 * Created by whisky on 2017/4/14.
 */

public class LoginActivity extends Activity {
    EditText loginName, loginPass;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login_activity);

        loginName = (EditText) findViewById(R.id.loginName);
        loginButton = (Button) findViewById(R.id.loginButton);
        loginPass = (EditText) findViewById(R.id.loginPassword);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable userName = loginName.getText();
                Editable userPassword = loginPass.getText();
                System.out.println(userName.toString());
                System.out.println(userPassword.toString());
                //push name&password
                Intent intent = new Intent();
                intent.setClass(LoginActivity.this, TagIAmActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
