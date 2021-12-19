package com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2871a.p2872a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.framework.a.a.a */
public final class C45804a {
    @AbstractC27891c(mo46611a = "url_list")

    /* renamed from: a */
    public final String f106711a;
    @AbstractC27891c(mo46611a = "width")

    /* renamed from: b */
    public final int f106712b;
    @AbstractC27891c(mo46611a = "height")

    /* renamed from: c */
    public final int f106713c;
    @AbstractC27891c(mo46611a = "url")

    /* renamed from: d */
    public final String f106714d;
    @AbstractC27891c(mo46611a = "key")

    /* renamed from: e */
    public final String f106715e;

    static {
        Covode.recordClassIndex(54323);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45804a)) {
            return false;
        }
        C45804a aVar = (C45804a) obj;
        return C89219l.m154714a(this.f106711a, aVar.f106711a) && this.f106712b == aVar.f106712b && this.f106713c == aVar.f106713c && C89219l.m154714a(this.f106714d, aVar.f106714d) && C89219l.m154714a(this.f106715e, aVar.f106715e);
    }

    public final int hashCode() {
        String str = this.f106711a;
        int i = 0;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + this.f106712b) * 31) + this.f106713c) * 31;
        String str2 = this.f106714d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f106715e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "ECImage(key=" + this.f106711a + ", width=" + this.f106712b + ", height=" + this.f106713c + ", url=" + this.f106714d + ", urlKey=" + this.f106715e + ")";
    }
}
