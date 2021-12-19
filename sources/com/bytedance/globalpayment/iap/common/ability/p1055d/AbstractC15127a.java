package com.bytedance.globalpayment.iap.common.ability.p1055d;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.C15126d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.p1049a.AbstractC15108b;
import java.util.List;

/* renamed from: com.bytedance.globalpayment.iap.common.ability.d.a */
public interface AbstractC15127a extends AbstractC15108b {
    static {
        Covode.recordClassIndex(17295);
    }

    void onCJBillingCallback(OrderData orderData);

    void onPurchasesUpdated(C15126d dVar, List<AbsIapChannelOrderData> list);
}
