package com.example.testsmirk.mvpdemo.login;

/**
 * Created by TestSmirk on 2016/6/30.
 */
public interface LoginView {
    void onShowProgress();
    void onDismissProgress();
    void onLoginComplate();
    void onLoginFail();
    void onUsernameErr();
    void onPasswordErr();
}
