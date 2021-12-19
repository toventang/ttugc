package com.bytedance.ies.bullet.service.base.p1164b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16574h;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16575i;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.base.b.b */
public final class C16619b implements AbstractC16574h {

    /* renamed from: a */
    private final ConcurrentHashMap<Class<?>, AbstractC16575i<?>> f39776a = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(19056);
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16574h
    /* renamed from: a */
    public final <T> T mo26343a(Class<T> cls) {
        T t;
        C89219l.m154719c(cls, "");
        AbstractC16575i<?> iVar = this.f39776a.get(cls);
        if (iVar == null || (t = (T) iVar.mo26345a()) == null || !cls.isAssignableFrom(t.getClass())) {
            return null;
        }
        return t;
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16574h
    /* renamed from: a */
    public final <T> void mo26344a(Class<T> cls, T t) {
        C89219l.m154719c(cls, "");
        if (t != null) {
            this.f39776a.put(cls, new C16620c(t));
        }
    }
}
