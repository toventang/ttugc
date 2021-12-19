package com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a.p991a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.a.a.e */
public final class C14674e implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public static boolean f35621a;

    /* renamed from: c */
    private static WeakHandler f35622c = new WeakHandler(Looper.getMainLooper(), new WeakHandler.IHandler() {
        /* class com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a.p991a.C14674e.C146751 */

        static {
            Covode.recordClassIndex(16772);
        }

        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public final void handleMsg(Message message) {
        }
    });

    /* renamed from: b */
    public AbstractC14677a f35623b;

    /* renamed from: d */
    private Runnable f35624d = new Runnable() {
        /* class com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a.p991a.C14674e.RunnableC146762 */

        static {
            Covode.recordClassIndex(16773);
        }

        public final void run() {
            if (C14674e.f35621a) {
                C14674e.f35621a = false;
            }
        }
    };

    /* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.a.a.e$a */
    public interface AbstractC14677a {
        static {
            Covode.recordClassIndex(16774);
        }

        /* renamed from: a */
        void mo23661a();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    static {
        Covode.recordClassIndex(16771);
    }

    public C14674e() {
        if (m26850a() != null) {
            f35621a = true;
        }
    }

    /* renamed from: a */
    private static Activity m26850a() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            Map map = (Map) declaredField.get(invoke);
            if (map == null) {
                return null;
            }
            for (Object obj : map.values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    declaredField3.setAccessible(true);
                    return (Activity) declaredField3.get(obj);
                }
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    public final void onActivityPaused(Activity activity) {
        if (f35621a) {
            f35622c.postDelayed(this.f35624d, 30000);
        }
    }

    public final void onActivityResumed(Activity activity) {
        if (!f35621a) {
            f35621a = true;
            AbstractC14677a aVar = this.f35623b;
            if (aVar != null) {
                aVar.mo23661a();
            }
        }
        f35622c.removeCallbacks(this.f35624d);
    }
}
