package com.bytedance.android.ecommerce.p164j;

import com.bytedance.android.ecommerce.p159e.C2778c;
import com.bytedance.android.ecommerce.p161g.EnumC2798a;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.ecommerce.j.c */
public final class C2804c implements AbstractC2807f {
    static {
        Covode.recordClassIndex(3230);
    }

    /* renamed from: a */
    private static JSONObject m8044a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_version_name", "1.0.0-rc.5");
            jSONObject.put("sdk_version_code", 10000);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    @Override // com.bytedance.android.ecommerce.p164j.AbstractC2807f
    /* renamed from: a */
    public final void mo7389a(long j) {
        JSONObject a = m8044a();
        try {
            a.put("param_duration", j);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        mo7380a("ecommerce_init", a);
    }

    @Override // com.bytedance.android.ecommerce.p163i.AbstractC2801b
    /* renamed from: a */
    public final void mo7380a(String str, JSONObject jSONObject) {
        C2778c.f8362a.mo7372d().f8325k.mo7380a(str, jSONObject);
    }

    @Override // com.bytedance.android.ecommerce.p164j.AbstractC2807f
    /* renamed from: a */
    public final void mo7391a(String str, String str2, String str3, String str4, String str5, long j, String str6) {
        JSONObject a = m8044a();
        try {
            a.put("param_payment_method_id", str);
            a.put("param_payment_reference", str2);
            a.put("result_code", str3);
            a.put("error_code", str4);
            a.put("error_message", str5);
            a.put("param_duration", j);
            a.put("param_response_str", str6);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        mo7380a("ecommerce_pay", a);
    }

    @Override // com.bytedance.android.ecommerce.p164j.AbstractC2807f
    /* renamed from: a */
    public final void mo7390a(String str, String str2, EnumC2798a aVar, String str3, String str4, int i, long j, String str5) {
        JSONObject a = m8044a();
        try {
            a.put("merchant_order_id", str);
            a.put("param_payment_reference", str2);
            a.put("order_status", aVar.getStatus());
            a.put("error_code", str3);
            a.put("error_message", str4);
            a.put("try_times", i);
            a.put("param_duration", j);
            a.put("param_response_str", str5);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        mo7380a("ecommerce_query", a);
    }
}
