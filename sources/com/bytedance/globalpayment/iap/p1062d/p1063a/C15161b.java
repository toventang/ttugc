package com.bytedance.globalpayment.iap.p1062d.p1063a;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.C15126d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.p1053b.C15123a;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.p1062d.p1064b.AbstractC15164b;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.iap.d.a.b */
public final class C15161b extends C15123a implements AbstractC15164b {
    static {
        Covode.recordClassIndex(17341);
    }

    @Override // com.bytedance.globalpayment.iap.p1062d.p1064b.AbstractC15164b
    /* renamed from: b */
    public final void mo24506b(OrderData orderData) {
        m27802a("pipo_pay_start", mo24385a(orderData));
    }

    @Override // com.bytedance.globalpayment.iap.p1062d.p1064b.AbstractC15164b
    /* renamed from: a */
    public final void mo24504a(OrderData orderData, C15126d dVar) {
        JSONObject a = mo24386a(mo24385a(orderData), dVar);
        add(a, "cur_pay_state", "unknown");
        m27802a("pipo_pay_end", a);
    }

    @Override // com.bytedance.globalpayment.iap.p1062d.p1064b.AbstractC15164b
    /* renamed from: b */
    public final void mo24507b(OrderData orderData, AbsResult absResult) {
        m27802a("ack_after_query_failed", mo24386a(mo24385a(orderData), C15126d.m27810a(absResult)));
    }

    @Override // com.bytedance.globalpayment.iap.p1062d.p1064b.AbstractC15164b
    /* renamed from: a */
    public final void mo24505a(OrderData orderData, AbsResult absResult) {
        m27802a("remove_invalid_order", mo24386a(mo24385a(orderData), C15126d.m27810a(absResult)));
    }
}
