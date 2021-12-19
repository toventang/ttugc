package com.bytedance.common.jato.p903b;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: com.bytedance.common.jato.b.a */
public final class C13530a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public volatile boolean f32926a;

    /* renamed from: b */
    private final ArrayList<Object> f32927b;

    /* renamed from: c */
    private WeakReference<Activity> f32928c;

    /* renamed from: d */
    private String f32929d;

    /* renamed from: e */
    private boolean f32930e;

    /* renamed from: f */
    private int f32931f;

    static {
        Covode.recordClassIndex(15540);
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    /* renamed from: com.bytedance.common.jato.b.a$a */
    public static final class C13531a {

        /* renamed from: a */
        public static final C13530a f32932a = new C13530a((byte) 0);

        static {
            Covode.recordClassIndex(15541);
        }
    }

    private C13530a() {
        this.f32927b = new ArrayList<>();
        this.f32929d = null;
    }

    /* renamed from: a */
    private Object[] m24307a() {
        Object[] objArr;
        MethodCollector.m26663i(12203);
        synchronized (this.f32927b) {
            try {
                if (this.f32927b.size() > 0) {
                    objArr = this.f32927b.toArray();
                } else {
                    objArr = null;
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(12203);
                throw th;
            }
        }
        if (objArr == null) {
            Object[] objArr2 = new Object[0];
            MethodCollector.m26664o(12203);
            return objArr2;
        }
        MethodCollector.m26664o(12203);
        return objArr;
    }

    /* synthetic */ C13530a(byte b) {
        this();
    }

    public final void onActivityPaused(Activity activity) {
        m24307a();
    }

    public final void onActivityResumed(Activity activity) {
        this.f32928c = new WeakReference<>(activity);
        this.f32929d = null;
        m24307a();
    }

    public final void onActivityStarted(Activity activity) {
        m24307a();
        if (this.f32930e) {
            this.f32930e = false;
            return;
        }
        int i = this.f32931f + 1;
        this.f32931f = i;
        if (i == 1) {
            this.f32926a = true;
            m24307a();
        }
    }

    public final void onActivityStopped(Activity activity) {
        if (activity.isChangingConfigurations()) {
            this.f32930e = true;
            return;
        }
        int i = this.f32931f - 1;
        this.f32931f = i;
        if (i == 0) {
            this.f32926a = false;
            m24307a();
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m24307a();
    }
}
