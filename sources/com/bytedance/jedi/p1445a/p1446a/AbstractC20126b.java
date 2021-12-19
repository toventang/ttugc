package com.bytedance.jedi.p1445a.p1446a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1446a.AbstractC20137e;
import com.bytedance.jedi.p1445a.p1448c.AbstractC20168e;
import com.bytedance.jedi.p1445a.p1448c.C20165b;
import com.bytedance.jedi.p1445a.p1448c.C20167d;
import com.bytedance.jedi.p1445a.p1448c.C20169f;
import com.bytedance.jedi.p1445a.p1448c.C20171g;
import com.bytedance.jedi.p1445a.p1462l.AbstractC20319b;
import com.bytedance.jedi.p1445a.p1462l.AbstractC20320c;
import com.bytedance.jedi.p1445a.p1462l.C20322e;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89388w;
import p4600h.p4601a.C89070n;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.jedi.a.a.b */
public abstract class AbstractC20126b<K, V> implements AbstractC20137e<K, V> {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f47895a = {new C89232y(C89204ab.m154669a(AbstractC20126b.class), "dataSource", "getDataSource$model_release()Lcom/bytedance/jedi/model/datasource/IDataSource;")};

    /* renamed from: c */
    private final AbstractC89244h f47896c = C89250i.m154773a((AbstractC89171a) new C20128b(this));

    /* renamed from: a */
    public final AbstractC20168e<K, List<V>> mo33464a() {
        return (AbstractC20168e) this.f47896c.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract List<V> mo33468b(K k);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo33469b(K k, List<? extends V> list);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract List<C89378p<K, List<V>>> mo33470c();

    /* renamed from: d */
    public AbstractC89172b<V, Comparable<?>> mo33471d() {
        return null;
    }

    /* renamed from: com.bytedance.jedi.a.a.b$b */
    static final class C20128b extends AbstractC89220m implements AbstractC89171a<AbstractC20168e<K, List<? extends V>>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC20126b f47898a;

        static {
            Covode.recordClassIndex(23636);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20128b(AbstractC20126b bVar) {
            super(0);
            this.f47898a = bVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Object invoke() {
            AbstractC20126b bVar = this.f47898a;
            C89219l.m154719c(bVar, "");
            AbstractC20137e.C20138a.C20139a aVar = new AbstractC20137e.C20138a.C20139a(bVar);
            C20167d.m38142a(bVar, aVar);
            return aVar;
        }
    }

    @Override // com.bytedance.jedi.p1445a.p1446a.AbstractC20137e
    /* renamed from: b */
    public final AbstractC88979t<List<C89378p<K, List<V>>>> mo33467b() {
        AbstractC88979t<List<C89378p<K, List<V>>>> b = AbstractC88979t.m154310b((Object) mo33470c());
        C89219l.m154709a((Object) b, "");
        return b;
    }

    static {
        Covode.recordClassIndex(23634);
    }

    @Override // com.bytedance.jedi.p1445a.p1446a.AbstractC20137e
    /* renamed from: a */
    public final AbstractC88979t<C20169f<List<V>>> mo33465a(K k) {
        AbstractC88979t<C20169f<List<V>>> b = AbstractC88979t.m154310b(C20171g.m38149a(mo33468b(k)));
        C89219l.m154709a((Object) b, "");
        return b;
    }

    /* renamed from: com.bytedance.jedi.a.a.b$a */
    public static final class C20127a<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f47897a;

        static {
            Covode.recordClassIndex(23635);
        }

        public C20127a(AbstractC89172b bVar) {
            this.f47897a = bVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a((Comparable) this.f47897a.invoke(t), (Comparable) this.f47897a.invoke(t2));
        }
    }

    @Override // com.bytedance.jedi.p1445a.p1446a.AbstractC20137e
    /* renamed from: a */
    public final void mo33466a(K k, List<? extends V> list) {
        AbstractC20319b<V> bVar;
        List<? extends V> a;
        AbstractC89172b<V, Comparable<?>> d = mo33471d();
        AbstractC20320c cVar = null;
        if (!(d == null || list == null || (a = C89070n.m154553a((Iterable) list, (Comparator) new C20127a(d))) == null)) {
            list = a;
        }
        mo33469b(k, list);
        C89219l.m154719c(this, "");
        AbstractC20168e a2 = C20165b.m38138a(this);
        if (a2 instanceof AbstractC20320c) {
            cVar = a2;
        }
        AbstractC20320c cVar2 = cVar;
        if (cVar2 != null) {
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
                        bVar = bVar2.mo33654a(C89387v.m154943a(k, list));
                        cVar2.mo33477a(bVar);
                    }
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
            bVar = C20322e.C20323a.m38510a(C89387v.m154943a(k, list));
            cVar2.mo33477a(bVar);
        }
    }
}
