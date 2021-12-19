package com.snapchat.kit.sdk.core.metrics;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.snapchat.kit.sdk.core.metrics.c */
public final class C28994c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    final List<C28983b> f68490a = new ArrayList();

    /* renamed from: b */
    private WeakReference<Activity> f68491b;

    /* renamed from: c */
    private final ScheduledExecutorService f68492c;

    static {
        Covode.recordClassIndex(35191);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        this.f68491b = new WeakReference<>(activity);
    }

    C28994c(ScheduledExecutorService scheduledExecutorService) {
        this.f68492c = scheduledExecutorService;
    }

    public final void onActivityDestroyed(Activity activity) {
        WeakReference<Activity> weakReference = this.f68491b;
        if (weakReference != null && activity == weakReference.get()) {
            this.f68491b = null;
        }
    }

    public final void onActivityStopped(Activity activity) {
        WeakReference<Activity> weakReference = this.f68491b;
        if (weakReference != null && activity == weakReference.get()) {
            for (C28983b bVar : this.f68490a) {
                this.f68492c.execute(bVar.f68475g);
            }
        }
    }
}
