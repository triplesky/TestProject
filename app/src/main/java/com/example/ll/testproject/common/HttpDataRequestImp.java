package com.example.ll.testproject.common;

import com.example.ll.testproject.MyApplication;

import java.io.File;

import okhttp3.OkHttpClient;

/**
 * Created by ll on 2018/5/31.
 */

public class HttpDataRequestImp {
    private static final int OUT_TIME = 15;
    private static volatile HttpDataRequestImp instance = null;
    private HttpDataInterFace dataInterFace;
    private OkHttpClient client;
    private

    public static HttpDataRequestImp getInstance() {
        if (null == instance) {
            synchronized (HttpDataRequestImp.class) {
                if (null == instance) {
                    instance = new HttpDataRequestImp(MyApplication.getInstance().getCacheDir());
                }
            }
        }
        return instance;
    }

    private HttpDataRequestImp(File cacheDir) {

    }

}
