package com.p2082ss.android.ugc.aweme.editSticker.text.p2887c;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.c.i */
public final class C46123i {

    /* renamed from: a */
    public final int f107375a;

    /* renamed from: b */
    public final int f107376b;

    /* renamed from: c */
    public final boolean f107377c;

    /* renamed from: d */
    public final boolean f107378d;

    /* renamed from: e */
    public final boolean f107379e;

    static {
        Covode.recordClassIndex(54681);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46123i)) {
            return false;
        }
        C46123i iVar = (C46123i) obj;
        return this.f107375a == iVar.f107375a && this.f107376b == iVar.f107376b && this.f107377c == iVar.f107377c && this.f107378d == iVar.f107378d && this.f107379e == iVar.f107379e;
    }

    public final int hashCode() {
        int i = ((this.f107375a * 31) + this.f107376b) * 31;
        boolean z = this.f107377c;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (i + i3) * 31;
        boolean z2 = this.f107378d;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        if (!this.f107379e) {
            i2 = 0;
        }
        return i10 + i2;
    }

    public final String toString() {
        return "TextStickerTouchEvent(x=" + this.f107375a + ", y=" + this.f107376b + ", isUp=" + this.f107377c + ", isRotate=" + this.f107378d + ", isInTimeEditView=" + this.f107379e + ")";
    }

    private /* synthetic */ C46123i() {
        this(0, 0, false, false, false);
    }

    public C46123i(int i, int i2, boolean z, boolean z2, boolean z3) {
        this.f107375a = i;
        this.f107376b = i2;
        this.f107377c = z;
        this.f107378d = z2;
        this.f107379e = z3;
    }
}
