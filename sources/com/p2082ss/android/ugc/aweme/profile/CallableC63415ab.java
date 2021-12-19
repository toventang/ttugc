package com.p2082ss.android.ugc.aweme.profile;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.ab */
final /* synthetic */ class CallableC63415ab implements Callable {

    /* renamed from: a */
    private final C63810k f143965a;

    /* renamed from: b */
    private final Aweme f143966b;

    static {
        Covode.recordClassIndex(74706);
    }

    CallableC63415ab(C63810k kVar, Aweme aweme) {
        this.f143965a = kVar;
        this.f143966b = aweme;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f143965a.mo102382c(this.f143966b);
    }
}
