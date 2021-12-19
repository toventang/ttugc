package com.p2082ss.android.ugc.aweme.feed.adapter;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.adapter.bf */
public final /* synthetic */ class RunnableC48203bf implements Runnable {

    /* renamed from: a */
    private final VideoViewCell f111682a;

    /* renamed from: b */
    private final C48238ce f111683b;

    static {
        Covode.recordClassIndex(56945);
    }

    RunnableC48203bf(VideoViewCell videoViewCell, C48238ce ceVar) {
        this.f111682a = videoViewCell;
        this.f111683b = ceVar;
    }

    public final void run() {
        this.f111682a.mo80208b(this.f111683b);
    }
}
