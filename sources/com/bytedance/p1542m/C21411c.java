package com.bytedance.p1542m;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1542m.p1543a.C21399b;
import com.bytedance.p1542m.p1544b.C21409a;
import java.util.Map;

/* renamed from: com.bytedance.m.c */
public final class C21411c {

    /* renamed from: a */
    public static AbstractC21408b f50797a;

    /* renamed from: b */
    public static Context f50798b;

    /* renamed from: c */
    public static AbstractC21397a f50799c;

    /* renamed from: d */
    public static boolean f50800d;

    static {
        Covode.recordClassIndex(25031);
    }

    /* renamed from: a */
    public static Map<String, C21409a> m40191a() {
        return f50797a.mo35001a();
    }

    /* renamed from: a */
    public static C21409a m40190a(String str) {
        return f50797a.mo35004b(str);
    }

    /* renamed from: a */
    public static synchronized void m40192a(AbstractC21397a aVar) {
        synchronized (C21411c.class) {
            MethodCollector.m26663i(12352);
            if (f50800d) {
                MethodCollector.m26664o(12352);
                return;
            }
            f50799c = aVar;
            f50798b = aVar.mo34999a();
            f50797a = C21399b.m40170b();
            f50800d = true;
            MethodCollector.m26664o(12352);
        }
    }
}
