package com.bytedance.p1734ug.sdk.region.data.p1743h;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ug.sdk.region.data.h.a */
public final class C23482a {
    static {
        Covode.recordClassIndex(27483);
    }

    /* renamed from: a */
    public static int m44169a(JSONObject jSONObject, String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return jSONObject.optInt(str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static String m44172b(JSONObject jSONObject, String str, String str2) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return str2;
        }
        try {
            str2 = jSONObject.optString(str);
            return str2;
        } catch (Throwable unused) {
            return str2;
        }
    }

    /* renamed from: a */
    public static long m44170a(JSONObject jSONObject, String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return j;
        }
        try {
            return jSONObject.optLong(str, j);
        } catch (Throwable unused) {
            return j;
        }
    }

    /* renamed from: a */
    public static void m44171a(JSONObject jSONObject, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject.put(str, str2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
