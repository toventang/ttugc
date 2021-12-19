package com.p2082ss.android.ugc.aweme.challenge.p2451g;

import android.os.Message;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.challenge.g.b */
public final /* synthetic */ class RunnableC35523b implements Runnable {

    /* renamed from: a */
    private final C35520a f83786a;

    /* renamed from: b */
    private final Message f83787b;

    static {
        Covode.recordClassIndex(42719);
    }

    RunnableC35523b(C35520a aVar, Message message) {
        this.f83786a = aVar;
        this.f83787b = message;
    }

    public final void run() {
        this.f83786a.handleMsg(this.f83787b);
    }
}
