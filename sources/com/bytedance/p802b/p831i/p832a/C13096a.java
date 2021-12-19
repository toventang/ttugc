package com.bytedance.p802b.p831i.p832a;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.b.i.a.a */
public final class C13096a {
    static {
        Covode.recordClassIndex(14932);
    }

    /* renamed from: a */
    public static JSONObject m23549a(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.optJSONObject("performance_modules").optJSONObject(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
