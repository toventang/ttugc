package com.bytedance.globalpayment.service.manager.p1083fe.ability;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1041c.AbstractC15081a;

/* renamed from: com.bytedance.globalpayment.service.manager.fe.ability.FeAbilityExternalService */
public interface FeAbilityExternalService {
    static {
        Covode.recordClassIndex(17503);
    }

    AbstractC15081a getECommerceInterceptor();

    void init();

    boolean openWebPageByScheme(Context context, String str);
}
