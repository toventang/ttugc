package com.bytedance.globalpayment.iap.common.ability.p1058g.p1059a;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.C15126d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;

/* renamed from: com.bytedance.globalpayment.iap.common.ability.g.a.g */
final /* synthetic */ class RunnableC15143g implements Runnable {

    /* renamed from: a */
    private final C15140e f36965a;

    /* renamed from: b */
    private final C15126d f36966b;

    /* renamed from: c */
    private final OrderInfo f36967c;

    static {
        Covode.recordClassIndex(17311);
    }

    RunnableC15143g(C15140e eVar, C15126d dVar, OrderInfo orderInfo) {
        this.f36965a = eVar;
        this.f36966b = dVar;
        this.f36967c = orderInfo;
    }

    public final void run() {
        this.f36965a.mo24416b(this.f36966b, this.f36967c);
    }
}
