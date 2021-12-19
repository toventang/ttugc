package com.bytedance.android.ecommerce.p153a.p154a;

import com.bytedance.android.ecommerce.p153a.C2749i;
import com.bytedance.android.ecommerce.p153a.C2751k;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.ecommerce.a.a.c */
public final class C2736c extends AbstractC2734a {

    /* renamed from: e */
    public String f8160e;

    /* renamed from: f */
    public String f8161f;

    /* renamed from: g */
    public C2751k f8162g;

    /* renamed from: h */
    public String f8163h;

    /* renamed from: i */
    public C2749i f8164i;

    /* renamed from: j */
    public String f8165j;

    /* renamed from: k */
    public String f8166k;

    /* renamed from: l */
    public String f8167l;

    /* renamed from: m */
    public boolean f8168m;

    /* renamed from: n */
    public String f8169n;

    /* renamed from: o */
    public String f8170o;

    /* renamed from: p */
    public String f8171p;

    /* renamed from: q */
    public String f8172q;

    static {
        Covode.recordClassIndex(3162);
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.android.ecommerce.p153a.p154a.AbstractC2734a
    /* renamed from: b */
    public final JSONObject mo7320b() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f8160e;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            jSONObject.put("amount", str);
            String str3 = this.f8161f;
            if (str3 == null) {
                str3 = str2;
            }
            jSONObject.put("charge_id", str3);
            C2751k kVar = this.f8162g;
            if (kVar != null) {
                jSONObject.put("configuration", kVar.mo7338a());
            }
            String str4 = this.f8163h;
            if (str4 == null) {
                str4 = str2;
            }
            jSONObject.put("currency", str4);
            C2749i iVar = this.f8164i;
            if (iVar != null) {
                jSONObject.put("payment_method", iVar.mo7336a());
            }
            String str5 = this.f8165j;
            if (str5 == null) {
                str5 = str2;
            }
            jSONObject.put("payment_reference", str5);
            String str6 = this.f8166k;
            if (str6 == null) {
                str6 = str2;
            }
            jSONObject.put("return_url", str6);
            String str7 = this.f8167l;
            if (str7 == null) {
                str7 = str2;
            }
            jSONObject.put("risk_info", str7);
            jSONObject.put("store_payment_method", this.f8168m);
            String str8 = this.f8169n;
            if (str8 == null) {
                str8 = str2;
            }
            jSONObject.put("sub_merchant_id", str8);
            String str9 = this.f8170o;
            if (str9 == null) {
                str9 = str2;
            }
            jSONObject.put("nonce", str9);
            String str10 = this.f8171p;
            if (str10 == null) {
                str10 = str2;
            }
            jSONObject.put("merchant_user_id", str10);
            String str11 = this.f8172q;
            if (str11 != null) {
                str2 = str11;
            }
            jSONObject.put("deeplink", str2);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @Override // com.bytedance.android.ecommerce.p153a.p154a.AbstractC2734a
    public final String toString() {
        return "{mAmount='" + this.f8160e + '\'' + ", mChargeId='" + this.f8161f + '\'' + ", mRequestConfiguration=" + this.f8162g + ", mCurrency='" + this.f8163h + '\'' + ", mPaymentMethodInfo=" + this.f8164i + ", mPaymentReference='" + this.f8165j + '\'' + ", mReturnUrl='" + this.f8166k + '\'' + ", mRiskInfo='" + this.f8167l + '\'' + ", mNeedStorePaymentMethod=" + this.f8168m + ", mSubMerchantId='" + this.f8169n + '\'' + ", mNonce='" + this.f8170o + '\'' + ", baseRequest='" + super.toString() + '\'' + '}';
    }
}
