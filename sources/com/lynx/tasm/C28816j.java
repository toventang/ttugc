package com.lynx.tasm;

import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.lynx.tasm.j */
public class C28816j {

    /* renamed from: a */
    public int f68013a;

    /* renamed from: b */
    public JSONObject f68014b;

    /* renamed from: c */
    private String f68015c = "";

    static {
        Covode.recordClassIndex(34923);
    }

    /* renamed from: a */
    public final String mo49932a() {
        JSONObject jSONObject = this.f68014b;
        if (jSONObject == null) {
            return this.f68015c;
        }
        return jSONObject.toString();
    }

    public String toString() {
        return "{\"code\": " + this.f68013a + ",\"msg\":" + mo49932a() + "}";
    }

    public C28816j(String str, int i) {
        this.f68013a = i;
        this.f68015c = str;
    }

    public C28816j(JSONObject jSONObject, int i) {
        this.f68014b = jSONObject;
        this.f68013a = i;
        try {
            if (jSONObject.has("error")) {
                this.f68015c = this.f68014b.getString("error");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
