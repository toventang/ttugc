package com.bytedance.helios.p1085a.p1086a;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.a.a.c */
public final class C15290c {

    /* renamed from: a */
    public static final C15290c f37307a = new C15290c();

    /* renamed from: b */
    private static Handler f37308b;

    private C15290c() {
    }

    static {
        Covode.recordClassIndex(17520);
    }

    /* renamed from: a */
    public static final Handler m28197a() {
        Handler handler;
        MethodCollector.m26663i(5563);
        synchronized (C15290c.class) {
            try {
                if (f37308b == null) {
                    f37308b = new Handler(Looper.getMainLooper());
                }
                handler = f37308b;
                if (handler == null) {
                    C89219l.m154707a();
                }
            } finally {
                MethodCollector.m26664o(5563);
            }
        }
        return handler;
    }
}
