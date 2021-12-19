package com.bytedance.globalpayment.payment.common.lib.p1077g;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.payment.common.lib.C15234a;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.payment.common.lib.g.a */
public class C15252a extends C15234a {

    /* renamed from: a */
    protected String f37242a;

    /* renamed from: b */
    private long f37243b;

    static {
        Covode.recordClassIndex(17452);
    }

    public C15252a(String str) {
        this.f37242a = str;
    }

    /* renamed from: a */
    public final void mo24700a(JSONObject jSONObject) {
        this.f37243b = SystemClock.uptimeMillis();
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, "api_name", this.f37242a);
        C15253a.m28071a().mo24704d().mo24726a("api_request_start", jSONObject2, null, jSONObject);
    }

    /* renamed from: a */
    public final void mo24701a(JSONObject jSONObject, JSONObject jSONObject2) {
        long j = 0;
        if (this.f37243b > 0) {
            j = SystemClock.uptimeMillis() - this.f37243b;
        }
        JSONObject jSONObject3 = new JSONObject();
        add(jSONObject3, "time_consuming", j);
        C15253a.m28071a().mo24704d().mo24726a("api_request_end", jSONObject, jSONObject3, jSONObject2);
    }
}
