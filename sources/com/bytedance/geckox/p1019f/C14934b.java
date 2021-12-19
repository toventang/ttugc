package com.bytedance.geckox.p1019f;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1603q.AbstractC21935d;
import com.bytedance.p1603q.p1605b.AbstractC21932a;
import com.bytedance.p1603q.p1605b.C21933b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.geckox.f.b */
public final class C14934b {

    /* renamed from: a */
    private static final Map<Class<? extends AbstractC21935d<?, ?>>, C21933b> f36488a = new HashMap();

    static {
        Covode.recordClassIndex(17047);
    }

    /* renamed from: a */
    public static AbstractC21932a m27505a(Class<? extends AbstractC21935d<?, ?>> cls) {
        C21933b bVar;
        MethodCollector.m26663i(2446);
        Map<Class<? extends AbstractC21935d<?, ?>>, C21933b> map = f36488a;
        synchronized (map) {
            try {
                bVar = map.get(cls);
            } finally {
                MethodCollector.m26664o(2446);
            }
        }
        return bVar;
    }

    /* renamed from: a */
    public static void m27506a(Class<? extends AbstractC21935d<?, ?>> cls, AbstractC21932a aVar) {
        MethodCollector.m26663i(2443);
        Map<Class<? extends AbstractC21935d<?, ?>>, C21933b> map = f36488a;
        synchronized (map) {
            try {
                C21933b bVar = map.get(cls);
                if (bVar == null) {
                    bVar = new C21933b(new AbstractC21932a[0]);
                    map.put(cls, bVar);
                }
                bVar.f51916a.add(aVar);
            } finally {
                MethodCollector.m26664o(2443);
            }
        }
    }
}
