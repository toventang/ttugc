package com.bytedance.globalpayment.iap.state.nomal;

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

/* renamed from: com.bytedance.globalpayment.iap.state.nomal.a */
public class C15224a extends AbstractC15131a {

    /* renamed from: c */
    private final String f37153c = C15224a.class.getCanonicalName();

    static {
        Covode.recordClassIndex(17422);
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1057f.AbstractC15131a
    /* renamed from: a */
    public final EnumC15121a mo24396a() {
        return EnumC15121a.CreateOrder;
    }

    public C15224a(AbstractC15153d dVar) {
        super(dVar);
    }

    /* renamed from: com.bytedance.globalpayment.iap.state.nomal.a$a */
    class C15225a implements AbstractC15235a<CreateOrderResponseEntity> {

        /* renamed from: b */
        private C15117b f37155b;

        static {
            Covode.recordClassIndex(17423);
        }

        @Override // com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15235a
        /* renamed from: a */
        public final void mo24359a(AbsResult absResult) {
            this.f37155b.mo24376a(false, absResult);
            if (absResult instanceof C15126d) {
                C15224a.this.mo24397a((C15126d) absResult);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15235a
        /* renamed from: a */
        public final /* synthetic */ void mo24360a(CreateOrderResponseEntity createOrderResponseEntity) {
            this.f37155b.mo24376a(true, null);
            C15224a aVar = C15224a.this;
            AbstractC15131a nextState = PaymentServiceManager.get().getIapExternalService().getNextState(aVar);
            if (nextState != null) {
                nextState.mo24398a(aVar.f36941a);
            }
        }

        public C15225a(C15117b bVar) {
            this.f37155b = bVar;
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1057f.AbstractC15131a
    /* renamed from: a */
    public final void mo24398a(OrderData orderData) {
        super.mo24398a(orderData);
        if (orderData.isCanceled() || orderData.isFinished()) {
            orderData.isCanceled();
            orderData.isConsumed();
            orderData.getProductId();
            C15253a.m28071a().mo24705e();
            return;
        }
        orderData.execute();
        C15124c iapPayRequest = orderData.getIapPayRequest();
        C15117b bVar = new C15117b(orderData.getProductId(), orderData.getOrderId(), iapPayRequest.f36922g, orderData.getPayType(), orderData.getStartPayTimeStamp(), this.f36941a);
        bVar.mo24375a();
        C15162b.m27903d().mo24493b().mo24401a(iapPayRequest, orderData, new C15225a(bVar));
    }
}
