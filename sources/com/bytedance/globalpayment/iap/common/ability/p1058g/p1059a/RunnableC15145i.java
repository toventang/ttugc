package com.bytedance.globalpayment.iap.common.ability.p1058g.p1059a;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.C15126d;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import java.util.List;

/* renamed from: com.bytedance.globalpayment.iap.common.ability.g.a.i */
final /* synthetic */ class RunnableC15145i implements Runnable {

    /* renamed from: a */
    private final C15140e f36970a;

    /* renamed from: b */
    private final IapPaymentMethod f36971b;

    /* renamed from: c */
    private final C15126d f36972c;

    /* renamed from: d */
    private final List f36973d;

    static {
        Covode.recordClassIndex(17313);
    }

    RunnableC15145i(C15140e eVar, IapPaymentMethod iapPaymentMethod, C15126d dVar, List list) {
        this.f36970a = eVar;
        this.f36971b = iapPaymentMethod;
        this.f36972c = dVar;
        this.f36973d = list;
    }

    public final void run() {
        this.f36970a.mo24408a(this.f36972c, this.f36973d);
    }
}
