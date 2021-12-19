package com.bytedance.lighten.loader;

import com.bytedance.covode.number.Covode;
import com.facebook.fresco.animation.p1862a.AbstractC24270a;
import com.facebook.fresco.animation.p1869d.AbstractC24298b;

/* renamed from: com.bytedance.lighten.loader.f */
final class C20787f implements AbstractC24298b {

    /* renamed from: a */
    final AbstractC24270a f49186a;

    /* renamed from: b */
    public int f49187b = -1;

    /* renamed from: c */
    private long f49188c = -1;

    /* renamed from: d */
    private int f49189d;

    /* renamed from: e */
    private long f49190e = -1;

    /* renamed from: f */
    private long f49191f = -1;

    /* renamed from: g */
    private int[] f49192g;

    static {
        Covode.recordClassIndex(24363);
    }

    /* renamed from: b */
    private boolean m39120b() {
        if (this.f49186a.mo9308a() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.fresco.animation.p1869d.AbstractC24298b
    /* renamed from: a */
    public final long mo34221a() {
        long j = this.f49188c;
        if (j != -1) {
            return j;
        }
        this.f49188c = 0;
        int length = this.f49192g.length;
        for (int i = 0; i < length; i++) {
            this.f49188c += (long) m39119b(this.f49192g[i]);
        }
        return this.f49188c;
    }

    @Override // com.facebook.fresco.animation.p1869d.AbstractC24298b
    /* renamed from: a */
    public final long mo34222a(int i) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (long) m39119b(i);
        }
        return j;
    }

    /* renamed from: b */
    private int m39119b(int i) {
        if (i >= this.f49186a.mo40050e()) {
            return this.f49186a.mo40049c(0);
        }
        return this.f49186a.mo40049c(i);
    }

    @Override // com.facebook.fresco.animation.p1869d.AbstractC24298b
    /* renamed from: a */
    public final long mo34223a(long j) {
        if (mo34221a() == 0) {
            return -1;
        }
        if (!m39120b() && this.f49189d >= this.f49186a.mo9308a()) {
            return -1;
        }
        long b = (long) m39119b(this.f49192g[this.f49187b]);
        long j2 = this.f49190e + b;
        if (j2 >= j) {
            return j2;
        }
        return j + b;
    }

    public C20787f(AbstractC24270a aVar, int[] iArr) {
        this.f49186a = aVar;
        this.f49192g = iArr;
    }

    @Override // com.facebook.fresco.animation.p1869d.AbstractC24298b
    /* renamed from: a */
    public final int mo34220a(long j, long j2) {
        if (!m39120b() && j / mo34221a() >= ((long) this.f49186a.mo9308a())) {
            return -1;
        }
        long a = j % mo34221a();
        long j3 = 0;
        int i = 0;
        int i2 = 0;
        do {
            j3 += (long) m39119b(this.f49192g[i2]);
            i2++;
        } while (a >= j3);
        int i3 = i2 - 1;
        int i4 = this.f49187b;
        if (i4 == -1 || j2 != this.f49191f) {
            this.f49190e = j;
            this.f49191f = j;
            this.f49187b = i3;
            return this.f49192g[i3];
        }
        this.f49191f = j;
        if (this.f49190e + ((long) m39119b(this.f49192g[i4])) > j) {
            return this.f49192g[this.f49187b];
        }
        this.f49190e = j;
        int i5 = this.f49187b + 1;
        int[] iArr = this.f49192g;
        if (i5 >= iArr.length) {
            this.f49189d++;
        } else {
            i = i5;
        }
        if (!this.f49186a.mo40046b(iArr[i])) {
            return this.f49192g[this.f49187b];
        }
        this.f49187b = i;
        return this.f49192g[i];
    }
}
