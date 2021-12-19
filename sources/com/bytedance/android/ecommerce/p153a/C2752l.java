package com.bytedance.android.ecommerce.p153a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.ecommerce.a.l */
public final class C2752l {

    /* renamed from: a */
    public String f8279a;

    /* renamed from: b */
    public String f8280b;

    /* renamed from: c */
    public String f8281c;

    /* renamed from: d */
    public String f8282d;

    /* renamed from: e */
    public String f8283e;

    /* renamed from: f */
    public String f8284f;

    /* renamed from: g */
    public boolean f8285g;

    /* renamed from: h */
    public String f8286h;

    /* renamed from: i */
    public String f8287i;

    /* renamed from: j */
    public String f8288j;

    /* renamed from: k */
    public List<C2743c> f8289k;

    /* renamed from: l */
    private Map<String, C2743c> f8290l;

    static {
        Covode.recordClassIndex(3178);
    }

    public C2752l(JSONObject jSONObject) {
        m7925a(jSONObject);
    }

    /* renamed from: a */
    private void m7925a(JSONObject jSONObject) {
        this.f8289k = new ArrayList();
        this.f8290l = new HashMap();
        this.f8279a = jSONObject.optString("payment_method_id");
        this.f8280b = jSONObject.optString("payment_method_type");
        this.f8281c = jSONObject.optString("payment_method");
        this.f8282d = jSONObject.optString("masked_identity");
        this.f8283e = jSONObject.optString("icon_url");
        this.f8284f = jSONObject.optString("dark_mode_icon_url");
        this.f8285g = jSONObject.optBoolean("is_primary");
        this.f8286h = jSONObject.optString("payment_method_token");
        this.f8287i = jSONObject.optString("bind_time");
        this.f8288j = jSONObject.optString("recent_used_time");
        JSONArray optJSONArray = jSONObject.optJSONArray("needed_elements");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    C2743c cVar = new C2743c((JSONObject) optJSONArray.get(i));
                    this.f8289k.add(cVar);
                    this.f8289k.addAll(cVar.f8228m);
                    for (C2743c cVar2 : cVar.f8228m) {
                        this.f8290l.put(cVar2.f8216a, cVar2);
                    }
                    this.f8290l.put(cVar.f8216a, cVar);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
