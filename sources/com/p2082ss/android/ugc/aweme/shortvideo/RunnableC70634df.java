package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.df */
public final /* synthetic */ class RunnableC70634df implements Runnable {

    /* renamed from: a */
    private final SafeHandler f158096a;

    static {
        Covode.recordClassIndex(83100);
    }

    RunnableC70634df(SafeHandler safeHandler) {
        this.f158096a = safeHandler;
    }

    public final void run() {
        SafeHandler safeHandler = this.f158096a;
        if (safeHandler.f155738a != null) {
            safeHandler.f155738a.getLifecycle().mo4013b(safeHandler);
        }
    }
}
