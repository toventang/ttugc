package com.bytedance.ies.xbridge;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.f */
public final class C18513f {

    /* renamed from: a */
    private final AbstractC89244h f44170a = C89250i.m154773a((AbstractC89171a) C18515b.f44172a);

    static {
        Covode.recordClassIndex(21207);
    }

    /* renamed from: a */
    public final C18514a mo29640a() {
        return (C18514a) this.f44170a.getValue();
    }

    /* renamed from: com.bytedance.ies.xbridge.f$b */
    static final class C18515b extends AbstractC89220m implements AbstractC89171a<C18514a> {

        /* renamed from: a */
        public static final C18515b f44172a = new C18515b();

        static {
            Covode.recordClassIndex(21209);
        }

        C18515b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C18514a invoke() {
            return new C18514a();
        }
    }

    /* renamed from: com.bytedance.ies.xbridge.f$a */
    public static final class C18514a {

        /* renamed from: a */
        public final Map<String, AbstractC18467c> f44171a = new LinkedHashMap();

        static {
            Covode.recordClassIndex(21208);
        }

        /* renamed from: a */
        public final void mo29642a(String str, AbstractC18467c cVar) {
            C89219l.m154719c(str, "");
            C89219l.m154719c(cVar, "");
            this.f44171a.put(str, cVar);
        }
    }

    /* renamed from: a */
    public final void mo29641a(String str, AbstractC18467c cVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(cVar, "");
        mo29640a().mo29642a(str, cVar);
    }
}
