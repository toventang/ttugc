package com.bytedance.ies.xbridge.model.p1341b;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.model.b.c */
public final class C18742c {

    /* renamed from: a */
    private final Map<Class<?>, AbstractC18740a<?>> f44526a = new LinkedHashMap();

    static {
        Covode.recordClassIndex(21436);
    }

    /* renamed from: a */
    public final <T> T mo29769a(Class<T> cls) {
        T t;
        C89219l.m154719c(cls, "");
        AbstractC18740a<?> aVar = this.f44526a.get(cls);
        if (aVar == null || (t = (T) aVar.mo29768b()) == null || !cls.isAssignableFrom(t.getClass())) {
            return null;
        }
        return t;
    }

    /* renamed from: a */
    public final <T> void mo29770a(Class<T> cls, T t) {
        C89219l.m154719c(cls, "");
        m34808a((Class) cls, (AbstractC18740a) new C18743d(t));
    }

    /* renamed from: b */
    public final <T> void mo29771b(Class<T> cls, T t) {
        C89219l.m154719c(cls, "");
        m34808a((Class) cls, (AbstractC18740a) new C18741b(t));
    }

    /* renamed from: a */
    private <T> void m34808a(Class<T> cls, AbstractC18740a<? extends T> aVar) {
        C89219l.m154719c(cls, "");
        C89219l.m154719c(aVar, "");
        AbstractC18740a<?> aVar2 = this.f44526a.get(cls);
        if (!(aVar2 == null || aVar2 == aVar)) {
            aVar2.mo29439a();
        }
        this.f44526a.put(cls, aVar);
    }
}
