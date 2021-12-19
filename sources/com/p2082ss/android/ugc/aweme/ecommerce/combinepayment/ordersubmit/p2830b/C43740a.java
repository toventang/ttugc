package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.a */
public final class C43740a {

    /* renamed from: a */
    public final String f101955a;

    /* renamed from: b */
    public final String f101956b;

    /* renamed from: c */
    public final String f101957c;

    /* renamed from: d */
    public final String f101958d;

    /* renamed from: e */
    public final String f101959e;

    /* renamed from: f */
    public final boolean f101960f;

    /* renamed from: g */
    public final String f101961g;

    /* renamed from: h */
    public final String f101962h;

    /* renamed from: i */
    public final Boolean f101963i;

    /* renamed from: j */
    public final Boolean f101964j;

    static {
        Covode.recordClassIndex(52005);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43740a)) {
            return false;
        }
        C43740a aVar = (C43740a) obj;
        return C89219l.m154714a(this.f101955a, aVar.f101955a) && C89219l.m154714a(this.f101956b, aVar.f101956b) && C89219l.m154714a(this.f101957c, aVar.f101957c) && C89219l.m154714a(this.f101958d, aVar.f101958d) && C89219l.m154714a(this.f101959e, aVar.f101959e) && this.f101960f == aVar.f101960f && C89219l.m154714a(this.f101961g, aVar.f101961g) && C89219l.m154714a(this.f101962h, aVar.f101962h) && C89219l.m154714a(this.f101963i, aVar.f101963i) && C89219l.m154714a(this.f101964j, aVar.f101964j);
    }

    public final int hashCode() {
        String str = this.f101955a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f101956b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f101957c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f101958d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f101959e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z = this.f101960f;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode5 + i2) * 31;
        String str6 = this.f101961g;
        int hashCode6 = (i5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f101962h;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Boolean bool = this.f101963i;
        int hashCode8 = (hashCode7 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f101964j;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        return "AddressVO(name=" + this.f101955a + ", phone=" + this.f101956b + ", region=" + this.f101957c + ", addressDetail=" + this.f101958d + ", zipcode=" + this.f101959e + ", hasAddress=" + this.f101960f + ", email=" + this.f101961g + ", invalidHintMessage=" + this.f101962h + ", addressReachable=" + this.f101963i + ", addressValid=" + this.f101964j + ")";
    }

    public C43740a(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, Boolean bool, Boolean bool2) {
        this.f101955a = str;
        this.f101956b = str2;
        this.f101957c = str3;
        this.f101958d = str4;
        this.f101959e = str5;
        this.f101960f = z;
        this.f101961g = str6;
        this.f101962h = str7;
        this.f101963i = bool;
        this.f101964j = bool2;
    }
}
