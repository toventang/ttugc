package com.p2082ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.g */
public final class C38238g {

    /* renamed from: a */
    public int f90346a;

    /* renamed from: b */
    public int f90347b;

    /* renamed from: c */
    public int f90348c;

    static {
        Covode.recordClassIndex(45722);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38238g)) {
            return false;
        }
        C38238g gVar = (C38238g) obj;
        return this.f90346a == gVar.f90346a && this.f90347b == gVar.f90347b && this.f90348c == gVar.f90348c;
    }

    public final int hashCode() {
        return (((this.f90346a * 31) + this.f90347b) * 31) + this.f90348c;
    }

    public final String toString() {
        return "AdHalfWebPageRealSecondsParams(originalSeconds=" + this.f90346a + ", realSeconds=" + this.f90347b + ", isAdjusted=" + this.f90348c + ")";
    }

    public C38238g(int i, int i2, int i3) {
        this.f90346a = i;
        this.f90347b = i2;
        this.f90348c = i3;
    }
}
