package com.bytedance.globalpayment.service.manager.ecommerce.wecht;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1041c.AbstractC15083c;

public interface IWeChtExternalService {
    static {
        Covode.recordClassIndex(17501);
    }

    AbstractC15083c getPayChannel();
}
