package com.bytedance.jedi.p1445a.p1454g.p1457c;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.bytedance.jedi.a.g.c.a */
public abstract class AbstractC20264a<T> implements Iterator<T> {

    /* renamed from: a */
    private T f48115a;

    static {
        Covode.recordClassIndex(23772);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo33569a(T t);

    public final boolean hasNext() {
        if (this.f48115a != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            try {
                T t = this.f48115a;
                this.f48115a = mo33569a(t);
                return t;
            } catch (Throwable th) {
                this.f48115a = mo33569a(this.f48115a);
                throw th;
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    public AbstractC20264a(T t) {
        this.f48115a = t;
    }
}
