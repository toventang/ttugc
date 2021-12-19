package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.PickTag;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.PromotionLogo;
import com.p2082ss.android.ugc.aweme.ecommercebase.dto.PromotionView;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.h */
public final class C43747h {

    /* renamed from: a */
    public final String f101990a;

    /* renamed from: b */
    public final int f101991b;

    /* renamed from: c */
    public final Image f101992c;

    /* renamed from: d */
    public final String f101993d;

    /* renamed from: e */
    public final String f101994e;

    /* renamed from: f */
    public final String f101995f;

    /* renamed from: g */
    public final Integer f101996g;

    /* renamed from: h */
    public final String f101997h;

    /* renamed from: i */
    public final PickTag f101998i;

    /* renamed from: j */
    public final List<PromotionLogo> f101999j;

    /* renamed from: k */
    public final PromotionView f102000k;

    static {
        Covode.recordClassIndex(52012);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43747h)) {
            return false;
        }
        C43747h hVar = (C43747h) obj;
        return C89219l.m154714a(this.f101990a, hVar.f101990a) && this.f101991b == hVar.f101991b && C89219l.m154714a(this.f101992c, hVar.f101992c) && C89219l.m154714a(this.f101993d, hVar.f101993d) && C89219l.m154714a(this.f101994e, hVar.f101994e) && C89219l.m154714a(this.f101995f, hVar.f101995f) && C89219l.m154714a(this.f101996g, hVar.f101996g) && C89219l.m154714a(this.f101997h, hVar.f101997h) && C89219l.m154714a(this.f101998i, hVar.f101998i) && C89219l.m154714a(this.f101999j, hVar.f101999j) && C89219l.m154714a(this.f102000k, hVar.f102000k);
    }

    public final int hashCode() {
        String str = this.f101990a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f101991b) * 31;
        Image image = this.f101992c;
        int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 31;
        String str2 = this.f101993d;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f101994e;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f101995f;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num = this.f101996g;
        int hashCode6 = (hashCode5 + (num != null ? num.hashCode() : 0)) * 31;
        String str5 = this.f101997h;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        PickTag pickTag = this.f101998i;
        int hashCode8 = (hashCode7 + (pickTag != null ? pickTag.hashCode() : 0)) * 31;
        List<PromotionLogo> list = this.f101999j;
        int hashCode9 = (hashCode8 + (list != null ? list.hashCode() : 0)) * 31;
        PromotionView promotionView = this.f102000k;
        if (promotionView != null) {
            i = promotionView.hashCode();
        }
        return hashCode9 + i;
    }

    public final String toString() {
        return "SkuInfoVO(skuId=" + this.f101990a + ", quantity=" + this.f101991b + ", productImg=" + this.f101992c + ", productTitle=" + this.f101993d + ", productSpec=" + this.f101994e + ", price=" + this.f101995f + ", maxQuantity=" + this.f101996g + ", lowStockWarning=" + this.f101997h + ", activityInfo=" + this.f101998i + ", promotionLogos=" + this.f101999j + ", promotionView=" + this.f102000k + ")";
    }

    public C43747h(String str, int i, Image image, String str2, String str3, String str4, Integer num, String str5, PickTag pickTag, List<PromotionLogo> list, PromotionView promotionView) {
        this.f101990a = str;
        this.f101991b = i;
        this.f101992c = image;
        this.f101993d = str2;
        this.f101994e = str3;
        this.f101995f = str4;
        this.f101996g = num;
        this.f101997h = str5;
        this.f101998i = pickTag;
        this.f101999j = list;
        this.f102000k = promotionView;
    }
}
