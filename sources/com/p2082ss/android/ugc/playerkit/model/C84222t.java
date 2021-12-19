package com.p2082ss.android.ugc.playerkit.model;

import com.bytedance.covode.number.Covode;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.playerkit.model.t */
public final class C84222t {

    /* renamed from: a */
    public int f188223a;

    /* renamed from: b */
    public String f188224b;

    /* renamed from: c */
    public long f188225c;

    /* renamed from: d */
    public Object f188226d;

    /* renamed from: e */
    public long f188227e;

    /* renamed from: f */
    public String f188228f;

    /* renamed from: g */
    public int f188229g;

    static {
        Covode.recordClassIndex(98129);
    }

    public final String toString() {
        return "ProcessSubUrlData{id=" + this.f188223a + ", language=" + this.f188224b + ", languageId='" + this.f188225c + ", url=" + this.f188226d + ", expire='" + this.f188227e + '\'' + ", format=" + this.f188228f + ", subId=" + this.f188229g + '}';
    }

    /* renamed from: a */
    public static String m144817a(List<C84222t> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        for (C84222t tVar : list) {
            if (tVar != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", tVar.f188223a);
                    jSONObject.put("language", tVar.f188224b);
                    jSONObject.put("language_id", tVar.f188225c);
                    jSONObject.put("url", tVar.f188226d);
                    jSONObject.put("expire", tVar.f188227e);
                    jSONObject.put("format", tVar.f188228f);
                    jSONObject.put("sub_id", tVar.f188229g);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                jSONArray.put(jSONObject);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("list", jSONArray);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject2.toString();
    }
}
