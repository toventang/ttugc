package com.bytedance.jedi.p1445a.p1450e.p1451a.p1452a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1446a.AbstractC20126b;
import com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20202a;
import com.bytedance.jedi.p1445a.p1454g.p1456b.C20203b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.a.e.a.a.d */
public class C20177d<K, V> extends AbstractC20126b<K, V> {

    /* renamed from: c */
    private AbstractC89172b<? super V, ? extends Comparable<?>> f47947c;

    /* renamed from: d */
    private final C20175b<K, V> f47948d;

    static {
        Covode.recordClassIndex(23685);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super V, ? extends java.lang.Comparable<?>>, h.f.a.b<V, java.lang.Comparable<?>> */
    @Override // com.bytedance.jedi.p1445a.p1446a.AbstractC20126b
    /* renamed from: d */
    public final AbstractC89172b<V, Comparable<?>> mo33471d() {
        AbstractC89172b bVar = (AbstractC89172b<? super V, ? extends Comparable<?>>) this.f47947c;
        if (bVar == null) {
            return super.mo33471d();
        }
        return bVar;
    }

    private C20177d() {
        AbstractC20202a<K1, V1> d = C20203b.m38204a().mo33506d();
        C89219l.m154709a((Object) d, "");
        this.f47948d = new C20175b<>(d);
    }

    @Override // com.bytedance.jedi.p1445a.p1446a.AbstractC20126b
    /* renamed from: c */
    public final List<C89378p<K, List<V>>> mo33470c() {
        C20175b<K, V> bVar = this.f47948d;
        ArrayList arrayList = new ArrayList();
        ConcurrentMap<K, List<V>> b = bVar.f47945a.mo33501b();
        C89219l.m154709a((Object) b, "");
        for (Map.Entry<K, List<V>> entry : b.entrySet()) {
            arrayList.add(C89387v.m154943a(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    public /* synthetic */ C20177d(byte b) {
        this();
    }

    @Override // com.bytedance.jedi.p1445a.p1446a.AbstractC20126b
    /* renamed from: b */
    public final List<V> mo33468b(K k) {
        return this.f47948d.f47945a.mo33498a(k);
    }

    @Override // com.bytedance.jedi.p1445a.p1446a.AbstractC20126b
    /* renamed from: b */
    public final void mo33469b(K k, List<? extends V> list) {
        C20175b<K, V> bVar = this.f47948d;
        if (list != null) {
            bVar.f47945a.mo33500a(k, list);
        } else {
            bVar.f47945a.mo33502b(k);
        }
    }
}
