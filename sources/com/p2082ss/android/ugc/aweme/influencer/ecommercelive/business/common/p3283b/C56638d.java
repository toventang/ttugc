package com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.common.p3283b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.b.d */
public final class C56638d {

    /* renamed from: a */
    public final String f129090a;

    /* renamed from: b */
    public final String f129091b;

    /* renamed from: c */
    public final String f129092c;

    static {
        Covode.recordClassIndex(66483);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56638d)) {
            return false;
        }
        C56638d dVar = (C56638d) obj;
        return C89219l.m154714a(this.f129090a, dVar.f129090a) && C89219l.m154714a(this.f129091b, dVar.f129091b) && C89219l.m154714a(this.f129092c, dVar.f129092c);
    }

    public final int hashCode() {
        String str = this.f129090a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f129091b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f129092c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "ECWidgetFirstShowData(serviceName=" + this.f129090a + ", authorId=" + this.f129091b + ", roomId=" + this.f129092c + ")";
    }

    public C56638d(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        this.f129090a = str;
        this.f129091b = str2;
        this.f129092c = str3;
    }
}
