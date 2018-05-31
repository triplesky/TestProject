package com.example.ll.testproject;

import android.app.Application;

/**
 * Created by ll on 2018/5/31.
 */

public class MyApplication extends Application {
    private static MyApplication instance;

    public static MyApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}
