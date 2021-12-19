package com.bytedance.jedi.p1445a.p1453f;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1448c.AbstractC20168e;
import com.bytedance.jedi.p1445a.p1448c.C20167d;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20181b;
import com.bytedance.jedi.p1445a.p1453f.C20189c;
import p4560f.p4561a.AbstractC88979t;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.jedi.a.f.a */
public abstract class AbstractC20179a<K, V, REQ, RESP> implements AbstractC20181b<K, V, REQ, RESP> {

    /* renamed from: c */
    static final /* synthetic */ AbstractC89286i[] f47950c = {new C89232y(C89204ab.m154669a(AbstractC20179a.class), "dataSource", "getDataSource$model_release()Lcom/bytedance/jedi/model/datasource/IDataSource;")};

    /* renamed from: d */
    public final AbstractC89244h f47951d = C89250i.m154773a((AbstractC89171a) new C20180a(this));

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AbstractC88979t<RESP> mo33481a(REQ req);

    /* renamed from: com.bytedance.jedi.a.f.a$a */
    static final class C20180a extends AbstractC89220m implements AbstractC89171a<AbstractC20168e<K, V>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC20179a f47952a;

        static {
            Covode.recordClassIndex(23688);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20180a(AbstractC20179a aVar) {
            super(0);
            this.f47952a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Object invoke() {
            AbstractC20179a aVar = this.f47952a;
            C89219l.m154719c(aVar, "");
            AbstractC20181b.C20182a.C20183a aVar2 = new AbstractC20181b.C20182a.C20183a(aVar);
            C20167d.m38142a(aVar, aVar2);
            return aVar2;
        }
    }

    static {
        Covode.recordClassIndex(23687);
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
    /* renamed from: c */
    public final AbstractC88979t<RESP> mo33487c(REQ req) {
        AbstractC88979t<RESP> a = mo33481a(req);
        C89219l.m154719c(this, "");
        C89219l.m154719c(a, "");
        AbstractC88979t<RESP> b = a.mo143280b(new C20189c.C20190a(this, req));
        C89219l.m154709a((Object) b, "");
        return b;
    }
}
