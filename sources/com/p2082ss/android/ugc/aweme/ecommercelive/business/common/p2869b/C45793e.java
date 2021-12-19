package com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2869b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.common.b.e */
public final class C45793e {

    /* renamed from: a */
    public final String f106691a;

    /* renamed from: b */
    public final String f106692b;

    /* renamed from: c */
    public final String f106693c;

    static {
        Covode.recordClassIndex(54311);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45793e)) {
            return false;
        }
        C45793e eVar = (C45793e) obj;
        return C89219l.m154714a(this.f106691a, eVar.f106691a) && C89219l.m154714a(this.f106692b, eVar.f106692b) && C89219l.m154714a(this.f106693c, eVar.f106693c);
    }

    public final int hashCode() {
        String str = this.f106691a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f106692b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f106693c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "ECWidgetFirstShowData(serviceName=" + this.f106691a + ", authorId=" + this.f106692b + ", roomId=" + this.f106693c + ")";
    }

    public C45793e(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        this.f106691a = str;
        this.f106692b = str2;
        this.f106693c = str3;
    }
}
