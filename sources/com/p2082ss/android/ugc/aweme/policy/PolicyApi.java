package com.p2082ss.android.ugc.aweme.policy;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.policy.PolicyApi */
public final class PolicyApi {

    /* renamed from: a */
    static final PolicyService f143494a = ((PolicyService) C18097a.m33698a(Api.f79771d, PolicyService.class));

    /* renamed from: com.ss.android.ugc.aweme.policy.PolicyApi$PolicyService */
    public interface PolicyService {
        static {
            Covode.recordClassIndex(74408);
        }

        @AbstractC22012t(mo35799a = "/aweme/v1/accept-private-policy/")
        AbstractC88979t<BaseResponse> acceptPrivacyPolicy();
    }

    static {
        Covode.recordClassIndex(74407);
    }
}
