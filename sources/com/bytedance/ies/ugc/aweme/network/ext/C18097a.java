package com.bytedance.ies.ugc.aweme.network.ext;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.AbstractC18096e;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.aweme.network.ext.a */
public final class C18097a {
    static {
        Covode.recordClassIndex(20736);
    }

    /* renamed from: a */
    public static final IRetrofitFactory m33696a() {
        IRetrofitFactory a = RetrofitFactory.m33635a();
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: a */
    public static final AbstractC18099f m33697a(String str) {
        C89219l.m154721d(str, "");
        AbstractC18099f a = m33696a().mo28816a(str);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: b */
    public static final AbstractC18096e m33699b(String str) {
        C89219l.m154721d(str, "");
        AbstractC18096e b = m33696a().mo28817b(str);
        C89219l.m154716b(b, "");
        return b;
    }

    /* renamed from: a */
    public static final <T> T m33698a(String str, Class<T> cls) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(cls, "");
        return (T) m33696a().mo28816a(str).mo28858a(cls);
    }
}
