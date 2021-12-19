package com.facebook.fresco.animation.p1869d;

import com.bytedance.covode.number.Covode;
import com.facebook.fresco.animation.p1862a.AbstractC24275d;

/* renamed from: com.facebook.fresco.animation.d.a */
public final class C24297a implements AbstractC24298b {

    /* renamed from: a */
    private final AbstractC24275d f57604a;

    /* renamed from: b */
    private long f57605b = -1;

    static {
        Covode.recordClassIndex(28429);
    }

    /* renamed from: b */
    private boolean m46229b() {
        if (this.f57604a.mo9308a() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.fresco.animation.p1869d.AbstractC24298b
    /* renamed from: a */
    public final long mo34221a() {
        long j = this.f57605b;
        if (j != -1) {
            return j;
        }
        this.f57605b = 0;
        int e = this.f57604a.mo40050e();
        for (int i = 0; i < e; i++) {
            this.f57605b += (long) this.f57604a.mo40049c(i);
        }
        return this.f57605b;
    }

    public C24297a(AbstractC24275d dVar) {
        this.f57604a = dVar;
    }

    @Override // com.facebook.fresco.animation.p1869d.AbstractC24298b
    /* renamed from: a */
    public final long mo34222a(int i) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (long) this.f57604a.mo40049c(i);
        }
        return j;
    }

    @Override // com.facebook.fresco.animation.p1869d.AbstractC24298b
    /* renamed from: a */
    public final long mo34223a(long j) {
        long a = mo34221a();
        long j2 = 0;
        if (a == 0) {
            return -1;
        }
        if (!m46229b() && j / mo34221a() >= ((long) this.f57604a.mo9308a())) {
            return -1;
        }
        long j3 = j % a;
        int e = this.f57604a.mo40050e();
        for (int i = 0; i < e && j2 <= j3; i++) {
            j2 += (long) this.f57604a.mo40049c(i);
        }
        return j + (j2 - j3);
    }

    @Override // com.facebook.fresco.animation.p1869d.AbstractC24298b
    /* renamed from: a */
    public final int mo34220a(long j, long j2) {
        if (!m46229b() && j / mo34221a() >= ((long) this.f57604a.mo9308a())) {
            return -1;
        }
        long a = j % mo34221a();
        int i = 0;
        long j3 = 0;
        do {
            j3 += (long) this.f57604a.mo40049c(i);
            i++;
        } while (a >= j3);
        return i - 1;
    }
}
