package com.p2082ss.android.ugc.aweme.setting.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4560f.p4561a.AbstractC88403ab;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.setting.api.ProAccountUpdateStatusApi */
public interface ProAccountUpdateStatusApi {
    static {
        Covode.recordClassIndex(80185);
    }

    @AbstractC89731o(mo144285a = "/tiktok/user/setting/proaccount_update_status/update/v1/")
    AbstractC88403ab<BaseResponse> updateStatus();
}
