package com.facebook.fresco.animation.p1869d;

import com.bytedance.covode.number.Covode;
import com.facebook.fresco.animation.p1862a.AbstractC24270a;

/* renamed from: com.facebook.fresco.animation.d.d */
public final class C24300d implements AbstractC24298b {

    /* renamed from: a */
    private final AbstractC24270a f57606a;

    /* renamed from: b */
    private long f57607b = -1;

    /* renamed from: c */
    private int f57608c;

    /* renamed from: d */
    private int f57609d = -1;

    /* renamed from: e */
    private long f57610e = -1;

    /* renamed from: f */
    private long f57611f = -1;

    static {
        Covode.recordClassIndex(28432);
    }

    /* renamed from: b */
    private boolean m46239b() {
        if (this.f57606a.mo9308a() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.fresco.animation.p1869d.AbstractC24298b
    /* renamed from: a */
    public final long mo34221a() {
        long j = this.f57607b;
        if (j != -1) {
            return j;
        }
        this.f57607b = 0;
        int e = this.f57606a.mo40050e();
        for (int i = 0; i < e; i++) {
            this.f57607b += (long) this.f57606a.mo40049c(i);
        }
        return this.f57607b;
    }

    public C24300d(AbstractC24270a aVar) {
        this.f57606a = aVar;
    }

    @Override // com.facebook.fresco.animation.p1869d.AbstractC24298b
    /* renamed from: a */
    public final long mo34222a(int i) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (long) this.f57606a.mo40049c(i);
        }
        return j;
    }

    @Override // com.facebook.fresco.animation.p1869d.AbstractC24298b
    /* renamed from: a */
    public final long mo34223a(long j) {
        if (mo34221a() == 0) {
            return -1;
        }
        if (!m46239b() && this.f57608c >= this.f57606a.mo9308a()) {
            return -1;
        }
        long c = (long) this.f57606a.mo40049c(this.f57609d);
        long j2 = this.f57610e + c;
        if (j2 >= j) {
            return j2;
        }
        return j + c;
    }

    @Override // com.facebook.fresco.animation.p1869d.AbstractC24298b
    /* renamed from: a */
    public final int mo34220a(long j, long j2) {
        long a = mo34221a();
        long j3 = 0;
        if (a == 0) {
            return -1;
        }
        if (!m46239b() && j / a >= ((long) this.f57606a.mo9308a())) {
            return -1;
        }
        long j4 = j % a;
        int i = 0;
        int i2 = 0;
        do {
            j3 += (long) this.f57606a.mo40049c(i2);
            i2++;
        } while (j4 >= j3);
        int i3 = i2 - 1;
        int i4 = this.f57609d;
        if (i4 == -1 || j2 != this.f57611f) {
            this.f57610e = j;
            this.f57611f = j;
            this.f57609d = i3;
            return i3;
        }
        this.f57611f = j;
        if (this.f57610e + ((long) this.f57606a.mo40049c(i4)) > j) {
            return this.f57609d;
        }
        this.f57610e = j;
        int i5 = this.f57609d + 1;
        if (i5 >= this.f57606a.mo40050e()) {
            this.f57608c++;
        } else {
            i = i5;
        }
        if (!this.f57606a.mo40046b(i)) {
            return this.f57609d;
        }
        this.f57609d = i;
        return i;
    }
}
