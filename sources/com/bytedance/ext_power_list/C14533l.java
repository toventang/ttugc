package com.bytedance.ext_power_list;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ext_power_list.l */
public final class C14533l {

    /* renamed from: a */
    public final boolean f35141a;

    /* renamed from: b */
    public final boolean f35142b;

    static {
        Covode.recordClassIndex(16620);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14533l)) {
            return false;
        }
        C14533l lVar = (C14533l) obj;
        return this.f35141a == lVar.f35141a && this.f35142b == lVar.f35142b;
    }

    public final int hashCode() {
        boolean z = this.f35141a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        if (!this.f35142b) {
            i = 0;
        }
        return i5 + i;
    }

    public final String toString() {
        return "LoadingState(prevHasMore=" + this.f35141a + ", nextHasMore=" + this.f35142b + ")";
    }

    private /* synthetic */ C14533l() {
        this(false, false);
    }

    public C14533l(boolean z, boolean z2) {
        this.f35141a = z;
        this.f35142b = z2;
    }
}
