package com.p2082ss.android.ugc.aweme.challenge.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20379aq;
import com.p2082ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailState */
public final class ChallengeDetailState implements AbstractC20368af {
    private final AbstractC20362a<ChallengeDetail> challengeDetail;

    static {
        Covode.recordClassIndex(42901);
    }

    public ChallengeDetailState() {
        this(null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChallengeDetailState copy$default(ChallengeDetailState challengeDetailState, AbstractC20362a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = challengeDetailState.challengeDetail;
        }
        return challengeDetailState.copy(aVar);
    }

    public final AbstractC20362a<ChallengeDetail> component1() {
        return this.challengeDetail;
    }

    public final ChallengeDetailState copy(AbstractC20362a<? extends ChallengeDetail> aVar) {
        C89219l.m154721d(aVar, "");
        return new ChallengeDetailState(aVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ChallengeDetailState) && C89219l.m154714a(this.challengeDetail, ((ChallengeDetailState) obj).challengeDetail);
        }
        return true;
    }

    public final int hashCode() {
        AbstractC20362a<ChallengeDetail> aVar = this.challengeDetail;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ChallengeDetailState(challengeDetail=" + this.challengeDetail + ")";
    }

    public final AbstractC20362a<ChallengeDetail> getChallengeDetail() {
        return this.challengeDetail;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.jedi.arch.a<? extends com.ss.android.ugc.aweme.challenge.model.ChallengeDetail> */
    /* JADX WARN: Multi-variable type inference failed */
    public ChallengeDetailState(AbstractC20362a<? extends ChallengeDetail> aVar) {
        C89219l.m154721d(aVar, "");
        this.challengeDetail = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChallengeDetailState(AbstractC20362a aVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? C20379aq.f48273a : aVar);
    }
}
