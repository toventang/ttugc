package com.p2082ss.android.ugc.aweme.commercialize.util.p2620b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.ugc.aweme.commercialize.util.C38583c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.util.b.a */
public final class C38582a {

    /* renamed from: a */
    public static final C38582a f91175a = new C38582a();

    /* renamed from: b */
    private static final IRetrofitFactory f91176b;

    /* renamed from: c */
    private static final String f91177c = C38583c.f91178a;

    private C38582a() {
    }

    static {
        Covode.recordClassIndex(46114);
        IRetrofitFactory a = RetrofitFactory.m33635a();
        C89219l.m154716b(a, "");
        f91176b = a;
    }

    /* renamed from: a */
    public static <T> T m78286a(Class<T> cls) {
        C89219l.m154721d(cls, "");
        return (T) f91176b.mo28817b(f91177c).mo28832d().mo28858a(cls);
    }

    /* renamed from: a */
    public static <T> T m78287a(Class<T> cls, String str) {
        C89219l.m154721d(cls, "");
        C89219l.m154721d(str, "");
        return (T) f91176b.mo28817b(str).mo28832d().mo28858a(cls);
    }
}
