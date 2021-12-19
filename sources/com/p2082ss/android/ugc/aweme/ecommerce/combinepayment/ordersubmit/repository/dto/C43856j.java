package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.j */
public final class C43856j {
    @AbstractC27891c(mo46611a = "order_sku")

    /* renamed from: a */
    public final List<C43851e> f102199a;
    @AbstractC27891c(mo46611a = "seller_id")

    /* renamed from: b */
    public final String f102200b;
    @AbstractC27891c(mo46611a = "warehouse_id")

    /* renamed from: c */
    public final String f102201c;
    @AbstractC27891c(mo46611a = "delivery_option")

    /* renamed from: d */
    public final int f102202d;
    @AbstractC27891c(mo46611a = "logistics_service_id")

    /* renamed from: e */
    public final String f102203e;
    @AbstractC27891c(mo46611a = "user_note")

    /* renamed from: f */
    public final String f102204f;

    static {
        Covode.recordClassIndex(52136);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43856j)) {
            return false;
        }
        C43856j jVar = (C43856j) obj;
        return C89219l.m154714a(this.f102199a, jVar.f102199a) && C89219l.m154714a(this.f102200b, jVar.f102200b) && C89219l.m154714a(this.f102201c, jVar.f102201c) && this.f102202d == jVar.f102202d && C89219l.m154714a(this.f102203e, jVar.f102203e) && C89219l.m154714a(this.f102204f, jVar.f102204f);
    }

    public final int hashCode() {
        List<C43851e> list = this.f102199a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f102200b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f102201c;
        int hashCode3 = (((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f102202d) * 31;
        String str3 = this.f102203e;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f102204f;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "OrderShopRequestParam(createOrderSku=" + this.f102199a + ", sellerId=" + this.f102200b + ", warehouseId=" + this.f102201c + ", deliveryOption=" + this.f102202d + ", logisticsServiceId=" + this.f102203e + ", userNote=" + this.f102204f + ")";
    }

    public C43856j(List<C43851e> list, String str, String str2, int i, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f102199a = list;
        this.f102200b = str;
        this.f102201c = str2;
        this.f102202d = i;
        this.f102203e = str3;
        this.f102204f = str4;
    }
}
