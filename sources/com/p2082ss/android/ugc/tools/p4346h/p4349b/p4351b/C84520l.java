package com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.tools.h.b.b.l */
public final class C84520l {

    /* renamed from: a */
    public final int f188909a;

    /* renamed from: b */
    public final boolean f188910b;

    static {
        Covode.recordClassIndex(98485);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84520l)) {
            return false;
        }
        C84520l lVar = (C84520l) obj;
        return this.f188909a == lVar.f188909a && this.f188910b == lVar.f188910b;
    }

    public final int hashCode() {
        int i = this.f188909a * 31;
        boolean z = this.f188910b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return i + i2;
    }

    public final String toString() {
        return "EpProviderCursorData(cursor=" + this.f188909a + ", hasMore=" + this.f188910b + ")";
    }

    public C84520l(int i, boolean z) {
        this.f188909a = i;
        this.f188910b = z;
    }
}
