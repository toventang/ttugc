package com.bytedance.crash.util;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13933m;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.util.n */
public final class C14062n {
    static {
        Covode.recordClassIndex(16129);
    }

    /* renamed from: a */
    public static boolean m25598a(JSONObject jSONObject, String str) {
        return m25597a(jSONObject) || m25595a(jSONObject.optJSONArray(str));
    }

    /* renamed from: a */
    public static JSONArray m25591a(Properties properties) {
        if (properties == null || properties.isEmpty()) {
            return null;
        }
        Set keySet = properties.keySet();
        JSONArray jSONArray = new JSONArray();
        for (Object obj : keySet) {
            jSONArray.put(((String) obj) + ":" + properties.get(obj));
        }
        return jSONArray;
    }

    /* renamed from: b */
    public static JSONArray m25600b(JSONArray jSONArray) {
        int i;
        if (jSONArray.length() <= 384) {
            return jSONArray;
        }
        JSONArray jSONArray2 = new JSONArray();
        int i2 = 0;
        do {
            jSONArray2.put(jSONArray.opt(i2));
            i2++;
            i = 256;
        } while (i2 < 256);
        jSONArray2.put("... skip " + ((jSONArray.length() - 128) - 256) + " lines");
        do {
            jSONArray2.put(jSONArray.opt(jSONArray.length() - (384 - i)));
            i++;
        } while (i < 384);
        return jSONArray2;
    }

    /* renamed from: a */
    public static boolean m25595a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m25597a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static JSONArray m25592a(JSONObject jSONObject, String... strArr) {
        JSONObject c = m25601c(jSONObject, strArr);
        if (c == null) {
            return null;
        }
        return c.optJSONArray(strArr[2]);
    }

    /* renamed from: b */
    public static String m25599b(JSONObject jSONObject, String... strArr) {
        JSONObject c = m25601c(jSONObject, strArr);
        if (c == null) {
            return null;
        }
        return c.optString(strArr[strArr.length - 1]);
    }

    /* renamed from: c */
    public static JSONObject m25601c(JSONObject jSONObject, String... strArr) {
        if (jSONObject == null) {
            new RuntimeException();
            C13933m.f33942g.isDebugMode();
            return null;
        }
        for (int i = 0; i < strArr.length - 1; i++) {
            jSONObject = jSONObject.optJSONObject(strArr[i]);
            if (jSONObject == null) {
                C13933m.f33942g.isDebugMode();
                return null;
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m25594a(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                if (!jSONObject.has(next)) {
                    jSONObject.put(next, jSONObject2.opt(next));
                }
            } catch (Throwable unused) {
                return;
            }
        }
    }

    /* renamed from: a */
    public static boolean m25596a(JSONArray jSONArray, String str) {
        if (m25595a(jSONArray)) {
            return false;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            Object opt = jSONArray.opt(i);
            if (!(opt instanceof String)) {
                break;
            } else if (((String) opt).contains(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static int m25590a(JSONObject jSONObject, int i, String... strArr) {
        JSONObject c = m25601c(jSONObject, strArr);
        if (c == null) {
            return i;
        }
        return c.optInt(strArr[strArr.length - 1], i);
    }

    /* renamed from: a */
    public static JSONObject m25593a(JSONObject jSONObject, String str, Object obj) {
        if (!(jSONObject == null || obj == null || TextUtils.isEmpty(str))) {
            try {
                jSONObject.put(str, obj);
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }
}
