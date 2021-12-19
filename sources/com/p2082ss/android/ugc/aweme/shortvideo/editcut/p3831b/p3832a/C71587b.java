package com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.p3832a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.b */
public final class C71587b {

    /* renamed from: a */
    public final boolean f160410a;

    /* renamed from: b */
    public final boolean f160411b;

    /* renamed from: c */
    public final boolean f160412c;

    static {
        Covode.recordClassIndex(84132);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C71587b)) {
            return false;
        }
        C71587b bVar = (C71587b) obj;
        return this.f160410a == bVar.f160410a && this.f160411b == bVar.f160411b && this.f160412c == bVar.f160412c;
    }

    public final int hashCode() {
        boolean z = this.f160410a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.f160411b;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        if (!this.f160412c) {
            i = 0;
        }
        return i9 + i;
    }

    public final String toString() {
        return "CutVideoListViewConfigure(enableStickPoint=" + this.f160410a + ", enableAdd=" + this.f160411b + ", isStickPointTab=" + this.f160412c + ")";
    }

    public C71587b(boolean z, boolean z2, boolean z3) {
        this.f160410a = z;
        this.f160411b = z2;
        this.f160412c = z3;
    }
}
