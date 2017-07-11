package com.ximsfei.app;

/**
 * Created by ximsfei on 2017/7/10.
 */
public class ActivityThread {
    private String mInstrumentation = "Origin mInstrumentation";
    private String mApplication = "Origin mApplication";

    @Override
    public String toString() {
        return "ActivityThread mInstrumentation = "
                + mInstrumentation
                + ", mApplication = "
                + mApplication;
    }
}
