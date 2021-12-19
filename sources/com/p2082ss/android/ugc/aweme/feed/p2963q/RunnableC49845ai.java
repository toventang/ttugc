package com.p2082ss.android.ugc.aweme.feed.p2963q;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.ExecutorC34605m;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.video.C80662ac;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.q.ai */
public final /* synthetic */ class RunnableC49845ai implements Runnable {

    /* renamed from: a */
    private final C49888x f114922a;

    /* renamed from: b */
    private final Aweme f114923b;

    static {
        Covode.recordClassIndex(58952);
    }

    RunnableC49845ai(C49888x xVar, Aweme aweme) {
        this.f114922a = xVar;
        this.f114923b = aweme;
    }

    public final void run() {
        C49888x xVar = this.f114922a;
        Aweme aweme = this.f114923b;
        if (C80662ac.m139888a(aweme)) {
            ExecutorC34605m.f81660a.execute(new RunnableC49840ad(xVar, aweme));
        }
    }
}
