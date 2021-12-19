package com.bytedance.common.utility;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.common.utility.g */
public final class C13616g {
    static {
        Covode.recordClassIndex(15643);
    }

    /* renamed from: a */
    public static String m24464a(JSONObject jSONObject, String str, String str2) {
        if (jSONObject == null || C13627m.m24498a(str) || !jSONObject.has(str)) {
            return str2;
        }
        return jSONObject.optString(str, str2);
    }
}
