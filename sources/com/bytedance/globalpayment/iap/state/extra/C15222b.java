package com.bytedance.globalpayment.iap.state.extra;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.C15124c;
import com.bytedance.globalpayment.iap.common.ability.C15126d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.ResponseEntity;
import com.bytedance.globalpayment.iap.common.ability.p1052a.EnumC15121a;
import com.bytedance.globalpayment.iap.common.ability.p1057f.AbstractC15131a;
import com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15153d;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.TokenInfo;
import com.bytedance.globalpayment.iap.p1050b.C15113b;
import com.bytedance.globalpayment.iap.p1051c.C15119d;
import com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15235a;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;

/* renamed from: com.bytedance.globalpayment.iap.state.extra.b */
public class C15222b extends AbstractC15131a {

    /* renamed from: c */
    private final String f37149c = C15222b.class.getSimpleName();

    static {
        Covode.recordClassIndex(17418);
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1057f.AbstractC15131a
    /* renamed from: a */
    public final EnumC15121a mo24396a() {
        return EnumC15121a.ExtraUploadToken;
    }

    public C15222b(AbstractC15153d dVar) {
        super(dVar);
    }

    /* renamed from: com.bytedance.globalpayment.iap.state.extra.b$a */
    class C15223a implements AbstractC15235a<ResponseEntity> {

        /* renamed from: a */
        C15119d f37150a;

        static {
            Covode.recordClassIndex(17419);
        }

        @Override // com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15235a
        /* renamed from: a */
        public final void mo24359a(AbsResult absResult) {
            this.f37150a.mo24380a(false, C15126d.m27810a(absResult));
            C15222b.this.mo24397a(C15126d.m27810a(absResult));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15235a
        /* renamed from: a */
        public final /* synthetic */ void mo24360a(ResponseEntity responseEntity) {
            ResponseEntity responseEntity2 = responseEntity;
            this.f37150a.mo24380a(true, null);
            if (TextUtils.isEmpty(C15222b.this.f36941a.getOrderId())) {
                C15222b.this.f36941a.setOrderId(responseEntity2.getOrderId());
            }
            C15222b bVar = C15222b.this;
            AbstractC15131a nextState = PaymentServiceManager.get().getIapExternalService().getNextState(bVar);
            if (nextState != null) {
                nextState.mo24398a(bVar.f36941a);
            }
        }

        public C15223a(C15119d dVar) {
            this.f37150a = dVar;
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1057f.AbstractC15131a
    /* renamed from: a */
    public final void mo24398a(OrderData orderData) {
        super.mo24398a(orderData);
        if (!orderData.isCanceled() && !orderData.isFinished()) {
            orderData.execute();
            C15124c iapPayRequest = orderData.getIapPayRequest();
            TokenInfo tokenInfo = new TokenInfo();
            tokenInfo.setOrderId(orderData.getOrderId()).setProductId(orderData.getProductId()).setUserId(orderData.getUserId()).setSubscription(iapPayRequest.f36922g).setNewSubscription(orderData.isNewSubscription()).setChannelUserId(orderData.getChannelUserId()).setPaymentMethod(orderData.getIapPaymentMethod().channelName).setOrderFromOtherSystem(orderData.isOrderFromOtherSystem());
            AbsIapChannelOrderData absIapChannelOrderData = orderData.getAbsIapChannelOrderData();
            if (absIapChannelOrderData != null) {
                tokenInfo.setToken(absIapChannelOrderData.getSelfToken()).setChannelOrderId(absIapChannelOrderData.getChannelOrderId());
            }
            AbsIapProduct absIapProduct = orderData.getAbsIapProduct();
            if (absIapProduct != null) {
                double priceAmountMicros = (double) absIapProduct.getPriceAmountMicros();
                Double.isNaN(priceAmountMicros);
                tokenInfo.setAmountValue(String.valueOf(priceAmountMicros / 1000000.0d)).setCurrency(absIapProduct.getPriceCurrencyCode());
            }
            C15253a.m28071a().mo24705e();
            orderData.getProductId();
            C15119d dVar = new C15119d(orderData.getProductId(), orderData.getOrderId(), tokenInfo.isSubscription(), orderData.getPayType(), orderData);
            dVar.mo24379a();
            new C15113b(iapPayRequest.f36917b, orderData.getHost(), tokenInfo).mo24371a(new C15223a(dVar));
        }
    }
}
