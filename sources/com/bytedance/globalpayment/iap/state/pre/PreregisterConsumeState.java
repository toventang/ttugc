package com.bytedance.globalpayment.iap.state.pre;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.C15126d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.p1052a.EnumC15121a;
import com.bytedance.globalpayment.iap.common.ability.p1057f.AbstractC15131a;
import com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15153d;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.p1051c.C15116a;
import com.bytedance.globalpayment.iap.p1062d.C15162b;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener;

public class PreregisterConsumeState extends AbstractC15131a {

    /* renamed from: c */
    public final String f37160c = PreregisterConsumeState.class.getCanonicalName();

    static {
        Covode.recordClassIndex(17427);
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1057f.AbstractC15131a
    /* renamed from: a */
    public final EnumC15121a mo24396a() {
        return EnumC15121a.PreregisterConsume;
    }

    public PreregisterConsumeState(AbstractC15153d dVar) {
        super(dVar);
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1057f.AbstractC15131a
    /* renamed from: a */
    public final void mo24398a(OrderData orderData) {
        AbsIapChannelOrderData absIapChannelOrderData;
        super.mo24398a(orderData);
        if (!orderData.isCanceled() && !orderData.isFinished() && (absIapChannelOrderData = orderData.getAbsIapChannelOrderData()) != null) {
            C15253a.m28071a().mo24705e();
            orderData.getProductId();
            C15116a aVar = new C15116a(orderData.getProductId(), orderData.getOrderId(), orderData.getPayType(), orderData.getIapPayRequest().f36922g, this.f36941a);
            aVar.mo24373a();
            C15162b.m27903d().mo24494c().mo24501a(orderData.getIapPaymentMethod(), orderData.getIapPayRequest().f36922g, absIapChannelOrderData.getChannelToken(), new ChannelPayConsumeFinishedListener(aVar));
        }
    }

    class ChannelPayConsumeFinishedListener implements ConsumeIapProductListener {
        private C15116a mConsumeProductMonitor;

        static {
            Covode.recordClassIndex(17428);
        }

        @Override // com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener
        public void onConsumeFinished(AbsResult absResult) {
            int code = absResult.getCode();
            if (code == 0) {
                C15253a.m28071a().mo24705e();
                PreregisterConsumeState.this.f36941a.getOrderId();
                this.mConsumeProductMonitor.mo24374a(true, null);
                PaymentServiceManager.get().getGoogleIapExternalService().getPayloadPreferencesService().removePayload(C15253a.m28071a().mo24709i().mo24713b(), PreregisterConsumeState.this.f36941a.getOrderId());
                PreregisterConsumeState.this.f36941a.setConsumed(true);
                if (PreregisterConsumeState.this.f36941a.isSuccess() && !PreregisterConsumeState.this.f36941a.isFinished()) {
                    PreregisterConsumeState.this.mo24397a(new C15126d(0, 0, "pay success in ChannelPayConsumeFinishedListener"));
                    return;
                }
                return;
            }
            C15253a.m28071a().mo24705e();
            C15126d dVar = new C15126d(207, code, "preRegisterawards google consume product fail, " + absResult.getMessage());
            this.mConsumeProductMonitor.mo24374a(false, dVar);
            PreregisterConsumeState.this.mo24397a(dVar);
        }

        public ChannelPayConsumeFinishedListener(C15116a aVar) {
            this.mConsumeProductMonitor = aVar;
        }
    }
}
