package com.bytedance.framwork.core.sdkmonitor;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.framwork.core.sdkmonitor.f */
public final class C14819f {
    static {
        Covode.recordClassIndex(16920);
    }

    /* renamed from: a */
    public static JSONObject m27210a(JSONObject jSONObject, String str, String str2) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject(str)) == null) {
            return null;
        }
        return optJSONObject.optJSONObject(str2);
    }
}
