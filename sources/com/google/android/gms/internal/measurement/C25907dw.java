package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.dw */
final class C25907dw extends AbstractC25920ei<T> {

    /* renamed from: a */
    private boolean f61049a;

    /* renamed from: b */
    private final /* synthetic */ Object f61050b;

    static {
        Covode.recordClassIndex(31322);
    }

    public final boolean hasNext() {
        if (!this.f61049a) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!this.f61049a) {
            this.f61049a = true;
            return (T) this.f61050b;
        }
        throw new NoSuchElementException();
    }

    C25907dw(Object obj) {
        this.f61050b = obj;
    }
}
