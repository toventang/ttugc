package com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.api.p2867a.C45694e;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.api.p2867a.C45696g;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.network.BaseResponse;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2871a.p2872a.C45805b;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.api.AudienceProductListApi */
public interface AudienceProductListApi {
    static {
        Covode.recordClassIndex(54199);
    }

    @AbstractC22000h(mo35789a = "/aweme/v1/oec/live/popup/prebuy/get")
    AbstractC21983b<BaseResponse<C45694e>> getFansPopUp(@AbstractC22018z(mo35807a = "source") int i, @AbstractC22018z(mo35807a = "room_id") String str, @AbstractC22018z(mo35807a = "anchor_id") String str2, @AbstractC22018z(mo35807a = "product_ids") String str3);

    @AbstractC22000h(mo35789a = "/aweme/v1/oec/live/product/pop")
    AbstractC21983b<BaseResponse<C45805b>> getIntroduceProduct(@AbstractC22018z(mo35807a = "room_id") String str, @AbstractC22018z(mo35807a = "promotion_response_style") Integer num);

    @AbstractC22000h(mo35789a = "/aweme/v1/oec/live/product/refresh")
    AbstractC21983b<BaseResponse<C45696g>> getProductList(@AbstractC22018z(mo35807a = "room_id") String str, @AbstractC22018z(mo35807a = "product_ids") String str2);
}
