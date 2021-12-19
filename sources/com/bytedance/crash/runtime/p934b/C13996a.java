package com.bytedance.crash.runtime.p934b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.entity.C13865c;
import com.bytedance.crash.runtime.C14005e;
import com.bytedance.crash.util.C14062n;
import com.bytedance.crash.util.C14075v;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.runtime.b.a */
public class C13996a {

    /* renamed from: a */
    protected static HashMap<String, C13996a> f34118a = new HashMap<>();

    /* renamed from: b */
    public JSONObject f34119b;

    /* renamed from: c */
    public JSONObject f34120c;

    /* renamed from: d */
    public JSONObject f34121d;

    /* renamed from: e */
    public boolean f34122e;

    /* renamed from: f */
    private final String f34123f;

    static {
        Covode.recordClassIndex(16061);
    }

    /* renamed from: b */
    public static JSONArray m25353b() {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry<String, C13996a> entry : f34118a.entrySet()) {
            JSONObject jSONObject = new JSONObject();
            C14062n.m25593a(jSONObject, entry.getKey(), entry.getValue().f34119b);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    /* renamed from: a */
    public long mo22513a() {
        return Long.decode(C14062n.m25599b(this.f34119b, "over_all", "get_settings_interval")).longValue() * 1000;
    }

    /* renamed from: a */
    public static C13996a m25349a(Object obj) {
        return m25358e(C13865c.m25083c(obj));
    }

    /* renamed from: b */
    public static JSONObject m25354b(String str) {
        C13996a aVar = f34118a.get(str);
        if (aVar != null) {
            return aVar.f34119b;
        }
        return null;
    }

    /* renamed from: b */
    private static boolean m25355b(JSONObject jSONObject) {
        if (jSONObject == null || C14062n.m25590a(jSONObject, 0, "exception_modules", "exception", "enable_upload") != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m25356c(String str) {
        C13996a aVar = f34118a.get(str);
        if (aVar == null || aVar.f34122e) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static long m25357d(String str) {
        C13996a aVar = f34118a.get(str);
        if (aVar == null) {
            return 3600000;
        }
        try {
            return aVar.mo22513a();
        } catch (Throwable unused) {
            return 3600000;
        }
    }

    /* renamed from: e */
    private static C13996a m25358e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return f34118a.get(str);
    }

    /* renamed from: a */
    private void m25351a(JSONObject jSONObject) {
        this.f34119b = jSONObject;
        this.f34122e = m25355b(jSONObject);
    }

    /* renamed from: a */
    public static boolean m25352a(String str) {
        if (f34118a.get(str) != null) {
            return true;
        }
        return false;
    }

    public C13996a(JSONObject jSONObject, String str) {
        this.f34123f = str;
        m25351a(jSONObject);
        f34118a.put(str, this);
        C14075v.m25650a("after update aid ".concat(String.valueOf(str)));
    }

    /* renamed from: a */
    public static void m25350a(String str, JSONObject jSONObject) {
        C13996a aVar = f34118a.get(str);
        if (aVar != null) {
            aVar.m25351a(jSONObject);
        } else {
            new C14005e(jSONObject, str);
        }
    }
}
