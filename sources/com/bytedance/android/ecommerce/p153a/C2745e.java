package com.bytedance.android.ecommerce.p153a;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.ecommerce.a.e */
public final class C2745e {

    /* renamed from: a */
    public String f8235a;

    /* renamed from: b */
    public String f8236b;

    /* renamed from: c */
    public String f8237c;

    static {
        Covode.recordClassIndex(3171);
    }

    public C2745e(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f8235a = jSONObject.optString(StringSet.type);
            this.f8236b = jSONObject.optString("value");
            this.f8237c = jSONObject.optString("error_key");
        }
    }
}
