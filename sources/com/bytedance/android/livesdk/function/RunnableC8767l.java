package com.bytedance.android.livesdk.function;

import com.bytedance.android.livesdk.chatroom.p481b.EnumC7303c;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.function.l */
final /* synthetic */ class RunnableC8767l implements Runnable {

    /* renamed from: a */
    private final EnumC7303c f21625a;

    static {
        Covode.recordClassIndex(9644);
    }

    RunnableC8767l(EnumC7303c cVar) {
        this.f21625a = cVar;
    }

    public final void run() {
        this.f21625a.onMessageFinish();
    }
}
