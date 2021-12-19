package com.p2082ss.android.deviceregister.p2134a;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.common.utility.C13607d;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.common.AbstractC29742a;
import com.p2082ss.android.deviceregister.p2135b.C29884c;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3386c.C58014b;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.deviceregister.a.d */
public final class C29869d {

    /* renamed from: a */
    public static String f71247a;

    /* renamed from: b */
    public static AbstractC29742a f71248b;

    /* renamed from: c */
    public static String f71249c;

    /* renamed from: d */
    public static String f71250d;

    /* renamed from: e */
    public static int f71251e;

    /* renamed from: f */
    public static String f71252f;

    /* renamed from: g */
    public static String f71253g = "2.5.5.6";

    /* renamed from: h */
    public static volatile JSONObject f71254h;

    /* renamed from: i */
    public static String f71255i;

    /* renamed from: j */
    public static final Object f71256j = new Object();

    /* renamed from: k */
    public static C29884c f71257k;

    /* renamed from: l */
    public static AbstractC29868c f71258l;

    /* renamed from: m */
    public static boolean f71259m = false;

    /* renamed from: n */
    public static String f71260n;

    /* renamed from: o */
    public static String f71261o;

    /* renamed from: p */
    private static int f71262p;

    /* renamed from: q */
    private static ConcurrentHashMap<String, Object> f71263q = new ConcurrentHashMap<>();

    /* renamed from: r */
    private static boolean f71264r = false;

    /* renamed from: s */
    private static String f71265s;

    /* renamed from: t */
    private static String f71266t;

    /* renamed from: u */
    private static String f71267u;

    /* renamed from: v */
    private static volatile boolean f71268v;

    /* renamed from: w */
    private static ConcurrentHashMap<String, Object> f71269w;

    static {
        Covode.recordClassIndex(36279);
    }

    /* renamed from: a */
    public static int m60189a() {
        AbstractC29742a aVar;
        if (f71262p <= 0 && (aVar = f71248b) != null) {
            f71262p = aVar.mo29081i();
        }
        return f71262p;
    }

    /* renamed from: b */
    public static String m60196b(Context context) {
        if (C13627m.m24498a(f71255i)) {
            f71255i = C29866a.m60186a(context).getString("user_agent", null);
        }
        return f71255i;
    }

    /* renamed from: c */
    public static String m60197c(Context context) {
        if (!TextUtils.isEmpty(f71247a)) {
            return f71247a;
        }
        AbstractC29742a aVar = f71248b;
        if (aVar != null) {
            return aVar.mo29073a();
        }
        try {
            if (m60190a(context.getPackageManager(), context.getPackageName()).metaData != null) {
                f71247a = null;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static String m60192a(Context context) {
        if (C13627m.m24498a(f71265s) && context != null) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
                if (packageInfo == null || packageInfo.signatures == null || packageInfo.signatures.length <= 0) {
                    return f71265s;
                }
                Signature signature = packageInfo.signatures[0];
                if (signature == null) {
                    return f71265s;
                }
                f71265s = C13607d.m24443b(signature.toByteArray());
            } catch (Exception unused) {
            }
        }
        return f71265s;
    }

    /* renamed from: a */
    private static void m60193a(Throwable th) {
        AbstractC29742a aVar = f71248b;
        if (aVar != null) {
            AbstractC29868c cVar = f71258l;
            aVar.mo29075c();
            if (cVar != null) {
                String stackTraceString = Log.getStackTraceString(th);
                if (!C13627m.m24498a(stackTraceString)) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("stack", stackTraceString);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    cVar.mo52023a("device_register", jSONObject);
                }
            }
        }
    }

    /* renamed from: a */
    private static ApplicationInfo m60190a(PackageManager packageManager, String str) {
        if (!TextUtils.equals(str, C17867d.m33078a().getPackageName())) {
            return packageManager.getApplicationInfo(str, 128);
        }
        if (C58014b.f132218a == null) {
            C58014b.f132218a = packageManager.getApplicationInfo(str, 128);
        }
        return C58014b.f132218a;
    }

    /* renamed from: a */
    private static Object m60191a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(863);
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
                    MethodCollector.m26664o(863);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public static void m60194a(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                jSONObject2.put(next, jSONObject.opt(next));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        r2 = new org.json.JSONObject();
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r4 = r12.getPackageName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r7 = m60190a(r12.getPackageManager(), r4).metaData;
        r0 = com.p2082ss.android.deviceregister.p2134a.C29869d.f71247a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r0 == null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        if (r0.length() <= 0) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        r8.put("channel", com.p2082ss.android.deviceregister.p2134a.C29869d.f71247a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        if (r7 == null) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
        if (android.text.TextUtils.isEmpty("") != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0051, code lost:
        r8.put("appkey", r7.getString(""));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        if (r7 == null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0063, code lost:
        if (android.text.TextUtils.isEmpty("") != false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0065, code lost:
        r8.put("channel", null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006c, code lost:
        m60193a(r0);
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0721, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0722, code lost:
        m60193a(r0);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(831);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0728, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0220 A[Catch:{ Exception -> 0x0274 }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x023b A[Catch:{ Exception -> 0x0274 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x023e A[Catch:{ Exception -> 0x0274 }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x026e A[Catch:{ Exception -> 0x0274 }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0283 A[Catch:{ Exception -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02af A[Catch:{ Exception -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02b1 A[Catch:{ Exception -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02d3 A[Catch:{ Exception -> 0x02e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02de A[Catch:{ Exception -> 0x02e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02f6 A[Catch:{ all -> 0x0360 }] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0306 A[Catch:{ all -> 0x0360 }] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0312 A[Catch:{ all -> 0x0360 }] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x034d A[Catch:{ all -> 0x0360 }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x036a A[Catch:{ all -> 0x0531 }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x039b A[Catch:{ all -> 0x0531 }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x03a5 A[Catch:{ all -> 0x0531 }] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x053f A[Catch:{ all -> 0x0545 }] */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x054f  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x056b A[Catch:{ all -> 0x05e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x059f A[Catch:{ all -> 0x05e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x05af A[Catch:{ all -> 0x05e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x05c8 A[Catch:{ all -> 0x05e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x05d3 A[Catch:{ all -> 0x05e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x05da A[Catch:{ all -> 0x05e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x05fb A[Catch:{ all -> 0x0608 }] */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x0610 A[SYNTHETIC, Splitter:B:304:0x0610] */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0660  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x066e  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x06a9 A[Catch:{ all -> 0x06f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x06c0 A[Catch:{ all -> 0x06f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x06ee A[Catch:{ all -> 0x06f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x0700  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x070f A[SYNTHETIC, Splitter:B:360:0x070f] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01cb A[Catch:{ Exception -> 0x0204 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01d9 A[Catch:{ Exception -> 0x0204 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m60195a(android.content.Context r12, org.json.JSONObject r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 1839
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.deviceregister.p2134a.C29869d.m60195a(android.content.Context, org.json.JSONObject, boolean):boolean");
    }
}
