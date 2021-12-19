package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.gw */
public final class C25999gw<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: a */
    private Iterator<Map.Entry<K, Object>> f61269a;

    static {
        Covode.recordClassIndex(31414);
    }

    public final boolean hasNext() {
        return this.f61269a.hasNext();
    }

    public final void remove() {
        this.f61269a.remove();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.f61269a.next();
        if (next.getValue() instanceof C25998gv) {
            return new C26000gx(next, (byte) 0);
        }
        return next;
    }

    public C25999gw(Iterator<Map.Entry<K, Object>> it) {
        this.f61269a = it;
    }
}
