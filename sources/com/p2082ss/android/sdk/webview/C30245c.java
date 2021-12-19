package com.p2082ss.android.sdk.webview;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.sdk.webview.c */
public final class C30245c {

    /* renamed from: a */
    private final Map<Class<?>, AbstractC30261g<?>> f72161a = new LinkedHashMap();

    static {
        Covode.recordClassIndex(36756);
    }

    /* renamed from: a */
    public final <T> T mo53698a(Class<T> cls) {
        T t;
        C89219l.m154719c(cls, "");
        AbstractC30261g<?> gVar = this.f72161a.get(cls);
        if (gVar == null || (t = (T) gVar.mo53714a()) == null || !cls.isAssignableFrom(t.getClass())) {
            return null;
        }
        return t;
    }

    /* renamed from: a */
    public final <T> void mo53699a(Class<T> cls, AbstractC30261g<T> gVar) {
        C89219l.m154719c(cls, "");
        C89219l.m154719c(gVar, "");
        this.f72161a.get(cls);
        this.f72161a.put(cls, gVar);
    }
}
