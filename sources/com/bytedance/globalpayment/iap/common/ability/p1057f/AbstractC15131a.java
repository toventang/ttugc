package com.bytedance.globalpayment.iap.common.ability.p1057f;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.C15122b;
import com.bytedance.globalpayment.iap.common.ability.C15126d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import com.bytedance.globalpayment.iap.common.ability.p1052a.EnumC15121a;
import com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15153d;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;

/* renamed from: com.bytedance.globalpayment.iap.common.ability.f.a */
public abstract class AbstractC15131a {

    /* renamed from: a */
    public OrderData f36941a;

    /* renamed from: b */
    protected AbstractC15153d f36942b;

    /* renamed from: c */
    private final String f36943c = AbstractC15131a.class.getSimpleName();

    static {
        Covode.recordClassIndex(17299);
    }

    /* renamed from: a */
    public abstract EnumC15121a mo24396a();

    /* renamed from: a */
    public void mo24398a(OrderData orderData) {
        this.f36941a = orderData;
    }

    public AbstractC15131a(AbstractC15153d dVar) {
        this.f36942b = dVar;
    }

    /* renamed from: a */
    public final void mo24397a(C15126d dVar) {
        String str;
        this.f36941a.finish();
        if (dVar.f36930c == PayType.UNKNOWN) {
            dVar.f36930c = this.f36941a.getPayType();
        }
        this.f36941a.getIapPayMonitor().mo24395a(dVar, mo24396a());
        C15122b.m27797e().mo24383c().mo24399a(this.f36941a, dVar, mo24396a());
        OrderInfo buildOrderInfo = this.f36941a.buildOrderInfo();
        C15253a.m28071a().mo24705e().mo24723a("notifyPayCallback. %s, %s", dVar, buildOrderInfo);
        if (this.f36941a.getIapPayRequest() == null) {
            str = "";
        } else {
            str = this.f36941a.getIapPayRequest().f36924i;
        }
        dVar.f36928a = str;
        dVar.f36929b = this.f36941a.getIapPayRequest();
        dVar.f36930c = this.f36941a.getPayType();
        if (this.f36941a.getPayType() == PayType.PRE && dVar.getCode() == 0) {
            this.f36942b.removeAcquireRewards(this.f36941a.getProductId());
        }
        C15122b.m27797e().mo24381a().mo24406a(dVar, buildOrderInfo);
        this.f36942b.onIapOrderFinished(this.f36941a);
    }
}
