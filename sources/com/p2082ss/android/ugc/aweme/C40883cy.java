package com.p2082ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.cy */
public final class C40883cy {

    /* renamed from: a */
    public final boolean f95692a;

    /* renamed from: b */
    public final int f95693b;

    static {
        Covode.recordClassIndex(48735);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40883cy)) {
            return false;
        }
        C40883cy cyVar = (C40883cy) obj;
        return this.f95692a == cyVar.f95692a && this.f95693b == cyVar.f95693b;
    }

    public final int hashCode() {
        boolean z = this.f95692a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return (i * 31) + this.f95693b;
    }

    public final String toString() {
        return "PercentAllocation(ignorePercentAllocation=" + this.f95692a + ", value=" + this.f95693b + ")";
    }

    public C40883cy(boolean z, int i) {
        this.f95692a = z;
        this.f95693b = i;
    }
}
