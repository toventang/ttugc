package com.lynx.tasm.utils;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.base.C28454c;

/* renamed from: com.lynx.tasm.utils.m */
public class C28929m {

    /* renamed from: a */
    private static Handler f68358a;

    static {
        Covode.recordClassIndex(35057);
    }

    /* renamed from: b */
    public static void m57951b() {
        C28454c.m56883a(m57950a(), "Expected to run on UI thread!");
    }

    /* renamed from: a */
    public static boolean m57950a() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m57947a(Runnable runnable) {
        MethodCollector.m26663i(258);
        synchronized (C28929m.class) {
            try {
                if (f68358a == null) {
                    f68358a = new Handler(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(258);
                throw th;
            }
        }
        f68358a.post(runnable);
        MethodCollector.m26664o(258);
    }

    /* renamed from: a */
    public static void m57948a(Runnable runnable, Object obj) {
        MethodCollector.m26663i(266);
        synchronized (C28929m.class) {
            try {
                if (f68358a == null) {
                    f68358a = new Handler(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(266);
                throw th;
            }
        }
        f68358a.removeCallbacks(runnable, obj);
        MethodCollector.m26664o(266);
    }

    /* renamed from: a */
    public static void m57949a(Runnable runnable, Object obj, long j) {
        MethodCollector.m26663i(261);
        synchronized (C28929m.class) {
            try {
                if (f68358a == null) {
                    f68358a = new Handler(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(261);
                throw th;
            }
        }
        f68358a.postAtTime(runnable, obj, j);
        MethodCollector.m26664o(261);
    }
}
