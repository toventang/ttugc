package com.bytedance.globalpayment;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.payment.common.lib.p1072b.C15240a;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import com.bytedance.globalpayment.service.manager.iap.IapService;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.b */
public final class C15105b implements AbstractC15106c {
    static {
        Covode.recordClassIndex(17273);
    }

    @Override // com.bytedance.globalpayment.AbstractC15106c
    /* renamed from: a */
    public final IapService mo24361a() {
        return PaymentServiceManager.get().getIapExternalService();
    }

    @Override // com.bytedance.globalpayment.AbstractC15106c
    /* renamed from: a */
    public final void mo24363a(JSONObject jSONObject) {
        C15253a.m28071a().mo24708h().mo24734a(jSONObject);
    }

    @Override // com.bytedance.globalpayment.AbstractC15106c
    /* renamed from: a */
    public final void mo24362a(C15240a aVar) {
        C15253a.m28071a().mo24709i().mo24711a(aVar);
        C15253a.m28071a().mo24702b();
        PaymentServiceManager.get().getIapExternalService().init();
        PaymentServiceManager.get().getECommerceExternalService().init();
        PaymentServiceManager.get().getFeAbilityExternalService().init();
    }
}
