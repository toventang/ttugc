package com.p2082ss.ttvideoengine;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.ttvideoengine.an */
public final /* synthetic */ class RunnableC86345an implements Runnable {

    /* renamed from: a */
    private final C86313ai f193423a;

    static {
        Covode.recordClassIndex(101573);
    }

    RunnableC86345an(C86313ai aiVar) {
        this.f193423a = aiVar;
    }

    public final void run() {
        C86313ai aiVar = this.f193423a;
        if (aiVar.f192923ah != null) {
            long a = aiVar.f192923ah.mo16684a(63, 0L);
            if ((aiVar.f193136f == 1 || (aiVar.f193136f == 0 && a < 0)) && aiVar.f193084e > 0) {
                aiVar.f193186g.postDelayed(aiVar.f193239h, (long) aiVar.f193084e);
            }
        }
    }
}
