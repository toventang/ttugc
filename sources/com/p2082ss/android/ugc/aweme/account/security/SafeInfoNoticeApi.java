package com.p2082ss.android.ugc.aweme.account.security;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4560f.p4561a.AbstractC88403ab;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.account.security.SafeInfoNoticeApi */
public interface SafeInfoNoticeApi {

    /* renamed from: a */
    public static final C32936a f78365a = C32936a.f78366a;

    static {
        Covode.recordClassIndex(39727);
    }

    @AbstractC89731o(mo144285a = "/safe_info/user/confirm/notice/")
    @AbstractC89721e
    AbstractC88403ab<BaseResponse> safeInfoConfirm(@AbstractC89719c(mo144273a = "notice_id") String str, @AbstractC89719c(mo144273a = "notice_type") String str2);

    @AbstractC89722f(mo144276a = "/safe_info/user/message/notice/")
    AbstractC88403ab<C32939c> safeInfoNoticeMsg(@AbstractC89736t(mo144292a = "adolescent_model") boolean z);

    /* renamed from: com.ss.android.ugc.aweme.account.security.SafeInfoNoticeApi$a */
    public static final class C32936a {

        /* renamed from: a */
        static final /* synthetic */ C32936a f78366a = new C32936a();

        private C32936a() {
        }

        static {
            Covode.recordClassIndex(39728);
        }

        /* renamed from: a */
        public static SafeInfoNoticeApi m67574a() {
            Object a = RetrofitFactory.m33635a().mo28817b(Api.f79771d).mo28832d().mo28858a(SafeInfoNoticeApi.class);
            C89219l.m154716b(a, "");
            return (SafeInfoNoticeApi) a;
        }
    }
}
