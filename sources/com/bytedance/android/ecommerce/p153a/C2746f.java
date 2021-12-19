package com.bytedance.android.ecommerce.p153a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.ecommerce.a.f */
public final class C2746f {

    /* renamed from: a */
    public String f8238a;

    /* renamed from: b */
    public String f8239b;

    /* renamed from: c */
    public String f8240c;

    /* renamed from: d */
    public String f8241d;

    /* renamed from: e */
    public String f8242e;

    /* renamed from: f */
    public String f8243f;

    /* renamed from: g */
    public String f8244g;

    /* renamed from: h */
    public List<C2743c> f8245h;

    /* renamed from: i */
    public Map<String, C2743c> f8246i;

    /* renamed from: j */
    public String f8247j;

    /* renamed from: k */
    public String f8248k;

    /* renamed from: l */
    public String f8249l;

    /* renamed from: m */
    public boolean f8250m;

    /* renamed from: n */
    public boolean f8251n;

    /* renamed from: o */
    public String f8252o;

    /* renamed from: p */
    public List<C2746f> f8253p;

    static {
        Covode.recordClassIndex(3172);
    }

    /* renamed from: a */
    private List<C2746f> m7918a() {
        ArrayList arrayList = new ArrayList();
        List<C2746f> list = this.f8253p;
        if (list != null) {
            for (C2746f fVar : list) {
                arrayList.addAll(fVar.m7918a());
            }
        }
        return arrayList;
    }

    public final String toString() {
        return "{mPaymentMethodId='" + this.f8238a + '\'' + ", mPaymentMethod='" + this.f8239b + '\'' + ", mIconUrl='" + this.f8240c + '\'' + ", mDarkModeIconUrl='" + this.f8241d + '\'' + ", mPaymentMethodType='" + this.f8242e + '\'' + ", mDisplayName='" + this.f8243f + '\'' + ", mStarlingKey='" + this.f8244g + '\'' + ", mElements=" + this.f8245h + ", mElementMap=" + this.f8246i + ", mMaxLimitedAmount='" + this.f8247j + '\'' + ", mMinLimitedAmount='" + this.f8248k + '\'' + ", mCurrency='" + this.f8249l + '\'' + ", mIsPciSensitive=" + this.f8250m + ", mIsSaveAble=" + this.f8251n + ", mPackageName='" + this.f8252o + '\'' + ", mSubPaymentMethods='" + this.f8253p + '\'' + '}';
    }

    public C2746f(JSONObject jSONObject) {
        m7919a(jSONObject);
    }

    /* renamed from: a */
    public final C2743c mo7331a(String str) {
        return this.f8246i.get(str);
    }

    /* renamed from: a */
    private void m7919a(JSONObject jSONObject) {
        this.f8246i = new HashMap();
        this.f8238a = jSONObject.optString("payment_method_id");
        this.f8239b = jSONObject.optString("payment_method");
        this.f8240c = jSONObject.optString("icon_url");
        this.f8241d = jSONObject.optString("dark_mode_icon_url");
        this.f8242e = jSONObject.optString("payment_method_type");
        this.f8243f = jSONObject.optString("display_name");
        this.f8244g = jSONObject.optString("starling_key");
        this.f8247j = jSONObject.optString("max_limited_amount");
        this.f8248k = jSONObject.optString("min_limited_amount");
        this.f8250m = jSONObject.optBoolean("pci_sensitive");
        this.f8251n = jSONObject.optBoolean("saveable");
        this.f8252o = jSONObject.optString("package_name");
        this.f8245h = new ArrayList();
        this.f8246i = new HashMap();
        JSONArray optJSONArray = jSONObject.optJSONArray("elements");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    C2743c cVar = new C2743c((JSONObject) optJSONArray.get(i));
                    this.f8245h.add(cVar);
                    this.f8245h.addAll(cVar.f8228m);
                    for (C2743c cVar2 : cVar.f8228m) {
                        this.f8246i.put(cVar2.f8216a, cVar2);
                    }
                    this.f8246i.put(cVar.f8216a, cVar);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        this.f8253p = new ArrayList();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("sub_payment_methods");
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                try {
                    this.f8253p.add(new C2746f((JSONObject) optJSONArray2.get(i2)));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
        this.f8253p.addAll(m7918a());
    }
}
