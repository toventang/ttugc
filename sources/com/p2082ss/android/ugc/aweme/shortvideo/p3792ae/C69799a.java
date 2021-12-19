package com.p2082ss.android.ugc.aweme.shortvideo.p3792ae;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27235f;
import com.google.p1998c.p2001c.C27404ap;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ae.a */
public final class C69799a implements AbstractC27235f<Challenge, AVChallenge> {
    static {
        Covode.recordClassIndex(82205);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.p1998c.p1999a.AbstractC27235f
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AVChallenge mo45319a(Challenge challenge) {
        return m123324a(challenge);
    }

    /* renamed from: a */
    public static ArrayList<AVChallenge> m123325a(List<Challenge> list) {
        return C27404ap.m54807a((Iterable) C27404ap.m54811a(list, new C69799a()));
    }

    /* renamed from: a */
    public static AVChallenge m123324a(Challenge challenge) {
        AVChallenge aVChallenge = new AVChallenge();
        aVChallenge.cid = challenge.getCid();
        aVChallenge.challengeName = challenge.getChallengeName();
        aVChallenge.stickerId = challenge.getStickerId();
        aVChallenge.type = challenge.getType();
        aVChallenge.viewCount = challenge.getViewCount();
        aVChallenge.userCount = challenge.getUserCount();
        aVChallenge.isCommerce = challenge.isCommerce();
        return aVChallenge;
    }
}
