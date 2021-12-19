package com.p2082ss.android.ugc.aweme.shortvideo.upload;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.p */
public final class C73915p {

    /* renamed from: a */
    public HandlerThread f165942a;

    /* renamed from: b */
    private Handler f165943b = new Handler(this.f165942a.getLooper());

    static {
        Covode.recordClassIndex(86661);
    }

    public C73915p() {
        HandlerThread handlerThread = new HandlerThread("PublishCommandExecutor");
        this.f165942a = handlerThread;
        handlerThread.start();
    }

    /* renamed from: a */
    public final void mo116361a(AbstractC73912m mVar) {
        if (this.f165942a.isAlive()) {
            this.f165943b.post(new RunnableC73916q(mVar));
            return;
        }
        throw new InterruptedException("PublishCommandExecutor has quit");
    }
}
