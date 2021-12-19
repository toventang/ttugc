package com.p2082ss.android.ugc.aweme.comment.util;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;

/* renamed from: com.ss.android.ugc.aweme.comment.util.e */
public final class C37193e {

    /* renamed from: a */
    public static final C37193e f87708a = new C37193e();

    private C37193e() {
    }

    static {
        Covode.recordClassIndex(44548);
    }

    /* renamed from: a */
    public static final void m75160a(String str, long j) {
        if (str != null) {
            AwemeService.m70060b().mo60683a(str, j);
            AbstractC81915c.m141874a(new C49672ag(14, str));
        }
    }
}
