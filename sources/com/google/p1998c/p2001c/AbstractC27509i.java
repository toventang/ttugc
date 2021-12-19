package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import java.util.NoSuchElementException;

/* renamed from: com.google.c.c.i */
public abstract class AbstractC27509i<T> extends AbstractC27479br<T> {

    /* renamed from: a */
    private T f64851a;

    static {
        Covode.recordClassIndex(33089);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo45448a(T t);

    public final boolean hasNext() {
        if (this.f64851a != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            try {
                T t = this.f64851a;
                this.f64851a = mo45448a(t);
                return t;
            } catch (Throwable th) {
                this.f64851a = mo45448a(this.f64851a);
                throw th;
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    public AbstractC27509i(T t) {
        this.f64851a = t;
    }
}
