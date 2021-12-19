package com.ttnet.org.chromium.base;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.base.HandlerC87473n;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ttnet.org.chromium.base.d */
public final class C87447d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public static boolean f198345a;

    /* renamed from: d */
    private static HandlerC87473n f198346d = new HandlerC87473n(Looper.getMainLooper(), new HandlerC87473n.AbstractC87474a() {
        /* class com.ttnet.org.chromium.base.C87447d.C874481 */

        static {
            Covode.recordClassIndex(103383);
        }
    });

    /* renamed from: b */
    public AbstractC87450a f198347b;

    /* renamed from: c */
    private int f198348c;

    /* renamed from: e */
    private Runnable f198349e = new Runnable() {
        /* class com.ttnet.org.chromium.base.C87447d.RunnableC874492 */

        static {
            Covode.recordClassIndex(103384);
        }

        public final void run() {
            if (C87447d.f198345a) {
                C87447d.f198345a = false;
                if (C87447d.this.f198347b != null) {
                    C87447d.this.f198347b.mo141490b();
                }
            }
        }
    };

    /* renamed from: com.ttnet.org.chromium.base.d$a */
    public interface AbstractC87450a {
        static {
            Covode.recordClassIndex(103385);
        }

        /* renamed from: a */
        void mo141489a();

        /* renamed from: b */
        void mo141490b();

        /* renamed from: c */
        void mo141491c();

        /* renamed from: d */
        void mo141492d();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    static {
        Covode.recordClassIndex(103382);
    }

    public C87447d() {
        if (m151778b() != null) {
            f198345a = true;
        }
        this.f198348c = 0;
        List<Activity> a = m151777a();
        if (a != null) {
            this.f198348c = a.size();
        }
    }

    /* renamed from: a */
    private static List<Activity> m151777a() {
        ArrayList arrayList = new ArrayList();
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            Map map = (Map) declaredField.get(invoke);
            if (map == null) {
                return null;
            }
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                Field declaredField2 = value.getClass().getDeclaredField("activity");
                declaredField2.setAccessible(true);
                arrayList.add((Activity) declaredField2.get(value));
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    private static Activity m151778b() {
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
        if (f198345a) {
            f198346d.postDelayed(this.f198349e, 30000);
        }
    }

    public final void onActivityStopped(Activity activity) {
        AbstractC87450a aVar;
        int i = this.f198348c - 1;
        this.f198348c = i;
        if (i == 0 && (aVar = this.f198347b) != null) {
            aVar.mo141492d();
        }
    }

    public final void onActivityResumed(Activity activity) {
        if (!f198345a) {
            f198345a = true;
            AbstractC87450a aVar = this.f198347b;
            if (aVar != null) {
                aVar.mo141489a();
            }
        }
        f198346d.removeCallbacks(this.f198349e);
    }

    public final void onActivityStarted(Activity activity) {
        AbstractC87450a aVar;
        if (this.f198348c == 0 && (aVar = this.f198347b) != null) {
            aVar.mo141491c();
        }
        this.f198348c++;
    }
}
