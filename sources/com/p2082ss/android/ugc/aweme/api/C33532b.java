package com.p2082ss.android.ugc.aweme.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.p2123b.C29736b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.api.b */
public final class C33532b {

    /* renamed from: a */
    public static final AbstractC89244h f79643a = C89250i.m154773a((AbstractC89171a) C33533a.f79645a);

    /* renamed from: b */
    public static final C33532b f79644b = new C33532b();

    private C33532b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.api.b$a */
    static final class C33533a extends AbstractC89220m implements AbstractC89171a<IAppWidgetApi> {

        /* renamed from: a */
        public static final C33533a f79645a = new C33533a();

        static {
            Covode.recordClassIndex(40403);
        }

        C33533a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IAppWidgetApi invoke() {
            return RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(IAppWidgetApi.class);
        }
    }

    static {
        Covode.recordClassIndex(40402);
    }
}
