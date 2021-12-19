package com.bytedance.mobsec.metasec.p1545ov;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4646ms.p4647bd.p4648o.C89915n1;

/* renamed from: com.bytedance.mobsec.metasec.ov.c */
public final class C21424c {
    static {
        Covode.recordClassIndex(25047);
    }

    /* renamed from: a */
    public static synchronized C21423b m40222a(String str) {
        C21423b bVar;
        synchronized (C21424c.class) {
            MethodCollector.m26663i(1174);
            C89915n1.AbstractC89916a a = C89915n1.m156010a(str);
            bVar = a != null ? new C21423b(a) : null;
            MethodCollector.m26664o(1174);
        }
        return bVar;
    }

    /* renamed from: a */
    public static synchronized boolean m40223a(Context context, C21421a aVar) {
        boolean a;
        synchronized (C21424c.class) {
            MethodCollector.m26663i(1178);
            a = C89915n1.m156012a(context, aVar.f50808a, "metasec_ov");
            MethodCollector.m26664o(1178);
        }
        return a;
    }
}
