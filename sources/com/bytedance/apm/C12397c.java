package com.bytedance.apm;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.apm.core.AbstractC12436b;
import com.bytedance.apm.core.C12435a;
import com.bytedance.apm.net.DefaultHttpServiceImpl;
import com.bytedance.apm.p789q.C12575a;
import com.bytedance.covode.number.Covode;
import com.bytedance.services.apm.api.C22710c;
import com.bytedance.services.apm.api.IHttpService;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.c */
public final class C12397c {

    /* renamed from: A */
    private static C12440d f29930A;

    /* renamed from: a */
    public static Context f29931a;

    /* renamed from: b */
    public static boolean f29932b;

    /* renamed from: c */
    public static boolean f29933c;

    /* renamed from: d */
    public static long f29934d;

    /* renamed from: e */
    public static long f29935e;

    /* renamed from: f */
    public static JSONObject f29936f = new JSONObject();

    /* renamed from: g */
    public static AbstractC12436b f29937g = new C12435a();

    /* renamed from: h */
    public static IHttpService f29938h = new DefaultHttpServiceImpl();

    /* renamed from: i */
    public static volatile int f29939i = -1;

    /* renamed from: j */
    public static boolean f29940j = false;

    /* renamed from: k */
    public static long f29941k;

    /* renamed from: l */
    public static long f29942l;

    /* renamed from: m */
    public static String f29943m;

    /* renamed from: n */
    public static boolean f29944n;

    /* renamed from: o */
    public static boolean f29945o;

    /* renamed from: p */
    public static boolean f29946p = true;

    /* renamed from: q */
    public static List<String> f29947q;

    /* renamed from: r */
    public static String f29948r;

    /* renamed from: s */
    public static boolean f29949s = false;

    /* renamed from: t */
    private static boolean f29950t;

    /* renamed from: u */
    private static Map<String, String> f29951u = Collections.emptyMap();

    /* renamed from: v */
    private static long f29952v = -1;

    /* renamed from: w */
    private static long f29953w;

    /* renamed from: x */
    private static boolean f29954x;

    /* renamed from: y */
    private static long f29955y = 0;

    /* renamed from: z */
    private static boolean f29956z = true;

    /* renamed from: e */
    public static boolean m22288e() {
        if (f29932b || f29950t) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static synchronized C12440d m22290g() {
        C12440d dVar;
        synchronized (C12397c.class) {
            dVar = f29930A;
        }
        return dVar;
    }

    /* renamed from: h */
    public static synchronized Map<String, String> m22291h() {
        Map<String, String> map;
        synchronized (C12397c.class) {
            map = f29951u;
        }
        return map;
    }

    /* renamed from: a */
    public static String m22278a() {
        if (TextUtils.isEmpty(f29943m)) {
            f29943m = C12575a.m22623a(Process.myPid());
        }
        return f29943m;
    }

    /* renamed from: c */
    public static boolean m22286c() {
        String a;
        if (!f29954x && (a = m22278a()) != null && a.contains(":")) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static long m22287d() {
        if (f29952v == -1) {
            long currentTimeMillis = System.currentTimeMillis();
            f29952v = currentTimeMillis;
            f29953w = currentTimeMillis;
        }
        return f29952v;
    }

    /* renamed from: f */
    public static boolean m22289f() {
        JSONObject jSONObject = f29936f;
        if (jSONObject == null || jSONObject.optString("channel") == null) {
            return false;
        }
        return f29936f.optString("channel").contains("local");
    }

    /* renamed from: i */
    public static long m22292i() {
        if (f29953w == 0) {
            f29953w = System.currentTimeMillis();
        }
        return f29953w;
    }

    static {
        Covode.recordClassIndex(14204);
    }

    /* renamed from: b */
    public static boolean m22285b() {
        boolean z = true;
        if (f29954x) {
            return true;
        }
        if (f29931a == null) {
            return m22286c();
        }
        String a = m22278a();
        if (a == null || a.contains(":") || !a.equals(f29931a.getPackageName())) {
            z = false;
        }
        f29954x = z;
        return z;
    }

    /* renamed from: a */
    public static void m22280a(Context context) {
        if (context != null) {
            f29931a = C12575a.m22622a(context);
        }
    }

    /* renamed from: b */
    public static void m22284b(long j) {
        if (j > 0) {
            long j2 = f29941k;
            if (j2 == 0 || j < j2) {
                f29941k = j;
            }
        }
    }

    /* renamed from: a */
    public static String m22279a(long j) {
        long j2 = j - f29953w;
        if (j2 < 30000) {
            return "0 - 30s";
        }
        if (j2 < 60000) {
            return "30s - 1min";
        }
        if (j2 < 120000) {
            return "1min - 2min";
        }
        if (j2 < 300000) {
            return "2min - 5min";
        }
        if (j2 < 600000) {
            return "5min - 10min";
        }
        if (j2 < 1800000) {
            return "10min - 30min";
        }
        if (j2 < 3600000) {
            return "30min - 1h";
        }
        return "1h - ";
    }

    /* renamed from: a */
    public static synchronized void m22281a(AbstractC12436b bVar) {
        synchronized (C12397c.class) {
            f29937g = bVar;
            Map<String, String> a = bVar.mo20250a();
            f29951u = a;
            if (a == null) {
                f29951u = new HashMap();
            }
            if (!f29951u.containsKey("aid")) {
                f29951u.put("aid", f29936f.optString("aid"));
            }
            if (!f29951u.containsKey("device_id")) {
                f29951u.put("device_id", f29936f.optString("device_id"));
            }
            if (!f29951u.containsKey("device_platform")) {
                f29951u.put("device_platform", "android");
            }
            f29951u.put("os", "Android");
            if (!f29951u.containsKey("update_version_code")) {
                f29951u.put("update_version_code", f29936f.optString("update_version_code"));
            }
            if (!f29951u.containsKey("version_code")) {
                f29951u.put("version_code", f29936f.optString("version_code"));
            }
            if (!f29951u.containsKey("channel")) {
                f29951u.put("channel", f29936f.optString("channel"));
            }
            if (!f29951u.containsKey("os_api")) {
                f29951u.put("os_api", new StringBuilder().append(Build.VERSION.SDK_INT).toString());
            }
            if (m22288e() && !f29951u.containsKey("_log_level")) {
                f29951u.put("_log_level", "debug");
            }
            if (f29930A == null) {
                f29930A = new C12440d();
            }
            f29930A.f30210l = new HashMap(f29951u);
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x02da */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0340 A[Catch:{ Exception -> 0x03c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0364 A[Catch:{ Exception -> 0x03c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0388 A[Catch:{ Exception -> 0x03c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x039a A[Catch:{ Exception -> 0x03c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x030a A[Catch:{ Exception -> 0x03c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x032e A[Catch:{ Exception -> 0x03c7 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m22282a(org.json.JSONObject r7) {
        /*
        // Method dump skipped, instructions count: 982
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.C12397c.m22282a(org.json.JSONObject):void");
    }

    /* renamed from: a */
    public static C22710c m22277a(String str, Map<String, String> map) {
        return f29938h.doGet(str, map);
    }

    /* renamed from: a */
    public static boolean m22283a(String str, String str2) {
        JSONObject jSONObject = f29936f;
        if (jSONObject == null) {
            return false;
        }
        try {
            jSONObject.put(str, str2);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }
}
