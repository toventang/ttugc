package com.bytedance.crash.runtime.p934b;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.util.C14056j;
import com.bytedance.crash.util.C14062n;
import com.bytedance.crash.util.C14069r;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.runtime.b.c */
public final class C13999c {

    /* renamed from: a */
    public static boolean f34127a;

    /* renamed from: b */
    public static int f34128b;

    /* renamed from: c */
    public static boolean f34129c;

    /* renamed from: d */
    protected static JSONObject f34130d = new JSONObject();

    static {
        Covode.recordClassIndex(16064);
    }

    /* renamed from: a */
    public static void m25363a(JSONObject jSONObject) {
        String str;
        if (jSONObject != null) {
            try {
                File d = C14069r.m25631d(C13933m.f33936a);
                JSONObject optJSONObject = jSONObject.optJSONObject("exception_modules");
                if (optJSONObject != null) {
                    str = optJSONObject.optString("npth");
                } else {
                    str = null;
                }
                File file = new File(C14069r.m25642j(C13933m.f33936a), "npth/configCrash/configNative");
                if (str != null) {
                    JSONObject jSONObject2 = new JSONObject(str);
                    f34130d = jSONObject2;
                    if (m25364a(d, "record")) {
                        C14056j.m25566a(file, " ", false);
                        f34127a = false;
                        return;
                    }
                    m25370b(jSONObject2);
                    C14056j.m25569a(file, m25370b(jSONObject2));
                    if (file.length() > 500) {
                        f34127a = true;
                        return;
                    }
                    return;
                }
                f34130d = new JSONObject();
                C14056j.m25574a(file);
            } catch (JSONException unused) {
            } catch (Throwable th) {
                C13849d.m25014a("NPTH_CATCH", th);
            }
        }
    }

    /* renamed from: b */
    private static JSONObject m25370b(JSONObject jSONObject) {
        MethodCollector.m26663i(152);
        Iterator<String> keys = jSONObject.keys();
        C13997b bVar = new C13997b();
        JSONObject jSONObject2 = new JSONObject();
        while (keys.hasNext()) {
            String next = keys.next();
            if ("configType".equals(next)) {
                try {
                    JSONObject optJSONObject = jSONObject.optJSONObject(next);
                    if (optJSONObject == null) {
                        C13849d.m25014a("NPTH_CATCH", new IllegalArgumentException("err config with key: ".concat(String.valueOf(next))));
                        MethodCollector.m26664o(152);
                        return null;
                    }
                    f34128b = optJSONObject.getInt("npth_enable_online_coreinfo");
                    int i = Build.VERSION.SDK_INT;
                    if (f34128b == 1) {
                        jSONObject2.put(next, optJSONObject);
                        NativeImpl.doSetOnlineCoreInfo(1);
                    }
                } catch (JSONException unused) {
                    continue;
                }
            } else if (!"coreinfo_types".equals(next)) {
                continue;
            } else {
                JSONObject optJSONObject2 = jSONObject.optJSONObject(next);
                if (optJSONObject2 == null) {
                    C13849d.m25014a("NPTH_CATCH", new IllegalArgumentException("err config with key: ".concat(String.valueOf(next))));
                    MethodCollector.m26664o(152);
                    return null;
                } else if (m25366a(optJSONObject2.optJSONArray("disable"), bVar)) {
                    f34128b = 0;
                    MethodCollector.m26664o(152);
                    return null;
                } else if (!C14062n.m25595a(m25369b(optJSONObject2.optJSONArray("enable"), bVar))) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (f34128b == 1 && f34129c) {
                        jSONObject2.put(next, optJSONObject2);
                    }
                }
            }
        }
        MethodCollector.m26664o(152);
        return jSONObject2;
    }

    /* renamed from: a */
    public static boolean m25365a(String str, C13997b bVar) {
        JSONObject optJSONObject;
        JSONObject jSONObject = f34130d;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject(str)) == null || m25366a(optJSONObject.optJSONArray("disable"), bVar)) {
            return false;
        }
        return m25366a(optJSONObject.optJSONArray("enable"), bVar);
    }

    /* renamed from: b */
    private static JSONArray m25369b(JSONArray jSONArray, C13997b bVar) {
        JSONArray jSONArray2 = new JSONArray();
        if (C14062n.m25595a(jSONArray)) {
            return jSONArray2;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                C13849d.m25014a("NPTH_CATCH", new IllegalArgumentException("err config: ".concat(String.valueOf(jSONArray))));
            } else if (m25367a(optJSONObject, bVar)) {
                f34129c = true;
                jSONArray2.put(optJSONObject);
            }
        }
        return jSONArray2;
    }

    /* renamed from: a */
    private static boolean m25364a(File file, String str) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        for (File file2 : listFiles) {
            try {
                if (!file2.isDirectory() && file2.getName().startsWith(str) && file2.length() > 0) {
                    long parseLong = Long.parseLong(C14056j.m25557a(file2.getAbsoluteFile(), "\n"));
                    if (currentTimeMillis > parseLong && currentTimeMillis - parseLong < 604800) {
                        return true;
                    }
                    if (currentTimeMillis > parseLong && currentTimeMillis - parseLong >= 604800) {
                        C14056j.m25574a(file2.getAbsoluteFile());
                        return false;
                    }
                }
            } catch (Throwable th) {
                C13849d.m25014a("NPTH_CATCH", th);
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m25366a(JSONArray jSONArray, C13997b bVar) {
        if (C14062n.m25595a(jSONArray)) {
            return false;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                C13849d.m25014a("NPTH_CATCH", new IllegalArgumentException("err config: ".concat(String.valueOf(jSONArray))));
            } else if (m25367a(optJSONObject, bVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m25367a(JSONObject jSONObject, C13997b bVar) {
        Iterator<String> keys = jSONObject.keys();
        boolean z = false;
        while (keys.hasNext()) {
            String next = keys.next();
            if (!TextUtils.isEmpty(next)) {
                z = true;
                if (next.startsWith("header_")) {
                    if (!m25368a(jSONObject.optJSONObject(next), bVar.mo22514b(next.substring(7)))) {
                        return false;
                    }
                } else if (next.startsWith("java_") && !m25368a(jSONObject.optJSONObject(next), bVar.mo22489a(next.substring(5)))) {
                    return false;
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m25368a(JSONObject jSONObject, Object obj) {
        JSONArray optJSONArray = jSONObject.optJSONArray("values");
        if (optJSONArray.length() == 0) {
            return false;
        }
        String optString = jSONObject.optString("op");
        String valueOf = String.valueOf(obj);
        if (optString.equals("=")) {
            return valueOf.equals(String.valueOf(optJSONArray.opt(0)));
        }
        if (optString.equals("in")) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                if (String.valueOf(optJSONArray.opt(i)).equals(valueOf)) {
                    return true;
                }
            }
        }
        return false;
    }
}
