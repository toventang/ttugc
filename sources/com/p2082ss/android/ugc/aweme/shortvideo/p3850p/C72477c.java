package com.p2082ss.android.ugc.aweme.shortvideo.p3850p;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.p.c */
public final class C72477c {

    /* renamed from: a */
    public static final C72477c f162474a = new C72477c();

    /* renamed from: b */
    private static final AbstractC89244h f162475b = C89250i.m154773a((AbstractC89171a) C72478a.f162476a);

    /* renamed from: a */
    private static Map<String, AbstractC72480e> m127865a() {
        return (Map) f162475b.getValue();
    }

    private C72477c() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.p.c$a */
    static final class C72478a extends AbstractC89220m implements AbstractC89171a<Map<String, AbstractC72480e>> {

        /* renamed from: a */
        public static final C72478a f162476a = new C72478a();

        static {
            Covode.recordClassIndex(85153);
        }

        C72478a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<String, AbstractC72480e> invoke() {
            return new LinkedHashMap();
        }
    }

    static {
        Covode.recordClassIndex(85152);
    }

    /* renamed from: a */
    public static final AbstractC72480e m127864a(String str) {
        C89219l.m154721d(str, "");
        AbstractC72480e eVar = m127865a().get(str);
        if (eVar != null) {
            return eVar;
        }
        C72467b bVar = new C72467b(str);
        m127865a().put(str, bVar);
        return bVar;
    }
}
