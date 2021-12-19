package com.p2082ss.bytertc.engine.utils;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.bytertc.engine.utils.AppMonitor */
public class AppMonitor implements Application.ActivityLifecycleCallbacks {
    private static AppMonitor INSTANCE;
    private List<Callback> mCallbacks = new CopyOnWriteArrayList();

    /* renamed from: com.ss.bytertc.engine.utils.AppMonitor$Callback */
    public interface Callback {
        static {
            Covode.recordClassIndex(101141);
        }

        void callback(int i);
    }

    static {
        Covode.recordClassIndex(101140);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        notifyCallback(0);
    }

    public void onActivityResumed(Activity activity) {
        notifyCallback(1);
    }

    private AppMonitor(Context context) {
        registerLifecycle(context);
    }

    /* renamed from: com_ss_bytertc_engine_utils_AppMonitor_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext */
    public static Context m147880x24621269(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    private void registerLifecycle(Context context) {
        ((Application) m147880x24621269(context)).registerActivityLifecycleCallbacks(this);
    }

    public AppMonitor unRegister(Callback callback) {
        if (!this.mCallbacks.contains(callback)) {
            return this;
        }
        this.mCallbacks.remove(callback);
        return this;
    }

    /* access modifiers changed from: package-private */
    public void notifyCallback(int i) {
        for (Callback callback : this.mCallbacks) {
            callback.callback(i);
        }
    }

    public boolean release(Context context) {
        if (context == null) {
            return false;
        }
        ((Application) m147880x24621269(context)).unregisterActivityLifecycleCallbacks(this);
        this.mCallbacks.clear();
        INSTANCE = null;
        return true;
    }

    public static AppMonitor get(Context context) {
        MethodCollector.m26663i(1236);
        if (INSTANCE == null) {
            synchronized (AppMonitor.class) {
                try {
                    if (INSTANCE == null) {
                        INSTANCE = new AppMonitor(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1236);
                    throw th;
                }
            }
        }
        AppMonitor appMonitor = INSTANCE;
        MethodCollector.m26664o(1236);
        return appMonitor;
    }

    public AppMonitor register(Context context, Callback callback) {
        if (!this.mCallbacks.contains(callback)) {
            this.mCallbacks.add(callback);
        }
        notifyCallback(CommonUtils.isInForeground(context) ? 1 : 0);
        return this;
    }
}
