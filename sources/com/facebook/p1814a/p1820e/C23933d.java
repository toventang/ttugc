package com.facebook.p1814a.p1820e;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.facebook.C24006ab;
import com.facebook.C24872m;
import com.facebook.internal.C24699ae;
import com.facebook.internal.C24768q;
import com.facebook.internal.C24770r;
import com.facebook.p1814a.C23998m;
import com.kakao.usermgmt.StringSet;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a.e.d */
public class C23933d {

    /* renamed from: a */
    static final C23998m f56658a = new C23998m(C24872m.f59047g);

    /* renamed from: b */
    private static final String f56659b = C23933d.class.getCanonicalName();

    static {
        Covode.recordClassIndex(28054);
        C24699ae.m47299a();
    }

    /* renamed from: a */
    public static boolean m45245a() {
        C24699ae.m47299a();
        C24768q a = C24770r.m47425a(C24872m.f59041a);
        if (a == null || !C24006ab.m45407b() || !a.f58763k) {
            return false;
        }
        return true;
    }

    /* renamed from: com.facebook.a.e.d$a */
    static class C23934a {

        /* renamed from: a */
        BigDecimal f56660a;

        /* renamed from: b */
        Currency f56661b;

        /* renamed from: c */
        Bundle f56662c;

        static {
            Covode.recordClassIndex(28055);
        }

        C23934a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
            this.f56660a = bigDecimal;
            this.f56661b = currency;
            this.f56662c = bundle;
        }
    }

    /* renamed from: a */
    static C23934a m45244a(String str, String str2, Map<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_iap_product_id", jSONObject.getString("productId"));
            bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
            bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
            bundle.putCharSequence("fb_iap_package_name", jSONObject.optString("packageName"));
            bundle.putCharSequence("fb_iap_product_title", jSONObject2.optString("title"));
            bundle.putCharSequence("fb_iap_product_description", jSONObject2.optString("description"));
            String optString = jSONObject2.optString(StringSet.type);
            bundle.putCharSequence("fb_iap_product_type", optString);
            if (optString.equals("subs")) {
                bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                String optString2 = jSONObject2.optString("introductoryPriceCycles");
                if (!optString2.isEmpty()) {
                    bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                    bundle.putCharSequence("fb_intro_price_cycles", optString2);
                }
            }
            for (String str3 : map.keySet()) {
                bundle.putCharSequence(str3, map.get(str3));
            }
            double d = (double) jSONObject2.getLong("price_amount_micros");
            Double.isNaN(d);
            return new C23934a(new BigDecimal(d / 1000000.0d), Currency.getInstance(jSONObject2.getString("price_currency_code")), bundle);
        } catch (JSONException unused) {
            return null;
        }
    }
}
