package com.bytedance.jedi.p1445a.p1446a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1446a.AbstractC20129c;
import com.bytedance.jedi.p1445a.p1448c.AbstractC20168e;
import com.bytedance.jedi.p1445a.p1448c.C20165b;
import com.bytedance.jedi.p1445a.p1448c.C20167d;
import com.bytedance.jedi.p1445a.p1448c.C20169f;
import com.bytedance.jedi.p1445a.p1448c.C20171g;
import com.bytedance.jedi.p1445a.p1462l.AbstractC20319b;
import com.bytedance.jedi.p1445a.p1462l.AbstractC20320c;
import com.bytedance.jedi.p1445a.p1462l.C20322e;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89388w;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.jedi.a.a.a */
public abstract class AbstractC20124a<K, V> implements AbstractC20129c<K, V> {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f47892a = {new C89232y(C89204ab.m154669a(AbstractC20124a.class), "dataSource", "getDataSource$model_release()Lcom/bytedance/jedi/model/datasource/IDataSource;")};

    /* renamed from: c */
    private final AbstractC89244h f47893c = C89250i.m154773a((AbstractC89171a) new C20125a(this));

    /* renamed from: a */
    public final AbstractC20168e<K, V> mo33455a() {
        return (AbstractC20168e) this.f47893c.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract V mo33459b(K k);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo33460b(K k, V v);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract List<C89378p<K, V>> mo33462d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo33463e();

    /* renamed from: c */
    public final void mo33461c() {
        mo33463e();
    }

    /* renamed from: com.bytedance.jedi.a.a.a$a */
    static final class C20125a extends AbstractC89220m implements AbstractC89171a<AbstractC20168e<K, V>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC20124a f47894a;

        static {
            Covode.recordClassIndex(23633);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20125a(AbstractC20124a aVar) {
            super(0);
            this.f47894a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Object invoke() {
            AbstractC20124a aVar = this.f47894a;
            C89219l.m154719c(aVar, "");
            AbstractC20129c.C20130a.C20131a aVar2 = new AbstractC20129c.C20130a.C20131a(aVar);
            C20167d.m38142a(aVar, aVar2);
            return aVar2;
        }
    }

    @Override // com.bytedance.jedi.p1445a.p1446a.AbstractC20129c
    /* renamed from: b */
    public final AbstractC88979t<List<C89378p<K, V>>> mo33458b() {
        AbstractC88979t<List<C89378p<K, V>>> b = AbstractC88979t.m154310b((Object) mo33462d());
        C89219l.m154709a((Object) b, "");
        return b;
    }

    static {
        Covode.recordClassIndex(23632);
    }

    @Override // com.bytedance.jedi.p1445a.p1446a.AbstractC20129c
    /* renamed from: a */
    public final AbstractC88979t<C20169f<V>> mo33456a(K k) {
        AbstractC88979t<C20169f<V>> b = AbstractC88979t.m154310b(C20171g.m38149a(mo33459b(k)));
        C89219l.m154709a((Object) b, "");
        return b;
    }

    @Override // com.bytedance.jedi.p1445a.p1446a.AbstractC20129c
    /* renamed from: a */
    public final void mo33457a(K k, V v) {
        AbstractC20319b<?> bVar;
        mo33460b(k, v);
        C89219l.m154719c(this, "");
        AbstractC20168e a = C20165b.m38137a(this);
        if (!(a instanceof AbstractC20320c)) {
            a = null;
        }
        AbstractC20320c cVar = (AbstractC20320c) a;
        if (cVar != null) {
            if (C20146h.f47917a.get(this) != null) {
                Map<?, AbstractC20319b<?>> map = C20146h.f47917a.get(this);
                if (map == null) {
                    C89219l.m154707a();
                }
                if (map.get(k) != null) {
                    Map<?, AbstractC20319b<?>> map2 = C20146h.f47917a.get(this);
                    if (map2 == null) {
                        C89219l.m154707a();
                    }
                    AbstractC20319b<?> bVar2 = map2.get(k);
                    if (bVar2 != null) {
                        bVar = bVar2;
                        cVar.mo33477a(bVar);
                    }
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
            bVar = C20322e.C20323a.m38510a(C89387v.m154943a(k, v));
            cVar.mo33477a(bVar);
        }
    }
}
