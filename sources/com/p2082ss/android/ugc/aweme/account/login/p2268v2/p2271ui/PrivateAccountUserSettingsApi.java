package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.PrivateAccountUserSettingsApi */
interface PrivateAccountUserSettingsApi {
    static {
        Covode.recordClassIndex(39383);
    }

    @AbstractC89731o(mo144285a = "aweme/v1/user/set/settings/")
    @AbstractC89721e
    AbstractC88979t<BaseResponse> setPrivatePolicyShow(@AbstractC89719c(mo144273a = "field") String str, @AbstractC89719c(mo144273a = "value") String str2);
}
