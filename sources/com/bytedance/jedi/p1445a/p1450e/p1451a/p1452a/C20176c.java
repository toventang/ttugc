package com.bytedance.jedi.p1445a.p1450e.p1451a.p1452a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1446a.AbstractC20124a;
import com.bytedance.jedi.p1445a.p1454g.p1456b.AbstractC20202a;
import com.bytedance.jedi.p1445a.p1454g.p1456b.C20203b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.a.e.a.a.c */
public class C20176c<K, V> extends AbstractC20124a<K, V> {

    /* renamed from: c */
    private final C20174a<K, V> f47946c;

    static {
        Covode.recordClassIndex(23684);
    }

    public /* synthetic */ C20176c() {
        this(-1);
    }

    @Override // com.bytedance.jedi.p1445a.p1446a.AbstractC20124a
    /* renamed from: e */
    public final void mo33463e() {
        this.f47946c.f47944a.mo33499a();
    }

    @Override // com.bytedance.jedi.p1445a.p1446a.AbstractC20124a
    /* renamed from: d */
    public final List<C89378p<K, V>> mo33462d() {
        C20174a<K, V> aVar = this.f47946c;
        ArrayList arrayList = new ArrayList();
        ConcurrentMap<K, V> b = aVar.f47944a.mo33501b();
        C89219l.m154709a((Object) b, "");
        for (Map.Entry<K, V> entry : b.entrySet()) {
            arrayList.add(C89387v.m154943a(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    @Override // com.bytedance.jedi.p1445a.p1446a.AbstractC20124a
    /* renamed from: b */
    public V mo33459b(K k) {
        return this.f47946c.f47944a.mo33498a(k);
    }

    public C20176c(long j) {
        AbstractC20202a<K1, V1> d = C20203b.m38204a().mo33506d();
        C89219l.m154709a((Object) d, "");
        this.f47946c = new C20174a<>(d);
    }

    @Override // com.bytedance.jedi.p1445a.p1446a.AbstractC20124a
    /* renamed from: b */
    public final void mo33460b(K k, V v) {
        C20174a<K, V> aVar = this.f47946c;
        if (v != null) {
            aVar.f47944a.mo33500a(k, v);
        } else {
            aVar.f47944a.mo33502b(k);
        }
    }
}
