package com.p2082ss.android.ugc.aweme.detail.p2749h;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.detail.h.r */
public final /* synthetic */ class RunnableC41210r implements Runnable {

    /* renamed from: a */
    private final C41178b f96308a;

    /* renamed from: b */
    private final Aweme f96309b;

    /* renamed from: c */
    private final int f96310c;

    static {
        Covode.recordClassIndex(49093);
    }

    RunnableC41210r(C41178b bVar, Aweme aweme, int i) {
        this.f96308a = bVar;
        this.f96309b = aweme;
        this.f96310c = i;
    }

    public final void run() {
        this.f96308a.mo70468a(this.f96309b, this.f96310c + 1);
    }
}
