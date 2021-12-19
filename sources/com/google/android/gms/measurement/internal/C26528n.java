package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.n */
public final class C26528n implements Iterator<String> {

    /* renamed from: a */
    private Iterator<String> f62460a;

    /* renamed from: b */
    private final /* synthetic */ zzan f62461b;

    static {
        Covode.recordClassIndex(31950);
    }

    public final boolean hasNext() {
        return this.f62460a.hasNext();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f62460a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }

    C26528n(zzan zzan) {
        this.f62461b = zzan;
        this.f62460a = zzan.f62577a.keySet().iterator();
    }
}
