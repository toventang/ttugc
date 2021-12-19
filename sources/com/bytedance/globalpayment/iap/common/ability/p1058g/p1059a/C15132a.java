package com.bytedance.globalpayment.iap.common.ability.p1058g.p1059a;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.C15126d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.p1052a.EnumC15121a;
import com.bytedance.globalpayment.iap.common.ability.p1053b.C15123a;
import com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15150a;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.iap.common.ability.g.a.a */
public final class C15132a extends C15123a implements AbstractC15150a {
    static {
        Covode.recordClassIndex(17300);
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15150a
    /* renamed from: a */
    public final void mo24399a(OrderData orderData, C15126d dVar, EnumC15121a aVar) {
        JSONObject a = mo24386a(mo24385a(orderData), dVar);
        if (aVar != null) {
            add(a, "cur_pay_state", aVar.name());
        } else {
            add(a, "cur_pay_state", "unknown");
        }
        m27802a("pipo_pay_end", a);
    }
}
