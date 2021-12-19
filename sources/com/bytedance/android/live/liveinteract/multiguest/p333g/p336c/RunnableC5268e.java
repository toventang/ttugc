package com.bytedance.android.live.liveinteract.multiguest.p333g.p336c;

import com.bytedance.android.live.liveinteract.multiguest.p333g.p335b.C5235a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.c.e */
public final /* synthetic */ class RunnableC5268e implements Runnable {

    /* renamed from: a */
    private final C5259b f13625a;

    /* renamed from: b */
    private final C5235a f13626b;

    static {
        Covode.recordClassIndex(5860);
    }

    RunnableC5268e(C5259b bVar, C5235a aVar) {
        this.f13625a = bVar;
        this.f13626b = aVar;
    }

    public final void run() {
        MethodCollector.m26663i(7978);
        C5259b bVar = this.f13625a;
        bVar.f13590b.removeView(this.f13626b);
        MethodCollector.m26664o(7978);
    }
}
