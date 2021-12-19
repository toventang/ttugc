package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27245k;
import java.io.Serializable;
import java.util.Comparator;

/* access modifiers changed from: package-private */
/* renamed from: com.google.c.c.p */
public final class C27527p<T> extends AbstractC27450az<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final Comparator<T> f64897a;

    static {
        Covode.recordClassIndex(33107);
    }

    public final int hashCode() {
        return this.f64897a.hashCode();
    }

    public final String toString() {
        return this.f64897a.toString();
    }

    C27527p(Comparator<T> comparator) {
        this.f64897a = (Comparator) C27245k.m54229a(comparator);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C27527p) {
            return this.f64897a.equals(((C27527p) obj).f64897a);
        }
        return false;
    }

    @Override // com.google.p1998c.p2001c.AbstractC27450az, java.util.Comparator
    public final int compare(T t, T t2) {
        return this.f64897a.compare(t, t2);
    }
}
