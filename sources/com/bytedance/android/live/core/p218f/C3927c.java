package com.bytedance.android.live.core.p218f;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.bytedance.android.live.core.p218f.p220b.C3926e;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.android.live.core.f.c */
public final class C3927c {

    /* renamed from: a */
    private static final FileFilter f10808a = new FileFilter() {
        /* class com.bytedance.android.live.core.p218f.C3927c.C39281 */

        static {
            Covode.recordClassIndex(4457);
        }

        public final boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (!Character.isDigit(name.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    };

    static {
        Covode.recordClassIndex(4456);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0032 A[SYNTHETIC, Splitter:B:15:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0045  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m9566a() {
        /*
            java.lang.String r6 = ""
            r5 = 13121(0x3341, float:1.8386E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r5)
            r4 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x003a, all -> 0x002f }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ IOException -> 0x003a, all -> 0x002f }
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x003a, all -> 0x002f }
            java.lang.String r0 = "/proc/cpuinfo"
            r1.<init>(r0)     // Catch:{ IOException -> 0x003a, all -> 0x002f }
            r2.<init>(r1)     // Catch:{ IOException -> 0x003a, all -> 0x002f }
            r3.<init>(r2)     // Catch:{ IOException -> 0x003a, all -> 0x002f }
        L_0x0019:
            java.lang.String r1 = r3.readLine()     // Catch:{ IOException -> 0x0039, all -> 0x002c }
            if (r1 == 0) goto L_0x0028
            java.lang.String r0 = "Hardware"
            boolean r0 = r1.startsWith(r0)     // Catch:{ IOException -> 0x0039, all -> 0x002c }
            if (r0 == 0) goto L_0x0019
            r6 = r1
        L_0x0028:
            r3.close()     // Catch:{ IOException -> 0x003f }
            goto L_0x003f
        L_0x002c:
            r0 = move-exception
            r4 = r3
            goto L_0x0030
        L_0x002f:
            r0 = move-exception
        L_0x0030:
            if (r4 == 0) goto L_0x0035
            r4.close()     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            throw r0
        L_0x0039:
            r4 = r3
        L_0x003a:
            if (r4 == 0) goto L_0x003f
            r4.close()
        L_0x003f:
            int r0 = r6.length()
            if (r0 <= 0) goto L_0x0056
            java.lang.String r0 = ":"
            java.lang.String[] r2 = r6.split(r0)
            int r1 = r2.length
            r0 = 2
            if (r1 != r0) goto L_0x0056
            r0 = 1
            r0 = r2[r0]
            java.lang.String r6 = r0.trim()
        L_0x0056:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.p218f.C3927c.m9566a():java.lang.String");
    }

    /* renamed from: a */
    public static long m9563a(String str) {
        try {
            StatFs statFs = new StatFs(str);
            int i = Build.VERSION.SDK_INT;
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        } catch (Exception | IllegalArgumentException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static C3926e m9564a(Context context) {
        C3926e eVar = new C3926e((char) 0);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) m9565a(context, "window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            eVar.f10805a = displayMetrics.densityDpi;
            eVar.f10806b = displayMetrics.widthPixels;
            eVar.f10807c = displayMetrics.heightPixels;
        }
        return eVar;
    }

    /* renamed from: a */
    private static Object m9565a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(13041);
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
                    MethodCollector.m26664o(13041);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
