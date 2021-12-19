package com.bytedance.globalpayment.iap.state.extra;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.C15124c;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.p1052a.EnumC15121a;
import com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15153d;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.iap.p1050b.C15109a;
import com.bytedance.globalpayment.iap.p1051c.C15118c;
import com.bytedance.globalpayment.iap.state.AbstractC15218a;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;

/* renamed from: com.bytedance.globalpayment.iap.state.extra.a */
public class C15221a extends AbstractC15218a {

    /* renamed from: h */
    private final String f37148h = C15221a.class.getCanonicalName();

    static {
        Covode.recordClassIndex(17417);
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1057f.AbstractC15131a
    /* renamed from: a */
    public final EnumC15121a mo24396a() {
        return EnumC15121a.ExtraQueryOrder;
    }

    public C15221a(AbstractC15153d dVar) {
        super(dVar);
        this.f37138d = 8;
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1057f.AbstractC15131a
    /* renamed from: a */
    public final void mo24398a(OrderData orderData) {
        super.mo24398a(orderData);
        if (!orderData.isCanceled() && !orderData.isFinished()) {
            String orderId = orderData.getOrderId();
            C15124c iapPayRequest = orderData.getIapPayRequest();
            String productId = orderData.getProductId();
            String str = iapPayRequest.f36917b;
            Context b = C15253a.m28071a().mo24709i().mo24713b();
            if (b != null) {
                PaymentServiceManager.get().getGoogleIapExternalService().getPayloadPreferencesService().addQueryOrderParam(b, productId, orderId, str, orderData.getUserId(), iapPayRequest.f36922g, iapPayRequest.f36924i, orderData.isNewSubscription());
            }
            C15253a.m28071a().mo24705e();
            orderData.getProductId();
            IapPaymentMethod iapPaymentMethod = orderData.getIapPaymentMethod();
            int i = this.f37138d;
            String userId = orderData.getUserId();
            boolean z = iapPayRequest.f36922g;
            this.f36941a.getPayType();
            this.f37139e = new C15109a(iapPaymentMethod, productId, orderId, str, i, userId, z, orderData.getHost(), orderData.isNewSubscription());
            C15118c cVar = new C15118c(productId, orderId, orderData.getIapPayRequest().f36922g, orderData.getPayType(), orderData);
            cVar.mo24377a();
            this.f37139e.mo24368a(this.f37140f, new AbstractC15218a.C15219a(cVar, this.f37140f));
        }
    }
}
