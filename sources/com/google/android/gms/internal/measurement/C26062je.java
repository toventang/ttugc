package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.je */
final class C26062je implements Iterator<String> {

    /* renamed from: a */
    private Iterator<String> f61375a;

    /* renamed from: b */
    private final /* synthetic */ C26060jc f61376b;

    static {
        Covode.recordClassIndex(31477);
    }

    public final boolean hasNext() {
        return this.f61375a.hasNext();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f61375a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    C26062je(C26060jc jcVar) {
        this.f61376b = jcVar;
        this.f61375a = jcVar.f61374a.iterator();
    }
}
