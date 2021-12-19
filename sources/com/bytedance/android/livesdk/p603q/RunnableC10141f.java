package com.bytedance.android.livesdk.p603q;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.q.f */
final /* synthetic */ class RunnableC10141f implements Runnable {

    /* renamed from: a */
    private final C10136a f24599a;

    static {
        Covode.recordClassIndex(11704);
    }

    RunnableC10141f(C10136a aVar) {
        this.f24599a = aVar;
    }

    public final void run() {
        C10136a aVar = this.f24599a;
        aVar.f24586b.setVisibility(8);
        if (aVar.f24587c && aVar.f24588d != null) {
            aVar.f24588d.setVisibility(0);
        }
    }
}
