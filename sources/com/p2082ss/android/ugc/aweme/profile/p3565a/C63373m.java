package com.p2082ss.android.ugc.aweme.profile.p3565a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.profile.a.m */
public final class C63373m {

    /* renamed from: a */
    public final int f143881a;

    /* renamed from: b */
    public final int f143882b;

    /* renamed from: c */
    public final int f143883c;

    /* renamed from: d */
    public final int f143884d;

    /* renamed from: e */
    public final boolean f143885e;

    static {
        Covode.recordClassIndex(74664);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C63373m)) {
            return false;
        }
        C63373m mVar = (C63373m) obj;
        return this.f143881a == mVar.f143881a && this.f143882b == mVar.f143882b && this.f143883c == mVar.f143883c && this.f143884d == mVar.f143884d && this.f143885e == mVar.f143885e;
    }

    public final int hashCode() {
        int i = ((((((this.f143881a * 31) + this.f143882b) * 31) + this.f143883c) * 31) + this.f143884d) * 31;
        boolean z = this.f143885e;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return i + i2;
    }

    public final String toString() {
        return "GuideCardData(icon=" + this.f143881a + ", title=" + this.f143882b + ", doc=" + this.f143883c + ", button=" + this.f143884d + ", buttonState=" + this.f143885e + ")";
    }

    public C63373m(int i, int i2, int i3, int i4, boolean z) {
        this.f143881a = i;
        this.f143882b = i2;
        this.f143883c = i3;
        this.f143884d = i4;
        this.f143885e = z;
    }
}
