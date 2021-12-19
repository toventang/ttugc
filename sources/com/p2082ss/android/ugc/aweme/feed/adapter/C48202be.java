package com.p2082ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49678f;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.LongPressLayout;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50528ad;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.adapter.be */
public final /* synthetic */ class C48202be implements LongPressLayout.AbstractC50014a {

    /* renamed from: a */
    private final BaseFeedPageParams f111680a;

    /* renamed from: b */
    private final Context f111681b;

    static {
        Covode.recordClassIndex(56944);
    }

    C48202be(BaseFeedPageParams baseFeedPageParams, Context context) {
        this.f111680a = baseFeedPageParams;
        this.f111681b = context;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.LongPressLayout.AbstractC50014a
    /* renamed from: a */
    public final void mo80347a(float f, float f2) {
        BaseFeedPageParams baseFeedPageParams = this.f111680a;
        Context context = this.f111681b;
        if (!baseFeedPageParams.isPlayListCleanMode().booleanValue()) {
            if (C50528ad.m94717a(baseFeedPageParams.eventType == null ? "" : baseFeedPageParams.eventType)) {
                AbstractC81915c.m141874a(new C49678f(baseFeedPageParams.awemeFromPage, f, f2, context.hashCode()));
            }
        }
    }
}
