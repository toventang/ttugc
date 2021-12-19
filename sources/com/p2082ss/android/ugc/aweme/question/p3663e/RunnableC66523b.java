package com.p2082ss.android.ugc.aweme.question.p3663e;

import android.os.Message;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.question.e.b */
public final /* synthetic */ class RunnableC66523b implements Runnable {

    /* renamed from: a */
    private final C66520a f149581a;

    /* renamed from: b */
    private final Message f149582b;

    static {
        Covode.recordClassIndex(78066);
    }

    RunnableC66523b(C66520a aVar, Message message) {
        this.f149581a = aVar;
        this.f149582b = message;
    }

    public final void run() {
        this.f149581a.handleMsg(this.f149582b);
    }
}
