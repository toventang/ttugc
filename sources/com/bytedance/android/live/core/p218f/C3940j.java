package com.bytedance.android.live.core.p218f;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.android.live.core.f.j */
public class C3940j {

    /* renamed from: a */
    private static Handler f10830a;

    static {
        Covode.recordClassIndex(4469);
    }

    /* renamed from: a */
    public static Handler m9594a() {
        MethodCollector.m26663i(12306);
        if (f10830a == null) {
            synchronized (C3940j.class) {
                try {
                    if (f10830a == null) {
                        f10830a = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12306);
                    throw th;
                }
            }
        }
        Handler handler = f10830a;
        MethodCollector.m26664o(12306);
        return handler;
    }

    /* renamed from: a */
    public static void m9595a(Runnable runnable) {
        m9594a().post(runnable);
    }
}
