package com.bytedance.helios.api.p1088b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.api.b.p */
public final class C15322p {

    /* renamed from: a */
    public final boolean f37389a;

    /* renamed from: b */
    public final boolean f37390b;

    /* renamed from: c */
    public final boolean f37391c;

    /* renamed from: d */
    public final C15307e f37392d;

    static {
        Covode.recordClassIndex(17552);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15322p)) {
            return false;
        }
        C15322p pVar = (C15322p) obj;
        return this.f37389a == pVar.f37389a && this.f37390b == pVar.f37390b && this.f37391c == pVar.f37391c && C89219l.m154714a(this.f37392d, pVar.f37392d);
    }

    public final int hashCode() {
        boolean z = this.f37389a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.f37390b;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        if (!this.f37391c) {
            i = 0;
        }
        int i10 = (i9 + i) * 31;
        C15307e eVar = this.f37392d;
        return i10 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "SampleRateModel(appOpsConfig=" + this.f37389a + ", autoStartConfig=" + this.f37390b + ", exceptionConfig=" + this.f37391c + ", defaultLowPriorityConfig=" + this.f37392d + ")";
    }

    public C15322p(boolean z, boolean z2, boolean z3, C15307e eVar) {
        C89219l.m154719c(eVar, "");
        this.f37389a = z;
        this.f37390b = z2;
        this.f37391c = z3;
        this.f37392d = eVar;
    }
}
