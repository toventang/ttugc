package com.bytedance.android.livesdk.feed.drawerfeed;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.android.livesdk.feed.repository.BaseFeedRepository;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.p */
final /* synthetic */ class C8560p implements AbstractC1214u {

    /* renamed from: a */
    private final C8555l f21158a;

    static {
        Covode.recordClassIndex(9415);
    }

    C8560p(C8555l lVar) {
        this.f21158a = lVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        this.f21158a.mo14854a((BaseFeedRepository.EnumC8657a) obj);
    }
}
