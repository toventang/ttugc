package com.bytedance.android.livesdk.p450an;

import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.google.gson.C27910f;
import java.lang.reflect.Type;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.an.e */
public final class C6802e {

    /* renamed from: a */
    public static Keva f16866a = Keva.getRepoSync("setting_from_server", 0);

    /* renamed from: b */
    public static boolean f16867b = false;

    /* renamed from: c */
    public static boolean f16868c = false;

    /* renamed from: d */
    public static C27910f f16869d = C4139e.C4140a.f11575b;

    /* renamed from: e */
    private static JSONObject f16870e;

    /* renamed from: f */
    private static boolean f16871f = false;

    static {
        Covode.recordClassIndex(7540);
    }

    /* renamed from: a */
    public static JSONObject m14594a() {
        try {
            JSONObject jSONObject = f16870e;
            if (jSONObject == null || jSONObject.length() == 0) {
                f16870e = new JSONObject(f16866a.getString("setting_key", ""));
            }
            return f16870e;
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    /* renamed from: a */
    public static <T> T m14593a(String str, T t) {
        try {
            if (SettingsManager.INSTANCE.contains(str)) {
                return (T) SettingsManager.INSTANCE.getValueByKey(str, t.getClass(), t);
            }
            Class<?> cls = t.getClass();
            return cls == Boolean.class ? (T) Boolean.valueOf(m14594a().optBoolean(str, t.booleanValue())) : (cls == Integer.class || cls == Short.class) ? (T) Integer.valueOf(m14594a().optInt(str, t.intValue())) : cls == Float.class ? (T) Float.valueOf((float) m14594a().optDouble(str, (double) t.floatValue())) : cls == Long.class ? (T) Long.valueOf(m14594a().optLong(str, t.longValue())) : cls == Double.class ? (T) Double.valueOf(m14594a().optDouble(str, t.doubleValue())) : cls == String.class ? (T) m14594a().optString(str, t) : (T) C4139e.C4140a.f11575b.mo46671a(m14594a().toString(), (Type) cls);
        } catch (Exception e) {
            String str2 = "SettingUtil#getValue exception:" + e.getMessage() + ", setting: " + str;
            HashMap hashMap = new HashMap();
            hashMap.put("exception", str2);
            C3868c.m9491a("ttlive_settings_manager_monitor", 0, hashMap);
            return t;
        }
    }
}
