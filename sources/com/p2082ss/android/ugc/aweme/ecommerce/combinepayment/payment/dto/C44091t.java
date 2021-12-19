package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.t */
public final class C44091t {
    @AbstractC27891c(mo46611a = "photos")

    /* renamed from: a */
    public final List<String> f102834a;
    @AbstractC27891c(mo46611a = "dark_photos")

    /* renamed from: b */
    public final List<String> f102835b;

    static {
        Covode.recordClassIndex(52402);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44091t)) {
            return false;
        }
        C44091t tVar = (C44091t) obj;
        return C89219l.m154714a(this.f102834a, tVar.f102834a) && C89219l.m154714a(this.f102835b, tVar.f102835b);
    }

    public final int hashCode() {
        List<String> list = this.f102834a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.f102835b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Photos(lightPhotos=" + this.f102834a + ", darkPhotos=" + this.f102835b + ")";
    }
}
