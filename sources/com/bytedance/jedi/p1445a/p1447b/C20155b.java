package com.bytedance.jedi.p1445a.p1447b;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1446a.AbstractC20129c;
import com.bytedance.jedi.p1445a.p1447b.C20147a;
import com.bytedance.jedi.p1445a.p1448c.AbstractC20168e;
import com.bytedance.jedi.p1445a.p1448c.C20165b;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20181b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.a.b.b */
public final class C20155b {

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.a.b.b$a */
    public static final class C20156a extends AbstractC89220m implements AbstractC89172b<C20147a.C20149b<K, RESP, K1, V1>, C89391z> {

        /* renamed from: a */
        public static final C20156a f47930a = new C20156a();

        static {
            Covode.recordClassIndex(23664);
        }

        C20156a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Object obj) {
            C89219l.m154719c(obj, "");
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(23663);
    }

    /* renamed from: a */
    public static final <K, V, REQ, RESP, K1, V1> C20147a<K, V, REQ, RESP, K1, V1> m38133a(AbstractC20181b<K, V, REQ, RESP> bVar, AbstractC20129c<K1, V1> cVar, AbstractC89172b<? super C20147a.C20149b<K, RESP, K1, V1>, C89391z> bVar2) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(bVar2, "");
        AbstractC20168e a = C20165b.m38137a(cVar);
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(a, "");
        C89219l.m154719c(bVar2, "");
        C20147a.C20149b bVar3 = new C20147a.C20149b();
        bVar2.invoke(bVar3);
        return new C20147a<>(bVar, a, bVar3, (byte) 0);
    }
}
