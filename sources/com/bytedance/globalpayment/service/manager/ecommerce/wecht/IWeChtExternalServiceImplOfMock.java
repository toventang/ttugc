package com.bytedance.globalpayment.service.manager.ecommerce.wecht;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1041c.AbstractC15083c;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1041c.C15084d;

public class IWeChtExternalServiceImplOfMock implements IWeChtExternalService {
    static {
        Covode.recordClassIndex(17502);
    }

    /* renamed from: com_bytedance_globalpayment_service_manager_ecommerce_wecht_IWeChtExternalServiceImplOfMock_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m28183xa5f6fe13(String str, String str2) {
        return 0;
    }

    @Override // com.bytedance.globalpayment.service.manager.ecommerce.wecht.IWeChtExternalService
    public AbstractC15083c getPayChannel() {
        m28183xa5f6fe13("IWeChtExternalService", "cur getPayChannel method is empty impl in IWeChtExternalServiceImplOfMockClass");
        return new C15084d();
    }
}
