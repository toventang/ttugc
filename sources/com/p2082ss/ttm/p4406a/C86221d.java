package com.p2082ss.ttm.p4406a;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* renamed from: com.ss.ttm.a.d */
public final class C86221d {

    /* renamed from: a */
    private static long[] f192438a;

    /* renamed from: b */
    private static long f192439b;

    static {
        Covode.recordClassIndex(101366);
    }

    /* renamed from: a */
    public static long[] m148194a() {
        if (f192438a == null) {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            f192438a = new long[]{m148196c(), ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks())};
        }
        return f192438a;
    }

    /* renamed from: c */
    private static long m148196c() {
        if (f192439b == 0) {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            f192439b = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        }
        return f192439b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x003a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m148195b() {
        /*
            r4 = 7795(0x1e73, float:1.0923E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)
            java.lang.String r0 = "/proc/meminfo"
            r3 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0021, all -> 0x0033 }
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ Exception -> 0x0021, all -> 0x0033 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0021, all -> 0x0033 }
            r0 = 8
            r2.<init>(r1, r0)     // Catch:{ Exception -> 0x0021, all -> 0x0033 }
            java.lang.String r0 = r2.readLine()     // Catch:{ Exception -> 0x001f }
            if (r0 == 0) goto L_0x001b
            r3 = r0
        L_0x001b:
            r2.close()     // Catch:{ Exception -> 0x003e }
            goto L_0x0042
        L_0x001f:
            r0 = move-exception
            goto L_0x0023
        L_0x0021:
            r0 = move-exception
            r2 = r3
        L_0x0023:
            r0.printStackTrace()     // Catch:{ all -> 0x0027 }
            goto L_0x0038
        L_0x0027:
            r1 = move-exception
            if (r2 == 0) goto L_0x0034
            r2.close()     // Catch:{ Exception -> 0x002e }
            goto L_0x0034
        L_0x002e:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0034
        L_0x0033:
            r1 = move-exception
        L_0x0034:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            throw r1
        L_0x0038:
            if (r2 == 0) goto L_0x0042
            r2.close()
            goto L_0x0042
        L_0x003e:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0042:
            r0 = 58
            int r2 = r3.indexOf(r0)
            r0 = 107(0x6b, float:1.5E-43)
            int r1 = r3.indexOf(r0)
            int r0 = r2 + 1
            java.lang.String r0 = r3.substring(r0, r1)
            java.lang.String r0 = r0.trim()
            int r0 = java.lang.Integer.parseInt(r0)
            long r0 = (long) r0
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttm.p4406a.C86221d.m148195b():long");
    }

    /* renamed from: a */
    public static long m148192a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) m148193a(context, "activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem / 1024;
    }

    /* renamed from: a */
    private static Object m148193a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(7642);
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
                    MethodCollector.m26664o(7642);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
