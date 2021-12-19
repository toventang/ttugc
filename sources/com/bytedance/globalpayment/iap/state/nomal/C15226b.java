package com.bytedance.globalpayment.iap.state.nomal;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.C15124c;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.p1052a.EnumC15121a;
import com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15153d;
import com.bytedance.globalpayment.iap.p1050b.C15109a;
import com.bytedance.globalpayment.iap.p1051c.C15118c;
import com.bytedance.globalpayment.iap.state.AbstractC15218a;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;

/* renamed from: com.bytedance.globalpayment.iap.state.nomal.b */
public class C15226b extends AbstractC15218a {

    /* renamed from: h */
    private final String f37156h = C15226b.class.getCanonicalName();

    static {
        Covode.recordClassIndex(17424);
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1057f.AbstractC15131a
    /* renamed from: a */
    public final EnumC15121a mo24396a() {
        return EnumC15121a.QueryOrder;
    }

    public C15226b(AbstractC15153d dVar) {
        super(dVar);
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
            C15253a.m28071a().mo24705e();
            orderData.getProductId();
            Context b = C15253a.m28071a().mo24709i().mo24713b();
            if (b != null) {
                PaymentServiceManager.get().getGoogleIapExternalService().getPayloadPreferencesService().addQueryOrderParam(b, productId, orderId, str, orderData.getUserId(), orderData.getAbsIapChannelOrderData().isSubscription(), orderData.getAbsIapChannelOrderData().getExtraPayload(), orderData.getAbsIapChannelOrderData().isNewSubscription());
            }
            this.f37139e = new C15109a(orderData.getIapPaymentMethod(), productId, orderId, str, orderData.getUserId(), orderData.getAbsIapChannelOrderData().isSubscription(), orderData.getHost(), orderData.getAbsIapChannelOrderData().isNewSubscription());
            C15118c cVar = new C15118c(productId, orderId, orderData.getIapPayRequest().f36922g, orderData.getPayType(), orderData);
            cVar.mo24377a();
            this.f37139e.mo24368a(this.f37140f, new AbstractC15218a.C15219a(cVar, this.f37140f));
        }
    }
}
