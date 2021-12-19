package com.p2082ss.android.ugc.aweme.lego.p3396f;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3386c.C58015c;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.lego.f.a */
public final class C58227a {

    /* renamed from: a */
    private static String f132612a;

    static {
        Covode.recordClassIndex(68294);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e A[SYNTHETIC, Splitter:B:18:0x004e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m105169a() {
        /*
            r6 = 4881(0x1311, float:6.84E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r6)
            r5 = 0
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x004b }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x004b }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x004b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x004b }
            java.lang.String r0 = "/proc/"
            r1.<init>(r0)     // Catch:{ all -> 0x004b }
            int r0 = android.os.Process.myPid()     // Catch:{ all -> 0x004b }
            java.lang.StringBuilder r1 = r1.append(r0)     // Catch:{ all -> 0x004b }
            java.lang.String r0 = "/cmdline"
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ all -> 0x004b }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x004b }
            r2.<init>(r0)     // Catch:{ all -> 0x004b }
            java.lang.String r0 = "iso-8859-1"
            r3.<init>(r2, r0)     // Catch:{ all -> 0x004b }
            r4.<init>(r3)     // Catch:{ all -> 0x004b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x004c }
            r1.<init>()     // Catch:{ all -> 0x004c }
        L_0x0035:
            int r0 = r4.read()     // Catch:{ all -> 0x004c }
            if (r0 <= 0) goto L_0x0040
            char r0 = (char) r0     // Catch:{ all -> 0x004c }
            r1.append(r0)     // Catch:{ all -> 0x004c }
            goto L_0x0035
        L_0x0040:
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x004c }
            r4.close()     // Catch:{ Exception -> 0x0047 }
        L_0x0047:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            return r0
        L_0x004b:
            r4 = r5
        L_0x004c:
            if (r4 == 0) goto L_0x0051
            r4.close()     // Catch:{ Exception -> 0x0051 }
        L_0x0051:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.lego.p3396f.C58227a.m105169a():java.lang.String");
    }

    /* renamed from: a */
    public static boolean m105170a(Context context) {
        String b = m105171b(context);
        if (b == null || b.contains(":") || !b.equals(context.getPackageName())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static String m105171b(Context context) {
        if (TextUtils.isEmpty(C58015c.m104839a())) {
            C58015c.f132219a = m105172c(context);
        }
        return C58015c.f132219a;
    }

    /* renamed from: c */
    private static String m105172c(Context context) {
        String str = f132612a;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) m105168a(context, "activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    String str2 = runningAppProcessInfo.processName;
                    f132612a = str2;
                    return str2;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String a = m105169a();
        f132612a = a;
        return a;
    }

    /* renamed from: a */
    private static Object m105168a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(4830);
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
                    MethodCollector.m26664o(4830);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
