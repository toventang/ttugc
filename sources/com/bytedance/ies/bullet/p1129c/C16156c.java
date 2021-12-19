package com.bytedance.ies.bullet.p1129c;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.c.c */
public final class C16156c {

    /* renamed from: a */
    public static final ConcurrentHashMap<String, AbstractC16245e> f38907a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static final C16156c f38908b = new C16156c();

    private C16156c() {
    }

    static {
        Covode.recordClassIndex(18449);
    }

    /* renamed from: a */
    public static AbstractC16245e m29997a(String str) {
        C89219l.m154719c(str, "");
        return f38907a.get(str);
    }

    /* renamed from: a */
    public static void m29998a(String str, AbstractC16245e eVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(eVar, "");
        f38907a.put(str, eVar);
    }
}
