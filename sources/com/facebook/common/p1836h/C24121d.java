package com.facebook.common.p1836h;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24091i;
import java.util.IdentityHashMap;
import java.util.Map;

/* renamed from: com.facebook.common.h.d */
public final class C24121d<T> {

    /* renamed from: a */
    static final Map<Object, Integer> f57054a = new IdentityHashMap();

    /* renamed from: b */
    T f57055b;

    /* renamed from: c */
    final AbstractC24120c<T> f57056c;

    /* renamed from: d */
    private int f57057d = 1;

    /* renamed from: com.facebook.common.h.d$a */
    public static class C24122a extends RuntimeException {
        static {
            Covode.recordClassIndex(28250);
        }

        public C24122a() {
            super("Null shared reference");
        }
    }

    static {
        Covode.recordClassIndex(28249);
    }

    /* renamed from: e */
    private void m45721e() {
        if (!m45719a(this)) {
            throw new C24122a();
        }
    }

    /* renamed from: d */
    private synchronized boolean m45720d() {
        MethodCollector.m26663i(10471);
        if (this.f57057d > 0) {
            MethodCollector.m26664o(10471);
            return true;
        }
        MethodCollector.m26664o(10471);
        return false;
    }

    /* renamed from: a */
    public final synchronized T mo39702a() {
        T t;
        MethodCollector.m26663i(10328);
        t = this.f57055b;
        MethodCollector.m26664o(10328);
        return t;
    }

    /* renamed from: b */
    public final synchronized void mo39703b() {
        MethodCollector.m26663i(10634);
        m45721e();
        this.f57057d++;
        MethodCollector.m26664o(10634);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized int mo39704c() {
        boolean z;
        int i;
        MethodCollector.m26663i(10635);
        m45721e();
        if (this.f57057d > 0) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45620a(z);
        i = this.f57057d - 1;
        this.f57057d = i;
        MethodCollector.m26664o(10635);
        return i;
    }

    /* renamed from: a */
    private static boolean m45719a(C24121d<?> dVar) {
        if (dVar.m45720d()) {
            return true;
        }
        return false;
    }

    public C24121d(T t, AbstractC24120c<T> cVar) {
        MethodCollector.m26663i(10326);
        this.f57055b = (T) C24091i.m45617a(t);
        this.f57056c = (AbstractC24120c) C24091i.m45617a(cVar);
        Map<Object, Integer> map = f57054a;
        synchronized (map) {
            try {
                Integer num = map.get(t);
                if (num == null) {
                    map.put(t, 1);
                } else {
                    map.put(t, Integer.valueOf(num.intValue() + 1));
                }
            } finally {
                MethodCollector.m26664o(10326);
            }
        }
    }
}
