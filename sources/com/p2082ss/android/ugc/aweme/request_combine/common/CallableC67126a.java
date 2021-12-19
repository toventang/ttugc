package com.p2082ss.android.ugc.aweme.request_combine.common;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.request_combine.common.a */
public final /* synthetic */ class CallableC67126a implements Callable {

    /* renamed from: a */
    private final ServerPortraitCollections f150539a;

    static {
        Covode.recordClassIndex(78716);
    }

    CallableC67126a(ServerPortraitCollections serverPortraitCollections) {
        this.f150539a = serverPortraitCollections;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f150539a.mo105957c();
    }
}
