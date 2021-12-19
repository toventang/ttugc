package com.p2082ss.android.ugc.aweme.commercialize.api;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38256t;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4640l.p4644b.AbstractC89722f;

/* renamed from: com.ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi */
public final class CommerceSettingsApi {

    /* renamed from: a */
    public static C38256t f88905a;

    /* renamed from: b */
    public static final CommerceSettingsApi f88906b = new CommerceSettingsApi();

    /* renamed from: c */
    private static final AbstractC89244h f88907c = C89250i.m154773a((AbstractC89171a) C37607a.f88908a);

    /* renamed from: com.ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi$IApi */
    interface IApi {
        static {
            Covode.recordClassIndex(45028);
        }

        @AbstractC89722f(mo144276a = "/aweme/v1/commerce/settings")
        AbstractFutureC27655q<C38256t> getSettings();
    }

    private CommerceSettingsApi() {
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi$a */
    static final class C37607a extends AbstractC89220m implements AbstractC89171a<IApi> {

        /* renamed from: a */
        public static final C37607a f88908a = new C37607a();

        static {
            Covode.recordClassIndex(45029);
        }

        C37607a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IApi invoke() {
            return RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(C29736b.f70924e).create(IApi.class);
        }
    }

    static {
        Covode.recordClassIndex(45027);
    }
}
