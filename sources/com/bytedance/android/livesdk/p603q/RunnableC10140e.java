package com.bytedance.android.livesdk.p603q;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: com.bytedance.android.livesdk.q.e */
final /* synthetic */ class RunnableC10140e implements Runnable {

    /* renamed from: a */
    private final C10136a f24597a;

    /* renamed from: b */
    private final DataChannel f24598b;

    static {
        Covode.recordClassIndex(11703);
    }

    RunnableC10140e(C10136a aVar, DataChannel dataChannel) {
        this.f24597a = aVar;
        this.f24598b = dataChannel;
    }

    public final void run() {
        C10136a aVar = this.f24597a;
        aVar.f24585a = new C10148k(aVar, this.f24598b);
    }
}
