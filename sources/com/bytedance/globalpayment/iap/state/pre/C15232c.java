package com.bytedance.globalpayment.iap.state.pre;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.C15124c;
import com.bytedance.globalpayment.iap.common.ability.C15126d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.ResponseEntity;
import com.bytedance.globalpayment.iap.common.ability.p1052a.EnumC15121a;
import com.bytedance.globalpayment.iap.common.ability.p1057f.AbstractC15131a;
import com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15153d;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.TokenInfo;
import com.bytedance.globalpayment.iap.p1050b.C15113b;
import com.bytedance.globalpayment.iap.p1051c.C15119d;
import com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15235a;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;

/* renamed from: com.bytedance.globalpayment.iap.state.pre.c */
public class C15232c extends AbstractC15131a {

    /* renamed from: c */
    private final String f37165c = C15232c.class.getSimpleName();

    static {
        Covode.recordClassIndex(17432);
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1057f.AbstractC15131a
    /* renamed from: a */
    public final EnumC15121a mo24396a() {
        return EnumC15121a.PreregisterUploadToken;
    }

    public C15232c(AbstractC15153d dVar) {
        super(dVar);
    }

    /* renamed from: com.bytedance.globalpayment.iap.state.pre.c$a */
    class C15233a implements AbstractC15235a<ResponseEntity> {

        /* renamed from: a */
        C15119d f37166a;

        static {
            Covode.recordClassIndex(17433);
        }

        @Override // com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15235a
        /* renamed from: a */
        public final void mo24359a(AbsResult absResult) {
            this.f37166a.mo24380a(false, C15126d.m27810a(absResult));
            C15232c.this.mo24397a(C15126d.m27810a(absResult));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15235a
        /* renamed from: a */
        public final /* synthetic */ void mo24360a(ResponseEntity responseEntity) {
            this.f37166a.mo24380a(true, null);
            C15232c cVar = C15232c.this;
            AbstractC15131a nextState = PaymentServiceManager.get().getIapExternalService().getNextState(cVar);
            if (nextState != null) {
                nextState.mo24398a(cVar.f36941a);
            }
        }

        public C15233a(C15119d dVar) {
            this.f37166a = dVar;
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1057f.AbstractC15131a
    /* renamed from: a */
    public final void mo24398a(OrderData orderData) {
        super.mo24398a(orderData);
        if (!orderData.isCanceled() && !orderData.isFinished()) {
            C15124c iapPayRequest = orderData.getIapPayRequest();
            TokenInfo tokenInfo = new TokenInfo();
            tokenInfo.setOrderId(orderData.getOrderId()).setProductId(orderData.getProductId()).setUserId(orderData.getUserId()).setChannelUserId(orderData.getChannelUserId()).setPaymentMethod(orderData.getIapPaymentMethod().channelName).setSubscription(iapPayRequest.f36922g).setNewSubscription(orderData.isNewSubscription());
            AbsIapChannelOrderData absIapChannelOrderData = orderData.getAbsIapChannelOrderData();
            if (absIapChannelOrderData != null) {
                tokenInfo.setToken(absIapChannelOrderData.getSelfToken()).setChannelOrderId(absIapChannelOrderData.getChannelOrderId());
            }
            C15253a.m28071a().mo24705e();
            orderData.getProductId();
            C15119d dVar = new C15119d(orderData.getProductId(), orderData.getOrderId(), tokenInfo.isSubscription(), orderData.getPayType(), orderData);
            dVar.mo24379a();
            new C15113b(iapPayRequest.f36917b, orderData.getHost(), tokenInfo).mo24371a(new C15233a(dVar));
        }
    }
}
