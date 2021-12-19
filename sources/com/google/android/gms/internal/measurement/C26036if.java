package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.if */
public final class C26036if {

    /* renamed from: a */
    static final C26036if f61331a = new C26036if();

    /* renamed from: b */
    private final AbstractC26040ij f61332b = new C26011hh();

    /* renamed from: c */
    private final ConcurrentMap<Class<?>, AbstractC26041ik<?>> f61333c = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(31451);
    }

    private C26036if() {
    }

    /* renamed from: a */
    public final <T> AbstractC26041ik<T> mo42708a(T t) {
        return mo42707a((Class) t.getClass());
    }

    /* renamed from: a */
    public final <T> AbstractC26041ik<T> mo42707a(Class<T> cls) {
        C25989gm.m50601a((Object) cls, "messageType");
        AbstractC26041ik<T> ikVar = (AbstractC26041ik<T>) this.f61333c.get(cls);
        if (ikVar != null) {
            return ikVar;
        }
        AbstractC26041ik<T> a = this.f61332b.mo42669a(cls);
        C25989gm.m50601a((Object) cls, "messageType");
        C25989gm.m50601a((Object) a, "schema");
        AbstractC26041ik<T> ikVar2 = (AbstractC26041ik<T>) this.f61333c.putIfAbsent(cls, a);
        return ikVar2 != null ? ikVar2 : a;
    }
}
