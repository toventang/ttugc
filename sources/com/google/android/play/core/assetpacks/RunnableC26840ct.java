package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.tasks.AbstractC27062d;
import java.util.HashMap;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.ct */
public final /* synthetic */ class RunnableC26840ct implements Runnable {

    /* renamed from: a */
    private final C26843cw f63680a;

    static {
        Covode.recordClassIndex(32315);
    }

    RunnableC26840ct(C26843cw cwVar) {
        this.f63680a = cwVar;
    }

    public final void run() {
        C26843cw cwVar = this.f63680a;
        AbstractC26857dj a = cwVar.f63685c.mo44603a();
        C26769ac acVar = cwVar.f63684b;
        HashMap hashMap = new HashMap();
        for (String str : acVar.mo44444a().keySet()) {
            hashMap.put(str, Long.valueOf(acVar.mo44449c(str)));
        }
        AbstractC27062d<List<String>> a2 = a.mo44502a(hashMap);
        C26769ac acVar2 = cwVar.f63684b;
        acVar2.getClass();
        a2.mo44772a(cwVar.f63686d.mo44603a(), new C26841cu(acVar2));
        a2.mo44771a(cwVar.f63686d.mo44603a(), C26842cv.f63682a);
    }
}
