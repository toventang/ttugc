package com.p2082ss.android.ugc.aweme.challenge.p2447c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.challenge.service.IChallengeDetailProviderOutService;
import com.p2082ss.android.ugc.aweme.commercialize.service.ChallengeDetailProviderOutService;
import com.p2082ss.android.ugc.aweme.utils.AbstractC80367dz;
import com.p2082ss.android.ugc.aweme.utils.C80371eb;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.challenge.c.a */
public final class C35497a {

    /* renamed from: a */
    public static final AbstractC80367dz f83723a = C80371eb.m139349a(C35498a.f83725a);

    /* renamed from: b */
    public static final C35497a f83724b = new C35497a();

    private C35497a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.c.a$a */
    static final class C35498a extends AbstractC89220m implements AbstractC89171a<AbstractC35499b> {

        /* renamed from: a */
        public static final C35498a f83725a = new C35498a();

        static {
            Covode.recordClassIndex(42690);
        }

        C35498a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC35499b invoke() {
            IChallengeDetailProviderOutService challengeDetailProviderOutService;
            Object a = C81908b.m141854a(IChallengeDetailProviderOutService.class, false);
            if (a != null) {
                challengeDetailProviderOutService = (IChallengeDetailProviderOutService) a;
                if (challengeDetailProviderOutService == null) {
                    return null;
                }
            } else {
                challengeDetailProviderOutService = new ChallengeDetailProviderOutService();
            }
            return challengeDetailProviderOutService.mo62527a();
        }
    }

    static {
        Covode.recordClassIndex(42689);
    }
}
