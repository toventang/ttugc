package com.bytedance.helios.api.p1088b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.helios.api.b.e */
public final class C15307e {

    /* renamed from: a */
    public final boolean f37332a;

    /* renamed from: b */
    public final boolean f37333b;

    /* renamed from: c */
    public final boolean f37334c;

    static {
        Covode.recordClassIndex(17537);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15307e)) {
            return false;
        }
        C15307e eVar = (C15307e) obj;
        return this.f37332a == eVar.f37332a && this.f37333b == eVar.f37333b && this.f37334c == eVar.f37334c;
    }

    public final int hashCode() {
        boolean z = this.f37332a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.f37333b;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        if (!this.f37334c) {
            i = 0;
        }
        return i9 + i;
    }

    public final String toString() {
        return "DefaultSampleRateModel(monitorNormal=" + this.f37332a + ", monitorError=" + this.f37333b + ", interceptError=" + this.f37334c + ")";
    }

    public C15307e(boolean z, boolean z2, boolean z3) {
        this.f37332a = z;
        this.f37333b = z2;
        this.f37334c = z3;
    }
}
