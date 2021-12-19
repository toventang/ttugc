package com.p2082ss.android.ugc.aweme.setting.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32176a;
import p077b.C1731i;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.setting.api.IChangePhoneHelperApi */
public interface IChangePhoneHelperApi {

    /* renamed from: a */
    public static final C67991a f152326a = C67991a.f152328b;

    static {
        Covode.recordClassIndex(80177);
    }

    @AbstractC89731o(mo144285a = "passport/auth/available_ways/")
    C1731i<C67996a> availableVerifyWays();

    @AbstractC89731o(mo144285a = "passport/safe/two_step_verification/get_verification_list/")
    C1731i<C32176a> check2sv();

    @AbstractC89731o(mo144285a = "/passport/shark/safe_verify/")
    @AbstractC89721e
    C1731i<C67998b> safeEnv(@AbstractC89719c(mo144273a = "scene") String str, @AbstractC89719c(mo144273a = "target") String str2);

    /* renamed from: com.ss.android.ugc.aweme.setting.api.IChangePhoneHelperApi$a */
    public static final class C67991a {

        /* renamed from: a */
        public static final IChangePhoneHelperApi f152327a = ((IChangePhoneHelperApi) RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(IChangePhoneHelperApi.class));

        /* renamed from: b */
        static final /* synthetic */ C67991a f152328b = new C67991a();

        private C67991a() {
        }

        static {
            Covode.recordClassIndex(80178);
        }
    }
}
