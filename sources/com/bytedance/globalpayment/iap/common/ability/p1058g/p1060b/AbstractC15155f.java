package com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.C15126d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.iap.common.ability.p1054c.AbstractC15125a;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.IapChannelUserData;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import java.util.List;

/* renamed from: com.bytedance.globalpayment.iap.common.ability.g.b.f */
public interface AbstractC15155f {
    static {
        Covode.recordClassIndex(17323);
    }

    /* renamed from: a */
    void mo24405a(AbstractC15125a aVar);

    /* renamed from: a */
    void mo24406a(C15126d dVar, OrderInfo orderInfo);

    /* renamed from: a */
    void mo24407a(C15126d dVar, IapChannelUserData iapChannelUserData);

    /* renamed from: a */
    void mo24409a(C15126d dVar, boolean z, List<AbsIapProduct> list);

    /* renamed from: a */
    void mo24410a(OrderInfo orderInfo);

    /* renamed from: a */
    void mo24411a(IapPaymentMethod iapPaymentMethod, C15126d dVar);

    /* renamed from: a */
    void mo24412a(IapPaymentMethod iapPaymentMethod, C15126d dVar, List<AbsIapProduct> list);

    /* renamed from: b */
    void mo24415b(AbstractC15125a aVar);

    /* renamed from: b */
    void mo24417b(C15126d dVar, List<AbsIapProduct> list);

    /* renamed from: b */
    void mo24419b(IapPaymentMethod iapPaymentMethod, C15126d dVar, List<String> list);
}
