package com.p2082ss.android.ugc.aweme.feed.p2969u;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.u.e */
final /* synthetic */ class CallableC49969e implements Callable {

    /* renamed from: a */
    private final C49968d f115253a;

    static {
        Covode.recordClassIndex(59081);
    }

    CallableC49969e(C49968d dVar) {
        this.f115253a = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MethodCollector.m26663i(5059);
        C49968d dVar = this.f115253a;
        dVar.getItems().size();
        if (dVar.getItems() != null && dVar.f115246d.f116591a + 1 < dVar.getItems().size()) {
            dVar.getItems().subList(0, dVar.f115246d.f116591a + 1).clear();
            dVar.f115246d.f116591a = 0;
            if (dVar.f115246d.f116592b) {
                dVar.f115246d.f116592b = false;
            }
        }
        dVar.getItems().size();
        Thread.sleep(400);
        Object obj = dVar.mData;
        MethodCollector.m26664o(5059);
        return obj;
    }
}
