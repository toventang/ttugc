package com.p2082ss.android.ugc.aweme.multi;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.multi.j */
public final class C60210j {
    @AbstractC27891c(mo46611a = "original_price")

    /* renamed from: a */
    public final String f137244a = null;
    @AbstractC27891c(mo46611a = "real_price")

    /* renamed from: b */
    public final String f137245b = null;

    static {
        Covode.recordClassIndex(70739);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60210j)) {
            return false;
        }
        C60210j jVar = (C60210j) obj;
        return C89219l.m154714a(this.f137244a, jVar.f137244a) && C89219l.m154714a(this.f137245b, jVar.f137245b);
    }

    public final int hashCode() {
        String str = this.f137244a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f137245b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ProductPrice(originalPrice=" + this.f137244a + ", realPrice=" + this.f137245b + ")";
    }

    private C60210j() {
    }
}
