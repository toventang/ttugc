package com.p2082ss.android.ugc.aweme.compliance.business.policynotice.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39250k;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.api.PolicyNoticeApi */
public final class PolicyNoticeApi {

    /* renamed from: a */
    public static final API f93135a;

    /* renamed from: b */
    public static final C39470a f93136b = new C39470a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.api.PolicyNoticeApi$API */
    public interface API {
        static {
            Covode.recordClassIndex(47160);
        }

        @AbstractC22000h(mo35789a = "/aweme/v1/policy/notice/")
        C1731i<C39250k> getPolicyNotice(@AbstractC22018z(mo35807a = "scene") int i);

        @AbstractC22012t(mo35799a = "/aweme/v1/policy/notice/approve/")
        @AbstractC21999g
        C1731i<BaseResponse> policyNoticeApprove(@AbstractC21997e(mo35786a = "business") String str, @AbstractC21997e(mo35786a = "policy_version") String str2, @AbstractC21997e(mo35786a = "style") String str3, @AbstractC21997e(mo35786a = "extra") String str4, @AbstractC21997e(mo35786a = "operation") Integer num, @AbstractC21997e(mo35786a = "scene") Integer num2);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.api.PolicyNoticeApi$a */
    public static final class C39470a {
        static {
            Covode.recordClassIndex(47161);
        }

        private C39470a() {
        }

        public /* synthetic */ C39470a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(47159);
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(API.class);
        C89219l.m154716b(create, "");
        f93135a = (API) create;
    }
}
