package com.example.testsmirk.mvpdemo.login;

import android.widget.EditText;

/**
 * Created by TestSmirk on 2016/6/30.
 */
public interface LoginInteractor {
    interface OnLoginFinishListener{
        void onUsernameErr();
        void onPasswordErr();
        void onSuccess();
    }
    void login(EditText username,EditText password,OnLoginFinishListener listener);
}
