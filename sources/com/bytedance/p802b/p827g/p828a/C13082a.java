package com.bytedance.p802b.p827g.p828a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.b.g.a.a */
public final class C13082a {

    /* renamed from: a */
    public long f31888a;

    /* renamed from: b */
    public boolean f31889b;

    /* renamed from: c */
    public boolean f31890c;

    /* renamed from: d */
    public boolean f31891d;

    /* renamed from: e */
    public boolean f31892e;

    /* renamed from: f */
    private double f31893f;

    static {
        Covode.recordClassIndex(14918);
    }

    /* renamed from: a */
    public final double mo20923a() {
        double d = this.f31893f;
        if (d > 0.5d) {
            return d;
        }
        return 0.8d;
    }

    public final String toString() {
        return "MemoryConfig{memoryCollectionInterval=" + this.f31888a + ", memoryTopCheckThreshold=" + this.f31893f + ", isStopWhenBackground=" + this.f31889b + ", isRealTimeMemEnable=" + this.f31890c + ", isUploadEnable=" + this.f31891d + ", isApm6SampleEnable=" + this.f31892e + '}';
    }

    public C13082a(long j, double d, boolean z, boolean z2) {
        if (j <= 0) {
            this.f31888a = 120;
        } else {
            this.f31888a = j;
        }
        this.f31893f = d;
        this.f31892e = z2;
        this.f31889b = false;
        this.f31890c = false;
        this.f31891d = z;
    }
}
