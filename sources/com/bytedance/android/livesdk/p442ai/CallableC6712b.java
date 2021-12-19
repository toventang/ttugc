package com.bytedance.android.livesdk.p442ai;

import com.bytedance.android.live.core.p218f.C3927c;
import com.bytedance.android.livesdk.p425aa.C6552h;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* renamed from: com.bytedance.android.livesdk.ai.b */
final /* synthetic */ class CallableC6712b implements Callable {

    /* renamed from: a */
    private final C6705a f16645a;

    static {
        Covode.recordClassIndex(7450);
    }

    CallableC6712b(C6705a aVar) {
        this.f16645a = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C6552h.m14010a().mo12688a(new RunnableC6714c(this.f16645a, C3927c.m9566a()));
        return null;
    }
}
