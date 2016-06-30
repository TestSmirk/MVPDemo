package com.example.testsmirk.mvpdemo.app;

import android.app.Application;

import org.xutils.x;

/**
 * Created by TestSmirk on 2016/6/30.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(true);

    }
}
