package com.bytedance.android.livesdkapi.p699l;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdkapi.l.b */
public final class C11826b {

    /* renamed from: a */
    public final boolean f28183a;

    /* renamed from: b */
    public final boolean f28184b;

    /* renamed from: c */
    public final boolean f28185c;

    /* renamed from: d */
    public final boolean f28186d;

    /* renamed from: e */
    public final boolean f28187e;

    static {
        Covode.recordClassIndex(13524);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11826b)) {
            return false;
        }
        C11826b bVar = (C11826b) obj;
        return this.f28183a == bVar.f28183a && this.f28184b == bVar.f28184b && this.f28185c == bVar.f28185c && this.f28186d == bVar.f28186d && this.f28187e == bVar.f28187e;
    }

    public final int hashCode() {
        boolean z = this.f28183a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.f28184b;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        boolean z3 = this.f28185c;
        if (z3) {
            z3 = true;
        }
        int i10 = z3 ? 1 : 0;
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = (i9 + i10) * 31;
        boolean z4 = this.f28186d;
        if (z4) {
            z4 = true;
        }
        int i14 = z4 ? 1 : 0;
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = (i13 + i14) * 31;
        if (!this.f28187e) {
            i = 0;
        }
        return i17 + i;
    }

    public final String toString() {
        return "DetailLivePermission(socialPermission=" + this.f28183a + ", videoPermission=" + this.f28184b + ", screenPermission=" + this.f28185c + ", obsPermission=" + this.f28186d + ", enableLiveStudio=" + this.f28187e + ")";
    }

    private /* synthetic */ C11826b() {
        this(false, false, false, false, false);
    }

    public C11826b(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f28183a = z;
        this.f28184b = z2;
        this.f28185c = z3;
        this.f28186d = z4;
        this.f28187e = z5;
    }
}
