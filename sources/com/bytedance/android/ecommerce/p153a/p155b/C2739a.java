package com.bytedance.android.ecommerce.p153a.p155b;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.ecommerce.a.b.a */
public class C2739a {

    /* renamed from: a */
    public JSONObject f8191a;

    /* renamed from: b */
    public String f8192b;

    /* renamed from: c */
    public String f8193c;

    /* renamed from: d */
    public String f8194d;

    /* renamed from: e */
    public String f8195e;

    static {
        Covode.recordClassIndex(3165);
    }

    public C2739a() {
    }

    public String toString() {
        return "BaseResponse{mResponseJsonObject=" + this.f8191a + ", mSign='" + this.f8192b + '\'' + ", mResultCode='" + this.f8193c + '\'' + ", mErrorCode='" + this.f8194d + '\'' + ", mErrorMessage='" + this.f8195e + '\'' + '}';
    }

    public C2739a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Object obj = jSONObject.get("response");
            if (obj instanceof JSONObject) {
                this.f8191a = (JSONObject) obj;
            } else if (obj instanceof String) {
                this.f8191a = new JSONObject((String) obj);
            }
            this.f8194d = this.f8191a.optString("error_code");
            this.f8195e = this.f8191a.optString("error_message");
            this.f8193c = this.f8191a.optString("result_code");
            this.f8192b = jSONObject.optString("sign");
        } catch (Throwable unused) {
        }
    }
}
