package com.squareup.p2075a.p2076a.p2077a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.squareup.a.a.a.n */
public final class C29141n {

    /* renamed from: a */
    int f68949a;

    /* renamed from: b */
    int f68950b;

    /* renamed from: c */
    int f68951c;

    /* renamed from: d */
    final int[] f68952d = new int[10];

    static {
        Covode.recordClassIndex(35490);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo50829a() {
        if ((this.f68949a & 2) != 0) {
            return this.f68952d[1];
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo50832b() {
        if ((this.f68949a & 128) != 0) {
            return this.f68952d[7];
        }
        return 65536;
    }

    /* renamed from: c */
    private boolean m58209c(int i) {
        if (((1 << i) & this.f68950b) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private boolean m58210d(int i) {
        if (((1 << i) & this.f68951c) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo50831a(int i) {
        if (((1 << i) & this.f68949a) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo50833b(int i) {
        int i2;
        if (m58210d(i)) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        if (m58209c(i)) {
            return i2 | 1;
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C29141n mo50830a(int i, int i2, int i3) {
        int[] iArr = this.f68952d;
        if (i >= iArr.length) {
            return this;
        }
        int i4 = 1 << i;
        this.f68949a |= i4;
        if ((i2 & 1) != 0) {
            this.f68950b |= i4;
        } else {
            this.f68950b &= i4 ^ -1;
        }
        if ((i2 & 2) != 0) {
            this.f68951c |= i4;
        } else {
            this.f68951c &= i4 ^ -1;
        }
        iArr[i] = i3;
        return this;
    }
}
