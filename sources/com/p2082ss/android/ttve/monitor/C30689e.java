package com.p2082ss.android.ttve.monitor;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.sdkmonitor.C14827k;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.vesdk.p4391g.C85509a;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ttve.monitor.e */
public final class C30689e {

    /* renamed from: a */
    public static boolean f73390a = true;

    /* renamed from: b */
    public static Thread f73391b;

    /* renamed from: c */
    public static volatile boolean f73392c;

    /* renamed from: d */
    public static final Object f73393d = new Object();

    /* renamed from: e */
    public static boolean f73394e = false;

    static {
        Covode.recordClassIndex(37259);
    }

    /* renamed from: a */
    public static void m63051a() {
        MethodCollector.m26663i(1544);
        if (!f73394e || f73392c) {
            MethodCollector.m26664o(1544);
            return;
        }
        synchronized (f73393d) {
            while (!f73392c) {
                try {
                    try {
                        System.currentTimeMillis();
                        f73393d.wait();
                        System.currentTimeMillis();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } finally {
                    MethodCollector.m26664o(1544);
                }
            }
        }
    }

    /* renamed from: a */
    static String m63049a(String str) {
        if (!f73390a) {
            return null;
        }
        m63051a();
        return C30685c.m63036a(str);
    }

    /* renamed from: a */
    public static Object m63048a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(1533);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(1533);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public static void m63054a(String str, String str2) {
        JSONObject jSONObject;
        if (f73390a) {
            m63051a();
            C14827k a = C30685c.m63035a();
            if (a != null && (jSONObject = a.f36155b) != null) {
                try {
                    jSONObject.put(str, str2);
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m63052a(String str, int i, C85509a aVar) {
        JSONObject a;
        if (f73390a) {
            m63051a();
            if (aVar == null) {
                a = null;
            } else {
                a = aVar.mo131336a();
            }
            C30685c.m63038a(str, i, a);
        }
    }

    /* renamed from: a */
    public static void m63053a(String str, int i, JSONObject jSONObject) {
        if (f73390a && jSONObject != null) {
            m63051a();
            if (TextUtils.isEmpty(m63049a("device_id"))) {
                m63054a("device_id", "Unknown");
            }
            if (TextUtils.isEmpty(m63049a("user_id"))) {
                m63054a("user_id", "Unknown");
            }
            if (TextUtils.isEmpty(m63049a("app_version"))) {
                m63054a("app_version", "Unknown");
            }
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("model", C30691f.f73401c);
                hashMap.put("cpu", C30691f.f73402d);
                hashMap.put("cpu_freq", C30691f.f73403e);
                hashMap.put("cpu_core", C30691f.f73404f);
                hashMap.put("memory", C30691f.f73405g);
                hashMap.put("storage", C30691f.f73406h);
                hashMap.put("external_storage", C30691f.f73407i);
                hashMap.put("screen_width", C30691f.f73408j);
                hashMap.put("screen_height", C30691f.f73409k);
                hashMap.put("os_sdk_int", C30691f.f73410l);
                hashMap.put("appid", C30691f.f73411m);
                hashMap.put("abi", C30691f.f73412n);
                hashMap.put("brand", C30691f.f73413o);
                if (!C30691f.f73399a) {
                    C30691f.f73414p = "10.5.0.161";
                    C30691f.f73399a = true;
                }
                hashMap.put("ve_version", C30691f.f73414p);
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str2 = (String) entry.getValue();
                    if (!C30691f.f73400b.contains(entry.getKey())) {
                        jSONObject.put("te_device_info_" + ((String) entry.getKey()), str2);
                    } else if (!TextUtils.isEmpty(str2)) {
                        try {
                            jSONObject.put("te_device_info_" + ((String) entry.getKey()), (double) Float.parseFloat(str2));
                        } catch (Exception unused) {
                            entry.getKey();
                        }
                    }
                }
            } catch (JSONException unused2) {
            }
            C30685c.m63038a(str, i, jSONObject);
        }
    }

    /* renamed from: a */
    static JSONObject m63050a(Context context, String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_id", str);
            try {
                jSONObject.put("app_version", context.getPackageManager().getPackageInfo(context.getPackageName(), 128).versionName);
            } catch (PackageManager.NameNotFoundException unused) {
                jSONObject.put("app_version", "vesdk:10.5.0.161");
            }
            jSONObject.put("ve_version", "10.5.0.161");
            jSONObject.put("effect_version", "10.5.0_rel_27_mt_202112020108_bc0fd2cb7df");
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("channel", "10.5.0.161" + "-mt");
            jSONObject.put("package_name", context.getPackageName());
            jSONObject.put("user_id", str2);
            jSONObject.put("version_code", str3);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
