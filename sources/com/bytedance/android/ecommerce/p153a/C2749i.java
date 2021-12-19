package com.bytedance.android.ecommerce.p153a;

import com.bytedance.covode.number.Covode;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.ecommerce.a.i */
public final class C2749i {

    /* renamed from: a */
    public String f8268a;

    /* renamed from: b */
    public String f8269b;

    /* renamed from: c */
    public List<C2747g> f8270c;

    static {
        Covode.recordClassIndex(3175);
    }

    /* renamed from: a */
    public final JSONObject mo7336a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("method_id", this.f8268a);
            jSONObject.put("payment_method_token", this.f8269b);
            JSONArray jSONArray = new JSONArray();
            for (C2747g gVar : this.f8270c) {
                jSONArray.put(gVar.mo7333a());
            }
            jSONObject.put("payment_elements", jSONArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public C2749i(String str, List<C2747g> list) {
        this.f8268a = str;
        this.f8270c = list;
    }
}
