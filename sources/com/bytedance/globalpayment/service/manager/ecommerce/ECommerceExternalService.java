package com.bytedance.globalpayment.service.manager.ecommerce;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1039a.AbstractC15075a;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1039a.AbstractC15076b;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1041c.AbstractC15083c;
import com.bytedance.globalpayment.p1036a.p1048b.C15104a;

public interface ECommerceExternalService extends ECommerceService {
    static {
        Covode.recordClassIndex(17497);
    }

    ECommerceService getECommerceService();

    AbstractC15083c getPayChannel(int i);

    void init();

    void pay(int i, C15104a aVar, AbstractC15076b bVar);

    void startBankCardOcr(String str, AbstractC15075a aVar);
}
