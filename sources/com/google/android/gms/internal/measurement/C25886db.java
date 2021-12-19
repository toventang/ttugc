package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.db */
final class C25886db extends AbstractSet<Map.Entry<K, V>> {

    /* renamed from: a */
    private final /* synthetic */ C25881cx f61023a;

    static {
        Covode.recordClassIndex(31301);
    }

    public final void clear() {
        this.f61023a.clear();
    }

    public final int size() {
        return this.f61023a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        C25881cx cxVar = this.f61023a;
        Map b = cxVar.mo42245b();
        if (b != null) {
            return b.entrySet().iterator();
        }
        return new C25883cz(cxVar);
    }

    C25886db(C25881cx cxVar) {
        this.f61023a = cxVar;
    }

    public final boolean contains(Object obj) {
        Map b = this.f61023a.mo42245b();
        if (b != null) {
            return b.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int a = this.f61023a.mo42241a(entry.getKey());
            if (a == -1 || !C25865ch.m50063a(this.f61023a.f61011e[a], entry.getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean remove(Object obj) {
        int c;
        int a;
        Map b = this.f61023a.mo42245b();
        if (b != null) {
            return b.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.f61023a.mo42243a() || (a = C25889de.m50104a(entry.getKey(), entry.getValue(), (c = this.f61023a.mo42246c()), this.f61023a.f61008b, this.f61023a.f61009c, this.f61023a.f61010d, this.f61023a.f61011e)) == -1) {
            return false;
        }
        this.f61023a.mo42242a(a, c);
        this.f61023a.f61013g--;
        this.f61023a.mo42250d();
        return true;
    }
}
