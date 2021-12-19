package com.bytedance.android.livesdk.feed.repository;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.feed.repository.n */
final /* synthetic */ class C8673n implements AbstractC88433f {

    /* renamed from: a */
    private final FeedRepository.C8658a f21422a;

    static {
        Covode.recordClassIndex(9539);
    }

    C8673n(FeedRepository.C8658a aVar) {
        this.f21422a = aVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        new Handler(Looper.getMainLooper()).post(new RunnableC8669j(this.f21422a));
    }
}
