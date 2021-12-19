package com.bytedance.jedi.p1445a.p1462l;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1446a.AbstractC20129c;
import com.bytedance.jedi.p1445a.p1446a.AbstractC20137e;
import com.bytedance.jedi.p1445a.p1446a.C20145g;
import com.bytedance.jedi.p1445a.p1446a.C20146h;
import com.bytedance.jedi.p1445a.p1463m.C20335d;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.a.l.g */
public final class C20327g<K, V> implements AbstractC20321d<C89378p<? extends K, ? extends V>> {

    /* renamed from: a */
    private final WeakReference<AbstractC20318a<C89378p<K, V>>> f48177a;

    static {
        Covode.recordClassIndex(23835);
    }

    public C20327g(AbstractC20318a<C89378p<K, V>> aVar) {
        C89219l.m154719c(aVar, "");
        this.f48177a = new WeakReference<>(aVar);
    }

    @Override // com.bytedance.jedi.p1445a.p1462l.AbstractC20321d
    /* renamed from: b */
    public final void mo33479b(AbstractC20319b<C89378p<K, V>> bVar) {
        Map a;
        C89219l.m154719c(bVar, "");
        AbstractC20318a<C89378p<K, V>> aVar = this.f48177a.get();
        if (aVar != null) {
            C89219l.m154709a((Object) aVar, "");
            C20335d.m38518a(bVar, aVar);
            C20145g.m38123a(aVar);
            try {
                Map<?, AbstractC20319b<?>> map = C20146h.f47917a.get(aVar);
                if (map == null) {
                    map = new LinkedHashMap<>();
                    C20146h.f47917a.put(aVar, map);
                }
                C20146h.m38126a(map).put(bVar.mo33655a().getFirst(), bVar);
                if (aVar instanceof AbstractC20129c) {
                    ((AbstractC20129c) aVar).mo33457a(bVar.mo33655a().getFirst(), bVar.mo33655a().getSecond());
                } else if (aVar instanceof AbstractC20137e) {
                    ((AbstractC20137e) aVar).mo33466a(bVar.mo33655a().getFirst(), bVar.mo33655a().getSecond());
                } else {
                    throw new IllegalStateException("TraceableObserver should be ICache or IListCache".toString());
                }
                Map<?, AbstractC20319b<?>> map2 = C20146h.f47917a.get(aVar);
                if (!(map2 == null || (a = C20146h.m38126a(map2)) == null)) {
                    a.remove(bVar.mo33655a().getFirst());
                }
            } finally {
                C20145g.m38124b(aVar);
            }
        }
    }
}
