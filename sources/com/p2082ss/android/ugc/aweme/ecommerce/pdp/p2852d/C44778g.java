package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.FlashSale;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.HalfWaistBanner;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.PickTag;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductDetailReview;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.PromotionLogo;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.WaistBanner;
import com.p2082ss.android.ugc.aweme.ecommercebase.dto.PromotionView;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.d.g */
public final class C44778g {

    /* renamed from: a */
    public final String f104468a;

    /* renamed from: b */
    public final String f104469b;

    /* renamed from: c */
    public final String f104470c;

    /* renamed from: d */
    public final String f104471d;

    /* renamed from: e */
    public final String f104472e;

    /* renamed from: f */
    public final boolean f104473f;

    /* renamed from: g */
    public final WaistBanner f104474g;

    /* renamed from: h */
    public final VoucherInfo f104475h;

    /* renamed from: i */
    public final ProductDetailReview f104476i;

    /* renamed from: j */
    public final boolean f104477j;

    /* renamed from: k */
    public final FlashSale f104478k;

    /* renamed from: l */
    public final PickTag f104479l;

    /* renamed from: m */
    public final boolean f104480m;

    /* renamed from: n */
    public final List<PromotionLogo> f104481n;

    /* renamed from: o */
    public final PromotionView f104482o;

    /* renamed from: p */
    public final HalfWaistBanner f104483p;

    static {
        Covode.recordClassIndex(53164);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44778g)) {
            return false;
        }
        C44778g gVar = (C44778g) obj;
        return C89219l.m154714a(this.f104468a, gVar.f104468a) && C89219l.m154714a(this.f104469b, gVar.f104469b) && C89219l.m154714a(this.f104470c, gVar.f104470c) && C89219l.m154714a(this.f104471d, gVar.f104471d) && C89219l.m154714a(this.f104472e, gVar.f104472e) && this.f104473f == gVar.f104473f && C89219l.m154714a(this.f104474g, gVar.f104474g) && C89219l.m154714a(this.f104475h, gVar.f104475h) && C89219l.m154714a(this.f104476i, gVar.f104476i) && this.f104477j == gVar.f104477j && C89219l.m154714a(this.f104478k, gVar.f104478k) && C89219l.m154714a(this.f104479l, gVar.f104479l) && this.f104480m == gVar.f104480m && C89219l.m154714a(this.f104481n, gVar.f104481n) && C89219l.m154714a(this.f104482o, gVar.f104482o) && C89219l.m154714a(this.f104483p, gVar.f104483p);
    }

    public final int hashCode() {
        String str = this.f104468a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f104469b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f104470c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f104471d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f104472e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z = this.f104473f;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode5 + i3) * 31;
        WaistBanner waistBanner = this.f104474g;
        int hashCode6 = (i6 + (waistBanner != null ? waistBanner.hashCode() : 0)) * 31;
        VoucherInfo voucherInfo = this.f104475h;
        int hashCode7 = (hashCode6 + (voucherInfo != null ? voucherInfo.hashCode() : 0)) * 31;
        ProductDetailReview productDetailReview = this.f104476i;
        int hashCode8 = (hashCode7 + (productDetailReview != null ? productDetailReview.hashCode() : 0)) * 31;
        boolean z2 = this.f104477j;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (hashCode8 + i7) * 31;
        FlashSale flashSale = this.f104478k;
        int hashCode9 = (i10 + (flashSale != null ? flashSale.hashCode() : 0)) * 31;
        PickTag pickTag = this.f104479l;
        int hashCode10 = (hashCode9 + (pickTag != null ? pickTag.hashCode() : 0)) * 31;
        if (!this.f104480m) {
            i2 = 0;
        }
        int i11 = (hashCode10 + i2) * 31;
        List<PromotionLogo> list = this.f104481n;
        int hashCode11 = (i11 + (list != null ? list.hashCode() : 0)) * 31;
        PromotionView promotionView = this.f104482o;
        int hashCode12 = (hashCode11 + (promotionView != null ? promotionView.hashCode() : 0)) * 31;
        HalfWaistBanner halfWaistBanner = this.f104483p;
        if (halfWaistBanner != null) {
            i = halfWaistBanner.hashCode();
        }
        return hashCode12 + i;
    }

    public final String toString() {
        return "ProductInfoVO(title=" + this.f104468a + ", realPrice=" + this.f104469b + ", originPrice=" + this.f104470c + ", sales=" + this.f104471d + ", discount=" + this.f104472e + ", needIcon=" + this.f104473f + ", waistBanner=" + this.f104474g + ", voucherInfo=" + this.f104475h + ", review=" + this.f104476i + ", freeShipping=" + this.f104477j + ", flashSale=" + this.f104478k + ", activityInfo=" + this.f104479l + ", isIntervalPrice=" + this.f104480m + ", promotionLogos=" + this.f104481n + ", promotionView=" + this.f104482o + ", halfWaistBanner=" + this.f104483p + ")";
    }

    public C44778g(String str, String str2, String str3, String str4, String str5, boolean z, WaistBanner waistBanner, VoucherInfo voucherInfo, ProductDetailReview productDetailReview, boolean z2, FlashSale flashSale, PickTag pickTag, boolean z3, List<PromotionLogo> list, PromotionView promotionView, HalfWaistBanner halfWaistBanner) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str5, "");
        this.f104468a = str;
        this.f104469b = str2;
        this.f104470c = str3;
        this.f104471d = str4;
        this.f104472e = str5;
        this.f104473f = z;
        this.f104474g = waistBanner;
        this.f104475h = voucherInfo;
        this.f104476i = productDetailReview;
        this.f104477j = z2;
        this.f104478k = flashSale;
        this.f104479l = pickTag;
        this.f104480m = z3;
        this.f104481n = list;
        this.f104482o = promotionView;
        this.f104483p = halfWaistBanner;
    }
}
