package com.bytedance.android.monitor.p713k;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitor.k.c */
public final class C11945c {

    /* renamed from: a */
    public static final C11945c f28576a = new C11945c();

    /* renamed from: b */
    private static final C11943a f28577b = C11943a.f28572a;

    /* renamed from: c */
    private static Map<String, AbstractC11944b> f28578c = new LinkedHashMap();

    private C11945c() {
    }

    static {
        Covode.recordClassIndex(13671);
    }

    /* renamed from: a */
    public static void m21083a(String str, AbstractC11944b bVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(bVar, "");
        f28578c.put(str, bVar);
    }
}
