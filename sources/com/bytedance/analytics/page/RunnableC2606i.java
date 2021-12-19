package com.bytedance.analytics.page;

import com.bytedance.analytics.C2576a;
import com.bytedance.analytics.p125b.C2593a;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.analytics.page.i */
public final /* synthetic */ class RunnableC2606i implements Runnable {

    /* renamed from: a */
    private final C2576a f7851a;

    static {
        Covode.recordClassIndex(2994);
    }

    RunnableC2606i(C2576a aVar) {
        this.f7851a = aVar;
    }

    public final void run() {
        C2576a aVar = this.f7851a;
        C89219l.m154721d(aVar, "");
        C2603g.m7551a(aVar);
        C2593a.m7539a("pushDelay", "fragmentViewUnshow");
    }
}
