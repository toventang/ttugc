package com.p2082ss.android.ugc.tiktok.deeplink;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.tiktok.deeplink.b */
public final class C84299b {

    /* renamed from: a */
    public boolean f188500a;

    /* renamed from: b */
    public boolean f188501b;

    /* renamed from: c */
    public boolean f188502c;

    /* renamed from: d */
    public boolean f188503d;

    /* renamed from: e */
    public boolean f188504e;

    /* renamed from: f */
    public boolean f188505f;

    /* renamed from: g */
    public boolean f188506g;

    /* renamed from: h */
    public boolean f188507h;

    /* renamed from: i */
    public boolean f188508i;

    static {
        Covode.recordClassIndex(98221);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84299b)) {
            return false;
        }
        C84299b bVar = (C84299b) obj;
        return this.f188500a == bVar.f188500a && this.f188501b == bVar.f188501b && this.f188502c == bVar.f188502c && this.f188503d == bVar.f188503d && this.f188504e == bVar.f188504e && this.f188505f == bVar.f188505f && this.f188506g == bVar.f188506g && this.f188507h == bVar.f188507h && this.f188508i == bVar.f188508i;
    }

    public final int hashCode() {
        boolean z = this.f188500a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.f188501b;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        boolean z3 = this.f188502c;
        if (z3) {
            z3 = true;
        }
        int i10 = z3 ? 1 : 0;
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = (i9 + i10) * 31;
        boolean z4 = this.f188503d;
        if (z4) {
            z4 = true;
        }
        int i14 = z4 ? 1 : 0;
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = (i13 + i14) * 31;
        boolean z5 = this.f188504e;
        if (z5) {
            z5 = true;
        }
        int i18 = z5 ? 1 : 0;
        int i19 = z5 ? 1 : 0;
        int i20 = z5 ? 1 : 0;
        int i21 = (i17 + i18) * 31;
        boolean z6 = this.f188505f;
        if (z6) {
            z6 = true;
        }
        int i22 = z6 ? 1 : 0;
        int i23 = z6 ? 1 : 0;
        int i24 = z6 ? 1 : 0;
        int i25 = (i21 + i22) * 31;
        boolean z7 = this.f188506g;
        if (z7) {
            z7 = true;
        }
        int i26 = z7 ? 1 : 0;
        int i27 = z7 ? 1 : 0;
        int i28 = z7 ? 1 : 0;
        int i29 = (i25 + i26) * 31;
        boolean z8 = this.f188507h;
        if (z8) {
            z8 = true;
        }
        int i30 = z8 ? 1 : 0;
        int i31 = z8 ? 1 : 0;
        int i32 = z8 ? 1 : 0;
        int i33 = (i29 + i30) * 31;
        if (!this.f188508i) {
            i = 0;
        }
        return i33 + i;
    }

    public final String toString() {
        return "Output(isPublicJump=" + this.f188500a + ", isSecurity=" + this.f188501b + ", isAllowJump=" + this.f188502c + ", isDefaultConfig=" + this.f188503d + ", isNotIncludeParam=" + this.f188504e + ", isContainExcludeParam=" + this.f188505f + ", isParamValueInvalid=" + this.f188506g + ", isEnableInterceptor=" + this.f188507h + ", isDeepLinkAllow=" + this.f188508i + ")";
    }

    private C84299b() {
        this.f188500a = false;
        this.f188501b = false;
        this.f188502c = false;
        this.f188503d = true;
        this.f188504e = false;
        this.f188505f = false;
        this.f188506g = false;
        this.f188507h = false;
        this.f188508i = true;
    }

    public /* synthetic */ C84299b(byte b) {
        this();
    }
}
