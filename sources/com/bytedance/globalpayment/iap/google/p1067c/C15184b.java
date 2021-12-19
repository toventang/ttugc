package com.bytedance.globalpayment.iap.google.p1067c;

import com.android.billingclient.api.SkuDetails;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.IapChannelUserData;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import com.kakao.usermgmt.StringSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.iap.google.c.b */
public final class C15184b extends AbsIapProduct {

    /* renamed from: a */
    private final String f37064a;

    /* renamed from: b */
    private final String f37065b;

    /* renamed from: c */
    private JSONObject f37066c;

    static {
        Covode.recordClassIndex(17364);
    }

    public C15184b(SkuDetails skuDetails) {
        this(skuDetails.f6653a);
    }

    private C15184b(String str) {
        this.f37064a = "GoogleIapProduct";
        this.f37065b = str;
        try {
            this.f37066c = new JSONObject(str);
        } catch (JSONException unused) {
            C15253a.m28071a().mo24705e();
        }
        this.mProductId = this.f37066c.optString("productId");
        this.mProductType = this.f37066c.optString(StringSet.type);
        this.mPrice = this.f37066c.optString("price");
        this.mPriceAmountMicros = this.f37066c.optLong("price_amount_micros");
        this.mPriceCurrencyCode = this.f37066c.optString("price_currency_code");
        this.mFreeTrialPeriod = this.f37066c.optString("freeTrialPeriod");
        this.mTitle = this.f37066c.optString("title");
        this.mSubscriptionPeriod = this.f37066c.optString("subscriptionPeriod");
        this.mDescription = this.f37066c.optString("description");
        this.mChannelUserData = new IapChannelUserData(IapPaymentMethod.GOOGLE, "", "");
    }
}
