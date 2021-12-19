package com.p2082ss.android.ugc.aweme.speedpredictor.impl;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.speedpredictor.api.AbstractC75215a;
import com.p2082ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig;
import com.p2082ss.android.ugc.p4314h.C84111e;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.speedpredictor.impl.c */
final /* synthetic */ class C75229c implements C84111e.AbstractC84112a {

    /* renamed from: a */
    private final ISpeedCalculatorConfig f169140a;

    static {
        Covode.recordClassIndex(88116);
    }

    C75229c(ISpeedCalculatorConfig iSpeedCalculatorConfig) {
        this.f169140a = iSpeedCalculatorConfig;
    }

    @Override // com.p2082ss.android.ugc.p4314h.C84111e.AbstractC84112a
    /* renamed from: a */
    public final Map mo118416a() {
        ISpeedCalculatorConfig iSpeedCalculatorConfig = this.f169140a;
        HashMap hashMap = new HashMap();
        AbstractC75215a intelligentAlgoConfig = iSpeedCalculatorConfig.getIntelligentAlgoConfig();
        if (intelligentAlgoConfig == null) {
            return hashMap;
        }
        hashMap.put("country", intelligentAlgoConfig.mo118406e());
        hashMap.put("access", intelligentAlgoConfig.mo118407f());
        hashMap.put("signal", Integer.valueOf(intelligentAlgoConfig.mo118408g()));
        return hashMap;
    }
}
