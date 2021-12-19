package com.p2082ss.android.ugc.aweme.feed.p2964r;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.feed.r.a */
public final class C49905a {

    /* renamed from: a */
    public static volatile boolean f115045a;

    /* renamed from: b */
    public static Object f115046b = new Object();

    static {
        Covode.recordClassIndex(59012);
    }

    /* renamed from: a */
    public static void m93683a() {
        MethodCollector.m26663i(11610);
        if (!f115045a) {
            synchronized (f115046b) {
                try {
                    if (!f115045a) {
                        try {
                            f115046b.wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                } finally {
                    MethodCollector.m26664o(11610);
                }
            }
            return;
        }
        MethodCollector.m26664o(11610);
    }
}
