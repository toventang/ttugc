package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.services.TwoStepVerificationService$pushChallengeKeva$2 */
public final class TwoStepVerificationService$pushChallengeKeva$2 extends AbstractC89220m implements AbstractC89171a<Keva> {
    public static final TwoStepVerificationService$pushChallengeKeva$2 INSTANCE = new TwoStepVerificationService$pushChallengeKeva$2();

    static {
        Covode.recordClassIndex(79738);
    }

    TwoStepVerificationService$pushChallengeKeva$2() {
        super(0);
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89171a
    public final Keva invoke() {
        return Keva.getRepo("aweme_open_push_challenge_page_list");
    }
}
