package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.dd */
final class C25888dd extends AbstractSet<K> {

    /* renamed from: a */
    private final /* synthetic */ C25881cx f61027a;

    static {
        Covode.recordClassIndex(31303);
    }

    public final void clear() {
        this.f61027a.clear();
    }

    public final int size() {
        return this.f61027a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
    public final Iterator<K> iterator() {
        C25881cx cxVar = this.f61027a;
        Map b = cxVar.mo42245b();
        if (b != null) {
            return b.keySet().iterator();
        }
        return new C25880cw(cxVar);
    }

    C25888dd(C25881cx cxVar) {
        this.f61027a = cxVar;
    }

    public final boolean contains(Object obj) {
        return this.f61027a.containsKey(obj);
    }

    public final boolean remove(Object obj) {
        Map b = this.f61027a.mo42245b();
        if (b != null) {
            return b.keySet().remove(obj);
        }
        if (this.f61027a.mo42244b(obj) != C25881cx.f61007a) {
            return true;
        }
        return false;
    }
}
