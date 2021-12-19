package com.bytedance.android.livesdk.verify;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.verify.model.GetCertificationEntranceResponse;
import com.bytedance.android.livesdk.verify.model.QueryZhimaStatusResponse;
import com.bytedance.android.livesdk.verify.model.ZhimaPollingResponse;
import com.bytedance.android.livesdk.verify.model.ZhimaStatusResponse;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88979t;

public interface ZhimaVerifyApi {
    static {
        Covode.recordClassIndex(12932);
    }

    @AbstractC22000h(mo35789a = "/webcast/certification/get_certification_entrance/")
    AbstractC88979t<C5832d<GetCertificationEntranceResponse>> getCertificationEntrance();

    @AbstractC22000h(mo35789a = "/webcast/certification/get_certification_status/")
    AbstractC88979t<C5832d<ZhimaStatusResponse>> getCertificationStatus();

    @AbstractC22000h(mo35789a = "/webcast/certification/query/")
    AbstractC88979t<C5832d<ZhimaPollingResponse>> queryPollingStatus(@AbstractC22018z(mo35807a = "zhima_token") String str, @AbstractC22018z(mo35807a = "transaction_id") String str2);

    @AbstractC22000h(mo35789a = "/webcast/certification/common/query/")
    AbstractC88979t<C5832d<QueryZhimaStatusResponse>> queryZhimaVerifyStatus(@AbstractC22018z(mo35807a = "zhima_token") String str);

    @AbstractC22012t(mo35799a = "/webcast/certification/common/submit/")
    @AbstractC21999g
    AbstractC88979t<C5832d<Object>> zhimaVerify(@AbstractC21997e(mo35786a = "return_url") String str, @AbstractC21997e(mo35786a = "certify_type") String str2);
}
