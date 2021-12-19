package com.bytedance.globalpayment.iap.common.ability.p1058g.p1059a;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.C15126d;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import java.util.List;

/* renamed from: com.bytedance.globalpayment.iap.common.ability.g.a.k */
final /* synthetic */ class RunnableC15147k implements Runnable {

    /* renamed from: a */
    private final C15140e f36977a;

    /* renamed from: b */
    private final IapPaymentMethod f36978b;

    /* renamed from: c */
    private final C15126d f36979c;

    /* renamed from: d */
    private final List f36980d;

    static {
        Covode.recordClassIndex(17315);
    }

    RunnableC15147k(C15140e eVar, IapPaymentMethod iapPaymentMethod, C15126d dVar, List list) {
        this.f36977a = eVar;
        this.f36978b = iapPaymentMethod;
        this.f36979c = dVar;
        this.f36980d = list;
    }

    public final void run() {
        this.f36977a.mo24414b();
    }
}
