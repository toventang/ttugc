package com.bytedance.jedi.p1445a.p1446a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1462l.AbstractC20318a;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.a.a.g */
public final class C20145g {

    /* renamed from: a */
    public static final C20145g f47915a = new C20145g();

    /* renamed from: b */
    private static final Map<AbstractC20318a<?>, AtomicBoolean> f47916b = Collections.synchronizedMap(new WeakHashMap());

    private C20145g() {
    }

    static {
        Covode.recordClassIndex(23653);
    }

    /* renamed from: b */
    public static void m38124b(AbstractC20318a<?> aVar) {
        C89219l.m154719c(aVar, "");
        m38125c(aVar).set(false);
    }

    /* renamed from: a */
    public static void m38123a(AbstractC20318a<?> aVar) {
        C89219l.m154719c(aVar, "");
        do {
        } while (!m38125c(aVar).compareAndSet(false, true));
    }

    /* renamed from: c */
    private static AtomicBoolean m38125c(AbstractC20318a<?> aVar) {
        Map<AbstractC20318a<?>, AtomicBoolean> map = f47916b;
        AtomicBoolean atomicBoolean = map.get(aVar);
        if (atomicBoolean != null) {
            return atomicBoolean;
        }
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        C89219l.m154709a((Object) map, "");
        map.put(aVar, atomicBoolean2);
        return atomicBoolean2;
    }
}
