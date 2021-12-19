package com.p2082ss.android.ugc.aweme.inbox.widget;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.inbox.widget.b */
public final class C56520b {

    /* renamed from: a */
    public final int f128859a;

    /* renamed from: b */
    public final int f128860b;

    /* renamed from: c */
    public final int f128861c;

    /* renamed from: d */
    public final int f128862d;

    /* renamed from: e */
    public final int f128863e;

    /* renamed from: f */
    public final int f128864f;

    /* renamed from: g */
    public final int f128865g;

    /* renamed from: h */
    public final int f128866h;

    /* renamed from: i */
    public final int f128867i;

    /* renamed from: j */
    public final int f128868j;

    /* renamed from: k */
    public final int f128869k;

    /* renamed from: l */
    public final int f128870l;

    /* renamed from: m */
    public final int f128871m;

    static {
        Covode.recordClassIndex(66341);
    }

    public C56520b() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8191);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56520b)) {
            return false;
        }
        C56520b bVar = (C56520b) obj;
        return this.f128859a == bVar.f128859a && this.f128860b == bVar.f128860b && this.f128861c == bVar.f128861c && this.f128862d == bVar.f128862d && this.f128863e == bVar.f128863e && this.f128864f == bVar.f128864f && this.f128865g == bVar.f128865g && this.f128866h == bVar.f128866h && this.f128867i == bVar.f128867i && this.f128868j == bVar.f128868j && this.f128869k == bVar.f128869k && this.f128870l == bVar.f128870l && this.f128871m == bVar.f128871m;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.f128859a * 31) + this.f128860b) * 31) + this.f128861c) * 31) + this.f128862d) * 31) + this.f128863e) * 31) + this.f128864f) * 31) + this.f128865g) * 31) + this.f128866h) * 31) + this.f128867i) * 31) + this.f128868j) * 31) + this.f128869k) * 31) + this.f128870l) * 31) + this.f128871m;
    }

    public final String toString() {
        return "UIStyleConfig(height=" + this.f128859a + ", avatarSingleSize=" + this.f128860b + ", avatarDoubleLeftSize=" + this.f128861c + ", avatarDoubleRightSize=" + this.f128862d + ", titleTuxFont=" + this.f128863e + ", titleForceTextSize=" + this.f128864f + ", contentTuxFont=" + this.f128865g + ", contentForceTextSize=" + this.f128866h + ", contentColor=" + this.f128867i + ", titleContentGap=" + this.f128868j + ", timeTuxFont=" + this.f128869k + ", timeForceTextSize=" + this.f128870l + ", contentEndGap=" + this.f128871m + ")";
    }

    private C56520b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        this.f128859a = i;
        this.f128860b = i2;
        this.f128861c = i3;
        this.f128862d = i4;
        this.f128863e = i5;
        this.f128864f = i6;
        this.f128865g = i7;
        this.f128866h = i8;
        this.f128867i = i9;
        this.f128868j = i10;
        this.f128869k = i11;
        this.f128870l = i12;
        this.f128871m = i13;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C56520b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        this((i14 & 1) != 0 ? -1 : i, (i14 & 2) != 0 ? -1 : i2, (i14 & 4) != 0 ? -1 : i3, (i14 & 8) != 0 ? -1 : i4, (i14 & 16) != 0 ? -1 : i5, (i14 & 32) != 0 ? -1 : i6, (i14 & 64) != 0 ? -1 : i7, (i14 & 128) != 0 ? -1 : i8, (i14 & 256) != 0 ? -1 : i9, (i14 & 512) != 0 ? -1 : i10, (i14 & 1024) != 0 ? -1 : i11, (i14 & 2048) != 0 ? -1 : i12, (i14 & 4096) == 0 ? i13 : -1);
    }
}
