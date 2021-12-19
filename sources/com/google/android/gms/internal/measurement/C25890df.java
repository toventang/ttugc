package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.df */
final class C25890df extends AbstractCollection<V> {

    /* renamed from: a */
    private final /* synthetic */ C25881cx f61028a;

    static {
        Covode.recordClassIndex(31305);
    }

    public final void clear() {
        this.f61028a.clear();
    }

    public final int size() {
        return this.f61028a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        C25881cx cxVar = this.f61028a;
        Map b = cxVar.mo42245b();
        if (b != null) {
            return b.values().iterator();
        }
        return new C25882cy(cxVar);
    }

    C25890df(C25881cx cxVar) {
        this.f61028a = cxVar;
    }
}
