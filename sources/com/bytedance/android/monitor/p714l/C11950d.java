package com.bytedance.android.monitor.p714l;

import android.text.TextUtils;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.l.d */
public final class C11950d {
    static {
        Covode.recordClassIndex(13676);
    }

    /* renamed from: a */
    public static JSONObject m21097a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return new JSONObject();
            }
            return new JSONObject(str);
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
            return new JSONObject();
        }
    }

    /* renamed from: a */
    public static int m21096a(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.optInt(str, 0);
    }

    /* renamed from: b */
    public static String m21104b(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return "";
        }
        return jSONObject.optString(str, "");
    }

    /* renamed from: c */
    public static JSONObject m21105c(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject.optJSONObject(str);
    }

    /* renamed from: d */
    public static Object m21106d(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return new Object();
        }
        return jSONObject.opt(str);
    }

    /* renamed from: a */
    public static void m21102a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null) {
            try {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    m21100a(jSONObject, next, m21106d(jSONObject2, next));
                }
            } catch (Exception unused) {
                HybridMonitor.getInstance().getExceptionHandler();
            }
        }
    }

    /* renamed from: a */
    public static void m21098a(JSONObject jSONObject, String str, int i) {
        try {
            jSONObject.put(str, i);
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    /* renamed from: a */
    public static void m21099a(JSONObject jSONObject, String str, long j) {
        try {
            jSONObject.put(str, j);
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    /* renamed from: a */
    public static void m21100a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    /* renamed from: a */
    public static void m21101a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    /* renamed from: a */
    public static boolean m21103a(JSONObject jSONObject, String str, Boolean bool) {
        if (jSONObject == null) {
            return bool.booleanValue();
        }
        return jSONObject.optBoolean(str, bool.booleanValue());
    }
}
