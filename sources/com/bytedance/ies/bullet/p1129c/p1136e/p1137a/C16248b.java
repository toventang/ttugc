package com.bytedance.ies.bullet.p1129c.p1136e.p1137a;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.c.e.a.b */
public final class C16248b {

    /* renamed from: a */
    private final Map<Class<?>, AbstractC16249c<?>> f39038a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(18541);
    }

    /* renamed from: a */
    public final void mo25824a() {
        this.f39038a.clear();
    }

    /* renamed from: b */
    public final C16248b mo25829b() {
        C16248b bVar = new C16248b();
        bVar.mo25825a(this);
        return bVar;
    }

    /* renamed from: a */
    public final void mo25825a(C16248b bVar) {
        C89219l.m154719c(bVar, "");
        this.f39038a.putAll(bVar.f39038a);
    }

    /* renamed from: a */
    public final <T> void mo25826a(Class<T> cls) {
        C89219l.m154719c(cls, "");
        AbstractC16249c<?> cVar = this.f39038a.get(cls);
        if (cVar != null) {
            cVar.mo25721a();
        }
        this.f39038a.remove(cls);
    }

    /* renamed from: b */
    public final <T> AbstractC16249c<T> mo25830b(Class<T> cls) {
        C89219l.m154719c(cls, "");
        AbstractC16249c<T> cVar = (AbstractC16249c<T>) this.f39038a.get(cls);
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    /* renamed from: c */
    public final <T> T mo25832c(Class<T> cls) {
        T t;
        C89219l.m154719c(cls, "");
        AbstractC16249c<?> cVar = this.f39038a.get(cls);
        if (cVar == null || (t = (T) cVar.mo25823b()) == null || !cls.isAssignableFrom(t.getClass())) {
            return null;
        }
        return t;
    }

    /* renamed from: a */
    public final <T> void mo25827a(Class<T> cls, AbstractC16249c<? extends T> cVar) {
        C89219l.m154719c(cls, "");
        C89219l.m154719c(cVar, "");
        AbstractC16249c<?> cVar2 = this.f39038a.get(cls);
        if (!(cVar2 == null || cVar2 == cVar)) {
            cVar2.mo25721a();
        }
        this.f39038a.put(cls, cVar);
    }

    /* renamed from: b */
    public final <T> void mo25831b(Class<T> cls, T t) {
        C89219l.m154719c(cls, "");
        mo25827a((Class) cls, (AbstractC16249c) new C16247a(t));
    }

    /* renamed from: a */
    public final <T> void mo25828a(Class<T> cls, T t) {
        C89219l.m154719c(cls, "");
        mo25827a((Class) cls, (AbstractC16249c) new C16250d(t));
    }
}
