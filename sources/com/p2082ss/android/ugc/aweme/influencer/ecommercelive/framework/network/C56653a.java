package com.p2082ss.android.ugc.aweme.influencer.ecommercelive.framework.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.a */
public final class C56653a {

    /* renamed from: a */
    public static final C56653a f129122a = new C56653a();

    /* renamed from: b */
    private static final IRetrofitFactory f129123b;

    private C56653a() {
    }

    static {
        Covode.recordClassIndex(66499);
        IRetrofitFactory a = RetrofitFactory.m33635a();
        C89219l.m154716b(a, "");
        f129123b = a;
    }

    /* renamed from: a */
    public static <T> T m102653a(Class<T> cls, String str) {
        C89219l.m154721d(cls, "");
        C89219l.m154721d(str, "");
        return (T) f129123b.mo28816a(str).mo28858a(cls);
    }
}
