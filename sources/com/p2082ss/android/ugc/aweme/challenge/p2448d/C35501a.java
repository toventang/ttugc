package com.p2082ss.android.ugc.aweme.challenge.p2448d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.challenge.d.a */
public final class C35501a implements AbstractC81914b {

    /* renamed from: a */
    public final Challenge f83726a;

    static {
        Covode.recordClassIndex(42693);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C35501a) && C89219l.m154714a(this.f83726a, ((C35501a) obj).f83726a);
        }
        return true;
    }

    public final int hashCode() {
        Challenge challenge = this.f83726a;
        if (challenge != null) {
            return challenge.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ChallengeCollectEvent(challenge=" + this.f83726a + ")";
    }

    public C35501a(Challenge challenge) {
        C89219l.m154721d(challenge, "");
        this.f83726a = challenge;
    }
}
