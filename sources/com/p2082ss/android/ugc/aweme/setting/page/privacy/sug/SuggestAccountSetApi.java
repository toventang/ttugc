package com.p2082ss.android.ugc.aweme.setting.page.privacy.sug;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4560f.p4561a.AbstractC88979t;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.setting.page.privacy.sug.SuggestAccountSetApi */
public final class SuggestAccountSetApi {

    /* renamed from: a */
    public static final AbstractC89244h f152897a = C89250i.m154773a((AbstractC89171a) C68314a.f152899a);

    /* renamed from: b */
    public static final SuggestAccountSetApi f152898b = new SuggestAccountSetApi();

    /* renamed from: com.ss.android.ugc.aweme.setting.page.privacy.sug.SuggestAccountSetApi$RealApi */
    public interface RealApi {
        static {
            Covode.recordClassIndex(80530);
        }

        @AbstractC22012t(mo35799a = "/tiktok/privacy/setting/suggestion/update/v1")
        @AbstractC21999g
        AbstractC88979t<BaseResponse> setSuggestPrivacySettings(@AbstractC21997e(mo35786a = "field") String str, @AbstractC21997e(mo35786a = "value") int i);
    }

    private SuggestAccountSetApi() {
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.privacy.sug.SuggestAccountSetApi$a */
    static final class C68314a extends AbstractC89220m implements AbstractC89171a<RealApi> {

        /* renamed from: a */
        public static final C68314a f152899a = new C68314a();

        static {
            Covode.recordClassIndex(80531);
        }

        C68314a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RealApi invoke() {
            return RetrofitFactory.m33635a().mo28816a(Api.f79771d).mo28858a(RealApi.class);
        }
    }

    static {
        Covode.recordClassIndex(80529);
    }
}
