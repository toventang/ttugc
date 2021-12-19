package com.bytedance.android.livesdk.feed.repository;

import android.util.Pair;
import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.feed.repository.h */
public final /* synthetic */ class C8667h implements AbstractC88433f {

    /* renamed from: a */
    private final FeedRepository.C8658a f21415a;

    static {
        Covode.recordClassIndex(9533);
    }

    C8667h(FeedRepository.C8658a aVar) {
        this.f21415a = aVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        FeedRepository.C8658a aVar = this.f21415a;
        Pair pair = (Pair) obj;
        if (pair.first != null) {
            aVar.f21394c = (String) pair.first;
        }
        if (pair.second != null) {
            aVar.f21395d = (String) pair.second;
        }
    }
}
