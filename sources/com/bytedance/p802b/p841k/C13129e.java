package com.bytedance.p802b.p841k;

import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p841k.p843b.C13118b;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.b.k.e */
public final class C13129e {
    static {
        Covode.recordClassIndex(14965);
    }

    /* renamed from: a */
    public static boolean m23602a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static JSONObject m23606c(JSONObject jSONObject) {
        Iterator<String> keys;
        if (jSONObject == null || (keys = jSONObject.keys()) == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject2.put(next, jSONObject.opt(next));
            }
            return jSONObject2;
        } catch (Exception unused) {
            return jSONObject;
        }
    }

    /* renamed from: b */
    public static JSONObject m23604b(JSONObject jSONObject) {
        Iterator<String> keys;
        if (jSONObject == null || (keys = jSONObject.keys()) == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                if (opt instanceof JSONObject) {
                    JSONObject c = m23606c((JSONObject) opt);
                    if (c != null) {
                        jSONObject2.put(next, c);
                    }
                } else if (opt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) opt;
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        jSONArray2.put(jSONArray.get(i));
                    }
                    jSONObject2.put(next, jSONArray2);
                } else {
                    jSONObject2.put(next, opt);
                }
            }
            return jSONObject2;
        } catch (Exception unused) {
            return jSONObject;
        }
    }

    /* renamed from: a */
    public static String m23600a(JSONObject jSONObject, String str) {
        try {
            if (!jSONObject.has(str)) {
                return null;
            }
            String string = jSONObject.getString(str);
            jSONObject.remove(str);
            return string;
        } catch (Exception e) {
            C13118b.m23587a("JsonUtils", "removeString", e);
            return null;
        }
    }

    /* renamed from: b */
    public static int m23603b(JSONObject jSONObject, String str) {
        try {
            if (!jSONObject.has(str)) {
                return 0;
            }
            int i = jSONObject.getInt(str);
            jSONObject.remove(str);
            return i;
        } catch (Exception e) {
            C13118b.m23587a("JsonUtils", "removeInt", e);
            return 0;
        }
    }

    /* renamed from: c */
    public static long m23605c(JSONObject jSONObject, String str) {
        try {
            if (!jSONObject.has(str)) {
                return 0;
            }
            long j = jSONObject.getLong(str);
            jSONObject.remove(str);
            return j;
        } catch (Exception e) {
            C13118b.m23587a("JsonUtils", "removeLong", e);
            return 0;
        }
    }

    /* renamed from: a */
    public static JSONObject m23601a(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys;
        if (jSONObject == null || jSONObject2 == null || (keys = jSONObject2.keys()) == null) {
            return null;
        }
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject2.isNull(next)) {
                jSONObject.put(next, jSONObject2.opt(next));
            }
        }
        return jSONObject;
    }
}
