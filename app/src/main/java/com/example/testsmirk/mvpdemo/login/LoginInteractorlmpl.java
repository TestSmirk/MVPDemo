package com.example.testsmirk.mvpdemo.login;

import android.text.TextUtils;
import android.widget.EditText;

import org.xutils.x;

/**
 * Created by TestSmirk on 2016/6/30.
 */
public class LoginInteractorlmpl implements LoginInteractor {


    @Override
    public void login(final EditText username, final EditText password, final OnLoginFinishListener listener) {
        x.task().postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean err = false;
                if (TextUtils.isEmpty(username.getText().toString())) {
                    listener.onUsernameErr();
                    err = true;
                }

                if (TextUtils.isEmpty(password.getText().toString())) {
                    listener.onPasswordErr();
                    err = true;
                }
                if(!err) listener.onSuccess();


            }
        }, 2000);
    }
}
