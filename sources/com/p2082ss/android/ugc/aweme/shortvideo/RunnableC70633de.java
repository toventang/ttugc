package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.de */
public final /* synthetic */ class RunnableC70633de implements Runnable {

    /* renamed from: a */
    private final SafeHandler f158095a;

    static {
        Covode.recordClassIndex(83099);
    }

    RunnableC70633de(SafeHandler safeHandler) {
        this.f158095a = safeHandler;
    }

    public final void run() {
        SafeHandler safeHandler = this.f158095a;
        if (safeHandler.f155738a != null) {
            safeHandler.f155738a.getLifecycle().mo4012a(safeHandler);
        }
    }
}
