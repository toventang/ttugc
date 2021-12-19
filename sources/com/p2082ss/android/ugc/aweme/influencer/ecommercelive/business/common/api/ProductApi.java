package com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.common.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.p3274a.p3275a.p3276a.p3277a.p3278a.C56614a;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.api.ProductApi */
public interface ProductApi {
    static {
        Covode.recordClassIndex(66476);
    }

    @AbstractC22012t(mo35799a = "/aweme/v1/oec/affiliate/live/product/del")
    @AbstractC21999g
    AbstractC21983b<BaseResponse<String>> deleteProducts(@AbstractC21998f Map<String, String> map);

    @AbstractC22000h(mo35789a = "/aweme/v1/oec/affiliate/live/product/num")
    AbstractC21983b<BaseResponse<C56614a>> getProductsCount(@AbstractC22018z(mo35807a = "room_id") String str, @AbstractC22018z(mo35807a = "is_owner") boolean z);
}
