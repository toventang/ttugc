package com.p2082ss.android.ugc.aweme.live;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.live.v */
final /* synthetic */ class RunnableC58785v implements Runnable {

    /* renamed from: a */
    private final LiveBroadcastActivity f133792a;

    static {
        Covode.recordClassIndex(69093);
    }

    RunnableC58785v(LiveBroadcastActivity liveBroadcastActivity) {
        this.f133792a = liveBroadcastActivity;
    }

    public final void run() {
        LiveBroadcastActivity liveBroadcastActivity = this.f133792a;
        Live.getService().mo13026g().mo16680a(liveBroadcastActivity.hashCode(), liveBroadcastActivity);
    }
}
