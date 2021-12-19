package com.bytedance.frameworks.baselib.network.http.p995g;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3386c.C58015c;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.frameworks.baselib.network.http.g.f */
public final class C14756f {

    /* renamed from: a */
    public static AtomicInteger f35969a = new AtomicInteger(0);

    /* renamed from: b */
    private static String f35970b = null;

    static {
        Covode.recordClassIndex(16853);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051 A[SYNTHETIC, Splitter:B:18:0x0051] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m27055a() {
        /*
            r6 = 7881(0x1ec9, float:1.1044E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r6)
            r5 = 0
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x004e }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x004e }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x004e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x004e }
            java.lang.String r0 = "/proc/"
            r1.<init>(r0)     // Catch:{ all -> 0x004e }
            int r0 = android.os.Process.myPid()     // Catch:{ all -> 0x004e }
            java.lang.StringBuilder r1 = r1.append(r0)     // Catch:{ all -> 0x004e }
            java.lang.String r0 = "/cmdline"
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ all -> 0x004e }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x004e }
            r2.<init>(r0)     // Catch:{ all -> 0x004e }
            java.lang.String r0 = "iso-8859-1"
            r3.<init>(r2, r0)     // Catch:{ all -> 0x004e }
            r4.<init>(r3)     // Catch:{ all -> 0x004e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x004f }
            r1.<init>()     // Catch:{ all -> 0x004f }
        L_0x0035:
            int r0 = r4.read()     // Catch:{ all -> 0x004f }
            if (r0 <= 0) goto L_0x0040
            char r0 = (char) r0     // Catch:{ all -> 0x004f }
            r1.append(r0)     // Catch:{ all -> 0x004f }
            goto L_0x0035
        L_0x0040:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ all -> 0x004f }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x004f }
            r4.close()     // Catch:{ Exception -> 0x004a }
        L_0x004a:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            return r0
        L_0x004e:
            r4 = r5
        L_0x004f:
            if (r4 == 0) goto L_0x0054
            r4.close()     // Catch:{ Exception -> 0x0054 }
        L_0x0054:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.p995g.C14756f.m27055a():java.lang.String");
    }

    /* renamed from: a */
    public static boolean m27056a(Context context) {
        Logger.debug();
        int i = f35969a.get();
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            return m27057b(context);
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m27057b(Context context) {
        String c = m27058c(context);
        if (c == null || c.contains(":") || !c.equals(context.getPackageName())) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static String m27058c(Context context) {
        if (TextUtils.isEmpty(C58015c.m104839a())) {
            C58015c.f132219a = m27059d(context);
        }
        return C58015c.f132219a;
    }

    /* renamed from: d */
    private static String m27059d(Context context) {
        String str = f35970b;
        if (!C13627m.m24498a(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) m27054a(context, "activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    Logger.debug();
                    String str2 = runningAppProcessInfo.processName;
                    f35970b = str2;
                    return str2;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String a = m27055a();
        f35970b = a;
        return a;
    }

    /* renamed from: a */
    private static Object m27054a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(7733);
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
                    MethodCollector.m26664o(7733);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
