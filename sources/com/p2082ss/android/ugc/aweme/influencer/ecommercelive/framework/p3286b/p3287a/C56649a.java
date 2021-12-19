package com.p2082ss.android.ugc.aweme.influencer.ecommercelive.framework.p3286b.p3287a;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.framework.b.a.a */
public final class C56649a {

    /* renamed from: a */
    public static final C56649a f129111a = new C56649a();

    /* renamed from: b */
    private static Keva f129112b;

    private C56649a() {
    }

    static {
        Covode.recordClassIndex(66494);
        Keva repo = Keva.getRepo("ec_local_sp_keva_name", 0);
        C89219l.m154716b(repo, "");
        f129112b = repo;
    }

    /* renamed from: a */
    public static void m102650a(String str) {
        C89219l.m154721d(str, "");
        f129112b.storeBoolean(str, false);
    }

    /* renamed from: b */
    public static boolean m102651b(String str) {
        C89219l.m154721d(str, "");
        return f129112b.getBoolean(str, true);
    }
}
