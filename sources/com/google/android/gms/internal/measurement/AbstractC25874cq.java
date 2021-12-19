package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.cq */
abstract class AbstractC25874cq<E> extends AbstractC25919eh<E> {

    /* renamed from: a */
    private final int f61002a;

    /* renamed from: b */
    private int f61003b;

    static {
        Covode.recordClassIndex(31289);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract E mo42217a(int i);

    public final int nextIndex() {
        return this.f61003b;
    }

    public final boolean hasPrevious() {
        if (this.f61003b > 0) {
            return true;
        }
        return false;
    }

    public final int previousIndex() {
        return this.f61003b - 1;
    }

    public final boolean hasNext() {
        if (this.f61003b < this.f61002a) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i = this.f61003b;
            this.f61003b = i + 1;
            return mo42217a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i = this.f61003b - 1;
            this.f61003b = i;
            return mo42217a(i);
        }
        throw new NoSuchElementException();
    }

    protected AbstractC25874cq(int i, int i2) {
        C25866ci.m50070b(i2, i);
        this.f61002a = i;
        this.f61003b = i2;
    }
}
