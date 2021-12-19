package com.p2082ss.android.ugc.aweme.setting.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.setting.model.C68171a;
import com.p2082ss.android.ugc.aweme.setting.model.C68172b;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;

/* renamed from: com.ss.android.ugc.aweme.setting.api.AuthListApi */
public interface AuthListApi {

    /* renamed from: a */
    public static final C67988a f152317a = C67988a.f152318a;

    static {
        Covode.recordClassIndex(80169);
    }

    @AbstractC89722f(mo144276a = "/aweme/v1/openapi/authorized/app/count/")
    AbstractFutureC27655q<C68171a> getAuthAppCount();

    @AbstractC89722f(mo144276a = "/aweme/v1/openapi/authorized/app/list/")
    AbstractC88979t<C68172b> getAuthInfoList();

    /* renamed from: com.ss.android.ugc.aweme.setting.api.AuthListApi$a */
    public static final class C67988a {

        /* renamed from: a */
        static final /* synthetic */ C67988a f152318a = new C67988a();

        private C67988a() {
        }

        static {
            Covode.recordClassIndex(80170);
        }

        /* renamed from: a */
        public static AuthListApi m120301a() {
            Object a = RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(AuthListApi.class);
            C89219l.m154716b(a, "");
            return (AuthListApi) a;
        }
    }
}
