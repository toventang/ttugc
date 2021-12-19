package com.bytedance.android.ecommerce.p153a;

import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.ecommerce.a.j */
public final class C2750j {

    /* renamed from: a */
    public JSONObject f8271a;

    /* renamed from: b */
    public JSONObject f8272b;

    /* renamed from: c */
    public String f8273c;

    /* renamed from: d */
    public String f8274d;

    static {
        Covode.recordClassIndex(3176);
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mBody", this.f8271a);
            jSONObject.put("mHeader", this.f8272b);
            jSONObject.put("mMethod", this.f8273c);
            jSONObject.put("mUrl", this.f8274d);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public C2750j(JSONObject jSONObject, JSONObject jSONObject2, String str, String str2) {
        this.f8271a = jSONObject;
        this.f8272b = jSONObject2;
        this.f8273c = str;
        this.f8274d = str2;
    }
}
