package com.p2082ss.android.ugc.aweme.setting.verification;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.setting.verification.VerificationApi */
public interface VerificationApi {

    /* renamed from: a */
    public static final C68704a f153707a = C68704a.f153708a;

    static {
        Covode.recordClassIndex(80967);
    }

    @AbstractC89722f(mo144276a = "/aweme/v1/mtcert/status/")
    AbstractC88979t<VerificationResponse> requestVerification(@AbstractC89736t(mo144292a = "sec_uid") String str);

    /* renamed from: com.ss.android.ugc.aweme.setting.verification.VerificationApi$a */
    public static final class C68704a {

        /* renamed from: a */
        static final /* synthetic */ C68704a f153708a = new C68704a();

        /* renamed from: b */
        private static final IRetrofitService f153709b = RetrofitService.createIRetrofitServicebyMonsterPlugin(false);

        private C68704a() {
        }

        static {
            Covode.recordClassIndex(80968);
        }

        /* renamed from: a */
        public static VerificationApi m121139a() {
            Object create = f153709b.createNewRetrofit(C68705a.f153710a).create(VerificationApi.class);
            C89219l.m154716b(create, "");
            return (VerificationApi) create;
        }
    }
}
