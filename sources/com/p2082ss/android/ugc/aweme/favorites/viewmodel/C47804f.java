package com.p2082ss.android.ugc.aweme.favorites.viewmodel;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.favorites.api.C47196f;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.f */
public final class C47804f {

    /* renamed from: a */
    public static final HashMap<String, C47196f> f110757a = new HashMap<>();

    /* renamed from: b */
    public static final C47804f f110758b = new C47804f();

    private C47804f() {
    }

    static {
        Covode.recordClassIndex(56430);
    }

    /* renamed from: a */
    public static C47196f m90816a(String str) {
        C89219l.m154721d(str, "");
        HashMap<String, C47196f> hashMap = f110757a;
        C47196f fVar = hashMap.get(str);
        hashMap.put(str, null);
        return fVar;
    }

    /* renamed from: a */
    public static void m90817a(String str, C47196f fVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(fVar, "");
        f110757a.put(str, fVar);
    }
}
