package com.p2082ss.android.ugc.aweme.profile;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4560f.p4561a.AbstractC88403ab;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.profile.PushSettingApi */
public interface PushSettingApi {
    static {
        Covode.recordClassIndex(74632);
    }

    @AbstractC89722f(mo144276a = "/aweme/v1/user/set/settings/")
    AbstractC88403ab<BaseResponse> setItem(@AbstractC89736t(mo144292a = "field") String str, @AbstractC89736t(mo144292a = "value") int i);
}
