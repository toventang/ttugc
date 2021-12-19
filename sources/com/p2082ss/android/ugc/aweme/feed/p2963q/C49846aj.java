package com.p2082ss.android.ugc.aweme.feed.p2963q;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49677e;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.feed.q.aj */
final /* synthetic */ class C49846aj implements AbstractC88433f {

    /* renamed from: a */
    private final C49888x f114924a;

    /* renamed from: b */
    private final Aweme f114925b;

    /* renamed from: c */
    private final int f114926c;

    /* renamed from: d */
    private final User f114927d;

    static {
        Covode.recordClassIndex(58953);
    }

    C49846aj(C49888x xVar, Aweme aweme, int i, User user) {
        this.f114924a = xVar;
        this.f114925b = aweme;
        this.f114926c = i;
        this.f114927d = user;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C49888x xVar = this.f114924a;
        Aweme aweme = this.f114925b;
        int i = this.f114926c;
        User user = this.f114927d;
        Long l = (Long) obj;
        if ((xVar.mo81109aD() == null || !xVar.mo81109aD().equals(aweme)) && xVar.mo81110aE() < i) {
            if (l == null) {
                l = 0L;
            }
            if (!aweme.isLive()) {
                user.roomId = l.longValue();
            }
            if (aweme.isLive() && 0 == l.longValue()) {
                AbstractC81915c.m141874a(new C49677e(aweme, xVar.f114782aJ.getEventType()));
            }
        }
    }
}
