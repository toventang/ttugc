package com.p2082ss.android.ugc.aweme.ecommerce.coupon.p2835a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto.CouponCache;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto.Voucher;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuVoucher;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.coupon.a.a */
public final class C44323a {

    /* renamed from: a */
    public static final Map<String, CouponCache> f103368a = new LinkedHashMap();

    /* renamed from: b */
    public static final C44323a f103369b = new C44323a();

    private C44323a() {
    }

    static {
        Covode.recordClassIndex(52637);
    }

    /* renamed from: a */
    public static int m87048a(String str) {
        C89219l.m154721d(str, "");
        CouponCache couponCache = f103368a.get(str);
        if (couponCache != null) {
            return couponCache.getClaimStatus();
        }
        return -1;
    }

    /* renamed from: a */
    public static List<String> m87049a(VoucherInfo voucherInfo, SkuVoucher skuVoucher) {
        List<Voucher> vouchers;
        Integer valueOf;
        List<String> bestVoucherTypeIds;
        if (voucherInfo == null || (vouchers = voucherInfo.getVouchers()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : vouchers) {
            T t2 = t;
            if (!(skuVoucher == null || (bestVoucherTypeIds = skuVoucher.getBestVoucherTypeIds()) == null || !bestVoucherTypeIds.contains(t2.getVoucherTypeID()))) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            String voucherID = ((Voucher) obj).getVoucherID();
            if (voucherID == null || !C80538hl.m139614a(voucherID)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            CouponCache couponCache = f103368a.get(((Voucher) obj2).getVoucherTypeID());
            if (couponCache == null || (valueOf = Integer.valueOf(couponCache.getClaimStatus())) == null || !(valueOf.intValue() == 3 || valueOf.intValue() == 4)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList<Voucher> arrayList4 = arrayList3;
        ArrayList arrayList5 = new ArrayList(C89070n.m154526a((Iterable) arrayList4, 10));
        for (Voucher voucher : arrayList4) {
            arrayList5.add(voucher.getVoucherTypeID());
        }
        return arrayList5;
    }
}
