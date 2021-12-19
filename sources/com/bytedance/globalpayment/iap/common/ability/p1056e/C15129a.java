package com.bytedance.globalpayment.iap.common.ability.p1056e;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.C15126d;
import com.bytedance.globalpayment.payment.common.lib.p1077g.C15252a;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.iap.common.ability.e.a */
public final class C15129a extends C15252a {

    /* renamed from: b */
    private String f36931b;

    /* renamed from: c */
    private String f36932c;

    static {
        Covode.recordClassIndex(17297);
    }

    /* renamed from: a */
    public final void mo24392a() {
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "request_id", this.f36931b);
        add(jSONObject, "product_id", this.f36932c);
        mo24700a(jSONObject);
    }

    /* renamed from: a */
    public final void mo24393a(boolean z, C15126d dVar) {
        long j;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            j = 0;
        } else {
            j = 1;
        }
        add(jSONObject, "status", j);
        add(jSONObject, "api_name", this.f37242a);
        if (dVar != null) {
            add(jSONObject, "result_code", (long) dVar.getCode());
            add(jSONObject, "result_detail_code", (long) dVar.getDetailCode());
            add(jSONObject, "result_message", dVar.getMessage());
        } else {
            add(jSONObject, "result_code", -1L);
            add(jSONObject, "result_detail_code", -1L);
            add(jSONObject, "result_message", "unknown");
        }
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, "request_id", this.f36931b);
        add(jSONObject2, "product_id", this.f36932c);
        mo24701a(jSONObject, jSONObject2);
    }

    public C15129a(String str, String str2, String str3) {
        super(str);
        this.f36931b = str2;
        this.f36932c = str3;
    }
}
