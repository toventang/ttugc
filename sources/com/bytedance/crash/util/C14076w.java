package com.bytedance.crash.util;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.C13864b;
import com.bytedance.crash.runtime.C14018m;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.util.w */
public final class C14076w {
    static {
        Covode.recordClassIndex(16143);
    }

    /* renamed from: a */
    public static boolean m25663a(File file) {
        return file.exists() && file.length() > 128;
    }

    /* renamed from: a */
    private static void m25661a(JSONObject jSONObject, JSONObject jSONObject2, File file) {
        if (file != null) {
            m25658a("has_logcat_file", m25663a(new File(file, "logcat.txt")), jSONObject, jSONObject2);
            C13864b.m25056a(jSONObject, "filters", "logcat_type", new File(file, "logerr.txt").exists() ? "native" : "java");
            m25658a("has_maps_file", m25663a(new File(file, "maps.txt")), jSONObject, jSONObject2);
            m25658a("has_meminfo_file", m25663a(new File(file, "meminfo.txt")), jSONObject, jSONObject2);
            m25658a("has_threads_file", m25663a(new File(file, "threads.txt")), jSONObject, jSONObject2);
            m25658a("has_pthreads_file", m25663a(C14069r.m25632d(file)), jSONObject, jSONObject2);
            m25658a("has_malloc_file", m25663a(C14069r.m25628c(file)), jSONObject, jSONObject2);
            m25658a("has_fds_file", m25663a(new File(file, "fds.txt")), jSONObject, jSONObject2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0099  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m25662a(org.json.JSONObject r7, org.json.JSONObject r8, org.json.JSONObject r9, org.json.JSONObject r10) {
        /*
        // Method dump skipped, instructions count: 182
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.C14076w.m25662a(org.json.JSONObject, org.json.JSONObject, org.json.JSONObject, org.json.JSONObject):void");
    }

    /* renamed from: a */
    private static void m25657a(String str, JSONObject jSONObject) {
        try {
            jSONObject.put(str, 1);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: g */
    private static void m25669g(JSONObject jSONObject, JSONObject jSONObject2) {
        m25655a(jSONObject.opt("launch_did"), "launch_did", jSONObject2);
    }

    /* renamed from: a */
    public static int m25652a(Object obj, int i) {
        if (obj == null) {
            return i;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt(String.valueOf(obj));
            } catch (Throwable unused) {
            }
        }
        return i;
    }

    /* renamed from: e */
    private static void m25667e(JSONObject jSONObject, JSONObject jSONObject2) {
        m25655a(jSONObject.opt("battery"), "battery", jSONObject2);
        m25655a(jSONObject.opt("filters"), "filters", jSONObject2);
    }

    /* renamed from: b */
    private static void m25664b(JSONObject jSONObject, JSONObject jSONObject2) {
        int i;
        boolean z = false;
        try {
            if (new JSONObject(jSONObject.optString("data")).optString("mainStackFromTrace").trim().startsWith("at")) {
                i = 0;
            } else {
                i = 1;
            }
        } catch (Throwable unused) {
            i = -1;
        }
        m25654a((Object) 1, (Object) Integer.valueOf(i), "has_native_stack", jSONObject2);
        if (i == 1) {
            z = true;
        }
        C13864b.m25056a(jSONObject, "filters", "has_native_stack", String.valueOf(z));
    }

    /* renamed from: c */
    private static void m25665c(JSONObject jSONObject, JSONObject jSONObject2) {
        m25655a(jSONObject.opt("miniapp_id"), "miniapp_id", jSONObject2);
        m25655a(jSONObject.opt("plugin_info"), "plugin_info", jSONObject2);
        m25655a(jSONObject.opt("process_name"), "process_name", jSONObject2);
        m25655a(jSONObject.opt("plugin_info"), "plugin_info", jSONObject2);
    }

    /* renamed from: d */
    private static void m25666d(JSONObject jSONObject, JSONObject jSONObject2) {
        m25655a(jSONObject.opt("pid"), "pid", jSONObject2);
        m25655a(jSONObject.opt("app_start_time"), "app_start_time", jSONObject2);
        m25655a(jSONObject.opt("app_start_time_readable"), "app_start_time_readable", jSONObject2);
        m25655a(jSONObject.opt("patch_info"), "patch_info", jSONObject2);
        m25655a(jSONObject.opt("is_background"), "is_background", jSONObject2);
        m25655a(jSONObject.opt("activity_trace"), "activity_trace", jSONObject2);
        m25655a(jSONObject.opt("custom_long"), "custom_long", jSONObject2);
        m25655a(jSONObject.opt("custom"), "custom", jSONObject2);
        if (jSONObject.optJSONObject("custom_long") != null) {
            m25655a(jSONObject.optJSONObject("custom_long").opt("activity_track"), "activity_track", jSONObject2);
        }
    }

    /* renamed from: f */
    private static void m25668f(JSONObject jSONObject, JSONObject jSONObject2) {
        m25655a(jSONObject.opt("logcat"), "logcat", jSONObject2);
        C13864b.m25056a(jSONObject, "filters", "has_logcat", String.valueOf(!C14062n.m25598a(jSONObject, "logcat")));
        m25655a(jSONObject.opt("crash_time"), "crash_time", jSONObject2);
        m25655a(jSONObject.opt("crash_uuid"), "crash_uuid", jSONObject2);
        m25655a(jSONObject.opt("storage"), "storage", jSONObject2);
        m25655a(jSONObject.opt("filters"), "filters", jSONObject2);
        if (jSONObject.opt("filters") != null) {
            m25655a(jSONObject.optJSONObject("filters").opt("sdk_version"), "filters:sdk_version", jSONObject2);
            m25655a(jSONObject.optJSONObject("filters").opt("is_root"), "filters:is_root", jSONObject2);
            m25655a(jSONObject.optJSONObject("filters").opt("is_64_devices"), "filters:is_64_devices", jSONObject2);
            m25655a(jSONObject.optJSONObject("filters").opt("is_64_runtime"), "filters:is_64_runtime", jSONObject2);
            m25655a(jSONObject.optJSONObject("filters").opt("is_x86_devices"), "filters:is_x86_devices", jSONObject2);
        }
    }

    /* renamed from: a */
    public static void m25659a(JSONObject jSONObject, File file) {
        CrashType crashType;
        Object opt = jSONObject.opt("data");
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (opt == null) {
            C13933m.f33942g.isDebugMode();
        } else if (optJSONObject == null) {
            C13933m.f33942g.isDebugMode();
        } else {
            if (opt instanceof JSONArray) {
                crashType = CrashType.LAUNCH;
                C13933m.f33942g.isDebugMode();
                jSONObject = ((JSONArray) opt).optJSONObject(0);
                m25669g(jSONObject, jSONObject2);
            } else if (jSONObject.optInt("is_anr") == 1) {
                crashType = CrashType.ANR;
                m25664b(jSONObject, jSONObject2);
                C13933m.f33942g.isDebugMode();
            } else if (jSONObject.optInt("is_native_crash") == 1) {
                crashType = CrashType.NATIVE;
                C13933m.f33942g.isDebugMode();
            } else if (jSONObject.optInt("is_dart") == 1) {
                C13933m.f33942g.isDebugMode();
                return;
            } else {
                crashType = CrashType.JAVA;
                C13933m.f33942g.isDebugMode();
            }
            C14062n.m25593a(jSONObject2, "crash_type", crashType);
            C14062n.m25593a(jSONObject2, "succ_step", Integer.valueOf(jSONObject.optInt("succ_step", -1)));
            m25668f(jSONObject, jSONObject2);
            m25662a(optJSONObject, jSONObject, jSONObject2, jSONObject3);
            m25660a(jSONObject, jSONObject2);
            m25661a(jSONObject, jSONObject2, file);
            C14018m.m25417a("crash_data_check", jSONObject2, jSONObject3);
        }
    }

    /* renamed from: a */
    private static void m25660a(JSONObject jSONObject, JSONObject jSONObject2) {
        m25665c(jSONObject, jSONObject2);
        m25666d(jSONObject, jSONObject2);
        m25667e(jSONObject, jSONObject2);
    }

    /* renamed from: a */
    private static void m25653a(long j, String str, JSONObject jSONObject) {
        if (j != 0) {
            C14062n.m25593a(jSONObject, str, Long.valueOf(j));
        }
    }

    /* renamed from: a */
    private static void m25655a(Object obj, String str, JSONObject jSONObject) {
        if (obj == null) {
            m25657a("err_null_".concat(String.valueOf(str)), jSONObject);
        }
    }

    /* renamed from: a */
    private static void m25656a(String str, String str2, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            m25657a("err_empty_".concat(String.valueOf(str2)), jSONObject);
        }
    }

    /* renamed from: a */
    private static void m25654a(Object obj, Object obj2, String str, JSONObject jSONObject) {
        if (obj == obj2) {
            return;
        }
        if (obj == null) {
            m25657a("err_" + str + "_not_" + obj, jSONObject);
        } else if (!obj.equals(obj2)) {
            m25657a("err_" + str + "_not_" + obj, jSONObject);
        }
    }

    /* renamed from: a */
    private static void m25658a(String str, boolean z, JSONObject jSONObject, JSONObject jSONObject2) {
        if (!z) {
            m25657a(str + "_false", jSONObject2);
        }
        C13864b.m25056a(jSONObject, "filters", str, String.valueOf(z));
    }
}
