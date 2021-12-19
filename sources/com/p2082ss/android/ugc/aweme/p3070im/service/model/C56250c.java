package com.p2082ss.android.ugc.aweme.p3070im.service.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.im.service.model.c */
public final class C56250c {

    /* renamed from: a */
    public final boolean f128291a = false;

    /* renamed from: b */
    public final boolean f128292b = false;

    static {
        Covode.recordClassIndex(66063);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56250c)) {
            return false;
        }
        C56250c cVar = (C56250c) obj;
        return this.f128291a == cVar.f128291a && this.f128292b == cVar.f128292b;
    }

    public final int hashCode() {
        boolean z = this.f128291a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        if (!this.f128292b) {
            i = 0;
        }
        return i5 + i;
    }

    public final String toString() {
        return "FollowWrapResult(isWrapped=" + this.f128291a + ", isLastWrapped=" + this.f128292b + ")";
    }
}
