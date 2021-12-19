package com.p2082ss.android.ugc.aweme.feed.p2964r;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.feed.r.b */
public final class C49906b {

    /* renamed from: a */
    public static Object f115047a = new Object();

    /* renamed from: b */
    public static volatile boolean f115048b;

    static {
        Covode.recordClassIndex(59013);
    }

    /* renamed from: a */
    public static void m93684a() {
        MethodCollector.m26663i(13210);
        if (!f115048b) {
            synchronized (f115047a) {
                try {
                    if (!f115048b) {
                        try {
                            f115047a.wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                } finally {
                    MethodCollector.m26664o(13210);
                }
            }
            return;
        }
        MethodCollector.m26664o(13210);
    }
}
