package com.bytedance.globalpayment.iap.common.ability.p1054c;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.C15126d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import java.util.List;

/* renamed from: com.bytedance.globalpayment.iap.common.ability.c.a */
public interface AbstractC15125a {
    static {
        Covode.recordClassIndex(17293);
    }

    /* renamed from: a */
    void mo12341a(C15126d dVar, OrderInfo orderInfo);

    /* renamed from: a */
    void mo12342a(C15126d dVar, List<AbsIapProduct> list);

    /* renamed from: a */
    void mo12343a(IapPaymentMethod iapPaymentMethod, C15126d dVar);

    /* renamed from: b */
    void mo12345b(C15126d dVar, OrderInfo orderInfo);

    /* renamed from: b */
    void mo12346b(C15126d dVar, List<AbsIapProduct> list);
}
