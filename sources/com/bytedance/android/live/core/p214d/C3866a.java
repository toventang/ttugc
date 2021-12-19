package com.bytedance.android.live.core.p214d;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.core.d.a */
public class C3866a {
    static {
        Covode.recordClassIndex(4395);
    }

    /* renamed from: a */
    public static void m9477a(JSONObject jSONObject, Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m9472a(JSONObject jSONObject, String str, double d) {
        try {
            jSONObject.put(str, d);
        } catch (JSONException e) {
            C3854a.m9460b("BaseMonitor", "", e);
        }
    }

    /* renamed from: a */
    public static void m9473a(JSONObject jSONObject, String str, float f) {
        try {
            jSONObject.put(str, (double) f);
        } catch (JSONException e) {
            C3854a.m9460b("BaseMonitor", "", e);
        }
    }

    /* renamed from: a */
    public static void m9474a(JSONObject jSONObject, String str, long j) {
        try {
            jSONObject.put(str, j);
        } catch (JSONException e) {
            C3854a.m9460b("BaseMonitor", "", e);
        }
    }

    /* renamed from: a */
    public static void m9475a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            C3854a.m9460b("BaseMonitor", "", e);
        }
    }

    /* renamed from: a */
    public static void m9476a(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        try {
            jSONObject.put(str, jSONObject2);
        } catch (JSONException e) {
            C3854a.m9460b("BaseMonitor", "", e);
        }
    }
}
