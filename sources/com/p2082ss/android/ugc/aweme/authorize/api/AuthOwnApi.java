package com.p2082ss.android.ugc.aweme.authorize.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88403ab;

/* renamed from: com.ss.android.ugc.aweme.authorize.api.AuthOwnApi */
public interface AuthOwnApi {
    static {
        Covode.recordClassIndex(40916);
    }

    @AbstractC22000h(mo35789a = "/passport/open/check_login/")
    AbstractC88403ab<Object> getLoginStatus(@AbstractC22018z(mo35807a = "client_key") String str);
}
