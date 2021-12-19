package com.p2082ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.fz */
public final class C80467fz {

    /* renamed from: a */
    static String f180042a = "undefined";

    /* renamed from: b */
    static String f180043b = "undefined";

    /* renamed from: c */
    public static final C80467fz f180044c = new C80467fz();

    private C80467fz() {
    }

    static {
        Covode.recordClassIndex(93735);
    }

    /* renamed from: a */
    public static String m139471a() {
        String c = m139475c();
        if (TextUtils.isEmpty(c)) {
            return "";
        }
        String d = m139477d(c);
        if (TextUtils.isEmpty(d)) {
            return "";
        }
        try {
            String string = new JSONObject(d).getString("pid");
            C89219l.m154716b(string, "");
            return string;
        } catch (JSONException unused) {
            return d;
        }
    }

    /* renamed from: c */
    private static String m139475c() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Object invoke = cls.getDeclaredMethod("get", String.class).invoke(cls, "ro.appsflyer.preinstall.path");
            if (invoke != null) {
                return (String) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m139473b() {
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, "ro.channelId." + C17867d.m33078a().getPackageName(), "");
            if (invoke == null) {
                invoke = "";
            }
            return (String) invoke;
        } catch (Exception unused) {
            return "";
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.utils.fz$a */
    public static final class CallableC80468a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f180045a;

        static {
            Covode.recordClassIndex(93736);
        }

        CallableC80468a(String str) {
            this.f180045a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
            if (r5 != null) goto L_0x004c;
         */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
            // Method dump skipped, instructions count: 248
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.utils.C80467fz.CallableC80468a.call():java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final void m139472a(String str) {
        C1731i.m5640b(new CallableC80468a(str), C1731i.f5562a);
    }

    /* renamed from: b */
    public static boolean m139474b(String str) {
        try {
            Method method = Class.forName("miui.os.MiuiInit").getMethod("isPreinstalledPackage", String.class);
            C89219l.m154716b(method, "");
            Object invoke = method.invoke(null, str);
            if (invoke != null) {
                return ((Boolean) invoke).booleanValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m139476c(String str) {
        try {
            Method method = Class.forName("miui.os.MiuiInit").getMethod("isPreinstalledPAIPackage", String.class);
            C89219l.m154716b(method, "");
            Object invoke = method.invoke(null, str);
            if (invoke != null) {
                return ((Boolean) invoke).booleanValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x003c */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m139477d(java.lang.String r7) {
        /*
            r6 = 4065(0xfe1, float:5.696E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r6)
            java.lang.String r5 = ""
            if (r7 != 0) goto L_0x000d
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            return r5
        L_0x000d:
            java.util.Properties r4 = new java.util.Properties
            r4.<init>()
            java.io.FileInputStream r3 = new java.io.FileInputStream
            r3.<init>(r7)
            r4.load(r3)     // Catch:{ FileNotFoundException | IOException -> 0x003c, all -> 0x0043 }
            android.content.Context r0 = com.bytedance.ies.ugc.appcontext.C17867d.m33078a()     // Catch:{ FileNotFoundException | IOException -> 0x003c, all -> 0x0043 }
            android.content.pm.PackageManager r2 = r0.getPackageManager()     // Catch:{ FileNotFoundException | IOException -> 0x003c, all -> 0x0043 }
            android.content.Context r0 = com.bytedance.ies.ugc.appcontext.C17867d.m33078a()     // Catch:{ FileNotFoundException | IOException -> 0x003c, all -> 0x0043 }
            java.lang.String r1 = r0.getPackageName()     // Catch:{ FileNotFoundException | IOException -> 0x003c, all -> 0x0043 }
            r0 = 0
            android.content.pm.PackageInfo r0 = r2.getPackageInfo(r1, r0)     // Catch:{ FileNotFoundException | IOException -> 0x003c, all -> 0x0043 }
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r5)     // Catch:{ FileNotFoundException | IOException -> 0x003c, all -> 0x0043 }
            java.lang.String r0 = r0.packageName     // Catch:{ FileNotFoundException | IOException -> 0x003c, all -> 0x0043 }
            java.lang.String r0 = r4.getProperty(r0)     // Catch:{ FileNotFoundException | IOException -> 0x003c, all -> 0x0043 }
            if (r0 != 0) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r5 = r0
        L_0x003c:
            r3.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            return r5
        L_0x0043:
            r0 = move-exception
            r3.close()     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.utils.C80467fz.m139477d(java.lang.String):java.lang.String");
    }
}
