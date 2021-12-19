package com.bytedance.p1542m.p1543a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.p1966e.AbstractC27034f;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.m.a.a */
public class C21398a {

    /* renamed from: b */
    private static volatile C21398a f50769b;

    /* renamed from: a */
    public Map<String, AbstractC27034f> f50770a = new HashMap();

    static {
        Covode.recordClassIndex(25018);
    }

    private C21398a() {
    }

    /* renamed from: a */
    public static C21398a m40167a() {
        MethodCollector.m26663i(12076);
        if (f50769b == null) {
            synchronized (C21398a.class) {
                try {
                    if (f50769b == null) {
                        f50769b = new C21398a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12076);
                    throw th;
                }
            }
        }
        C21398a aVar = f50769b;
        MethodCollector.m26664o(12076);
        return aVar;
    }
}
