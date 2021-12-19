package com.p2082ss.android.ugc.aweme.profile.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.p2123b.C29736b;

/* renamed from: com.ss.android.ugc.aweme.profile.api.GetProAccountCategoryTypeApi */
public final class GetProAccountCategoryTypeApi {

    /* renamed from: a */
    public static final GetProAccountCategoryTypeApi f144003a = new GetProAccountCategoryTypeApi();

    /* renamed from: b */
    private static final RealApi f144004b = ((RealApi) RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(RealApi.class));

    /* renamed from: com.ss.android.ugc.aweme.profile.api.GetProAccountCategoryTypeApi$RealApi */
    interface RealApi {
        static {
            Covode.recordClassIndex(74725);
        }

        @AbstractC22000h(mo35789a = "/aweme/v1/user/proaccount/categorytype/")
        AbstractFutureC27655q<Object> getProAccountCategoryType();
    }

    private GetProAccountCategoryTypeApi() {
    }

    static {
        Covode.recordClassIndex(74724);
    }
}
