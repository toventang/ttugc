package com.bytedance.android.ecommerce.p153a;

import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.ecommerce.a.k */
public final class C2751k {

    /* renamed from: a */
    public String f8275a;

    /* renamed from: b */
    public String f8276b;

    /* renamed from: c */
    public String f8277c;

    /* renamed from: d */
    public String f8278d;

    static {
        Covode.recordClassIndex(3177);
    }

    /* renamed from: a */
    public final JSONObject mo7338a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("environment", this.f8275a);
            jSONObject.put("locale", this.f8276b);
            jSONObject.put("origin_key", this.f8277c);
            jSONObject.put("platform", this.f8278d);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
