package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;

/* renamed from: com.google.c.c.o */
final class C27526o<K, V> extends C27515m<K, V> {

    /* renamed from: g */
    transient long[] f64893g;

    /* renamed from: h */
    private transient int f64894h;

    /* renamed from: i */
    private transient int f64895i;

    /* renamed from: j */
    private final boolean f64896j;

    static {
        Covode.recordClassIndex(33106);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.C27515m
    /* renamed from: a */
    public final int mo46006a() {
        return this.f64894h;
    }

    C27526o() {
        this(3);
    }

    @Override // com.google.p1998c.p2001c.C27515m
    public final void clear() {
        super.clear();
        this.f64894h = -2;
        this.f64895i = -2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.C27515m
    /* renamed from: e */
    public final int mo46018e(int i) {
        return (int) this.f64893g[i];
    }

    C27526o(int i) {
        this(i, (byte) 0);
    }

    /* renamed from: f */
    private int m55028f(int i) {
        return (int) (this.f64893g[i] >>> 32);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.C27515m
    /* renamed from: b */
    public final void mo46012b(int i) {
        super.mo46012b(i);
        this.f64893g = Arrays.copyOf(this.f64893g, i);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.C27515m
    /* renamed from: a */
    public final void mo46009a(int i) {
        if (this.f64896j) {
            m55027b(m55028f(i), (int) this.f64893g[i]);
            m55027b(this.f64895i, i);
            m55027b(i, -2);
            this.f64862e++;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.C27515m
    /* renamed from: d */
    public final void mo46017d(int i) {
        int size = size() - 1;
        m55027b(m55028f(i), (int) this.f64893g[i]);
        if (i < size) {
            m55027b(m55028f(size), i);
            m55027b(i, (int) this.f64893g[size]);
        }
        super.mo46017d(i);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.C27515m
    /* renamed from: a */
    public final int mo46007a(int i, int i2) {
        if (i >= size()) {
            return i2;
        }
        return i;
    }

    private C27526o(int i, byte b) {
        super(i, (byte) 0);
        this.f64896j = false;
    }

    /* renamed from: b */
    private void m55027b(int i, int i2) {
        if (i == -2) {
            this.f64894h = i2;
        } else {
            long[] jArr = this.f64893g;
            jArr[i] = (jArr[i] & -4294967296L) | (((long) i2) & 4294967295L);
        }
        if (i2 == -2) {
            this.f64895i = i;
            return;
        }
        long[] jArr2 = this.f64893g;
        jArr2[i2] = (4294967295L & jArr2[i2]) | (((long) i) << 32);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.C27515m
    /* renamed from: a */
    public final void mo46010a(int i, float f) {
        super.mo46010a(i, f);
        this.f64894h = -2;
        this.f64895i = -2;
        long[] jArr = new long[i];
        this.f64893g = jArr;
        Arrays.fill(jArr, -1L);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.C27515m
    /* renamed from: a */
    public final void mo46011a(int i, K k, V v, int i2) {
        super.mo46011a(i, k, v, i2);
        m55027b(this.f64895i, i);
        m55027b(i, -2);
    }
}
