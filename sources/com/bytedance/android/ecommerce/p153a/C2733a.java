package com.bytedance.android.ecommerce.p153a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.ecommerce.a.a */
public final class C2733a {

    /* renamed from: a */
    List<Integer> f8146a;

    /* renamed from: b */
    public JSONArray f8147b;

    /* renamed from: c */
    public String f8148c;

    /* renamed from: d */
    public JSONArray f8149d;

    /* renamed from: e */
    public String f8150e;

    /* renamed from: f */
    public String f8151f;

    /* renamed from: g */
    public String f8152g;

    static {
        Covode.recordClassIndex(3159);
    }

    /* renamed from: a */
    public final List<Integer> mo7317a() {
        if (this.f8146a == null) {
            this.f8146a = new ArrayList();
            if (this.f8147b != null) {
                for (int i = 0; i < this.f8147b.length(); i++) {
                    try {
                        this.f8146a.add((Integer) this.f8147b.get(i));
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return this.f8146a;
    }

    public final String toString() {
        return "{mCvvLength=" + this.f8147b + ", mCardBrandRegex='" + this.f8148c + '\'' + ", mCardBrandLength=" + this.f8149d + ", mCardBrandDisplayName='" + this.f8150e + '\'' + ", mCardBrand='" + this.f8151f + '\'' + ", mPaymentMethodId='" + this.f8152g + '\'' + '}';
    }

    public C2733a(JSONObject jSONObject) {
        this.f8147b = jSONObject.optJSONArray("cvv_length");
        this.f8148c = jSONObject.optString("card_brand_regex");
        this.f8149d = jSONObject.optJSONArray("card_brand_length");
        this.f8150e = jSONObject.optString("card_brand_display_name");
        this.f8151f = jSONObject.optString("card_brand");
        this.f8152g = jSONObject.optString("payment_method_id");
    }
}
