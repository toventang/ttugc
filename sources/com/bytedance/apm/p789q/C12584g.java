package com.bytedance.apm.p789q;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.q.g */
public final class C12584g {
    static {
        Covode.recordClassIndex(14401);
    }

    /* renamed from: b */
    public static boolean m22676b(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static JSONObject m22677c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new JSONObject(jSONObject.toString());
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    /* renamed from: a */
    public static JSONObject m22674a(JSONObject jSONObject) {
        LinkedList linkedList = new LinkedList();
        Iterator<String> keys = jSONObject.keys();
        if (keys == null) {
            return null;
        }
        while (keys.hasNext()) {
            linkedList.add(keys.next());
        }
        try {
            return new JSONObject(jSONObject, (String[]) linkedList.toArray(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    /* renamed from: d */
    public static JSONObject m22678d(JSONObject jSONObject) {
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

    /* renamed from: a */
    public static JSONObject m22675a(JSONObject jSONObject, String str, String str2) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject(str)) == null) {
            return null;
        }
        return optJSONObject.optJSONObject(str2);
    }

    /* renamed from: a */
    public static int m22673a(JSONObject jSONObject, String str, String str2, String str3) {
        JSONObject a = m22675a(jSONObject, str, str2);
        if (a == null) {
            return 0;
        }
        return a.optInt(str3, 0);
    }
}
