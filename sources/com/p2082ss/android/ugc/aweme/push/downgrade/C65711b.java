package com.p2082ss.android.ugc.aweme.push.downgrade;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17873f;

/* renamed from: com.ss.android.ugc.aweme.push.downgrade.b */
public class C65711b {

    /* renamed from: a */
    public static volatile boolean f148061a = true;

    /* renamed from: b */
    private static volatile boolean f148062b;

    static {
        Covode.recordClassIndex(77209);
    }

    /* renamed from: a */
    public static void m117624a() {
        MethodCollector.m26663i(13497);
        if (!f148062b) {
            synchronized (C65711b.class) {
                try {
                    if (!f148062b) {
                        f148062b = true;
                        C17873f.m33099g().mo143289d(C65712c.f148063a);
                    }
                } finally {
                    MethodCollector.m26664o(13497);
                }
            }
            return;
        }
        MethodCollector.m26664o(13497);
    }
}
