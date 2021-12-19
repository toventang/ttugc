package com.p2082ss.android.ugc.aweme.account.agegate.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.C22306c;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.account.agegate.model.SetEmailResponse;
import com.p2082ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import java.util.HashMap;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.api.Api */
public class Api {
    static {
        Covode.recordClassIndex(38124);
    }

    public static C1731i<SetEmailResponse> emailForExportVideo(String str) {
        return C1731i.m5640b(new CallableC31410a(str), C1731i.f5562a);
    }

    static final /* synthetic */ SetEmailResponse lambda$emailForExportVideo$0$Api(String str) {
        String str2 = C22306c.C22307a.f52737a + "api.tiktokv.com/tiktok/v1/kids/user/email/";
        HashMap hashMap = new HashMap();
        hashMap.put("email", str);
        return (SetEmailResponse) new C27910f().mo46670a(NetworkProxyAccount.f78256b.mo58684a(str2, hashMap), SetEmailResponse.class);
    }
}
