package com.example.testsmirk.mvpdemo.login;

import android.widget.EditText;

/**
 * Created by TestSmirk on 2016/6/30.
 */
public class LoginPresenterlmpl implements LoginPresenter,LoginInteractor.OnLoginFinishListener {
    private LoginView loginView;
    private LoginInteractor loginInteractor;

    public LoginPresenterlmpl(LoginView loginView) {
        this.loginView = loginView;
        loginInteractor = new LoginInteractorlmpl();
    }

    @Override
    public void login(EditText username, EditText password) {
        if(loginView!=null) loginView.onShowProgress();
        loginInteractor.login(username,password,this);
    }

    @Override
    public void onDestroy() {
        loginView=null;
    }

    @Override
    public void onUsernameErr() {
        if(loginView==null)
            return;
        loginView.onUsernameErr();
        loginView.onDismissProgress();
    }

    @Override
    public void onPasswordErr() {
        if(loginView==null)
            return;
        loginView.onPasswordErr();
        loginView.onDismissProgress();
    }

    @Override
    public void onSuccess() {
        if(loginView==null)
            return;
        loginView.onLoginComplate();
    }
}
