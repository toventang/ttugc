package com.bytedance.android.livesdk.feed.repository;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.android.live.core.p215e.C3884b;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.feed.repository.f */
final /* synthetic */ class C8665f implements AbstractC1214u {

    /* renamed from: a */
    private final FeedRepository f21413a;

    static {
        Covode.recordClassIndex(9531);
    }

    C8665f(FeedRepository feedRepository) {
        this.f21413a = feedRepository;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        this.f21413a.mo14964a((C3884b) obj);
    }
}
