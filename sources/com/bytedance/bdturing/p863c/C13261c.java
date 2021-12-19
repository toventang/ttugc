package com.bytedance.bdturing.p863c;

import com.bytedance.bdturing.C13285g;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.bdturing.c.c */
public final class C13261c {

    /* renamed from: a */
    int f32432a;

    /* renamed from: b */
    String f32433b;

    /* renamed from: c */
    String f32434c;

    /* renamed from: d */
    String f32435d;

    /* renamed from: e */
    String f32436e;

    /* renamed from: f */
    C13256b f32437f;

    static {
        Covode.recordClassIndex(15223);
    }

    /* renamed from: a */
    public final void mo21430a(int i, JSONObject jSONObject) {
        C13256b bVar = this.f32437f;
        if (bVar != null) {
            try {
                bVar.mo21423a(m23831a(i, "callback", jSONObject, this).toString());
            } catch (JSONException unused) {
            }
        }
    }

    C13261c(C13256b bVar, String str) {
        this.f32437f = bVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f32432a = jSONObject.getInt("JSSDK");
            this.f32433b = jSONObject.getString("func");
            this.f32434c = jSONObject.getString("params");
            this.f32435d = jSONObject.getString("__msg_type");
            this.f32436e = jSONObject.getString("__callback_id");
        } catch (JSONException e) {
            C13285g.m23900a(e);
        }
    }

    /* renamed from: a */
    public static String m23830a(String str, String str2, JSONObject jSONObject, String str3) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", 1);
            jSONObject2.put("func", str);
            jSONObject2.put("__msg_type", str2);
            jSONObject2.put("data", jSONObject);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("__params", jSONObject2);
            jSONObject3.put("__callback_id", str3);
            return jSONObject3.toString();
        } catch (JSONException e) {
            C13285g.m23900a(e);
            return null;
        }
    }

    /* renamed from: a */
    private static JSONObject m23831a(int i, String str, JSONObject jSONObject, C13261c cVar) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", i);
        jSONObject2.put("func", cVar.f32433b);
        jSONObject2.put("__msg_type", str);
        Object obj = jSONObject;
        if (jSONObject == null) {
            obj = "{}";
        }
        jSONObject2.put("data", obj);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("__params", jSONObject2);
        jSONObject3.put("__callback_id", cVar.f32436e);
        return jSONObject3;
    }
}
