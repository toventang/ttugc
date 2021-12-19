package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.api.internal.c */
public final class ComponentCallbacks2C25417c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: a */
    static final ComponentCallbacks2C25417c f60311a = new ComponentCallbacks2C25417c();

    /* renamed from: b */
    final AtomicBoolean f60312b = new AtomicBoolean();

    /* renamed from: c */
    final AtomicBoolean f60313c = new AtomicBoolean();

    /* renamed from: d */
    private final ArrayList<AbstractC25418a> f60314d = new ArrayList<>();

    /* renamed from: e */
    private boolean f60315e = false;

    /* renamed from: com.google.android.gms.common.api.internal.c$a */
    public interface AbstractC25418a {
        static {
            Covode.recordClassIndex(30817);
        }

        /* renamed from: a */
        void mo41610a(boolean z);
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    /* renamed from: a */
    public static ComponentCallbacks2C25417c m48959a() {
        return f60311a;
    }

    static {
        Covode.recordClassIndex(30816);
    }

    private ComponentCallbacks2C25417c() {
    }

    /* renamed from: a */
    public static void m48960a(Application application) {
        MethodCollector.m26663i(8516);
        ComponentCallbacks2C25417c cVar = f60311a;
        synchronized (cVar) {
            try {
                if (!cVar.f60315e) {
                    application.registerActivityLifecycleCallbacks(cVar);
                    application.registerComponentCallbacks(cVar);
                    cVar.f60315e = true;
                }
            } finally {
                MethodCollector.m26664o(8516);
            }
        }
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f60312b.compareAndSet(true, false);
        this.f60313c.set(true);
        if (compareAndSet) {
            m48961a(false);
        }
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f60312b.compareAndSet(false, true)) {
            this.f60313c.set(true);
            m48961a(true);
        }
    }

    /* renamed from: a */
    private final void m48961a(boolean z) {
        MethodCollector.m26663i(8660);
        synchronized (f60311a) {
            try {
                ArrayList<AbstractC25418a> arrayList = this.f60314d;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    AbstractC25418a aVar = arrayList.get(i);
                    i++;
                    aVar.mo41610a(z);
                }
            } finally {
                MethodCollector.m26664o(8660);
            }
        }
    }

    /* renamed from: a */
    public final void mo41639a(AbstractC25418a aVar) {
        MethodCollector.m26663i(8658);
        synchronized (f60311a) {
            try {
                this.f60314d.add(aVar);
            } finally {
                MethodCollector.m26664o(8658);
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f60312b.compareAndSet(true, false);
        this.f60313c.set(true);
        if (compareAndSet) {
            m48961a(false);
        }
    }
}
