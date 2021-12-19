package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.ShopBill;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto.Voucher;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.f */
public final class C43745f {

    /* renamed from: a */
    public final String f101978a;

    /* renamed from: b */
    public final String f101979b;

    /* renamed from: c */
    public final Image f101980c;

    /* renamed from: d */
    public final String f101981d;

    /* renamed from: e */
    public final List<C43747h> f101982e;

    /* renamed from: f */
    public final List<LogisticDTO> f101983f;

    /* renamed from: g */
    public final LogisticDTO f101984g;

    /* renamed from: h */
    public final boolean f101985h;

    /* renamed from: i */
    public final String f101986i;

    /* renamed from: j */
    public final boolean f101987j;

    /* renamed from: k */
    public final List<Voucher> f101988k;

    /* renamed from: l */
    public final ShopBill f101989l;

    static {
        Covode.recordClassIndex(52010);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43745f)) {
            return false;
        }
        C43745f fVar = (C43745f) obj;
        return C89219l.m154714a(this.f101978a, fVar.f101978a) && C89219l.m154714a(this.f101979b, fVar.f101979b) && C89219l.m154714a(this.f101980c, fVar.f101980c) && C89219l.m154714a(this.f101981d, fVar.f101981d) && C89219l.m154714a(this.f101982e, fVar.f101982e) && C89219l.m154714a(this.f101983f, fVar.f101983f) && C89219l.m154714a(this.f101984g, fVar.f101984g) && this.f101985h == fVar.f101985h && C89219l.m154714a(this.f101986i, fVar.f101986i) && this.f101987j == fVar.f101987j && C89219l.m154714a(this.f101988k, fVar.f101988k) && C89219l.m154714a(this.f101989l, fVar.f101989l);
    }

    public final int hashCode() {
        String str = this.f101978a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f101979b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Image image = this.f101980c;
        int hashCode3 = (hashCode2 + (image != null ? image.hashCode() : 0)) * 31;
        String str3 = this.f101981d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<C43747h> list = this.f101982e;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        List<LogisticDTO> list2 = this.f101983f;
        int hashCode6 = (hashCode5 + (list2 != null ? list2.hashCode() : 0)) * 31;
        LogisticDTO logisticDTO = this.f101984g;
        int hashCode7 = (hashCode6 + (logisticDTO != null ? logisticDTO.hashCode() : 0)) * 31;
        boolean z = this.f101985h;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode7 + i3) * 31;
        String str4 = this.f101986i;
        int hashCode8 = (i6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        if (!this.f101987j) {
            i2 = 0;
        }
        int i7 = (hashCode8 + i2) * 31;
        List<Voucher> list3 = this.f101988k;
        int hashCode9 = (i7 + (list3 != null ? list3.hashCode() : 0)) * 31;
        ShopBill shopBill = this.f101989l;
        if (shopBill != null) {
            i = shopBill.hashCode();
        }
        return hashCode9 + i;
    }

    public final String toString() {
        return "ProductInfoVO(sellerId=" + this.f101978a + ", warehouseId=" + this.f101979b + ", shopAvatar=" + this.f101980c + ", shopName=" + this.f101981d + ", skuInfos=" + this.f101982e + ", logistics=" + this.f101983f + ", selectedLogistic=" + this.f101984g + ", reachable=" + this.f101985h + ", unreachableReason=" + this.f101986i + ", hasAddress=" + this.f101987j + ", vouchers=" + this.f101988k + ", shopBill=" + this.f101989l + ")";
    }

    public C43745f(String str, String str2, Image image, String str3, List<C43747h> list, List<LogisticDTO> list2, LogisticDTO logisticDTO, boolean z, String str4, boolean z2, List<Voucher> list3, ShopBill shopBill) {
        C89219l.m154721d(list, "");
        this.f101978a = str;
        this.f101979b = str2;
        this.f101980c = image;
        this.f101981d = str3;
        this.f101982e = list;
        this.f101983f = list2;
        this.f101984g = logisticDTO;
        this.f101985h = z;
        this.f101986i = str4;
        this.f101987j = z2;
        this.f101988k = list3;
        this.f101989l = shopBill;
    }
}
