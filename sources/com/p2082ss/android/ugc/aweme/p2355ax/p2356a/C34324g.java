package com.p2082ss.android.ugc.aweme.p2355ax.p2356a;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ax.a.g */
public final class C34324g {

    /* renamed from: a */
    private final Map<Class<?>, AbstractC34339l<?>> f81176a = new LinkedHashMap();

    static {
        Covode.recordClassIndex(41268);
    }

    /* renamed from: a */
    public final <T> T mo60766a(Class<T> cls) {
        T t;
        C89219l.m154721d(cls, "");
        AbstractC34339l<?> lVar = this.f81176a.get(cls);
        if (lVar == null || (t = (T) lVar.mo60751a()) == null || !cls.isAssignableFrom(t.getClass())) {
            return null;
        }
        return t;
    }

    /* renamed from: a */
    public final <T> void mo60767a(Class<T> cls, AbstractC34339l<? extends T> lVar) {
        C89219l.m154721d(cls, "");
        C89219l.m154721d(lVar, "");
        AbstractC34339l<?> lVar2 = this.f81176a.get(cls);
        if (lVar2 != null) {
            lVar2.mo60752b();
        }
        this.f81176a.put(cls, lVar);
    }
}
