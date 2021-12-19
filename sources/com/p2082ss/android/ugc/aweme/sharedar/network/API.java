package com.p2082ss.android.ugc.aweme.sharedar.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Map;
import p4640l.p4644b.AbstractC89720d;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.sharedar.network.API */
public interface API {
    static {
        Covode.recordClassIndex(81914);
    }

    @AbstractC89731o(mo144285a = "/tiktok/v1/shareshoot/invite/")
    @AbstractC89721e
    AbstractC21983b<BaseResponse> inviteFriend(@AbstractC89720d Map<String, String> map);
}
