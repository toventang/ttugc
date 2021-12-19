package com.p2082ss.ttvideoengine;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.z */
public final class C86653z implements AbstractC86302aa {

    /* renamed from: a */
    public final ArrayList<AbstractC86306ae> f195304a = new ArrayList<>();

    static {
        Covode.recordClassIndex(101881);
    }

    @Override // com.p2082ss.ttvideoengine.AbstractC86302aa
    /* renamed from: a */
    public final int mo137121a() {
        return this.f195304a.size();
    }

    @Override // com.p2082ss.ttvideoengine.AbstractC86302aa
    public final String toString() {
        if (this.f195304a.size() > 0) {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < this.f195304a.size(); i++) {
                JSONObject a = this.f195304a.get(i).mo137123a();
                if (a.has("url") && a.has("language_id") && a.has("format") && a.has("sub_id")) {
                    jSONArray.put(a);
                }
            }
            try {
                jSONObject.putOpt("list", jSONArray);
                return jSONObject.toString();
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public C86653z(JSONObject jSONObject) {
        JSONArray optJSONArray;
        if (jSONObject.has("list") && (optJSONArray = jSONObject.optJSONArray("list")) != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null && optJSONObject.has("language_id") && optJSONObject.has("format") && optJSONObject.has("url") && optJSONObject.has("sub_id")) {
                    this.f195304a.add(new C86305ad(optJSONObject));
                }
            }
        }
    }
}
