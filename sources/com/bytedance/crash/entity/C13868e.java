package com.bytedance.crash.entity;

import android.provider.Settings;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.util.C14062n;
import com.bytedance.crash.util.C14075v;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.entity.e */
public final class C13868e {

    /* renamed from: a */
    public static boolean f33762a;

    /* renamed from: b */
    public static boolean f33763b;

    /* renamed from: c */
    private static JSONObject f33764c;

    /* renamed from: d */
    private static String f33765d;

    /* renamed from: e */
    private static String f33766e;

    static {
        Covode.recordClassIndex(15927);
    }

    /* renamed from: a */
    public static boolean m25089a() {
        return "true".equals(f33765d);
    }

    /* renamed from: b */
    public static boolean m25091b() {
        return "true".equals(f33766e);
    }

    /* renamed from: d */
    public static JSONObject m25094d() {
        if (f33764c == null) {
            try {
                f33764c = new JSONObject(Settings.Global.getString(C13933m.f33936a.getContentResolver(), "bytest_automation_info"));
            } catch (JSONException unused) {
                f33764c = new JSONObject();
            } catch (Throwable unused2) {
            }
        }
        return f33764c;
    }

    /* renamed from: c */
    public static void m25092c() {
        m25094d();
        if (!C14062n.m25597a(f33764c)) {
            f33763b = true;
            Iterator<String> keys = f33764c.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if ("slardar_filter".equals(next)) {
                    JSONObject optJSONObject = f33764c.optJSONObject(next);
                    if (optJSONObject == null) {
                        C14075v.m25651b("bytest config is null");
                        return;
                    }
                    f33765d = optJSONObject.optString("core_dump_switch");
                    f33766e = optJSONObject.optString("gwp_asan_switch");
                    f33762a = "true".equals(optJSONObject.optString("is_all_exception_collected"));
                }
            }
        }
    }

    /* renamed from: a */
    public static void m25088a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                m25093c(jSONObject);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    static void m25090b(JSONObject jSONObject) {
        Object opt;
        m25094d();
        JSONObject jSONObject2 = f33764c;
        if (jSONObject2 != null) {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!"slardar_filter".equals(next) && (opt = f33764c.opt(next)) != null) {
                    try {
                        jSONObject.put(next, opt);
                    } catch (JSONException unused) {
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private static void m25093c(JSONObject jSONObject) {
        m25094d();
        JSONObject jSONObject2 = f33764c;
        if (jSONObject2 != null) {
            JSONObject optJSONObject = jSONObject2.optJSONObject("slardar_filter");
            if (!C14062n.m25597a(optJSONObject)) {
                JSONObject optJSONObject2 = jSONObject.optJSONObject("filters");
                if (optJSONObject2 == null) {
                    optJSONObject2 = new JSONObject();
                    try {
                        jSONObject.put("filters", optJSONObject2);
                    } catch (JSONException unused) {
                    }
                }
                C13864b.m25061b(optJSONObject2, optJSONObject);
            }
        }
    }
}
