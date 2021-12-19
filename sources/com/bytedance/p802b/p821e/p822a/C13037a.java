package com.bytedance.p802b.p821e.p822a;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p834j.C13104c;
import com.bytedance.p802b.p841k.C13113a;
import com.bytedance.services.apm.api.C22710c;
import com.bytedance.services.apm.api.IHttpService;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.b.e.a.a */
public class C13037a extends C13113a {

    /* renamed from: a */
    public static AbstractC13038b f31819a;

    /* renamed from: b */
    public static long f31820b = -1;

    /* renamed from: c */
    public static long f31821c;

    /* renamed from: d */
    public static long f31822d = -1;

    /* renamed from: h */
    private static String f31823h;

    /* renamed from: i */
    private static Boolean f31824i;

    /* renamed from: j */
    private static String f31825j;

    /* renamed from: k */
    private static int f31826k = -1;

    /* renamed from: l */
    private static String f31827l;

    /* renamed from: m */
    private static int f31828m = -1;

    /* renamed from: n */
    private static String f31829n;

    /* renamed from: o */
    private static String f31830o;

    /* renamed from: p */
    private static int f31831p = -1;

    /* renamed from: q */
    private static JSONObject f31832q;

    /* renamed from: r */
    private static Map<String, String> f31833r;

    /* renamed from: e */
    public static int m23437e() {
        return f31819a.mo20740c();
    }

    /* renamed from: n */
    public static String m23446n() {
        return f31819a.mo20741d();
    }

    /* renamed from: o */
    public static String m23447o() {
        return f31819a.mo20743f();
    }

    /* renamed from: p */
    public static long m23448p() {
        return f31819a.mo20742e();
    }

    static {
        Covode.recordClassIndex(14873);
    }

    /* renamed from: a */
    public static long m23432a() {
        if (f31820b < 0) {
            f31820b = System.currentTimeMillis();
        }
        return f31820b;
    }

    /* renamed from: b */
    public static long m23434b() {
        if (f31821c <= 0) {
            f31821c = System.currentTimeMillis();
        }
        return f31821c;
    }

    /* renamed from: d */
    public static String m23436d() {
        if (f31823h == null) {
            synchronized (C13037a.class) {
                if (f31823h == null) {
                    f31823h = f31819a.mo20744g();
                }
            }
        }
        return f31823h;
    }

    /* renamed from: f */
    public static String m23438f() {
        if (f31825j == null) {
            synchronized (C13037a.class) {
                if (f31825j == null) {
                    f31825j = f31819a.mo20745h();
                }
            }
        }
        return f31825j;
    }

    /* renamed from: g */
    public static int m23439g() {
        if (f31826k == -1) {
            synchronized (C13037a.class) {
                if (f31826k == -1) {
                    f31826k = f31819a.mo20746i();
                }
            }
        }
        return f31826k;
    }

    /* renamed from: i */
    public static int m23441i() {
        if (f31828m == -1) {
            synchronized (C13037a.class) {
                if (f31828m == -1) {
                    f31828m = f31819a.mo20748k();
                }
            }
        }
        return f31828m;
    }

    /* renamed from: l */
    public static String m23444l() {
        if (f31831p == -1) {
            synchronized (C13037a.class) {
                if (f31831p == -1) {
                    f31831p = f31819a.mo20751n();
                }
            }
        }
        return String.valueOf(f31831p);
    }

    /* renamed from: m */
    public static JSONObject m23445m() {
        if (f31832q == null) {
            synchronized (C13037a.class) {
                if (f31832q == null) {
                    f31832q = f31819a.mo20754q();
                }
            }
        }
        return f31832q;
    }

    /* renamed from: c */
    public static boolean m23435c() {
        boolean z;
        if (f31824i == null) {
            synchronized (C13037a.class) {
                if (f31824i == null) {
                    String d = m23436d();
                    if (d == null || d.contains(":") || !d.equals(C13113a.f31955g.getPackageName())) {
                        z = false;
                    } else {
                        z = true;
                    }
                    f31824i = Boolean.valueOf(z);
                }
            }
        }
        return f31824i.booleanValue();
    }

    /* renamed from: h */
    public static String m23440h() {
        if (TextUtils.isEmpty(f31827l)) {
            synchronized (C13037a.class) {
                if (TextUtils.isEmpty(f31827l)) {
                    f31827l = f31819a.mo20747j();
                }
            }
        }
        return f31827l;
    }

    /* renamed from: j */
    public static String m23442j() {
        if (TextUtils.isEmpty(f31829n)) {
            synchronized (C13037a.class) {
                if (TextUtils.isEmpty(f31829n)) {
                    f31829n = f31819a.mo20749l();
                }
            }
        }
        return f31829n;
    }

    /* renamed from: k */
    public static String m23443k() {
        if (TextUtils.isEmpty(f31830o)) {
            synchronized (C13037a.class) {
                if (TextUtils.isEmpty(f31830o)) {
                    f31830o = f31819a.mo20750m();
                }
            }
        }
        return f31830o;
    }

    /* renamed from: q */
    public static Map<String, String> m23449q() {
        if (f31833r == null) {
            HashMap hashMap = new HashMap();
            f31833r = hashMap;
            hashMap.put("aid", String.valueOf(m23437e()));
            f31833r.put("os", "Android");
            f31833r.put("device_platform", "android");
            f31833r.put("os_api", new StringBuilder().append(Build.VERSION.SDK_INT).toString());
            f31833r.put("update_version_code", String.valueOf(m23439g()));
            f31833r.put("version_code", m23442j());
            f31833r.put("channel", m23438f());
            f31833r.put("device_model", Build.MODEL);
            f31833r.put("device_brand", Build.BRAND);
        }
        f31833r.put("device_id", m23446n());
        if (m23579r()) {
            f31833r.put("_log_level", "debug");
        }
        try {
            Map<String, String> s = f31819a.mo20756s();
            if (s != null && s.size() > 0) {
                for (Map.Entry<String, String> entry : s.entrySet()) {
                    f31833r.put(entry.getKey(), entry.getValue());
                }
            }
        } catch (Throwable unused) {
        }
        return f31833r;
    }

    /* renamed from: a */
    public static C22710c m23433a(String str, Map<String, String> map, byte[] bArr) {
        return ((IHttpService) C13104c.m23566a(IHttpService.class)).doPost(str, bArr, map);
    }
}
