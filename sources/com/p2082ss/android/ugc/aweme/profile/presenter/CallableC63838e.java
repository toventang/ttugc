package com.p2082ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.e */
final /* synthetic */ class CallableC63838e implements Callable {

    /* renamed from: a */
    private final FeedItemList f144749a;

    static {
        Covode.recordClassIndex(75262);
    }

    CallableC63838e(FeedItemList feedItemList) {
        this.f144749a = feedItemList;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f144749a;
    }
}
