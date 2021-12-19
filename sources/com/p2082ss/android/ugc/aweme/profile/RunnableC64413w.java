package com.p2082ss.android.ugc.aweme.profile;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.w */
public final /* synthetic */ class RunnableC64413w implements Runnable {

    /* renamed from: a */
    private final C63810k f146026a;

    /* renamed from: b */
    private final Aweme f146027b;

    static {
        Covode.recordClassIndex(75873);
    }

    RunnableC64413w(C63810k kVar, Aweme aweme) {
        this.f146026a = kVar;
        this.f146027b = aweme;
    }

    public final void run() {
        C63810k kVar = this.f146026a;
        kVar.f144634a.mo103749a(this.f146027b);
        kVar.f144634a.mo103755a(true);
    }
}
