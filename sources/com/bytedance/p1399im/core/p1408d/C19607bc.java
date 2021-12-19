package com.bytedance.p1399im.core.p1408d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.im.core.d.bc */
public final class C19607bc {

    /* renamed from: g */
    private static C19607bc f46589g;

    /* renamed from: a */
    public int f46590a;

    /* renamed from: b */
    public long f46591b;

    /* renamed from: c */
    public boolean f46592c = true;

    /* renamed from: d */
    public Map<String, C19638h> f46593d = new LinkedHashMap();

    /* renamed from: e */
    public List<C19538ai> f46594e;

    /* renamed from: f */
    public Set<Object> f46595f = new HashSet();

    /* renamed from: h */
    private int f46596h = 0;

    static {
        Covode.recordClassIndex(22451);
    }

    private C19607bc() {
    }

    /* renamed from: b */
    public final void mo31389b() {
        Iterator<Object> it = this.f46595f.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: a */
    public static C19607bc m36619a() {
        MethodCollector.m26663i(10008);
        if (f46589g == null) {
            synchronized (C19607bc.class) {
                try {
                    if (f46589g == null) {
                        f46589g = new C19607bc();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10008);
                    throw th;
                }
            }
        }
        C19607bc bcVar = f46589g;
        MethodCollector.m26664o(10008);
        return bcVar;
    }
}
