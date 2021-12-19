package com.p2082ss.android.ugc.aweme.share.business.tcm;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.share.business.tcm.TCMOrderDeleteApi */
public interface TCMOrderDeleteApi {
    static {
        Covode.recordClassIndex(81204);
    }

    @AbstractC22012t(mo35799a = "/aweme/v1/commerce/tcm/item/delete/apply/")
    @AbstractC21999g
    AbstractC88979t<BaseResponse> applyDeleteTCMOrder(@AbstractC21997e(mo35786a = "order_id") String str, @AbstractC21997e(mo35786a = "item_id") String str2);

    @AbstractC22000h(mo35789a = "/aweme/v1/commerce/tcm/item/delete/status/")
    AbstractC88979t<C68899a> checkTCMOrderDeleteStatus(@AbstractC22018z(mo35807a = "order_id") String str, @AbstractC22018z(mo35807a = "item_id") String str2);
}
