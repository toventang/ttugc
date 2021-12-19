package com.bytedance.globalpayment.iap.common.ability.p1058g.p1059a;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.C15126d;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;

/* renamed from: com.bytedance.globalpayment.iap.common.ability.g.a.f */
final /* synthetic */ class RunnableC15142f implements Runnable {

    /* renamed from: a */
    private final C15140e f36962a;

    /* renamed from: b */
    private final IapPaymentMethod f36963b;

    /* renamed from: c */
    private final C15126d f36964c;

    static {
        Covode.recordClassIndex(17310);
    }

    RunnableC15142f(C15140e eVar, IapPaymentMethod iapPaymentMethod, C15126d dVar) {
        this.f36962a = eVar;
        this.f36963b = iapPaymentMethod;
        this.f36964c = dVar;
    }

    public final void run() {
        this.f36962a.mo24418b(this.f36963b, this.f36964c);
    }
}
