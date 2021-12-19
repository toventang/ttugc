package com.bytedance.ies.xbridge.model.p1339a.p1340a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.model.a.a.e */
public final class C18739e {

    /* renamed from: a */
    public static final C18739e f44524a = new C18739e();

    private C18739e() {
    }

    static {
        Covode.recordClassIndex(21433);
    }

    /* renamed from: a */
    public static List<Object> m34803a(JSONArray jSONArray) {
        C89219l.m154719c(jSONArray, "");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object opt = jSONArray.opt(i);
            if (opt instanceof Long) {
                arrayList.add(Long.valueOf(jSONArray.optLong(i)));
            } else if (opt instanceof Double) {
                arrayList.add(Double.valueOf(jSONArray.optDouble(i)));
            } else if (opt instanceof Integer) {
                arrayList.add(Integer.valueOf(jSONArray.getInt(i)));
            } else if (opt instanceof String) {
                arrayList.add(jSONArray.optString(i));
            } else if (opt instanceof JSONObject) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                C89219l.m154709a((Object) optJSONObject, "");
                arrayList.add(m34804a(optJSONObject));
            } else if (opt instanceof JSONArray) {
                JSONArray optJSONArray = jSONArray.optJSONArray(i);
                C89219l.m154709a((Object) optJSONArray, "");
                arrayList.add(m34803a(optJSONArray));
            } else if (opt instanceof Boolean) {
                arrayList.add(Boolean.valueOf(jSONArray.optBoolean(i)));
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<String, Object> m34804a(JSONObject jSONObject) {
        C89219l.m154719c(jSONObject, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt instanceof Long) {
                C89219l.m154709a((Object) next, "");
                linkedHashMap.put(next, Long.valueOf(jSONObject.optLong(next)));
            } else if (opt instanceof Double) {
                C89219l.m154709a((Object) next, "");
                linkedHashMap.put(next, Double.valueOf(jSONObject.optDouble(next)));
            } else if (opt instanceof Integer) {
                C89219l.m154709a((Object) next, "");
                linkedHashMap.put(next, Integer.valueOf(jSONObject.optInt(next)));
            } else if (opt instanceof String) {
                C89219l.m154709a((Object) next, "");
                linkedHashMap.put(next, jSONObject.optString(next));
            } else if (opt instanceof JSONObject) {
                C89219l.m154709a((Object) next, "");
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                C89219l.m154709a((Object) optJSONObject, "");
                linkedHashMap.put(next, m34804a(optJSONObject));
            } else if (opt instanceof JSONArray) {
                C89219l.m154709a((Object) next, "");
                JSONArray optJSONArray = jSONObject.optJSONArray(next);
                C89219l.m154709a((Object) optJSONArray, "");
                linkedHashMap.put(next, m34803a(optJSONArray));
            } else if (opt instanceof Boolean) {
                C89219l.m154709a((Object) next, "");
                linkedHashMap.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
            } else {
                C89219l.m154709a((Object) next, "");
                linkedHashMap.put(next, null);
            }
        }
        return linkedHashMap;
    }
}
