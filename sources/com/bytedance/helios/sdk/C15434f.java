package com.bytedance.helios.sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1203l;
import androidx.lifecycle.C1216w;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.api.p1087a.C15298b;
import com.bytedance.helios.api.p1088b.C15320o;
import com.bytedance.helios.api.p1090c.C15326b;
import com.bytedance.helios.sdk.p1095c.C15391f;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.helios.sdk.utils.C15484f;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.helios.sdk.f */
public class C15434f {

    /* renamed from: a */
    public static final String f37672a = C15434f.class.getSimpleName();

    /* renamed from: b */
    public static final C15434f f37673b = new C15434f();

    /* renamed from: c */
    public final C15370b f37674c = new C15370b();

    /* renamed from: d */
    public final AtomicBoolean f37675d = new AtomicBoolean(true);

    /* renamed from: e */
    public String f37676e = "null";

    /* renamed from: f */
    public String f37677f = "null";

    /* renamed from: g */
    public int f37678g = 0;

    /* renamed from: h */
    public final AtomicBoolean f37679h = new AtomicBoolean(false);

    /* renamed from: i */
    public final Runnable f37680i = new RunnableC15473g(this);

    /* renamed from: j */
    public int f37681j = 0;

    /* renamed from: k */
    private final Object f37682k = new Object();

    /* renamed from: l */
    private Application f37683l;

    /* renamed from: m */
    private final Application.ActivityLifecycleCallbacks f37684m = new Application.ActivityLifecycleCallbacks() {
        /* class com.bytedance.helios.sdk.C15434f.C154351 */

        static {
            Covode.recordClassIndex(17687);
        }

        public final void onActivityDestroyed(Activity activity) {
            C15484f.m28490a("Helios-Log-Page-State", activity + " onDestroyed");
            C15434f.this.f37674c.remove(activity);
            C15434f.this.mo25166a(activity, 5);
        }

        public final void onActivityPaused(Activity activity) {
            C15484f.m28490a("Helios-Log-Page-State", activity + " onPaused");
            C15434f.this.f37674c.add(activity, AbstractC1196i.EnumC1198a.ON_PAUSE);
            C15434f.this.mo25166a(activity, 3);
        }

        public final void onActivityResumed(Activity activity) {
            C15484f.m28490a("Helios-Log-Page-State", activity + " onResumed");
            C15434f.this.f37674c.add(activity, AbstractC1196i.EnumC1198a.ON_RESUME);
            C15434f.this.f37676e = activity.getClass().getName();
            C15434f.this.f37678g = activity.hashCode();
            C15434f.this.mo25166a(activity, 2);
        }

        public final void onActivityStarted(Activity activity) {
            C15484f.m28490a("Helios-Log-Page-State", activity + " onStarted");
            C15434f.this.f37674c.add(activity, AbstractC1196i.EnumC1198a.ON_START);
            C15434f.this.f37676e = activity.getClass().getName();
            C15434f.this.f37678g = activity.hashCode();
            C15434f.this.mo25166a(activity, 1);
        }

        public final void onActivityStopped(Activity activity) {
            C15484f.m28490a("Helios-Log-Page-State", activity + " onStopped");
            C15434f.this.f37674c.add(activity, AbstractC1196i.EnumC1198a.ON_STOP);
            C15434f.this.mo25166a(activity, 4);
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C15484f.m28490a("Helios-Log-Page-State", activity + " onSaveInstanceState");
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C15484f.m28490a("Helios-Log-Page-State", activity + " onCreated");
            C15434f.this.f37674c.add(activity, AbstractC1196i.EnumC1198a.ON_CREATE);
            C15434f.this.f37676e = activity.getClass().getName();
            C15434f.this.f37678g = activity.hashCode();
            C15434f.this.mo25166a(activity, 0);
        }
    };

    /* renamed from: n */
    private final AbstractC1203l f37685n = new LifecycleMonitor$2(this);

    /* renamed from: a */
    public static C15434f m28386a() {
        return f37673b;
    }

    /* renamed from: b */
    public final String mo25168b() {
        return this.f37674c.toString();
    }

    /* renamed from: c */
    public final boolean mo25169c() {
        return this.f37675d.get();
    }

    /* renamed from: f */
    public final int mo25172f() {
        int i = this.f37678g;
        if (i == 0) {
            return this.f37681j;
        }
        return i;
    }

    /* renamed from: e */
    public final String mo25171e() {
        if (TextUtils.equals("null", this.f37676e)) {
            return this.f37677f;
        }
        return this.f37676e;
    }

    static {
        Covode.recordClassIndex(17686);
    }

    /* renamed from: d */
    public final boolean mo25170d() {
        if (!this.f37679h.get() || this.f37675d.get()) {
            return false;
        }
        return true;
    }

    private C15434f() {
    }

    /* renamed from: a */
    public final void mo25167a(Application application) {
        try {
            this.f37683l = application;
            C15477a.m28475a(application, this.f37684m);
            C1216w.f4006i.getLifecycle().mo4012a(this.f37685n);
        } catch (Exception e) {
            C15320o.m28230a(new C15326b(null, e, "label_lifecycle_monitor_initialize", null));
        }
    }

    /* renamed from: a */
    public final void mo25166a(Activity activity, int i) {
        MethodCollector.m26663i(5709);
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f37682k) {
            try {
                C15298b.get().startCheck(activity, i);
            } catch (Throwable th) {
                MethodCollector.m26664o(5709);
                throw th;
            }
        }
        C15391f.m28291a("checkResource", currentTimeMillis);
        MethodCollector.m26664o(5709);
    }
}
