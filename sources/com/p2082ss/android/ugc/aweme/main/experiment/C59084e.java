package com.p2082ss.android.ugc.aweme.main.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.main.experiment.e */
public final class C59084e {

    /* renamed from: a */
    public static C59085f f134488a;

    /* renamed from: b */
    public static final C59084e f134489b = new C59084e();

    private C59084e() {
    }

    static {
        C59085f fVar;
        Covode.recordClassIndex(69432);
        int a = C16048b.m29633a().mo25412a(true, "feed_swipe_left", 0);
        int a2 = C16048b.m29633a().mo25412a(true, "top_follow_notice_live_unread_style", 0);
        if (a == C59080a.f134478a && a2 == C59082c.f134482a) {
            fVar = new C59085f(C59080a.f134478a, C59082c.f134482a);
        } else {
            fVar = new C59085f(a, a2);
        }
        f134488a = fVar;
    }
}
