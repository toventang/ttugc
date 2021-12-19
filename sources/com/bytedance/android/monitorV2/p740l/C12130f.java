package com.bytedance.android.monitorV2.p740l;

import android.text.TextUtils;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitorV2.l.f */
public final class C12130f {
    static {
        Covode.recordClassIndex(13859);
    }

    /* renamed from: a */
    public static JSONObject m21648a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return new JSONObject();
            }
            return new JSONObject(str);
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
            return new JSONObject();
        }
    }

    /* renamed from: a */
    public static int m21647a(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.optInt(str, 0);
    }

    /* renamed from: b */
    public static long m21655b(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.optLong(str, 0);
    }

    /* renamed from: c */
    public static String m21657c(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return "";
        }
        return jSONObject.optString(str, "");
    }

    /* renamed from: d */
    public static JSONObject m21658d(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject.optJSONObject(str);
    }

    /* renamed from: e */
    public static Object m21659e(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return new Object();
        }
        return jSONObject.opt(str);
    }

    /* renamed from: b */
    public static JSONObject m21656b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    m21653a(jSONObject3, jSONObject2);
                    return jSONObject3;
                } catch (Throwable unused) {
                    jSONObject = jSONObject3;
                    HybridMultiMonitor.getInstance().getExceptionHandler();
                    return jSONObject;
                }
            } catch (Throwable unused2) {
                HybridMultiMonitor.getInstance().getExceptionHandler();
                return jSONObject;
            }
        } else if (jSONObject2 == null) {
            return jSONObject;
        } else {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject2.opt(next);
                if (opt instanceof JSONObject) {
                    m21651a(jSONObject, next, m21656b(jSONObject.optJSONObject(next), jSONObject2.optJSONObject(next)));
                } else {
                    m21651a(jSONObject, next, opt);
                }
            }
            return jSONObject;
        }
    }

    /* renamed from: a */
    public static void m21653a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null) {
            try {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    m21651a(jSONObject, next, m21659e(jSONObject2, next));
                }
            } catch (Exception unused) {
                HybridMultiMonitor.getInstance().getExceptionHandler();
            }
        }
    }

    /* renamed from: a */
    public static void m21649a(JSONObject jSONObject, String str, int i) {
        try {
            jSONObject.put(str, i);
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    /* renamed from: a */
    public static void m21650a(JSONObject jSONObject, String str, long j) {
        try {
            jSONObject.put(str, j);
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    /* renamed from: a */
    public static void m21651a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    /* renamed from: a */
    public static void m21652a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    /* renamed from: a */
    public static boolean m21654a(JSONObject jSONObject, JSONObject jSONObject2, String... strArr) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        for (String str : strArr) {
            if (!m21657c(jSONObject, str).equals(m21657c(jSONObject2, str))) {
                return false;
            }
        }
        return true;
    }
}
