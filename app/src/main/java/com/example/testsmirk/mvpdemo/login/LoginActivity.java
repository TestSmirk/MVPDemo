package com.example.testsmirk.mvpdemo.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.testsmirk.mvpdemo.R;
import com.example.testsmirk.mvpdemo.main.MainActivity;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;

@ContentView(R.layout.activity_main)
public class LoginActivity extends BaseActivity implements LoginView{
    @ViewInject(R.id.progressBar)
    private ProgressBar progressBar;
    @ViewInject(R.id.et_username)
    private EditText te_username;
    @ViewInject(R.id.et_password)
    private EditText et_password;
    private LoginPresenterlmpl login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        login = new LoginPresenterlmpl(this);
    }
    @Event(R.id.bt_login)
    private void loginEvent(View v){
        Log.d(TAG, "loginEvent() called with: " + "v = [" + v + "]");
        login.login(te_username,et_password);
    }

    @Override
    public void onShowProgress() {
        Log.d(TAG, "onShowProgress() called with: " + "");
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void onDismissProgress() {
        Log.d(TAG, "onDismissProgress() called with: " + "");
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void onLoginComplate() {
        Log.d(TAG, "onLoginComplate() called with: " + "");
        startActivity(new Intent(this,MainActivity.class));
        this.finish();
    }

    @Override
    public void onLoginFail() {
        Log.d(TAG, "onLoginFail() called with: " + "");
        Toast.makeText(LoginActivity.this, "login fial", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUsernameErr() {
        Log.d(TAG, "onUsernameErr() called with: " + "");
        te_username.setError("username not empty");
    }

    @Override
    public void onPasswordErr() {
        Log.d(TAG, "onPasswordErr() called with: " + "");
        et_password.setError("password not empty");
    }

    private static final String TAG = "LoginActivity";

}
