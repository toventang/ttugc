package com.p2082ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.o */
public final /* synthetic */ class CallableC38759o implements Callable {

    /* renamed from: a */
    private final Aweme f91531a;

    static {
        Covode.recordClassIndex(46300);
    }

    CallableC38759o(Aweme aweme) {
        this.f91531a = aweme;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return AbstractC38757n.m78626a(this.f91531a);
    }
}
