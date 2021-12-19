package com.bytedance.globalpayment.service.manager.p1083fe.ability;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1041c.AbstractC15081a;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1041c.C15082b;

/* renamed from: com.bytedance.globalpayment.service.manager.fe.ability.FeAbilityExternalServiceImplOfMock */
public class FeAbilityExternalServiceImplOfMock implements FeAbilityExternalService {
    static {
        Covode.recordClassIndex(17504);
    }

    /* renamed from: com_bytedance_globalpayment_service_manager_fe_ability_FeAbilityExternalServiceImplOfMock_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m28184x310b7ff2(String str, String str2) {
        return 0;
    }

    @Override // com.bytedance.globalpayment.service.manager.p1083fe.ability.FeAbilityExternalService
    public void init() {
    }

    @Override // com.bytedance.globalpayment.service.manager.p1083fe.ability.FeAbilityExternalService
    public AbstractC15081a getECommerceInterceptor() {
        m28184x310b7ff2("FeAbilityExternalService", "cur getECommerceInterceptor method is empty impl in FeAbilityExternalServiceImplOfMockClass");
        return new C15082b();
    }

    @Override // com.bytedance.globalpayment.service.manager.p1083fe.ability.FeAbilityExternalService
    public boolean openWebPageByScheme(Context context, String str) {
        m28184x310b7ff2("FeAbilityExternalService", "cur openWebPageByScheme method is empty impl in FeAbilityExternalServiceImplOfMockClass");
        return false;
    }
}
