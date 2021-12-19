package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27245k;

/* access modifiers changed from: package-private */
/* renamed from: com.google.c.c.bb */
public final class C27455bb<E> extends AbstractC27540z<E> {

    /* renamed from: a */
    static final AbstractC27540z<Object> f64766a = new C27455bb(new Object[0], 0);

    /* renamed from: b */
    final transient Object[] f64767b;

    /* renamed from: c */
    private final transient int f64768c;

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27536x
    /* renamed from: a */
    public final boolean mo45578a() {
        return false;
    }

    public final int size() {
        return this.f64768c;
    }

    static {
        Covode.recordClassIndex(33035);
    }

    @Override // java.util.List
    public final E get(int i) {
        C27245k.m54228a(i, this.f64768c);
        return (E) this.f64767b[i];
    }

    C27455bb(Object[] objArr, int i) {
        this.f64767b = objArr;
        this.f64768c = i;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27540z, com.google.p1998c.p2001c.AbstractC27536x
    /* renamed from: a */
    public final int mo45633a(Object[] objArr, int i) {
        System.arraycopy(this.f64767b, 0, objArr, i, this.f64768c);
        return i + this.f64768c;
    }
}
