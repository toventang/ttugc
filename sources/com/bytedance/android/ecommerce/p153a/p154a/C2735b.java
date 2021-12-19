package com.bytedance.android.ecommerce.p153a.p154a;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.ecommerce.a.a.b */
public final class C2735b extends AbstractC2734a {

    /* renamed from: e */
    public String f8157e;

    /* renamed from: f */
    public String f8158f;

    /* renamed from: g */
    public String f8159g;

    static {
        Covode.recordClassIndex(3161);
    }

    public C2735b() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.android.ecommerce.p153a.p154a.AbstractC2734a
    /* renamed from: b */
    public final JSONObject mo7320b() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f8157e;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            jSONObject.put("merchant_user_id", str);
            String str3 = this.f8158f;
            if (str3 == null) {
                str3 = str2;
            }
            jSONObject.put("nonce", str3);
            String str4 = this.f8159g;
            if (str4 != null) {
                str2 = str4;
            }
            jSONObject.put("image_base64", str2);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @Override // com.bytedance.android.ecommerce.p153a.p154a.AbstractC2734a
    public final String toString() {
        return "BankCardRequest{mMerchantUserId='" + this.f8157e + '\'' + ", mNonce='" + this.f8158f + '}';
    }

    public C2735b(String str, String str2) {
        this.f8157e = str;
        this.f8158f = str2;
    }
}
