package com.p2082ss.android.ugc.aweme.ecommercelive.framework.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.framework.network.a */
public final class C45818a {

    /* renamed from: a */
    public static final C45818a f106750a = new C45818a();

    /* renamed from: b */
    private static final IRetrofitFactory f106751b;

    private C45818a() {
    }

    static {
        Covode.recordClassIndex(54338);
        IRetrofitFactory a = RetrofitFactory.m33635a();
        C89219l.m154716b(a, "");
        f106751b = a;
    }

    /* renamed from: a */
    public static <T> T m88431a(Class<T> cls, String str) {
        C89219l.m154721d(cls, "");
        C89219l.m154721d(str, "");
        return (T) f106751b.mo28816a(str).mo28858a(cls);
    }
}
