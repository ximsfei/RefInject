package mirror.com.ximsfei.app;

import com.ximsfei.refinject.RefClass;
import com.ximsfei.refinject.RefObject;

/**
 * Created by ximsfei on 2017/7/10.
 */
public class ActivityThread {
    public static Class<?> TYPE = RefClass.load(ActivityThread.class, "com.ximsfei.app.ActivityThread");
    public static RefObject<String> mInstrumentation;
    public static RefObject<String> mApplication;
}
