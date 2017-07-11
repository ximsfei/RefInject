package com.ximsfei.app;

/**
 * Created by ximsfei on 2017/7/10.
 */
public class App {
    public static void main(String[] args) {
        ActivityThread origin = new ActivityThread();
        System.out.println(ActivityThread.class);
        System.out.println(origin);
        mirror.com.ximsfei.app.ActivityThread.mApplication.set(origin, "Inject Application");
        mirror.com.ximsfei.app.ActivityThread.mInstrumentation.set(origin, "Inject Instrumentation");
        System.out.println(mirror.com.ximsfei.app.ActivityThread.TYPE);
        System.out.println(origin);
    }
}
