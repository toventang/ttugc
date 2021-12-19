package com.p2082ss.android.ugc.aweme.lancet.p3384a;

import androidx.work.AbstractC1717j;
import androidx.work.C1591b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;

/* renamed from: com.ss.android.ugc.aweme.lancet.a.c */
public class C58005c {

    /* renamed from: a */
    public static boolean f132203a;

    static {
        Covode.recordClassIndex(68040);
    }

    /* renamed from: a */
    public static void m104826a() {
        MethodCollector.m26663i(4640);
        synchronized (C58005c.class) {
            try {
                if (!f132203a) {
                    try {
                        AbstractC1717j.m5621a(C17867d.m33078a(), new C1591b.C1592a().mo5349a());
                        f132203a = true;
                    } catch (Exception e) {
                        e.printStackTrace();
                        C13468b.m24210a(e);
                    }
                }
            } finally {
                MethodCollector.m26664o(4640);
            }
        }
    }
}
