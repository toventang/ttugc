package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27245k;
import java.util.NoSuchElementException;

/* renamed from: com.google.c.c.a */
abstract class AbstractC27346a<E> extends AbstractC27480bs<E> {

    /* renamed from: a */
    private final int f64619a;

    /* renamed from: b */
    private int f64620b;

    static {
        Covode.recordClassIndex(32926);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract E mo45524a(int i);

    public final int nextIndex() {
        return this.f64620b;
    }

    public final boolean hasPrevious() {
        if (this.f64620b > 0) {
            return true;
        }
        return false;
    }

    public final int previousIndex() {
        return this.f64620b - 1;
    }

    public final boolean hasNext() {
        if (this.f64620b < this.f64619a) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i = this.f64620b;
            this.f64620b = i + 1;
            return mo45524a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i = this.f64620b - 1;
            this.f64620b = i;
            return mo45524a(i);
        }
        throw new NoSuchElementException();
    }

    protected AbstractC27346a(int i, int i2) {
        C27245k.m54242b(i2, i);
        this.f64619a = i;
        this.f64620b = i2;
    }
}
