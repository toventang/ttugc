package com.bytedance.webx;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.webx.p1763g.AbstractC23610a;
import com.bytedance.webx.p1763g.C23611b;
import java.util.HashMap;

/* renamed from: com.bytedance.webx.g */
public class C23609g {

    /* renamed from: a */
    private static HashMap<String, AbstractC23610a> f55870a = new HashMap<>();

    private C23609g() {
    }

    static {
        Covode.recordClassIndex(27708);
    }

    /* renamed from: a */
    private static AbstractC23610a m44644a(String str) {
        MethodCollector.m26663i(5037);
        AbstractC23610a aVar = f55870a.get(str);
        if (aVar != null) {
            MethodCollector.m26664o(5037);
            return aVar;
        }
        synchronized (C23609g.class) {
            try {
                AbstractC23610a aVar2 = f55870a.get(str);
                if (aVar2 != null) {
                    return aVar2;
                }
                C23611b bVar = new C23611b(str);
                HashMap<String, AbstractC23610a> hashMap = new HashMap<>(f55870a);
                hashMap.put(str, bVar);
                f55870a = hashMap;
                MethodCollector.m26664o(5037);
                return bVar;
            } finally {
                MethodCollector.m26664o(5037);
            }
        }
    }

    /* renamed from: a */
    public static <T extends AbstractC23605f> T m44643a(String str, Class<T> cls) {
        return (T) m44644a(str).mo39035a(cls);
    }
}
