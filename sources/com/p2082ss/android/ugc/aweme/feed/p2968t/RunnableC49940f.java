package com.p2082ss.android.ugc.aweme.feed.p2968t;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;

/* renamed from: com.ss.android.ugc.aweme.feed.t.f */
final /* synthetic */ class RunnableC49940f implements Runnable {

    /* renamed from: a */
    private final C49936e f115119a;

    /* renamed from: b */
    private final FeedItemList f115120b;

    /* renamed from: c */
    private final int f115121c;

    static {
        Covode.recordClassIndex(59051);
    }

    RunnableC49940f(C49936e eVar, FeedItemList feedItemList, int i) {
        this.f115119a = eVar;
        this.f115120b = feedItemList;
        this.f115121c = i;
    }

    public final void run() {
        C49936e.m93769a(this.f115120b, this.f115121c);
    }
}
