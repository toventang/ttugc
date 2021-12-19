package com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.kids.common.p3328a.C57345a;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.response.C57665c;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.api.PolicyNoticeApi */
public final class PolicyNoticeApi {

    /* renamed from: a */
    public static final API f131586a;

    /* renamed from: b */
    public static final C57654a f131587b = new C57654a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.api.PolicyNoticeApi$API */
    public interface API {
        static {
            Covode.recordClassIndex(67619);
        }

        @AbstractC22000h(mo35789a = "/tiktok/v1/kids/policy/notice/")
        C1731i<C57665c> getPolicyNotice();

        @AbstractC22012t(mo35799a = "/tiktok/v1/kids/policy/notice/approve/")
        C1731i<BaseResponse> policyNoticeApprove(@AbstractC22018z(mo35807a = "business") String str, @AbstractC22018z(mo35807a = "policy_version") String str2, @AbstractC22018z(mo35807a = "style") String str3, @AbstractC22018z(mo35807a = "extra") String str4, @AbstractC22018z(mo35807a = "operation") Integer num);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.api.PolicyNoticeApi$a */
    public static final class C57654a {
        static {
            Covode.recordClassIndex(67620);
        }

        private C57654a() {
        }

        public /* synthetic */ C57654a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(67618);
        Object a = RetrofitFactory.m33635a().mo28816a(C57345a.f130717a).mo28858a(API.class);
        C89219l.m154716b(a, "");
        f131586a = (API) a;
    }
}
