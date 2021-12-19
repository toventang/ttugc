package com.p2082ss.ugc.effectplatform.p4444b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.util.C87007u;
import p4519d.p4520a.p4521a.C87989b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.b.d */
public final class C86751d {

    /* renamed from: a */
    public static final C86751d f195641a = new C86751d();

    /* renamed from: b */
    private static C87989b<String, AbstractC86755f> f195642b = new C87989b<>(true);

    private C86751d() {
    }

    static {
        Covode.recordClassIndex(102450);
    }

    /* renamed from: a */
    public static AbstractC86755f m150298a(String str) {
        C89219l.m154719c(str, "");
        if (!C87007u.m150697a(str) && f195642b.containsKey(str)) {
            return f195642b.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public static void m150299a(String str, AbstractC86755f fVar) {
        C89219l.m154719c(str, "");
        f195642b.put(str, fVar);
    }
}
