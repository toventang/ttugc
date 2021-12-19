package com.p2082ss.android.ugc.aweme.challenge.service;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.p2082ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.challenge.service.b */
final /* synthetic */ class C35545b implements AbstractC1729g {

    /* renamed from: a */
    private final boolean f83823a;

    /* renamed from: b */
    private final String f83824b;

    static {
        Covode.recordClassIndex(42768);
    }

    C35545b(boolean z, String str) {
        this.f83823a = z;
        this.f83824b = str;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        Challenge challenge;
        boolean z = this.f83823a;
        String str = this.f83824b;
        if (iVar.mo5539b() || iVar.mo5544c() || iVar.mo5545d() == null) {
            return null;
        }
        if (!z || (challenge = ((ChallengeDetail) iVar.mo5545d()).challenge) == null || !CommerceChallengeServiceImpl.m75741e().mo65392b(challenge) || C80580in.m139687c()) {
            return iVar;
        }
        CommerceChallengeServiceImpl.m75741e().mo65383a(challenge);
        return ChallengeApi.m72575a(str, str);
    }
}
