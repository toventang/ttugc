package com.p2082ss.android.ugc.aweme.setting.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.setting.api.ABApi */
public interface ABApi {

    /* renamed from: a */
    public static final C67985a f152311a = C67985a.f152312a;

    static {
        Covode.recordClassIndex(80164);
    }

    @AbstractC22000h(mo35789a = "/aweme/v1/abtest/param/")
    C1731i<C28022o> querySettings();

    /* renamed from: com.ss.android.ugc.aweme.setting.api.ABApi$a */
    public static final class C67985a {

        /* renamed from: a */
        static final /* synthetic */ C67985a f152312a = new C67985a();

        /* renamed from: b */
        private static final AbstractC89244h f152313b = C89250i.m154773a((AbstractC89171a) C67986a.f152314a);

        /* renamed from: a */
        public static ABApi m120300a() {
            return (ABApi) f152313b.getValue();
        }

        private C67985a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.setting.api.ABApi$a$a */
        static final class C67986a extends AbstractC89220m implements AbstractC89171a<ABApi> {

            /* renamed from: a */
            public static final C67986a f152314a = new C67986a();

            static {
                Covode.recordClassIndex(80166);
            }

            C67986a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ ABApi invoke() {
                return RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(ABApi.class);
            }
        }

        static {
            Covode.recordClassIndex(80165);
        }
    }
}
