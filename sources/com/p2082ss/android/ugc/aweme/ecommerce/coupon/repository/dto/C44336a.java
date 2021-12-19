package com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.a */
public final class C44336a {
    static {
        Covode.recordClassIndex(52661);
    }

    /* renamed from: a */
    public static final Voucher m87058a(VoucherInfo voucherInfo) {
        C89219l.m154721d(voucherInfo, "");
        List<Voucher> vouchers = voucherInfo.getVouchers();
        T t = null;
        if (vouchers == null) {
            return null;
        }
        Iterator<T> it = vouchers.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (C89219l.m154714a((Object) next.getSelected(), (Object) true)) {
                t = next;
                break;
            }
        }
        return t;
    }
}
