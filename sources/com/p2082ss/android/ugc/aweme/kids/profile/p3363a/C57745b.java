package com.p2082ss.android.ugc.aweme.kids.profile.p3363a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.kids.api.account.p3313a.AbstractC57153a;
import com.p2082ss.android.ugc.aweme.kids.intergration.account.KidsAccountServiceImpl;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.kids.profile.a.b */
public final class C57745b implements AbstractC57744a {

    /* renamed from: a */
    private final AbstractC89244h f131748a = C89250i.m154773a((AbstractC89171a) C57747b.f131751a);

    /* renamed from: b */
    private final AbstractC89244h f131749b = C89250i.m154773a((AbstractC89171a) C57746a.f131750a);

    static {
        Covode.recordClassIndex(67730);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.profile.a.b$a */
    static final class C57746a extends AbstractC89220m implements AbstractC89171a<IExternalService> {

        /* renamed from: a */
        public static final C57746a f131750a = new C57746a();

        static {
            Covode.recordClassIndex(67731);
        }

        C57746a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IExternalService invoke() {
            return AVExternalServiceImpl.m113114a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.profile.p3363a.AbstractC57744a
    /* renamed from: a */
    public final Object mo95065a() {
        return this.f131748a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.profile.a.b$b */
    static final class C57747b extends AbstractC89220m implements AbstractC89171a<AbstractC57153a> {

        /* renamed from: a */
        public static final C57747b f131751a = new C57747b();

        static {
            Covode.recordClassIndex(67732);
        }

        C57747b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC57153a invoke() {
            return KidsAccountServiceImpl.m104406h().mo94318b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.profile.p3363a.AbstractC57744a
    /* renamed from: b */
    public final Object mo95066b() {
        return C89070n.m154584g((Iterable) ((IExternalService) this.f131749b.getValue()).draftService().draftList(false));
    }
}
