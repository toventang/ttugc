package com.bytedance.crash.entity;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICommonParams;
import com.bytedance.crash.nativecrash.C13949c;
import com.bytedance.crash.nativecrash.C13953e;
import com.bytedance.crash.p930h.C13879a;
import com.bytedance.crash.util.C14042ab;
import com.bytedance.crash.util.C14044b;
import com.bytedance.crash.util.C14062n;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.entity.b */
public class C13864b {

    /* renamed from: a */
    public final JSONObject f33757a;

    /* renamed from: b */
    private Header f33758b;

    static {
        Covode.recordClassIndex(15923);
    }

    /* renamed from: a */
    private static String m25054a(long j) {
        return j <= 1024 ? "0 - 1K" : j <= 65536 ? "1K - 64K" : j <= 524288 ? "64K - 512K" : j <= 1048576 ? "512K - 1M" : j <= 67108864 ? "1M - 64M" : "64M - ";
    }

    /* renamed from: a */
    public static boolean m25060a(String str) {
        return ((long) C13953e.m25271c(str)) > C13949c.m25255c();
    }

    /* renamed from: a */
    public final C13864b mo22345a(JSONObject jSONObject) {
        mo22346a("header", jSONObject);
        return this;
    }

    /* renamed from: a */
    public final Header mo22335a() {
        if (this.f33758b == null) {
            Header header = new Header(C13933m.f33936a);
            this.f33758b = header;
            mo22338a(header);
        }
        return this.f33758b;
    }

