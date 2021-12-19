package com.p2082ss.android.p2160ml;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ml.i */
public class C30082i {

    /* renamed from: a */
    public static boolean f71785a;

    /* renamed from: c */
    private static C30082i f71786c;

    /* renamed from: b */
    public C30083j f71787b;

    static {
        Covode.recordClassIndex(36578);
    }

    /* renamed from: a */
    public static C30082i m60841a() {
        MethodCollector.m26663i(9659);
        if (f71786c == null) {
            synchronized (C30082i.class) {
                try {
                    if (f71786c == null) {
                        f71786c = new C30082i();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9659);
                    throw th;
                }
            }
        }
        C30082i iVar = f71786c;
        MethodCollector.m26664o(9659);
        return iVar;
    }
}
