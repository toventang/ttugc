package com.bytedance.android.live.liveinteract.multiguest.p333g.p336c;

import com.bytedance.android.live.liveinteract.multiguest.p333g.p335b.C5235a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.c.f */
public final /* synthetic */ class RunnableC5269f implements Runnable {

    /* renamed from: a */
    private final C5259b f13627a;

    /* renamed from: b */
    private final C5235a f13628b;

    static {
        Covode.recordClassIndex(5861);
    }

    RunnableC5269f(C5259b bVar, C5235a aVar) {
        this.f13627a = bVar;
        this.f13628b = aVar;
    }

    public final void run() {
        MethodCollector.m26663i(6262);
        C5259b bVar = this.f13627a;
        bVar.f13590b.removeView(this.f13628b);
        MethodCollector.m26664o(6262);
    }
}
