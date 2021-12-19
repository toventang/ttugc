package com.p2082ss.android.ugc.aweme.friends.p3019i;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.friends.i.i */
public final class C51535i {
    @AbstractC27891c(mo46611a = "interval")

    /* renamed from: a */
    public long f118768a = 86400;
    @AbstractC27891c(mo46611a = "homepage_hot")

    /* renamed from: b */
    public boolean f118769b = false;
    @AbstractC27891c(mo46611a = "homepage_hot_index")

    /* renamed from: c */
    public int f118770c = 5;
    @AbstractC27891c(mo46611a = "me_tab")

    /* renamed from: d */
    public boolean f118771d = false;
    @AbstractC27891c(mo46611a = "inbox_tab")

    /* renamed from: e */
    public boolean f118772e = false;
    @AbstractC27891c(mo46611a = "homepage_follow")

    /* renamed from: f */
    public boolean f118773f = false;
    @AbstractC27891c(mo46611a = "profile_recommend")

    /* renamed from: g */
    public boolean f118774g = false;
    @AbstractC27891c(mo46611a = "freq_limit")

    /* renamed from: h */
    public int f118775h = 0;

    static {
        Covode.recordClassIndex(60800);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C51535i)) {
            return false;
        }
        C51535i iVar = (C51535i) obj;
        return this.f118768a == iVar.f118768a && this.f118769b == iVar.f118769b && this.f118770c == iVar.f118770c && this.f118771d == iVar.f118771d && this.f118772e == iVar.f118772e && this.f118773f == iVar.f118773f && this.f118774g == iVar.f118774g && this.f118775h == iVar.f118775h;
    }

    public final String toString() {
        return "PermissionPopUp(interval=" + this.f118768a + ", homepageHot=" + this.f118769b + ", homepageHotIndex=" + this.f118770c + ", meTab=" + this.f118771d + ", inboxTab=" + this.f118772e + ", homepageFollow=" + this.f118773f + ", profileRecommend=" + this.f118774g + ", freqLimit=" + this.f118775h + ")";
    }

    private C51535i() {
    }

    public final int hashCode() {
        long j = this.f118768a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        boolean z = this.f118769b;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (((i + i3) * 31) + this.f118770c) * 31;
        boolean z2 = this.f118771d;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.f118772e;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (i10 + i11) * 31;
        boolean z4 = this.f118773f;
        if (z4) {
            z4 = true;
        }
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = (i14 + i15) * 31;
        if (!this.f118774g) {
            i2 = 0;
        }
        return ((i18 + i2) * 31) + this.f118775h;
    }
}
