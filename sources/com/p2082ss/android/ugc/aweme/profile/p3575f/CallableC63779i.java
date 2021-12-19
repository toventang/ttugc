package com.p2082ss.android.ugc.aweme.profile.p3575f;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.f.i */
public final /* synthetic */ class CallableC63779i implements Callable {

    /* renamed from: a */
    private final int f144571a;

    /* renamed from: b */
    private final String f144572b;

    /* renamed from: c */
    private final FeedItemList f144573c;

    static {
        Covode.recordClassIndex(75107);
    }

    CallableC63779i(int i, String str, FeedItemList feedItemList) {
        this.f144571a = i;
        this.f144572b = str;
        this.f144573c = feedItemList;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C63775e.m115334b(this.f144571a, this.f144572b, this.f144573c);
    }
}
