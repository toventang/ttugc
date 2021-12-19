package com.bytedance.sdk.bdlynx.p1677a.p1681d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.bdlynx.p1677a.p1682e.AbstractC22612c;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.sdk.bdlynx.a.d.a */
public final class C22608a {

    /* renamed from: a */
    public static final C22608a f53417a = new C22608a();

    /* renamed from: b */
    private static final Map<Class<? extends AbstractC22612c>, AbstractC22612c> f53418b = new LinkedHashMap();

    /* renamed from: c */
    private static final Map<String, Object> f53419c = new LinkedHashMap();

    private C22608a() {
    }

    static {
        Covode.recordClassIndex(26424);
    }

    /* renamed from: a */
    public final synchronized <T extends AbstractC22612c> T mo36876a(Class<T> cls) {
        T t;
        MethodCollector.m26663i(1198);
        C89219l.m154719c(cls, "");
        AbstractC22612c cVar = f53418b.get(cls);
        if (!(cVar instanceof AbstractC22612c)) {
            cVar = null;
        }
        t = (T) cVar;
        MethodCollector.m26664o(1198);
        return t;
    }
}
