package com.bytedance.globalpayment.iap.state.pre;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.C15124c;
import com.bytedance.globalpayment.iap.common.ability.C15126d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.CreateOrderResponseEntity;
import com.bytedance.globalpayment.iap.common.ability.p1052a.EnumC15121a;
import com.bytedance.globalpayment.iap.common.ability.p1057f.AbstractC15131a;
import com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15153d;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.p1051c.C15117b;
import com.bytedance.globalpayment.iap.p1062d.C15162b;
import com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15235a;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;

/* renamed from: com.bytedance.globalpayment.iap.state.pre.a */
public class C15229a extends AbstractC15131a {

    /* renamed from: c */
    private final String f37161c = C15229a.class.getSimpleName();

    static {
        Covode.recordClassIndex(17429);
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1057f.AbstractC15131a
    /* renamed from: a */
    public final EnumC15121a mo24396a() {
        return EnumC15121a.PreregisterCreateOrder;
    }

    /* renamed from: com.bytedance.globalpayment.iap.state.pre.a$a */
    class C15230a implements AbstractC15235a<CreateOrderResponseEntity> {

        /* renamed from: b */
        private C15117b f37163b;

        static {
            Covode.recordClassIndex(17430);
        }

        @Override // com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15235a
        /* renamed from: a */
        public final void mo24359a(AbsResult absResult) {
            this.f37163b.mo24376a(false, absResult);
            C15229a.this.mo24397a(C15126d.m27810a(absResult));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15235a
        /* renamed from: a */
        public final /* synthetic */ void mo24360a(CreateOrderResponseEntity createOrderResponseEntity) {
            this.f37163b.mo24376a(true, null);
            C15229a aVar = C15229a.this;
            AbstractC15131a nextState = PaymentServiceManager.get().getIapExternalService().getNextState(aVar);
            if (nextState != null) {
                nextState.mo24398a(aVar.f36941a);
            }
        }

        public C15230a(C15117b bVar) {
            this.f37163b = bVar;
        }
    }

    public C15229a(AbstractC15153d dVar) {
        super(dVar);
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1057f.AbstractC15131a
    /* renamed from: a */
    public final void mo24398a(OrderData orderData) {
        super.mo24398a(orderData);
        if (!orderData.isCanceled() && !orderData.isFinished()) {
            orderData.execute();
            C15124c iapPayRequest = orderData.getIapPayRequest();
            C15253a.m28071a().mo24705e();
            orderData.getProductId();
            C15117b bVar = new C15117b(orderData.getProductId(), orderData.getOrderId(), iapPayRequest.f36922g, orderData.getPayType(), orderData.getStartPayTimeStamp(), orderData);
            bVar.mo24375a();
            C15162b.m27903d().mo24493b().mo24401a(iapPayRequest, orderData, new C15230a(bVar));
        }
    }
}
