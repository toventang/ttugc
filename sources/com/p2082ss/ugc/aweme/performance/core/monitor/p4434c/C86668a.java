package com.p2082ss.ugc.aweme.performance.core.monitor.p4434c;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.ugc.aweme.performance.core.monitor.c.a */
public final class C86668a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public static WeakReference<Activity> f195363a = new WeakReference<>(null);

    /* renamed from: b */
    public static String f195364b = "";

    /* renamed from: c */
    public static final C86668a f195365c = new C86668a();

    /* renamed from: d */
    private static List<Application.ActivityLifecycleCallbacks> f195366d = new ArrayList();

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    private C86668a() {
    }

    static {
        Covode.recordClassIndex(101896);
    }

    public final void onActivityResumed(Activity activity) {
        String str;
        Class<?> cls;
        f195363a = new WeakReference<>(activity);
        if (activity == null || (cls = activity.getClass()) == null || (str = cls.getSimpleName()) == null) {
            str = "";
        }
        f195364b = str;
    }

    public final void onActivityStopped(Activity activity) {
        Iterator<T> it = f195366d.iterator();
        while (it.hasNext()) {
            it.next().onActivityStopped(activity);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        String str;
        ComponentName componentName;
        if (activity == null || (componentName = activity.getComponentName()) == null || (str = componentName.getShortClassName()) == null) {
            str = "";
        }
        f195364b = str;
    }
}
