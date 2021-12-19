package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27245k;
import java.util.Iterator;

/* renamed from: com.google.c.c.bo */
public abstract class AbstractC27476bo<F, T> implements Iterator<T> {

    /* renamed from: b */
    final Iterator<? extends F> f64803b;

    static {
        Covode.recordClassIndex(33056);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo45700a(F f);

    public final boolean hasNext() {
        return this.f64803b.hasNext();
    }

    public final void remove() {
        this.f64803b.remove();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.c.c.bo<F, T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Iterator
    public final T next() {
        return (T) mo45700a(this.f64803b.next());
    }

    AbstractC27476bo(Iterator<? extends F> it) {
        this.f64803b = (Iterator) C27245k.m54229a(it);
    }
}
