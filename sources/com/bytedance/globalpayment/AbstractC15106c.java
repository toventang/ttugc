package com.bytedance.globalpayment;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.payment.common.lib.p1072b.C15240a;
import com.bytedance.globalpayment.service.manager.iap.IapService;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.c */
public interface AbstractC15106c {
    static {
        Covode.recordClassIndex(17274);
    }

    /* renamed from: a */
    IapService mo24361a();

    /* renamed from: a */
    void mo24362a(C15240a aVar);

    /* renamed from: a */
    void mo24363a(JSONObject jSONObject);
}
