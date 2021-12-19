package com.p2082ss.android.ugc.aweme.discover.p2770e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;

/* renamed from: com.ss.android.ugc.aweme.discover.e.e */
public final class C41926e implements AbstractC81914b {

    /* renamed from: a */
    public final long f97797a;

    /* renamed from: b */
    public final long f97798b;

    /* renamed from: c */
    public final int f97799c;

    /* renamed from: d */
    public final int f97800d;

    /* renamed from: e */
    public final long f97801e;

    static {
        Covode.recordClassIndex(49852);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41926e)) {
            return false;
        }
        C41926e eVar = (C41926e) obj;
        return this.f97797a == eVar.f97797a && this.f97798b == eVar.f97798b && this.f97799c == eVar.f97799c && this.f97800d == eVar.f97800d && this.f97801e == eVar.f97801e;
    }

    public final String toString() {
        return "DynamicVerticalSearchRefreshEvent(networkStart=" + this.f97797a + ", networkEnd=" + this.f97798b + ", itemCount=" + this.f97799c + ", status=" + this.f97800d + ", viewDrawStart=" + this.f97801e + ")";
    }

    public final int hashCode() {
        long j = this.f97797a;
        long j2 = this.f97798b;
        long j3 = this.f97801e;
        return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f97799c) * 31) + this.f97800d) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public C41926e(long j, long j2, int i, int i2, long j3) {
        this.f97797a = j;
        this.f97798b = j2;
        this.f97799c = i;
        this.f97800d = i2;
        this.f97801e = j3;
    }
}
