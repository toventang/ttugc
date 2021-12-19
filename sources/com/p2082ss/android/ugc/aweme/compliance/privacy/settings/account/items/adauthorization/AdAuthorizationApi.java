package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.p2082ss.android.ugc.aweme.compliance.common.p2660a.C39605a;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.AdAuthorizationApi */
public interface AdAuthorizationApi {

    /* renamed from: a */
    public static final C39754a f93605a = C39754a.f93607b;

    static {
        Covode.recordClassIndex(47483);
    }

    @AbstractC22012t(mo35799a = "/aweme/v1/ad/authorization/update/")
    @AbstractC21999g
    AbstractC21983b<String> requestAdAuthorization(@AbstractC21998f Map<String, Object> map);

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.AdAuthorizationApi$a */
    public static final class C39754a {

        /* renamed from: a */
        static final AdAuthorizationApi f93606a;

        /* renamed from: b */
        static final /* synthetic */ C39754a f93607b = new C39754a();

        private C39754a() {
        }

        static {
            Covode.recordClassIndex(47484);
            Object a = RetrofitFactory.m33635a().mo28816a(C39605a.f93367a).mo28858a(AdAuthorizationApi.class);
            C89219l.m154716b(a, "");
            f93606a = (AdAuthorizationApi) a;
        }
    }
}
