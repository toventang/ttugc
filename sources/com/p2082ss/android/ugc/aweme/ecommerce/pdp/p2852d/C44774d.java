package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Price;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.d.d */
public final class C44774d {

    /* renamed from: a */
    public final Price f104457a;

    /* renamed from: b */
    public final String f104458b;

    /* renamed from: c */
    public final boolean f104459c;

    /* renamed from: d */
    public final boolean f104460d;

    /* renamed from: e */
    public final String f104461e;

    /* renamed from: f */
    public final String f104462f;

    /* renamed from: g */
    public final String f104463g;

    /* renamed from: h */
    public final String f104464h;

    /* renamed from: i */
    public final String f104465i;

    /* renamed from: j */
    public final boolean f104466j;

    static {
        Covode.recordClassIndex(53160);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44774d)) {
            return false;
        }
        C44774d dVar = (C44774d) obj;
        return C89219l.m154714a(this.f104457a, dVar.f104457a) && C89219l.m154714a(this.f104458b, dVar.f104458b) && this.f104459c == dVar.f104459c && this.f104460d == dVar.f104460d && C89219l.m154714a(this.f104461e, dVar.f104461e) && C89219l.m154714a(this.f104462f, dVar.f104462f) && C89219l.m154714a(this.f104463g, dVar.f104463g) && C89219l.m154714a(this.f104464h, dVar.f104464h) && C89219l.m154714a(this.f104465i, dVar.f104465i) && this.f104466j == dVar.f104466j;
    }

    public final int hashCode() {
        Price price = this.f104457a;
        int i = 0;
        int hashCode = (price != null ? price.hashCode() : 0) * 31;
        String str = this.f104458b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.f104459c;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode2 + i3) * 31;
        boolean z2 = this.f104460d;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        String str2 = this.f104461e;
        int hashCode3 = (i10 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f104462f;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f104463g;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f104464h;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f104465i;
        if (str6 != null) {
            i = str6.hashCode();
        }
        int i11 = (hashCode6 + i) * 31;
        if (!this.f104466j) {
            i2 = 0;
        }
        return i11 + i2;
    }

    public final String toString() {
        return "ProductDeliveryInfo(price=" + this.f104457a + ", originPrice=" + this.f104458b + ", reachable=" + this.f104459c + ", shippingDiscount=" + this.f104460d + ", deliveryStatusText=" + this.f104461e + ", discountDescText=" + this.f104462f + ", leadTimeText=" + this.f104463g + ", thresholdText=" + this.f104464h + ", thresholdTextEn=" + this.f104465i + ", freeShipping=" + this.f104466j + ")";
    }

    public C44774d(Price price, String str, boolean z, boolean z2, String str2, String str3, String str4, String str5, String str6, boolean z3) {
        this.f104457a = price;
        this.f104458b = str;
        this.f104459c = z;
        this.f104460d = z2;
        this.f104461e = str2;
        this.f104462f = str3;
        this.f104463g = str4;
        this.f104464h = str5;
        this.f104465i = str6;
        this.f104466j = z3;
    }
}
