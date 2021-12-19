package com.bytedance.globalpayment.iap.p1062d.p1064b;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.p1057f.AbstractC15131a;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.iap.p1049a.AbstractC15107a;
import com.bytedance.globalpayment.iap.p1049a.AbstractC15108b;
import com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15237c;
import com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener;
import java.util.List;

/* renamed from: com.bytedance.globalpayment.iap.d.b.a */
public interface AbstractC15163a {
    static {
        Covode.recordClassIndex(17343);
    }

    /* renamed from: a */
    AbstractC15131a mo24495a(IapPaymentMethod iapPaymentMethod, Object... objArr);

    /* renamed from: a */
    void mo24496a(IapPaymentMethod iapPaymentMethod);

    /* renamed from: a */
    void mo24497a(IapPaymentMethod iapPaymentMethod, AbstractC15107a aVar);

    /* renamed from: a */
    void mo24498a(IapPaymentMethod iapPaymentMethod, AbstractC15108b bVar);

    /* renamed from: a */
    void mo24499a(IapPaymentMethod iapPaymentMethod, String str, String str2);

    /* renamed from: a */
    void mo24500a(IapPaymentMethod iapPaymentMethod, List<String> list, boolean z, AbstractC15237c<AbsIapProduct> cVar);

    /* renamed from: a */
    void mo24501a(IapPaymentMethod iapPaymentMethod, boolean z, String str, ConsumeIapProductListener consumeIapProductListener);

    /* renamed from: b */
    void mo24502b(IapPaymentMethod iapPaymentMethod);

    /* renamed from: c */
    void mo24503c(IapPaymentMethod iapPaymentMethod);
}
