package com.bytedance.globalpayment.iap.common.ability;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.payment.common.lib.C15234a;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.iap.common.ability.c */
public class C15124c extends C15234a {

    /* renamed from: a */
    public String f36916a;

    /* renamed from: b */
    public String f36917b;

    /* renamed from: c */
    public long f36918c;

    /* renamed from: d */
    public String f36919d;

    /* renamed from: e */
    public String f36920e;

    /* renamed from: f */
    public String f36921f;

    /* renamed from: g */
    public boolean f36922g;

    /* renamed from: h */
    public String f36923h;

    /* renamed from: i */
    public String f36924i = "";

    /* renamed from: j */
    public boolean f36925j;

    /* renamed from: k */
    public Map<String, String> f36926k;

    /* renamed from: l */
    public long f36927l;

    static {
        Covode.recordClassIndex(17292);
    }

    public String toString() {
        return "IapPayRequest{mSign='" + this.f36916a + '\'' + ", mMerchantId='" + this.f36917b + '\'' + ", mTimestamp=" + this.f36918c + ", mDid='" + this.f36919d + '\'' + ", mUid='" + this.f36920e + '\'' + ", mBizContent='" + this.f36921f + '\'' + ", mIsSubscription=" + this.f36922g + ", mProductId='" + this.f36923h + '\'' + ", mExtraPayload='" + this.f36924i + '\'' + ", mHasCreateOrderOnServer=" + this.f36925j + ", mPayRequestParams=" + this.f36926k + ", mStartPayTimeStamp=" + this.f36927l + '}';
    }

    public C15124c(long j) {
        this.f36927l = j;
        this.f36926k = new TreeMap();
    }

    public C15124c(JSONObject jSONObject) {
        this.f36917b = jSONObject.optString("merchant_id");
        this.f36924i = jSONObject.optString("extra_payload");
    }
}
