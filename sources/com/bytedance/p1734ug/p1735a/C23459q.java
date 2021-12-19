package com.bytedance.p1734ug.p1735a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ug.a.q */
public final class C23459q {

    /* renamed from: a */
    private static final Object f55623a = new Object();

    /* renamed from: b */
    private static final Map<String, C23458p> f55624b = new HashMap();

    static {
        Covode.recordClassIndex(27419);
    }

    /* renamed from: a */
    public static AbstractC23452j m44149a(C23445f fVar) {
        MethodCollector.m26663i(7539);
        if (fVar != null) {
            synchronized (f55623a) {
                try {
                    Map<String, C23458p> map = f55624b;
                    if (map.containsKey(fVar.f55599b)) {
                        return map.get(fVar.f55599b);
                    }
                    C23458p pVar = new C23458p(fVar);
                    map.put(fVar.f55599b, pVar);
                    MethodCollector.m26664o(7539);
                    return pVar;
                } finally {
                    MethodCollector.m26664o(7539);
                }
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("options is null");
            MethodCollector.m26664o(7539);
            throw illegalArgumentException;
        }
    }
}
