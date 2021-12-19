package com.p2082ss.android.ugc.aweme.ecommerce.cart.repository.p2828a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.cart.repository.a.a */
public final class C43640a {
    @AbstractC27891c(mo46611a = "cart_item_id")

    /* renamed from: a */
    public final String f101718a;
    @AbstractC27891c(mo46611a = "exception_ux")

    /* renamed from: b */
    public final ExceptionUX f101719b;
    @AbstractC27891c(mo46611a = "cart_entry")

    /* renamed from: c */
    public final CartEntry f101720c;
    @AbstractC27891c(mo46611a = "pre_sku_count")

    /* renamed from: d */
    public final Integer f101721d;
    @AbstractC27891c(mo46611a = "post_sku_count")

    /* renamed from: e */
    public final Integer f101722e;

    static {
        Covode.recordClassIndex(51898);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43640a)) {
            return false;
        }
        C43640a aVar = (C43640a) obj;
        return C89219l.m154714a(this.f101718a, aVar.f101718a) && C89219l.m154714a(this.f101719b, aVar.f101719b) && C89219l.m154714a(this.f101720c, aVar.f101720c) && C89219l.m154714a(this.f101721d, aVar.f101721d) && C89219l.m154714a(this.f101722e, aVar.f101722e);
    }

    public final int hashCode() {
        String str = this.f101718a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ExceptionUX exceptionUX = this.f101719b;
        int hashCode2 = (hashCode + (exceptionUX != null ? exceptionUX.hashCode() : 0)) * 31;
        CartEntry cartEntry = this.f101720c;
        int hashCode3 = (hashCode2 + (cartEntry != null ? cartEntry.hashCode() : 0)) * 31;
        Integer num = this.f101721d;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f101722e;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "AddItemToCartData(cartItemId=" + this.f101718a + ", exceptionUX=" + this.f101719b + ", cartEntry=" + this.f101720c + ", preSkuCount=" + this.f101721d + ", postSkuCount=" + this.f101722e + ")";
    }
}
