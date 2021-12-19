package com.p2082ss.android.ugc.aweme.commercialize.live.business.links.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f.C38103d;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.api.BusinessLinksLiveApi */
public interface BusinessLinksLiveApi {
    static {
        Covode.recordClassIndex(45529);
    }

    @AbstractC22012t(mo35799a = "/aweme/v1/ad/ba/business/link/active/clear/")
    AbstractC88403ab<BaseResponse> clearBusinessLinksCards();

    @AbstractC22000h(mo35789a = "/aweme/v1/ad/ba/business/link/active/count/")
    AbstractC88979t<C38103d> getActiveLinksCount();
}
