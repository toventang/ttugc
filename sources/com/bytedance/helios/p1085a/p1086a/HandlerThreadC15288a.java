package com.bytedance.helios.p1085a.p1086a;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.helios.a.a.a */
public final class HandlerThreadC15288a extends HandlerThread {

    /* renamed from: a */
    private static HandlerThreadC15288a f37303a;

    /* renamed from: b */
    private static Handler f37304b;

    /* renamed from: c */
    private static ExecutorC15289b f37305c;

    static {
        Covode.recordClassIndex(17518);
    }

    private HandlerThreadC15288a() {
        super("helios.bg", 10);
    }

    /* renamed from: a */
    public static HandlerThreadC15288a m28194a() {
        HandlerThreadC15288a aVar;
        MethodCollector.m26663i(5595);
        synchronized (HandlerThreadC15288a.class) {
            try {
                m28196c();
                aVar = f37303a;
            } finally {
                MethodCollector.m26664o(5595);
            }
        }
        return aVar;
    }

    /* renamed from: b */
    public static Handler m28195b() {
        Handler handler;
        MethodCollector.m26663i(5719);
        synchronized (HandlerThreadC15288a.class) {
            try {
                m28196c();
                handler = f37304b;
            } finally {
                MethodCollector.m26664o(5719);
            }
        }
        return handler;
    }

    /* renamed from: c */
    private static void m28196c() {
        if (f37303a == null) {
            HandlerThreadC15288a aVar = new HandlerThreadC15288a();
            f37303a = aVar;
            aVar.start();
            f37304b = new Handler(f37303a.getLooper());
            f37305c = new ExecutorC15289b(f37304b);
        }
    }
}
