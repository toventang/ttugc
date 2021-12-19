package com.p2082ss.android.common.p2132c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.common.c.b */
public final class C29822b {

    /* renamed from: a */
    public static volatile boolean f71163a;

    /* renamed from: b */
    public static long f71164b = 100;

    /* renamed from: c */
    public static long f71165c;

    static {
        Covode.recordClassIndex(36227);
    }

    /* renamed from: a */
    public static void m60079a() {
        MethodCollector.m26663i(12280);
        if (f71163a) {
            try {
                if (f71165c < 100) {
                    Thread.sleep(f71164b);
                } else {
                    f71163a = false;
                }
                f71165c++;
                MethodCollector.m26664o(12280);
            } catch (InterruptedException e) {
                e.printStackTrace();
                MethodCollector.m26664o(12280);
            }
        } else {
            f71165c = 0;
            MethodCollector.m26664o(12280);
        }
    }
}
