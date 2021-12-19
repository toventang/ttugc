package com.bytedance.helios.sdk.utils;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13846c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.helios.sdk.utils.h */
public final class C15487h {

    /* renamed from: a */
    public static final C15487h f37743a = new C15487h();

    /* renamed from: b */
    private static String f37744b;

    private C15487h() {
    }

    static {
        Covode.recordClassIndex(17741);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052 A[SYNTHETIC, Splitter:B:17:0x0052] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m28503a() {
        /*
            r6 = 7858(0x1eb2, float:1.1011E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r6)
            r5 = 0
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x004f }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x004f }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x004f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x004f }
            java.lang.String r0 = "/proc/"
            r1.<init>(r0)     // Catch:{ all -> 0x004f }
            int r0 = android.os.Process.myPid()     // Catch:{ all -> 0x004f }
            java.lang.StringBuilder r1 = r1.append(r0)     // Catch:{ all -> 0x004f }
            java.lang.String r0 = "/cmdline"
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ all -> 0x004f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x004f }
            r2.<init>(r0)     // Catch:{ all -> 0x004f }
            java.lang.String r0 = "iso-8859-1"
            r3.<init>(r2, r0)     // Catch:{ all -> 0x004f }
            r4.<init>(r3)     // Catch:{ all -> 0x004f }
            int r0 = r4.read()     // Catch:{ all -> 0x0050 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0050 }
            r1.<init>()     // Catch:{ all -> 0x0050 }
        L_0x0039:
            if (r0 <= 0) goto L_0x0044
            char r0 = (char) r0     // Catch:{ all -> 0x0050 }
            r1.append(r0)     // Catch:{ all -> 0x0050 }
            int r0 = r4.read()     // Catch:{ all -> 0x0050 }
            goto L_0x0039
        L_0x0044:
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0050 }
            r4.close()     // Catch:{ Exception -> 0x004b }
        L_0x004b:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            return r0
        L_0x004f:
            r4 = r5
        L_0x0050:
            if (r4 == 0) goto L_0x0055
            r4.close()     // Catch:{ Exception -> 0x0055 }
        L_0x0055:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.sdk.utils.C15487h.m28503a():java.lang.String");
    }

    /* renamed from: a */
    public static boolean m28504a(Context context) {
        C89219l.m154719c(context, "");
        String b = m28505b(context);
        if (b != null && !C89361p.m154908a((CharSequence) b, (CharSequence) ":", false)) {
            return C89219l.m154714a((Object) b, (Object) context.getPackageName());
        }
        return false;
    }

    /* renamed from: b */
    private static String m28505b(Context context) {
        boolean z;
        String str = f37744b;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            Object a = m28502a(context, "activity");
            if (a != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) a).getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == myPid) {
                        String str2 = runningAppProcessInfo.processName;
                        f37744b = str2;
                        return str2;
                    }
                }
                String a2 = m28503a();
                f37744b = a2;
                return a2;
            }
            throw new C89388w("null cannot be cast to non-null type");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static Object m28502a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(7715);
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
                            C13846c.m25011a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(7715);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
