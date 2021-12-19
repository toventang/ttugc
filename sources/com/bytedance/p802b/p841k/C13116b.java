package com.bytedance.p802b.p841k;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.b.k.b */
public final class C13116b {
    static {
        Covode.recordClassIndex(14952);
    }

    /* renamed from: a */
    public static List<Object> m23582a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (jSONObject.optInt("wrapper_type_description", -1) != 1) {
            arrayList.add(jSONObject);
            return arrayList;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("wrapper_array_data");
        if (optJSONArray == null) {
            return null;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            try {
                arrayList.add(optJSONArray.get(i));
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static JSONObject m23583a(String str, JSONArray jSONArray) {
        try {
            JSONObject put = new JSONObject().put("wrapper_array_data", jSONArray);
            put.put("log_type", str);
            put.put("wrapper_type_description", 1);
            return put;
        } catch (Exception unused) {
            return null;
        }
    }
}
