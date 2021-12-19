package com.bytedance.android.livesdk.p442ai;

import com.bytedance.android.live.core.p218f.C3964w;
import com.bytedance.android.livesdk.p425aa.C6552h;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* renamed from: com.bytedance.android.livesdk.ai.q */
final /* synthetic */ class CallableC6747q implements Callable {

    /* renamed from: a */
    private final C6741n f16752a;

    static {
        Covode.recordClassIndex(7485);
    }

    CallableC6747q(C6741n nVar) {
        this.f16752a = nVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C6552h.m14010a().mo12688a(new RunnableC6748r(this.f16752a, ((float) C3964w.m9651a()) / 1024.0f));
        return null;
    }
}
