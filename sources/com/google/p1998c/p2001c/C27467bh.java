package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27245k;
import java.io.Serializable;

/* access modifiers changed from: package-private */
/* renamed from: com.google.c.c.bh */
public final class C27467bh<T> extends AbstractC27450az<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final AbstractC27450az<? super T> f64799a;

    static {
        Covode.recordClassIndex(33047);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: com.google.c.c.az<? super T>, com.google.c.c.az<S extends T> */
    @Override // com.google.p1998c.p2001c.AbstractC27450az
    /* renamed from: a */
    public final <S extends T> AbstractC27450az<S> mo45799a() {
        return (AbstractC27450az<? super T>) this.f64799a;
    }

    public final int hashCode() {
        return -this.f64799a.hashCode();
    }

    public final String toString() {
        return this.f64799a + ".reverse()";
    }

    C27467bh(AbstractC27450az<? super T> azVar) {
        this.f64799a = (AbstractC27450az) C27245k.m54229a(azVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C27467bh) {
            return this.f64799a.equals(((C27467bh) obj).f64799a);
        }
        return false;
    }

    @Override // com.google.p1998c.p2001c.AbstractC27450az, java.util.Comparator
    public final int compare(T t, T t2) {
        return this.f64799a.compare(t2, t);
    }
}
