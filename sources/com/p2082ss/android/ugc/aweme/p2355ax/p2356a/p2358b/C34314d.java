package com.p2082ss.android.ugc.aweme.p2355ax.p2356a.p2358b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ax.a.b.d */
public final class C34314d {

    /* renamed from: a */
    public final String f81160a;

    /* renamed from: b */
    public final long f81161b;

    static {
        Covode.recordClassIndex(41258);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34314d)) {
            return false;
        }
        C34314d dVar = (C34314d) obj;
        return C89219l.m154714a(this.f81160a, dVar.f81160a) && this.f81161b == dVar.f81161b;
    }

    public final int hashCode() {
        String str = this.f81160a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.f81161b;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "IntervalMetric(intervalName=" + this.f81160a + ", interval=" + this.f81161b + ")";
    }

    public C34314d(String str, long j) {
        C89219l.m154721d(str, "");
        this.f81160a = str;
        this.f81161b = j;
    }
}
