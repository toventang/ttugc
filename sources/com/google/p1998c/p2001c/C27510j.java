package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27235f;
import com.google.p1998c.p1999a.C27245k;
import java.io.Serializable;
import java.util.Arrays;

/* access modifiers changed from: package-private */
/* renamed from: com.google.c.c.j */
public final class C27510j<F, T> extends AbstractC27450az<F> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final AbstractC27235f<F, ? extends T> f64852a;

    /* renamed from: b */
    final AbstractC27450az<T> f64853b;

    static {
        Covode.recordClassIndex(33090);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f64852a, this.f64853b});
    }

    public final String toString() {
        return this.f64853b + ".onResultOf(" + this.f64852a + ")";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C27510j) {
            C27510j jVar = (C27510j) obj;
            if (!this.f64852a.equals(jVar.f64852a) || !this.f64853b.equals(jVar.f64853b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    C27510j(AbstractC27235f<F, ? extends T> fVar, AbstractC27450az<T> azVar) {
        this.f64852a = (AbstractC27235f) C27245k.m54229a(fVar);
        this.f64853b = (AbstractC27450az) C27245k.m54229a(azVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.google.c.c.az<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.p1998c.p2001c.AbstractC27450az, java.util.Comparator
    public final int compare(F f, F f2) {
        return this.f64853b.compare(this.f64852a.mo45319a(f), this.f64852a.mo45319a(f2));
    }
}
