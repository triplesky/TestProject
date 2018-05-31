package com.example.ll.testproject.common;

import java.security.Signature;

/**
 * Created by ll on 2018/5/30.
 */

public class Singleton {
    private Singleton() {

    }
    private static volatile Singleton instance = null;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (null == instance) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    private static class LazyHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static final Singleton getInstanceForLazy() {
        return LazyHolder.INSTANCE;
    }
}
