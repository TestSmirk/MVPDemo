package com.example.testsmirk.mvpdemo.login;

import android.widget.EditText;

/**
 * Created by TestSmirk on 2016/6/30.
 */
public interface LoginPresenter {
    void login(EditText username,EditText password);
    void onDestroy();
}
