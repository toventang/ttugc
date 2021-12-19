package com.p2082ss.android.ugc.aweme.ecommercebase.view;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.ecommercebase.view.a */
public final class C45676a {

    /* renamed from: a */
    public int f106325a;

    /* renamed from: b */
    public int f106326b;

    /* renamed from: c */
    public int f106327c;

    /* renamed from: d */
    public int f106328d;

    /* renamed from: e */
    public int f106329e;

    /* renamed from: f */
    public int f106330f;

    /* renamed from: g */
    public int f106331g;

    /* renamed from: h */
    public int f106332h;

    /* renamed from: i */
    public int f106333i;

    /* renamed from: j */
    public int f106334j;

    /* renamed from: k */
    public int f106335k;

    /* renamed from: l */
    public int f106336l;

    static {
        Covode.recordClassIndex(54187);
    }

    public C45676a() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 4095);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45676a)) {
            return false;
        }
        C45676a aVar = (C45676a) obj;
        return this.f106325a == aVar.f106325a && this.f106326b == aVar.f106326b && this.f106327c == aVar.f106327c && this.f106328d == aVar.f106328d && this.f106329e == aVar.f106329e && this.f106330f == aVar.f106330f && this.f106331g == aVar.f106331g && this.f106332h == aVar.f106332h && this.f106333i == aVar.f106333i && this.f106334j == aVar.f106334j && this.f106335k == aVar.f106335k && this.f106336l == aVar.f106336l;
    }

    public final int hashCode() {
        return (((((((((((((((((((((this.f106325a * 31) + this.f106326b) * 31) + this.f106327c) * 31) + this.f106328d) * 31) + this.f106329e) * 31) + this.f106330f) * 31) + this.f106331g) * 31) + this.f106332h) * 31) + this.f106333i) * 31) + this.f106334j) * 31) + this.f106335k) * 31) + this.f106336l;
    }

    public final String toString() {
        return "TagLayoutParams(bgStyle=" + this.f106325a + ", width=" + this.f106326b + ", height=" + this.f106327c + ", marginStart=" + this.f106328d + ", marginTop=" + this.f106329e + ", marginEnd=" + this.f106330f + ", marginBottom=" + this.f106331g + ", paddingStart=" + this.f106332h + ", paddingTop=" + this.f106333i + ", paddingEnd=" + this.f106334j + ", paddingBottom=" + this.f106335k + ", gravity=" + this.f106336l + ")";
    }

    private C45676a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f106325a = i;
        this.f106326b = i2;
        this.f106327c = i3;
        this.f106328d = 0;
        this.f106329e = 0;
        this.f106330f = i4;
        this.f106331g = 0;
        this.f106332h = i5;
        this.f106333i = i6;
        this.f106334j = i7;
        this.f106335k = 0;
        this.f106336l = i8;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C45676a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this((i9 & 1) != 0 ? -1 : i, (i9 & 2) != 0 ? -2 : i2, (i9 & 4) == 0 ? i3 : -2, (i9 & 32) != 0 ? 0 : i4, (i9 & 128) != 0 ? 0 : i5, (i9 & 256) != 0 ? 0 : i6, (i9 & 512) == 0 ? i7 : 0, (i9 & 2048) != 0 ? 17 : i8);
    }
}
