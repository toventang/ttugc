package com.p2082ss.android.ugc.aweme.ecommerce.cart.repository.p2828a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.cart.repository.a.b */
public final class C43641b {
    @AbstractC27891c(mo46611a = "seller_id")

    /* renamed from: a */
    public final String f101723a;
    @AbstractC27891c(mo46611a = "warehouse_id")

    /* renamed from: b */
    public final String f101724b;
    @AbstractC27891c(mo46611a = "product_id")

    /* renamed from: c */
    public final String f101725c;
    @AbstractC27891c(mo46611a = "sku_id")

    /* renamed from: d */
    public final String f101726d;
    @AbstractC27891c(mo46611a = "add_count")

    /* renamed from: e */
    public final Integer f101727e;
    @AbstractC27891c(mo46611a = "chain_key")

    /* renamed from: f */
    public final String f101728f;
    @AbstractC27891c(mo46611a = "entrance_info")

    /* renamed from: g */
    public final String f101729g;
    @AbstractC27891c(mo46611a = "source")

    /* renamed from: h */
    public final Integer f101730h;
    @AbstractC27891c(mo46611a = "kol_id")

    /* renamed from: i */
    public final String f101731i;

    static {
        Covode.recordClassIndex(51899);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43641b)) {
            return false;
        }
        C43641b bVar = (C43641b) obj;
        return C89219l.m154714a(this.f101723a, bVar.f101723a) && C89219l.m154714a(this.f101724b, bVar.f101724b) && C89219l.m154714a(this.f101725c, bVar.f101725c) && C89219l.m154714a(this.f101726d, bVar.f101726d) && C89219l.m154714a(this.f101727e, bVar.f101727e) && C89219l.m154714a(this.f101728f, bVar.f101728f) && C89219l.m154714a(this.f101729g, bVar.f101729g) && C89219l.m154714a(this.f101730h, bVar.f101730h) && C89219l.m154714a(this.f101731i, bVar.f101731i);
    }

    public final int hashCode() {
        String str = this.f101723a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f101724b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f101725c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f101726d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num = this.f101727e;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        String str5 = this.f101728f;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f101729g;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Integer num2 = this.f101730h;
        int hashCode8 = (hashCode7 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str7 = this.f101731i;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        return "AddItemToCartRequest(sellerId=" + this.f101723a + ", warehouseId=" + this.f101724b + ", productId=" + this.f101725c + ", skuId=" + this.f101726d + ", addCount=" + this.f101727e + ", chainKey=" + this.f101728f + ", entranceInfo=" + this.f101729g + ", source=" + this.f101730h + ", kolId=" + this.f101731i + ")";
    }

    public C43641b(String str, String str2, String str3, String str4, Integer num, String str5, String str6, Integer num2, String str7) {
        this.f101723a = str;
        this.f101724b = str2;
        this.f101725c = str3;
        this.f101726d = str4;
        this.f101727e = num;
        this.f101728f = str5;
        this.f101729g = str6;
        this.f101730h = num2;
        this.f101731i = str7;
    }
}
