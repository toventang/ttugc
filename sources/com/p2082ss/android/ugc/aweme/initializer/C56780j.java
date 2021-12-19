package com.p2082ss.android.ugc.aweme.initializer;

import androidx.core.p036g.AbstractC0688a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2373e.p2374a.AbstractC34583a;
import com.p2082ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p2082ss.android.ugc.aweme.shortvideo.p3792ae.C69799a;

/* renamed from: com.ss.android.ugc.aweme.initializer.j */
final /* synthetic */ class C56780j implements AbstractC34583a {

    /* renamed from: a */
    private final AbstractC0688a f129339a;

    static {
        Covode.recordClassIndex(66645);
    }

    C56780j(AbstractC0688a aVar) {
        this.f129339a = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2373e.p2374a.AbstractC34583a
    /* renamed from: a */
    public final void mo61039a(Object obj) {
        AbstractC0688a aVar = this.f129339a;
        ChallengeDetail challengeDetail = (ChallengeDetail) obj;
        if (challengeDetail != null && challengeDetail.challenge != null) {
            aVar.mo2720a(C69799a.m123324a(challengeDetail.challenge));
        }
    }
}
