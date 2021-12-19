package com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2871a.p2872a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.api.p2867a.C45687a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.framework.a.a.b */
public final class C45805b {
    @AbstractC27891c(mo46611a = "product")

    /* renamed from: a */
    public final C45687a f106716a = null;
    @AbstractC27891c(mo46611a = "server_time")

    /* renamed from: b */
    public final long f106717b = 0;
    @AbstractC27891c(mo46611a = "schema")

    /* renamed from: c */
    public final String f106718c = null;

    static {
        Covode.recordClassIndex(54324);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45805b)) {
            return false;
        }
        C45805b bVar = (C45805b) obj;
        return C89219l.m154714a(this.f106716a, bVar.f106716a) && this.f106717b == bVar.f106717b && C89219l.m154714a(this.f106718c, bVar.f106718c);
    }

    public final String toString() {
        return "PopProductResp(product=" + this.f106716a + ", serverTime=" + this.f106717b + ", schema=" + this.f106718c + ")";
    }

    private C45805b() {
    }

    public final int hashCode() {
        int i;
        C45687a aVar = this.f106716a;
        int i2 = 0;
        if (aVar != null) {
            i = aVar.hashCode();
        } else {
            i = 0;
        }
        long j = this.f106717b;
        int i3 = ((i * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.f106718c;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i3 + i2;
    }
}
