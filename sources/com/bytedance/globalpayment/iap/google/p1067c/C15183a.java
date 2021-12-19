package com.bytedance.globalpayment.iap.google.p1067c;

import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.google.p1070f.C15192a;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import com.bytedance.globalpayment.payment.common.lib.p1082j.C15283e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.iap.google.c.a */
public final class C15183a extends AbsIapChannelOrderData {

    /* renamed from: a */
    private final String f37060a;

    /* renamed from: b */
    private JSONObject f37061b;

    /* renamed from: c */
    private boolean f37062c;

    /* renamed from: d */
    private String f37063d;

    static {
        Covode.recordClassIndex(17363);
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final String getChannelUserId() {
        return "";
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final String getHost() {
        return this.f37063d;
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final String getOriginalJson() {
        return this.mOriginalJson;
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final IapPaymentMethod getPaymentMethod() {
        return IapPaymentMethod.GOOGLE;
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final String getSelfToken() {
        return this.mOriginalJson;
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final String getSignature() {
        return this.mSignature;
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final boolean isOrderFromOtherSystem() {
        return this.f37062c;
    }

    public final String toString() {
        return this.mOriginalJson;
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final String getChannelToken() {
        JSONObject jSONObject = this.f37061b;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final String getDeveloperPayload() {
        return this.f37061b.optString("developerPayload");
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final int getOrderState() {
        if (this.f37061b.optInt("purchaseState", 1) != 4) {
            return 1;
        }
        return 2;
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final boolean isOrderStateSuccess() {
        if (getOrderState() == 1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15183a)) {
            return false;
        }
        AbsIapChannelOrderData absIapChannelOrderData = (AbsIapChannelOrderData) obj;
        if (!TextUtils.equals(this.mOriginalJson, absIapChannelOrderData.getOriginalJson()) || !TextUtils.equals(this.mSignature, absIapChannelOrderData.getSignature())) {
            return false;
        }
        return true;
    }

    public C15183a(Purchase purchase, boolean z) {
        this(purchase.f6646a, purchase.f6647b);
        this.mIsSubscription = z;
    }

    /* renamed from: a */
    private static JSONObject m27981a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            String[] split = C15283e.m28158a(str).split("-");
            String[] split2 = C15283e.m28158a(str2).split("-");
            if (split.length != 0) {
                if (split2.length != 0) {
                    jSONObject.put("trade_no", split2[0]);
                    jSONObject.put("trade_amount", split2[1]);
                    jSONObject.put("app_id", split[0]);
                    jSONObject.put("merchant_id", split[1]);
                    jSONObject.put("uid", split[2]);
                    return jSONObject;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private C15183a(String str, String str2) {
        String str3;
        String str4;
        String[] split;
        this.f37060a = "GoogleOrderData";
        this.mSignature = str2;
        try {
            this.mExtraPayload = "";
            JSONObject jSONObject = new JSONObject(str);
            this.f37061b = jSONObject;
            String optString = jSONObject.optString("obfuscatedAccountId");
            if (optString.startsWith("newstr")) {
                String replace = optString.replace("newstr", "");
                if (TextUtils.isEmpty(replace)) {
                    split = new String[0];
                } else {
                    split = C15192a.m27997b(replace).split("\n");
                }
                if (split.length == 3) {
                    this.mSelfOrderId = split[0];
                    this.f37063d = split[1];
                    this.mIsNewSubscription = TextUtils.equals(split[2], "1");
                } else if (split.length == 2) {
                    this.mSelfOrderId = split[0];
                    this.f37063d = split[1];
                }
            } else {
                this.mSelfOrderId = optString;
            }
            String optString2 = this.f37061b.optString("obfuscatedProfileId");
            String[] split2 = optString2.split("\n");
            if (split2.length == 3) {
                str3 = split2[0];
                str4 = split2[1];
                this.mExtraPayload = split2[2];
            } else if (split2.length == 2) {
                str3 = split2[0];
                str4 = split2[1];
            } else {
                JSONObject a = m27981a(this.f37061b.optString("obfuscatedAccountId"), optString2);
                if (a != null) {
                    str3 = a.optString("merchant_id");
                    str4 = a.optString("uid");
                    String optString3 = a.optString("trade_no");
                    if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || TextUtils.isEmpty(optString3)) {
                        str3 = "";
                        str4 = str3;
                    } else {
                        this.mSelfOrderId = optString3;
                        this.f37062c = true;
                    }
                } else {
                    str3 = split2[0];
                    str4 = "";
                }
            }
            this.f37061b.remove("obfuscatedProfileId");
            this.f37061b.remove("obfuscatedAccountId");
            if (!TextUtils.isEmpty(this.mSelfOrderId) || !TextUtils.isEmpty(str3) || !TextUtils.isEmpty(str4)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("orderId", this.mSelfOrderId);
                jSONObject2.put("merchantId", str3);
                jSONObject2.put("userId", str4);
                this.f37061b.put("developerPayload", jSONObject2.toString());
            } else {
                this.f37061b.put("developerPayload", "");
            }
            this.mOriginalJson = this.f37061b.toString();
            this.mChannelOrderId = this.f37061b.optString("orderId");
            this.mProductId = this.f37061b.optString("productId");
            this.mIsAckEd = this.f37061b.optBoolean("acknowledged", true);
            C15253a.m28071a().mo24705e();
        } catch (JSONException unused) {
            C15253a.m28071a().mo24705e();
        }
    }
}
