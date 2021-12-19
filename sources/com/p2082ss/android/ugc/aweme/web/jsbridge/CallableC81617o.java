package com.p2082ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.o */
final /* synthetic */ class CallableC81617o implements Callable {

    /* renamed from: a */
    private final FeedbackUploadALog f182509a;

    static {
        Covode.recordClassIndex(95014);
    }

    CallableC81617o(FeedbackUploadALog feedbackUploadALog) {
        this.f182509a = feedbackUploadALog;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f182509a.mo79916c();
    }
}
