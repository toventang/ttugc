package com.p2082ss.android.ugc.p4314h;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.h.i */
public final class C84119i implements Comparable<C84119i> {

    /* renamed from: a */
    public static boolean f187720a = true;

    /* renamed from: b */
    public double f187721b;

    /* renamed from: c */
    public double f187722c;

    /* renamed from: d */
    public long f187723d;

    /* renamed from: e */
    public long f187724e;

    static {
        Covode.recordClassIndex(98015);
    }

    public final String toString() {
        return "SpeedRecord{mSpeed=" + this.f187721b + ", mWeight=" + this.f187722c + ", mCostTime=" + this.f187723d + ", currentTime=" + this.f187724e + '}';
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C84119i iVar) {
        double d = this.f187721b;
        double d2 = iVar.f187721b;
        if (d == d2) {
            return 0;
        }
        if (d < d2) {
            return -1;
        }
        return 1;
    }

    public C84119i(double d, double d2, long j, long j2) {
        this.f187721b = d;
        this.f187722c = d2;
        this.f187723d = j;
        this.f187724e = j2;
        if (!f187720a) {
            return;
        }
        if (d < 0.0d || d2 < 0.0d) {
            throw new IllegalArgumentException(toString());
        }
    }
}
