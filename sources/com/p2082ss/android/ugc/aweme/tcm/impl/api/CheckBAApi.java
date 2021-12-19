package com.p2082ss.android.ugc.aweme.tcm.impl.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.feed.model.BAInfos;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.tcm.impl.api.CheckBAApi */
public interface CheckBAApi {
    static {
        Covode.recordClassIndex(90798);
    }

    @AbstractC22012t(mo35799a = "/aweme/v1/commerce/tcm/creator/check_business_partner/")
    AbstractC88979t<BAInfos> getCheckBA(@AbstractC22018z(mo35807a = "uids") String str);
}
