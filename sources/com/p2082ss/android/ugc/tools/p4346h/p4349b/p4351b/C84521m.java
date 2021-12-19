package com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.tools.h.b.b.m */
public final class C84521m {

    /* renamed from: a */
    public final int f188911a;

    /* renamed from: b */
    public final boolean f188912b;

    static {
        Covode.recordClassIndex(98486);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84521m)) {
            return false;
        }
        C84521m mVar = (C84521m) obj;
        return this.f188911a == mVar.f188911a && this.f188912b == mVar.f188912b;
    }

    public final int hashCode() {
        int i = this.f188911a * 31;
        boolean z = this.f188912b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return i + i2;
    }

    public final String toString() {
        return "EpSearchCursorData(cursor=" + this.f188911a + ", hasMore=" + this.f188912b + ")";
    }

    public C84521m(int i, boolean z) {
        this.f188911a = i;
        this.f188912b = z;
    }
}
