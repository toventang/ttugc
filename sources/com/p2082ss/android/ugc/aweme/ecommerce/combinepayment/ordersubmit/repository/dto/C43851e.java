package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuPrice;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.e */
public final class C43851e {
    @AbstractC27891c(mo46611a = "product_id")

    /* renamed from: a */
    public final String f102181a;
    @AbstractC27891c(mo46611a = "sku_id")

    /* renamed from: b */
    public final String f102182b;
    @AbstractC27891c(mo46611a = "quantity")

    /* renamed from: c */
    public final int f102183c;
    @AbstractC27891c(mo46611a = "sku_price")

    /* renamed from: d */
    public final SkuPrice f102184d;
    @AbstractC27891c(mo46611a = "chain_key")

    /* renamed from: e */
    public final String f102185e;
    @AbstractC27891c(mo46611a = "entrance_info")

    /* renamed from: f */
    public final String f102186f;
    @AbstractC27891c(mo46611a = "cart_item_id")

    /* renamed from: g */
    public final String f102187g;
    @AbstractC27891c(mo46611a = "source")

    /* renamed from: h */
    public final Integer f102188h;
    @AbstractC27891c(mo46611a = "source_info")

    /* renamed from: i */
    public final String f102189i;
    @AbstractC27891c(mo46611a = "kol_id")

    /* renamed from: j */
    public String f102190j;

    static {
        Covode.recordClassIndex(52131);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43851e)) {
            return false;
        }
        C43851e eVar = (C43851e) obj;
        return C89219l.m154714a(this.f102181a, eVar.f102181a) && C89219l.m154714a(this.f102182b, eVar.f102182b) && this.f102183c == eVar.f102183c && C89219l.m154714a(this.f102184d, eVar.f102184d) && C89219l.m154714a(this.f102185e, eVar.f102185e) && C89219l.m154714a(this.f102186f, eVar.f102186f) && C89219l.m154714a(this.f102187g, eVar.f102187g) && C89219l.m154714a(this.f102188h, eVar.f102188h) && C89219l.m154714a(this.f102189i, eVar.f102189i) && C89219l.m154714a(this.f102190j, eVar.f102190j);
    }

    public final int hashCode() {
        String str = this.f102181a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f102182b;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f102183c) * 31;
        SkuPrice skuPrice = this.f102184d;
        int hashCode3 = (hashCode2 + (skuPrice != null ? skuPrice.hashCode() : 0)) * 31;
        String str3 = this.f102185e;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f102186f;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f102187g;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Integer num = this.f102188h;
        int hashCode7 = (hashCode6 + (num != null ? num.hashCode() : 0)) * 31;
        String str6 = this.f102189i;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f102190j;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        return "CreateOrderSku(productId=" + this.f102181a + ", skuId=" + this.f102182b + ", quantity=" + this.f102183c + ", skuPrice=" + this.f102184d + ", chainKey=" + this.f102185e + ", entranceInfo=" + this.f102186f + ", cartItemId=" + this.f102187g + ", source=" + this.f102188h + ", sourceInfo=" + this.f102189i + ", kolId=" + this.f102190j + ")";
    }

    public C43851e(String str, String str2, int i, SkuPrice skuPrice, String str3, String str4, String str5, Integer num, String str6, String str7) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(skuPrice, "");
        this.f102181a = str;
        this.f102182b = str2;
        this.f102183c = i;
        this.f102184d = skuPrice;
        this.f102185e = str3;
        this.f102186f = str4;
        this.f102187g = str5;
        this.f102188h = num;
        this.f102189i = str6;
        this.f102190j = str7;
    }
}
