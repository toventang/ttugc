package com.p2082ss.android.ugc.aweme.app;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.app.j */
public class C33796j {

    /* renamed from: c */
    private static C33796j f80039c;

    /* renamed from: a */
    public boolean f80040a = true;

    /* renamed from: b */
    public boolean f80041b = true;

    static {
        Covode.recordClassIndex(40693);
    }

    /* renamed from: a */
    public static C33796j m69147a() {
        MethodCollector.m26663i(6414);
        if (f80039c == null) {
            synchronized (C33796j.class) {
                try {
                    if (f80039c == null) {
                        f80039c = new C33796j();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6414);
                    throw th;
                }
            }
        }
        C33796j jVar = f80039c;
        MethodCollector.m26664o(6414);
        return jVar;
    }
}
