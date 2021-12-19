package com.bytedance.lynx.hybrid.service.p1537b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.p1515a.AbstractC21151e;
import com.bytedance.lynx.hybrid.p1515a.AbstractC21153g;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.service.b.a */
public final class C21351a implements AbstractC21151e {

    /* renamed from: a */
    private final ConcurrentHashMap<Class<?>, AbstractC21153g<?>> f50701a = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(24970);
    }

    @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21151e
    /* renamed from: a */
    public final <T> T mo34721a(Class<T> cls) {
        T t;
        C89219l.m154719c(cls, "");
        AbstractC21153g<?> gVar = this.f50701a.get(cls);
        if (gVar == null || (t = (T) gVar.mo34723a()) == null || !cls.isAssignableFrom(t.getClass())) {
            return null;
        }
        return t;
    }

    @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21151e
    /* renamed from: a */
    public final <T> void mo34722a(Class<T> cls, T t) {
        C89219l.m154719c(cls, "");
        if (t != null) {
            this.f50701a.put(cls, new C21352b(t));
        }
    }
}
