package com.bytedance.helios.sdk.utils;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.p1085a.p1086a.ExecutorC15289b;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.helios.sdk.utils.g */
public final class HandlerThreadC15486g extends HandlerThread {

    /* renamed from: a */
    private static HandlerThreadC15486g f37740a;

    /* renamed from: b */
    private static Handler f37741b;

    /* renamed from: c */
    private static ExecutorC15289b f37742c;

    static {
        Covode.recordClassIndex(17740);
    }

    private HandlerThreadC15486g() {
        super("helios.monitor", 0);
    }

    /* renamed from: a */
    public static HandlerThreadC15486g m28498a() {
        HandlerThreadC15486g gVar;
        MethodCollector.m26663i(5726);
        synchronized (HandlerThreadC15486g.class) {
            try {
                m28501d();
                gVar = f37740a;
            } finally {
                MethodCollector.m26664o(5726);
            }
        }
        return gVar;
    }

    /* renamed from: b */
    public static Handler m28499b() {
        Handler handler;
        MethodCollector.m26663i(5727);
        synchronized (HandlerThreadC15486g.class) {
            try {
                m28501d();
                handler = f37741b;
            } finally {
                MethodCollector.m26664o(5727);
            }
        }
        return handler;
    }

    /* renamed from: c */
    public static Executor m28500c() {
        ExecutorC15289b bVar;
        MethodCollector.m26663i(5728);
        synchronized (HandlerThreadC15486g.class) {
            try {
                m28501d();
                bVar = f37742c;
            } finally {
                MethodCollector.m26664o(5728);
            }
        }
        return bVar;
    }

    /* renamed from: d */
    private static void m28501d() {
        if (f37740a == null) {
            HandlerThreadC15486g gVar = new HandlerThreadC15486g();
            f37740a = gVar;
            gVar.start();
            f37741b = new Handler(f37740a.getLooper());
            f37742c = new ExecutorC15289b(f37741b);
        }
    }
}
