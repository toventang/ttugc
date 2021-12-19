package com.bytedance.android.ecommerce.p153a.p154a;

import com.bytedance.android.ecommerce.p153a.C2751k;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.ecommerce.a.a.d */
public final class C2737d extends AbstractC2734a {

    /* renamed from: e */
    public String f8173e;

    /* renamed from: f */
    public String f8174f;

    /* renamed from: g */
    public C2751k f8175g;

    /* renamed from: h */
    public String f8176h;

    /* renamed from: i */
    public String f8177i;

    /* renamed from: j */
    public boolean f8178j;

    /* renamed from: k */
    public String f8179k;

    static {
        Covode.recordClassIndex(3163);
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.android.ecommerce.p153a.p154a.AbstractC2734a
    /* renamed from: b */
    public final JSONObject mo7320b() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            String str = this.f8173e;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            jSONObject2.put("nonce", str);
            C2751k kVar = this.f8175g;
            if (kVar == null) {
                jSONObject = str2;
            } else {
                jSONObject = kVar.mo7338a();
            }
            jSONObject2.put("configuration", jSONObject);
            String str3 = this.f8176h;
            if (str3 == null) {
                str3 = str2;
            }
            jSONObject2.put("payment_reference", str3);
            String str4 = this.f8177i;
            if (str4 == null) {
                str4 = str2;
            }
            jSONObject2.put("charge_id", str4);
            String str5 = this.f8176h;
            if (str5 == null) {
                str5 = str2;
            }
            jSONObject2.put("payment_reference", str5);
            jSONObject2.put("is_agreement", this.f8178j);
            String str6 = this.f8179k;
            if (str6 == null) {
                str6 = str2;
            }
            jSONObject2.put("merchant_order_id", str6);
            String str7 = this.f8174f;
            if (str7 != null) {
                str2 = str7;
            }
            jSONObject2.put("merchant_user_id", str2);
        } catch (Throwable unused) {
        }
        return jSONObject2;
    }

    @Override // com.bytedance.android.ecommerce.p153a.p154a.AbstractC2734a
    public final String toString() {
        return "{mNonce='" + this.f8173e + '\'' + ", mMerchantUserId='" + this.f8174f + '\'' + ", mRequestConfiguration=" + this.f8175g + ", mPaymentReference='" + this.f8176h + '\'' + ", mChargeId='" + this.f8177i + '\'' + ", mIsAgreement=" + this.f8178j + ", mMerchantOrderId='" + this.f8179k + '\'' + ", baseRequest='" + super.toString() + '\'' + '}';
    }
}
