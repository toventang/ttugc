package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.p1478a.C20714a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.i */
public final class C43748i {

    /* renamed from: a */
    public final String f102001a;

    /* renamed from: b */
    public final String f102002b;

    /* renamed from: c */
    public final Integer f102003c;

    /* renamed from: d */
    public final String f102004d;

    /* renamed from: e */
    public final C20714a f102005e;

    /* renamed from: f */
    public final Integer f102006f;

    /* renamed from: g */
    public final Integer f102007g;

    static {
        Covode.recordClassIndex(52013);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43748i)) {
            return false;
        }
        C43748i iVar = (C43748i) obj;
        return C89219l.m154714a(this.f102001a, iVar.f102001a) && C89219l.m154714a(this.f102002b, iVar.f102002b) && C89219l.m154714a(this.f102003c, iVar.f102003c) && C89219l.m154714a(this.f102004d, iVar.f102004d) && C89219l.m154714a(this.f102005e, iVar.f102005e) && C89219l.m154714a(this.f102006f, iVar.f102006f) && C89219l.m154714a(this.f102007g, iVar.f102007g);
    }

    public final int hashCode() {
        String str = this.f102001a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f102002b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f102003c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        String str3 = this.f102004d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        C20714a aVar = this.f102005e;
        int hashCode5 = (hashCode4 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        Integer num2 = this.f102006f;
        int hashCode6 = (hashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f102007g;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        return "SummaryBillItem(itemName=" + this.f102001a + ", itemFee=" + this.f102002b + ", itemFeeColor=" + this.f102003c + ", link=" + this.f102004d + ", logo=" + this.f102005e + ", itemTextColor=" + this.f102006f + ", itemType=" + this.f102007g + ")";
    }

    public C43748i(String str, String str2, Integer num, String str3, C20714a aVar, Integer num2, Integer num3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f102001a = str;
        this.f102002b = str2;
        this.f102003c = num;
        this.f102004d = str3;
        this.f102005e = aVar;
        this.f102006f = num2;
        this.f102007g = num3;
    }
}
