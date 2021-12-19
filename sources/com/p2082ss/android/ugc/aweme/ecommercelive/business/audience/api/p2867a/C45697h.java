package com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.api.p2867a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommercebase.dto.GImage;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.h */
public final class C45697h {
    @AbstractC27891c(mo46611a = "image")

    /* renamed from: a */
    public final GImage f106414a;
    @AbstractC27891c(mo46611a = "promotion_id")

    /* renamed from: b */
    public final String f106415b;

    static {
        Covode.recordClassIndex(54212);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45697h)) {
            return false;
        }
        C45697h hVar = (C45697h) obj;
        return C89219l.m154714a(this.f106414a, hVar.f106414a) && C89219l.m154714a(this.f106415b, hVar.f106415b);
    }

    public final int hashCode() {
        GImage gImage = this.f106414a;
        int i = 0;
        int hashCode = (gImage != null ? gImage.hashCode() : 0) * 31;
        String str = this.f106415b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "PromotionLogo(image=" + this.f106414a + ", promotionId=" + this.f106415b + ")";
    }
}
