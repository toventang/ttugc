package com.bytedance.android.ecommerce.p153a.p155b;

import com.bytedance.android.ecommerce.p153a.C2750j;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.ecommerce.a.b.c */
public final class C2741c extends C2739a {

    /* renamed from: f */
    public C2750j f8205f;

    /* renamed from: g */
    public String f8206g;

    /* renamed from: h */
    public String f8207h;

    /* renamed from: i */
    public String f8208i;

    /* renamed from: j */
    public String f8209j;

    static {
        Covode.recordClassIndex(3167);
    }

    public C2741c() {
    }

    @Override // com.bytedance.android.ecommerce.p153a.p155b.C2739a
    public final String toString() {
        String jVar;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mResultCode", this.f8193c);
            jSONObject.put("mErrorCode", this.f8194d);
            jSONObject.put("mErrorMessage", this.f8195e);
            C2750j jVar2 = this.f8205f;
            if (jVar2 == null) {
                jVar = "";
            } else {
                jVar = jVar2.toString();
            }
            jSONObject.put("mRedirectDetails", jVar);
            jSONObject.put("mPaymentMethodDetails", this.f8206g);
            jSONObject.put("mExpirationTime", this.f8207h);
            jSONObject.put("mPaymentMethodToken", this.f8208i);
            jSONObject.put("mPresentToShopperDetails", this.f8209j);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public C2741c(String str) {
        super(str);
        C2750j jVar;
        try {
            this.f8194d = this.f8191a.optString("error_code");
            this.f8195e = this.f8191a.optString("error_message");
            this.f8207h = this.f8191a.optString("expiration_time");
            this.f8206g = this.f8191a.optString("payment_method_details");
            this.f8208i = this.f8191a.optString("payment_method_token");
            JSONObject optJSONObject = this.f8191a.optJSONObject("redirect_details");
            if (optJSONObject == null) {
                jVar = null;
            } else {
                jVar = new C2750j(optJSONObject.optJSONObject("body"), optJSONObject.optJSONObject("header"), optJSONObject.optString("method"), optJSONObject.optString("url"));
            }
            this.f8205f = jVar;
            this.f8193c = this.f8191a.optString("result_code");
            this.f8209j = this.f8191a.optString("present_to_shopper_details");
        } catch (Throwable unused) {
        }
    }
}
