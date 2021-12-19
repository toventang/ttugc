package com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;

/* renamed from: com.bytedance.globalpayment.iap.common.ability.g.b.d */
public interface AbstractC15153d {
    static {
        Covode.recordClassIndex(17321);
    }

    void onIapOrderFinished(OrderData orderData);

    void removeAcquireRewards(String str);
}
