package com.bytedance.android.ecommerce.p153a.p155b;

import com.bytedance.android.ecommerce.p161g.EnumC2798a;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.ecommerce.a.b.d */
public final class C2742d extends C2739a {

    /* renamed from: f */
    public String f8210f;

    /* renamed from: g */
    public String f8211g;

    /* renamed from: h */
    public EnumC2798a f8212h;

    /* renamed from: i */
    public String f8213i;

    /* renamed from: j */
    public String f8214j;

    /* renamed from: k */
    public String f8215k;

    static {
        Covode.recordClassIndex(3168);
    }

    public C2742d() {
    }

    @Override // com.bytedance.android.ecommerce.p153a.p155b.C2739a
    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mStatus", this.f8212h.getStatus());
            jSONObject.put("mErrorCode", this.f8210f);
            jSONObject.put("mErrorMessage", this.f8211g);
            jSONObject.put("mAmount", this.f8213i);
            jSONObject.put("mCurrency", this.f8214j);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public C2742d(String str) {
        super(str);
        try {
            this.f8212h = EnumC2798a.getOrderStatus(this.f8191a.optString("status"));
            this.f8210f = this.f8191a.optString("error_code");
            this.f8211g = this.f8191a.optString("error_message");
            this.f8213i = this.f8191a.optString("amount");
            this.f8214j = this.f8191a.optString("currency");
        } catch (Throwable unused) {
        }
    }

    public C2742d(String str, String str2) {
        this.f8212h = EnumC2798a.getOrderStatus(null);
        this.f8210f = str;
        this.f8211g = str2;
        this.f8213i = null;
        this.f8214j = null;
        this.f8215k = null;
    }
}
