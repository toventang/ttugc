package com.bytedance.common.p899b;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/* renamed from: com.bytedance.common.b.a */
public final class C13498a extends Observable implements Application.ActivityLifecycleCallbacks, WeakHandler.IHandler {

    /* renamed from: b */
    public static boolean f32875b = true;

    /* renamed from: c */
    private static C13498a f32876c;

    /* renamed from: f */
    private static int f32877f;

    /* renamed from: a */
    public boolean f32878a;

    /* renamed from: d */
    private WeakReference<Activity> f32879d;

    /* renamed from: e */
    private Runnable f32880e = new Runnable() {
        /* class com.bytedance.common.p899b.C13498a.RunnableC134991 */

        static {
            Covode.recordClassIndex(15507);
        }

        public final void run() {
            if (C13498a.this.f32878a) {
                C13498a.this.f32878a = false;
            }
        }
    };

    /* renamed from: g */
    private WeakHandler f32881g = new WeakHandler(this);

    /* renamed from: h */
    private final List<Application.ActivityLifecycleCallbacks> f32882h = new ArrayList();

    static {
        Covode.recordClassIndex(15506);
    }

    private C13498a() {
    }

    /* renamed from: a */
    public static synchronized C13498a m24278a() {
        C13498a aVar;
        synchronized (C13498a.class) {
            MethodCollector.m26663i(3381);
            if (f32876c == null) {
                f32876c = new C13498a();
            }
            aVar = f32876c;
            MethodCollector.m26664o(3381);
        }
        return aVar;
    }

    /* renamed from: b */
    private Object[] m24279b() {
        Object[] objArr;
        MethodCollector.m26663i(3393);
        synchronized (this.f32882h) {
            try {
                if (this.f32882h.size() > 0) {
                    objArr = this.f32882h.toArray();
                } else {
                    objArr = null;
                }
            } finally {
                MethodCollector.m26664o(3393);
            }
        }
        return objArr;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (message.what == 1 && f32875b) {
            setChanged();
            notifyObservers(Boolean.valueOf(f32875b));
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        Object[] b = m24279b();
        if (b != null) {
            for (Object obj : b) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityDestroyed(activity);
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        if (this.f32878a) {
            this.f32881g.postDelayed(this.f32880e, 30000);
        }
        Object[] b = m24279b();
        if (b != null) {
            for (Object obj : b) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityPaused(activity);
            }
        }
    }

    public final void onActivityResumed(Activity activity) {
        this.f32879d = new WeakReference<>(activity);
        if (!this.f32878a) {
            this.f32878a = true;
        }
        this.f32881g.removeCallbacks(this.f32880e);
        Object[] b = m24279b();
        if (b != null) {
            for (Object obj : b) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityResumed(activity);
            }
        }
    }

    public final void onActivityStarted(Activity activity) {
        Object[] b = m24279b();
        if (b != null) {
            for (Object obj : b) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityStarted(activity);
            }
        }
        this.f32881g.removeMessages(1);
        int i = f32877f;
        if (i == 0) {
            f32875b = false;
        }
        f32877f = i + 1;
    }

    public final void onActivityStopped(Activity activity) {
        Object[] b = m24279b();
        if (b != null) {
            for (Object obj : b) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityStopped(activity);
            }
        }
        int i = f32877f - 1;
        f32877f = i;
        if (i == 0) {
            f32875b = true;
            this.f32881g.sendEmptyMessageDelayed(1, 30000);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        f32875b = false;
        Object[] b = m24279b();
        if (b != null) {
            for (Object obj : b) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityCreated(activity, bundle);
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Object[] b = m24279b();
        if (b != null) {
            for (Object obj : b) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivitySaveInstanceState(activity, bundle);
            }
        }
    }
}
