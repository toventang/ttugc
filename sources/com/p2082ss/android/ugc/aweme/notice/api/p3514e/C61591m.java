package com.p2082ss.android.ugc.aweme.notice.api.p3514e;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.notice.api.e.m */
public final class C61591m {

    /* renamed from: a */
    public final int f139769a;

    /* renamed from: b */
    public final int f139770b;

    static {
        Covode.recordClassIndex(72269);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61591m)) {
            return false;
        }
        C61591m mVar = (C61591m) obj;
        return this.f139769a == mVar.f139769a && this.f139770b == mVar.f139770b;
    }

    public final int hashCode() {
        return (this.f139769a * 31) + this.f139770b;
    }

    public final String toString() {
        return "PsmIdentifier(service=" + this.f139769a + ", method=" + this.f139770b + ")";
    }

    public C61591m(int i, int i2) {
        this.f139769a = i;
        this.f139770b = i2;
    }
}
