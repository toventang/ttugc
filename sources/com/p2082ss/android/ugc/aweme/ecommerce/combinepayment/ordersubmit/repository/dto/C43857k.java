package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.k */
public final class C43857k {
    static {
        Covode.recordClassIndex(52137);
    }

    /* renamed from: a */
    public static final int m86773a(PackedSku packedSku) {
        Integer skuAmount;
        if (packedSku == null || (skuAmount = packedSku.getSkuAmount()) == null) {
            return 1;
        }
        return skuAmount.intValue();
    }
}
