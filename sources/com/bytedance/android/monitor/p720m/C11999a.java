package com.bytedance.android.monitor.p720m;

import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.m.a */
public final class C11999a {
    static {
        Covode.recordClassIndex(13726);
    }

    /* renamed from: a */
    public static void m21194a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static void m21195a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (Exception unused) {
        }
    }
}
