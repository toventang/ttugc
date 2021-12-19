package com.bytedance.globalpayment.iap.common.ability.p1058g.p1059a;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.C15126d;
import java.util.List;

/* renamed from: com.bytedance.globalpayment.iap.common.ability.g.a.l */
final /* synthetic */ class RunnableC15148l implements Runnable {

    /* renamed from: a */
    private final C15140e f36981a;

    /* renamed from: b */
    private final C15126d f36982b;

    /* renamed from: c */
    private final boolean f36983c;

    /* renamed from: d */
    private final List f36984d;

    static {
        Covode.recordClassIndex(17316);
    }

    RunnableC15148l(C15140e eVar, C15126d dVar, boolean z, List list) {
        this.f36981a = eVar;
        this.f36982b = dVar;
        this.f36983c = z;
        this.f36984d = list;
    }

    public final void run() {
        this.f36981a.mo24413a(this.f36984d);
    }
}
