package p4519d.p4520a.p4534g;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import p4519d.p4520a.p4521a.C87988a;
import p4519d.p4520a.p4521a.C87989b;

/* renamed from: d.a.g.b */
public final class C88067b<K, V> {

    /* renamed from: a */
    public final C87989b<K, C87988a<V>> f199977a = new C87989b<>();

    static {
        Covode.recordClassIndex(104093);
    }

    /* renamed from: a */
    public final Collection<V> mo142621a() {
        Collection<C87988a<V>> values = this.f199977a.values();
        ArrayList arrayList = new ArrayList();
        for (C87988a<V> aVar : values) {
            arrayList.addAll(aVar);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo142622a(K k, V v) {
        C87988a<V> aVar = this.f199977a.get(k);
        if (aVar == null) {
            C87988a<V> aVar2 = new C87988a<>();
            aVar2.add(v);
            this.f199977a.put(k, aVar2);
            return;
        }
        aVar.add(v);
    }
}
