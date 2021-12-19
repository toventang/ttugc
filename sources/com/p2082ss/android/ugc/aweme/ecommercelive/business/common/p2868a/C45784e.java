package com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2868a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommercebase.dto.GImage;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.common.a.e */
public final class C45784e {
    @AbstractC27891c(mo46611a = "image")

    /* renamed from: a */
    public final GImage f106679a;
    @AbstractC27891c(mo46611a = "promotion_id")

    /* renamed from: b */
    public final String f106680b;

    static {
        Covode.recordClassIndex(54302);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45784e)) {
            return false;
        }
        C45784e eVar = (C45784e) obj;
        return C89219l.m154714a(this.f106679a, eVar.f106679a) && C89219l.m154714a(this.f106680b, eVar.f106680b);
    }

    public final int hashCode() {
        GImage gImage = this.f106679a;
        int i = 0;
        int hashCode = (gImage != null ? gImage.hashCode() : 0) * 31;
        String str = this.f106680b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "PromotionSkin(image=" + this.f106679a + ", promotionId=" + this.f106680b + ")";
    }
}
