package com.p2082ss.android.ugc.aweme.main;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.main.s */
public final /* synthetic */ class RunnableC59132s implements Runnable {

    /* renamed from: a */
    private final Handler f134559a;

    /* renamed from: b */
    private final Message f134560b;

    static {
        Covode.recordClassIndex(69486);
    }

    RunnableC59132s(Handler handler, Message message) {
        this.f134559a = handler;
        this.f134560b = message;
    }

    public final void run() {
        this.f134559a.handleMessage(this.f134560b);
    }
}
