package com.p2082ss.android.ugc.aweme.ecommerce.service.p2858vo;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.service.vo.a */
public final class C45381a {

    /* renamed from: a */
    public final String f105745a;

    /* renamed from: b */
    public final String f105746b;

    static {
        Covode.recordClassIndex(53850);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45381a)) {
            return false;
        }
        C45381a aVar = (C45381a) obj;
        return C89219l.m154714a(this.f105745a, aVar.f105745a) && C89219l.m154714a(this.f105746b, aVar.f105746b);
    }

    public final int hashCode() {
        String str = this.f105745a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f105746b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "CommonResource(couponPopupBg2xUrl=" + this.f105745a + ", couponPopupBg3xUrl=" + this.f105746b + ")";
    }

    public C45381a(String str, String str2) {
        this.f105745a = str;
        this.f105746b = str2;
    }
}
