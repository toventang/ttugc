package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.is */
final class C26049is implements Iterator<Object> {
    static {
        Covode.recordClassIndex(31464);
    }

    public final boolean hasNext() {
        return false;
    }

    C26049is() {
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
