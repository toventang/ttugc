package com.bytedance.android.ecommerce.p153a;

import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.ecommerce.a.g */
public final class C2747g {

    /* renamed from: a */
    public String f8254a;

    /* renamed from: b */
    public String f8255b;

    /* renamed from: c */
    public String f8256c;

    /* renamed from: d */
    public boolean f8257d;

    static {
        Covode.recordClassIndex(3173);
    }

    /* renamed from: a */
    public final JSONObject mo7333a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("element", this.f8254a);
            jSONObject.put("param_name", this.f8255b);
            jSONObject.put("param_value", this.f8256c);
            jSONObject.put("is_encrypted", this.f8257d);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public C2747g(String str, String str2, String str3) {
        this.f8254a = str;
        this.f8255b = str2;
        this.f8256c = str3;
    }
}