    /* renamed from: a */
    public final C13864b mo22336a(long j, long j2) {
        try {
            mo22346a("app_start_time", Long.valueOf(j));
            if (j2 != 0) {
                mo22346a("app_start_up_time", Long.valueOf(j2));
            }
            mo22346a("app_start_time_readable", (Object) new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.getDefault()).format(new Date(j)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    /* renamed from: a */
    public final C13864b mo22343a(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        if (list == null || list.isEmpty()) {
            mo22346a("patch_info", (Object) jSONArray);
            return this;
        }
        for (String str : list) {
            jSONArray.put(str);
        }
        mo22346a("patch_info", (Object) jSONArray);
        return this;
    }

    /* renamed from: a */
    public final C13864b mo22341a(String str, List<String> list) {
        if (list == null) {
            return this;
        }
        JSONArray jSONArray = new JSONArray();
        for (String str2 : list) {
            jSONArray.put(str2);
        }
        mo22342a(str, jSONArray);
        return this;
    }

    /* renamed from: a */
    public final C13864b mo22342a(String str, JSONArray jSONArray) {
        JSONObject optJSONObject = this.f33757a.optJSONObject("custom_long");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            mo22346a("custom_long", optJSONObject);
        }
        C14062n.m25593a(optJSONObject, str, jSONArray);
        return this;
    }

    /* renamed from: a */
    public final C13864b mo22340a(String str, String str2) {
        m25056a(mo22349b(), "filters", str, str2);
        return this;
    }

    /* renamed from: a */
    public final void mo22346a(String str, Object obj) {
        C14062n.m25593a(this.f33757a, str, obj);
    }

    /* renamed from: a */
    public final C13864b mo22337a(ICommonParams iCommonParams) {
        JSONArray jSONArray;
        Throwable th;
        boolean z = C13879a.f33807a;
        C14062n.m25593a(this.f33757a, "mira_init", Boolean.valueOf(z));
        if (z) {
            jSONArray = C13879a.m25107a();
            if (jSONArray == null) {
                try {
                    Map<String, Integer> pluginInfo = iCommonParams.getPluginInfo();
                    if (pluginInfo != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        try {
                            for (Map.Entry<String, Integer> entry : pluginInfo.entrySet()) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("package_name", entry.getKey());
                                jSONObject.put("version_code", entry.getValue());
                                jSONArray2.put(jSONObject);
                            }
                            jSONArray = jSONArray2;
                        } catch (Throwable th2) {
                            th = th2;
                            jSONArray = jSONArray2;
                            try {
                                this.f33757a.put("Code err:\n" + C14042ab.m25488a(th), 0);
                            } catch (Throwable unused) {
                            }
                            C14062n.m25593a(this.f33757a, "plugin_info", jSONArray);
                            return this;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    this.f33757a.put("Code err:\n" + C14042ab.m25488a(th), 0);
                    C14062n.m25593a(this.f33757a, "plugin_info", jSONArray);
                    return this;
                }
            }
        } else {
            jSONArray = null;
        }
        C14062n.m25593a(this.f33757a, "plugin_info", jSONArray);
        return this;
    }

    /* renamed from: a */
    public final C13864b mo22344a(Map<? extends String, ? extends String> map) {
        JSONObject jSONObject;
        JSONObject optJSONObject;
        if (map != null) {
            Object opt = this.f33757a.opt("data");
            if (opt instanceof JSONArray) {
                jSONObject = ((JSONArray) opt).optJSONObject(0);
            } else {
                jSONObject = this.f33757a;
            }
            if (jSONObject == null) {
                optJSONObject = new JSONObject();
            } else {
                optJSONObject = jSONObject.optJSONObject("filters");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                    mo22346a("filters", optJSONObject);
                }
            }
            for (Map.Entry<? extends String, ? extends String> entry : map.entrySet()) {
                C14062n.m25593a(optJSONObject, (String) entry.getKey(), entry.getValue());
            }
            mo22346a("filters", optJSONObject);
        }
        return this;
    }

    public C13864b() {
        this.f33757a = new JSONObject();
    }

    /* renamed from: b */
    public final JSONObject mo22349b() {
        Object opt = this.f33757a.opt("data");
        if (opt instanceof JSONArray) {
            return ((JSONArray) opt).optJSONObject(0);
        }
        return this.f33757a;
    }

    public C13864b(JSONObject jSONObject) {
        this.f33757a = jSONObject;
    }

    /* renamed from: c */
    public final void mo22351c(JSONObject jSONObject) {
        m25061b(this.f33757a, jSONObject);
    }

    /* renamed from: b */
    public static boolean m25062b(String str) {
        if (C13953e.m25267a(str) > 960) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m25063c(String str) {
        if (C13953e.m25270b(str) > 350) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C13864b mo22338a(Header header) {
        mo22346a("header", header.f33753a);
        this.f33758b = header;
        return this;
    }

    /* renamed from: b */
    public final C13864b mo22348b(JSONObject jSONObject) {
        m25059a(this.f33757a, jSONObject);
        return this;
    }

    /* renamed from: a */
    public final C13864b mo22339a(String str, long j) {
        m25055a(this.f33757a, "features_num", str, j);
        return this;
    }

    /* renamed from: b */
    public final C13864b mo22347b(String str, String str2) {
        m25056a(this.f33757a, "features_str", str, str2);
        return this;
    }

    /* renamed from: c */
    public final C13864b mo22350c(String str, String str2) {
        m25056a(mo22349b(), "custom", str, str2);
        return this;
    }

    /* renamed from: b */
    public static void m25061b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null && jSONObject2.length() > 0) {
            try {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object opt = jSONObject.opt(next);
                    if (opt == null) {
                        jSONObject.put(next, jSONObject2.opt(next));
                    } else if (opt instanceof JSONObject) {
                        m25061b(jSONObject.getJSONObject(next), jSONObject2.getJSONObject(next));
                    } else if (opt instanceof JSONArray) {
                        JSONArray optJSONArray = jSONObject2.optJSONArray(next);
                        if (optJSONArray != null) {
                            JSONArray jSONArray = (JSONArray) opt;
                            if (jSONArray.length() != 1 || !(jSONArray.opt(0) instanceof JSONObject) || !(optJSONArray.opt(0) instanceof JSONObject)) {
                                for (int i = 0; i < optJSONArray.length(); i++) {
                                    jSONArray.put(optJSONArray.get(i));
                                }
                            } else {
                                m25061b(jSONArray.getJSONObject(0), optJSONArray.getJSONObject(0));
                            }
                        }
                    } else {
                        jSONObject.put(next, jSONObject2.opt(next));
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m25057a(JSONObject jSONObject, Throwable th) {
        if (jSONObject.opt("npth_err_info") == null) {
            try {
                jSONObject.put("npth_err_info", C14042ab.m25488a(th));
            } catch (Throwable unused) {
            }
        } else {
            int i = 0;
            while (jSONObject.opt("npth_err_info" + i) != null) {
                i++;
                if (i >= 5) {
                    return;
                }
            }
            try {
                jSONObject.put("npth_err_info" + i, C14042ab.m25488a(th));
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: a */
    public static void m25058a(JSONObject jSONObject, Map<? extends String, ? extends String> map) {
        if (map != null) {
            try {
                for (Map.Entry<? extends String, ? extends String> entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m25059a(JSONObject jSONObject, JSONObject jSONObject2) {
        C14062n.m25593a(jSONObject, "storage", jSONObject2);
        long optLong = jSONObject2.optLong("inner_free");
        long optLong2 = jSONObject2.optLong("sdcard_free");
        long optLong3 = jSONObject2.optLong("inner_free_real");
        String a = m25054a(optLong);
        String a2 = m25054a(optLong2);
        String a3 = m25054a(optLong3);
        m25056a(jSONObject, "filters", "inner_free", a);
        m25056a(jSONObject, "filters", "inner_free_real", a3);
        m25056a(jSONObject, "filters", "sdcard_free", a2);
    }

    /* renamed from: a */
    public static void m25055a(JSONObject jSONObject, String str, String str2, long j) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (optJSONObject == null) {
                try {
                    optJSONObject = new JSONObject();
                    jSONObject.put(str, optJSONObject);
                } catch (Throwable unused) {
                    return;
                }
            }
            optJSONObject.put(str2, j);
        }
    }

    /* renamed from: a */
    public static C13864b m25053a(Context context, String str, String str2, String str3) {
        C13864b bVar = new C13864b();
        bVar.mo22346a("crash_time", Long.valueOf(System.currentTimeMillis()));
        bVar.mo22346a("process_name", (Object) C14044b.m25520c(context));
        bVar.mo22346a("crash_name", (Object) str);
        bVar.mo22346a("crash_reason", (Object) str2);
        bVar.mo22346a("data", (Object) str3);
        bVar.mo22346a("crash_type", (Object) CrashType.GAME.getName());
        C14044b.m25512a(context, bVar.f33757a);
        return bVar;
    }

    /* renamed from: a */
    public static void m25056a(JSONObject jSONObject, String str, String str2, Object obj) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
                C14062n.m25593a(jSONObject, str, optJSONObject);
            }
            C14062n.m25593a(optJSONObject, str2, obj);
        }
    }
}
