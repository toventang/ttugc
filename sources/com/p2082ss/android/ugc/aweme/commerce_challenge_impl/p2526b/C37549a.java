package com.p2082ss.android.ugc.aweme.commerce_challenge_impl.p2526b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.commerce_challenge_api.p2522a.AbstractC37537a;
import com.p2082ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeOutService;
import com.p2082ss.android.ugc.aweme.commercialize.service.CommerceChallengeOutService;
import com.p2082ss.android.ugc.aweme.utils.AbstractC80367dz;
import com.p2082ss.android.ugc.aweme.utils.C80371eb;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.commerce_challenge_impl.b.a */
public final class C37549a {

    /* renamed from: a */
    public static final AbstractC80367dz f88744a = C80371eb.m139349a(C37550a.f88746a);

    /* renamed from: b */
    public static final C37549a f88745b = new C37549a();

    private C37549a() {
    }

    /* renamed from: a */
    public static AbstractC37537a m75717a() {
        return (AbstractC37537a) f88744a.mo123714a();
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce_challenge_impl.b.a$a */
    static final class C37550a extends AbstractC89220m implements AbstractC89171a<AbstractC37537a> {

        /* renamed from: a */
        public static final C37550a f88746a = new C37550a();

        static {
            Covode.recordClassIndex(44947);
        }

        C37550a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC37537a invoke() {
            ICommerceChallengeOutService commerceChallengeOutService;
            Object a = C81908b.m141854a(ICommerceChallengeOutService.class, false);
            if (a != null) {
                commerceChallengeOutService = (ICommerceChallengeOutService) a;
                if (commerceChallengeOutService == null) {
                    return null;
                }
            } else {
                commerceChallengeOutService = new CommerceChallengeOutService();
            }
            return commerceChallengeOutService.mo65375a();
        }
    }

    static {
        Covode.recordClassIndex(44946);
    }
}
