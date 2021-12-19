package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.compliance.common.p2660a.C39605a;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.CanQuitBusinessAccountApi */
public interface CanQuitBusinessAccountApi {

    /* renamed from: a */
    public static final C39809a f93723a = C39809a.f93725b;

    static {
        Covode.recordClassIndex(47539);
    }

    @AbstractC22000h(mo35789a = "/aweme/v1/ad/ba/quitcheck/")
    AbstractC88979t<BaseResponse> check();

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.CanQuitBusinessAccountApi$a */
    public static final class C39809a {

        /* renamed from: a */
        static final CanQuitBusinessAccountApi f93724a;

        /* renamed from: b */
        static final /* synthetic */ C39809a f93725b = new C39809a();

        private C39809a() {
        }

        static {
            Covode.recordClassIndex(47540);
            Object a = RetrofitFactory.m33635a().mo28816a(C39605a.f93367a).mo28858a(CanQuitBusinessAccountApi.class);
            C89219l.m154716b(a, "");
            f93724a = (CanQuitBusinessAccountApi) a;
        }
    }
}
