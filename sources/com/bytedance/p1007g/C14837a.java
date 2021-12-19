package com.bytedance.p1007g;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.g.a */
public final class C14837a {
    static {
        Covode.recordClassIndex(16938);
    }

    /* renamed from: a */
    public static SharedPreferences m27260a(Context context, String str) {
        try {
            return C34822d.m71158a(context, str, 0);
        } catch (Exception unused) {
            if (Build.VERSION.SDK_INT >= 24) {
                return C34822d.m71158a(context.createDeviceProtectedStorageContext(), str, 0);
            }
            throw new RuntimeException("abtest SharedPreferences :".concat(String.valueOf(str)));
        }
    }

    /* renamed from: b */
    public static Map<String, Integer> m27264b(Context context, String str) {
        SharedPreferences a = m27260a(context, str);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, ?> entry : a.getAll().entrySet()) {
            if (entry.getValue() instanceof Integer) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return concurrentHashMap;
    }

    /* renamed from: c */
    public static Map<String, String> m27266c(Context context, String str) {
        SharedPreferences a = m27260a(context, str);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, ?> entry : a.getAll().entrySet()) {
            if (entry.getValue() instanceof String) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return concurrentHashMap;
    }

    /* renamed from: a */
    public static JSONObject m27261a(Context context, String str, String str2) {
        try {
            return new JSONObject(m27260a(context, str).getString(str2, ""));
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    /* renamed from: b */
    public static Set<String> m27265b(Context context, String str, String str2) {
        return new ConcurrentSkipListSet(m27260a(context, str).getStringSet(str2, new ConcurrentSkipListSet()));
    }

    /* renamed from: a */
    public static void m27262a(final Context context, final String str, final String str2, final String str3) {
        C14866k.m27292a(new Runnable() {
            /* class com.bytedance.p1007g.C14837a.RunnableC148414 */

            static {
                Covode.recordClassIndex(16942);
            }

            public final void run() {
                if (str3 == null) {
                    C14837a.m27260a(context, str).edit().remove(str2).apply();
                } else {
                    C14837a.m27260a(context, str).edit().putString(str2, str3).apply();
                }
            }
        });
    }

    /* renamed from: a */
    public static void m27263a(final Context context, final String str, final String str2, final Set<String> set) {
        C14866k.m27292a(new Runnable() {
            /* class com.bytedance.p1007g.C14837a.RunnableC148403 */

            static {
                Covode.recordClassIndex(16941);
            }

            public final void run() {
                C14837a.m27260a(context, str).edit().putStringSet(str2, set).apply();
            }
        });
    }
}
