package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.c.c.be */
public final class C27464be<E> extends AbstractC27381ai<E> {

    /* renamed from: a */
    static final C27464be<Object> f64790a = new C27464be<>(new Object[0], 0, null, 0, 0);

    /* renamed from: b */
    final transient Object[] f64791b;

    /* renamed from: c */
    final transient Object[] f64792c;

    /* renamed from: d */
    private final transient int f64793d;

    /* renamed from: e */
    private final transient int f64794e;

    /* renamed from: f */
    private final transient int f64795f;

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27536x
    /* renamed from: a */
    public final boolean mo45578a() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27381ai
    /* renamed from: c */
    public final boolean mo45579c() {
        return true;
    }

    @Override // com.google.p1998c.p2001c.AbstractC27381ai
    public final int hashCode() {
        return this.f64794e;
    }

    public final int size() {
        return this.f64795f;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27381ai
    /* renamed from: d */
    public final AbstractC27540z<E> mo45656d() {
        return AbstractC27540z.m55061b(this.f64791b, this.f64795f);
    }

    @Override // com.google.p1998c.p2001c.AbstractC27381ai, com.google.p1998c.p2001c.AbstractC27381ai, java.util.AbstractCollection, java.util.Collection, java.util.Set, com.google.p1998c.p2001c.AbstractC27536x, com.google.p1998c.p2001c.AbstractC27536x, java.lang.Iterable
    public final AbstractC27479br<E> iterator() {
        return asList().iterator();
    }

    static {
        Covode.recordClassIndex(33044);
    }

    @Override // com.google.p1998c.p2001c.AbstractC27536x
    public final boolean contains(Object obj) {
        Object[] objArr = this.f64792c;
        if (obj == null || objArr == null) {
            return false;
        }
        int a = C27535w.m55048a(obj);
        while (true) {
            int i = a & this.f64793d;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a = i + 1;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27536x
    /* renamed from: a */
    public final int mo45633a(Object[] objArr, int i) {
        System.arraycopy(this.f64791b, 0, objArr, i, this.f64795f);
        return i + this.f64795f;
    }

    C27464be(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f64791b = objArr;
        this.f64792c = objArr2;
        this.f64793d = i2;
        this.f64794e = i;
        this.f64795f = i3;
    }
}
