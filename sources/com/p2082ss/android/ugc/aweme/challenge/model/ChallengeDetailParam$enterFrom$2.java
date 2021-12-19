package com.p2082ss.android.ugc.aweme.challenge.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam$enterFrom$2 */
public final class ChallengeDetailParam$enterFrom$2 extends AbstractC89220m implements AbstractC89171a<String> {
    final /* synthetic */ ChallengeDetailParam this$0;

    static {
        Covode.recordClassIndex(42737);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChallengeDetailParam$enterFrom$2(ChallengeDetailParam challengeDetailParam) {
        super(0);
        this.this$0 = challengeDetailParam;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89171a
    public final String invoke() {
        String challengeFrom = this.this$0.getChallengeFrom();
        if (challengeFrom == null || challengeFrom.length() == 0) {
            return this.this$0.getFrom();
        }
        return challengeFrom;
    }
}
