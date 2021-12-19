package com.p2082ss.ugc.effectplatform.util;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.ugc.effectplatform.util.e */
public final class C86985e {

    /* renamed from: a */
    private static Map<String, Object> f196133a = new ConcurrentHashMap();

    /* renamed from: com.ss.ugc.effectplatform.util.e$a */
    public static class C86986a {

        /* renamed from: a */
        public long f196134a;

        /* renamed from: b */
        public long f196135b;

        static {
            Covode.recordClassIndex(102752);
        }
    }

    static {
        Covode.recordClassIndex(102751);
    }

    /* renamed from: a */
    public static String m150640a() {
        Object obj = f196133a.get("cache_key_cpu_model");
        if (obj != null) {
            return (String) obj;
        }
        String b = m150643b();
        f196133a.put("cache_key_cpu_model", b);
        return b;
    }

    /* renamed from: b */
    private static synchronized String m150643b() {
        BufferedReader bufferedReader;
        Throwable th;
        Exception e;
        synchronized (C86985e.class) {
            MethodCollector.m26663i(1393);
            BufferedReader bufferedReader2 = null;
            try {
                if (new File("/proc/cpuinfo").exists()) {
                    bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                bufferedReader2 = bufferedReader;
                                break;
                            } else if (readLine.contains(":")) {
                                String[] split = readLine.split(":");
                                if (split[0].contains("Hardware")) {
                                    String str = split[1];
                                    m150641a(bufferedReader);
                                    MethodCollector.m26664o(1393);
                                    return str;
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            try {
                                e.printStackTrace();
                                m150641a(bufferedReader);
                                String str2 = Build.HARDWARE;
                                MethodCollector.m26664o(1393);
                                return str2;
                            } catch (Throwable th2) {
                                th = th2;
                                m150641a(bufferedReader);
                                MethodCollector.m26664o(1393);
                                throw th;
                            }
                        }
                    }
                }
                m150641a(bufferedReader2);
            } catch (Exception e3) {
                e = e3;
                bufferedReader = null;
                e.printStackTrace();
                m150641a(bufferedReader);
                String str22 = Build.HARDWARE;
                MethodCollector.m26664o(1393);
                return str22;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
                m150641a(bufferedReader);
                MethodCollector.m26664o(1393);
                throw th;
            }
            String str222 = Build.HARDWARE;
            MethodCollector.m26664o(1393);
            return str222;
        }
    }

    /* renamed from: a */
    private static void m150641a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static C86986a m150638a(Context context) {
        Object obj = f196133a.get("cache_key_memory_info");
        if (obj != null) {
            return (C86986a) obj;
        }
        C86986a aVar = new C86986a();
        aVar.f196134a = m150642b(context);
        aVar.f196135b = m150644c(context);
        f196133a.put("cache_key_memory_info", aVar);
        return aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034 A[Catch:{ Exception -> 0x0048, all -> 0x004f }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long m150642b(android.content.Context r7) {
        /*
            r6 = 526(0x20e, float:7.37E-43)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r6)
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = -1
            r0 = 16
            android.app.ActivityManager$MemoryInfo r1 = new android.app.ActivityManager$MemoryInfo     // Catch:{ Exception -> 0x0024 }
            r1.<init>()     // Catch:{ Exception -> 0x0024 }
            java.lang.String r0 = "activity"
            java.lang.Object r0 = m150639a(r7, r0)     // Catch:{ Exception -> 0x0024 }
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch:{ Exception -> 0x0024 }
            if (r0 == 0) goto L_0x0024
            r0.getMemoryInfo(r1)     // Catch:{ Exception -> 0x0024 }
            long r2 = r1.totalMem     // Catch:{ Exception -> 0x0024 }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x004b
            goto L_0x0026
        L_0x0024:
            r2 = -1
        L_0x0026:
            r5 = 0
            java.lang.String r1 = "/proc/meminfo"
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x0048, all -> 0x004f }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0048, all -> 0x004f }
            boolean r0 = r0.exists()     // Catch:{ Exception -> 0x0048, all -> 0x004f }
            if (r0 == 0) goto L_0x0048
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0048, all -> 0x004f }
            r4.<init>(r1)     // Catch:{ Exception -> 0x0048, all -> 0x004f }
            java.lang.String r0 = "MemTotal"
            int r0 = m150637a(r0, r4)     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
            long r2 = (long) r0     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
            r0 = 1024(0x400, double:5.06E-321)
            long r2 = r2 * r0
            r5 = r4
            goto L_0x0048
        L_0x0045:
            r0 = move-exception
            goto L_0x0051
        L_0x0047:
            r5 = r4
        L_0x0048:
            m150641a(r5)
        L_0x004b:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            return r2
        L_0x004f:
            r0 = move-exception
            r4 = r5
        L_0x0051:
            m150641a(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ugc.effectplatform.util.C86985e.m150642b(android.content.Context):long");
    }

    /* renamed from: c */
    private static long m150644c(Context context) {
        long j;
        FileInputStream fileInputStream;
        Throwable th;
        MethodCollector.m26663i(551);
        int i = Build.VERSION.SDK_INT;
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ActivityManager activityManager = (ActivityManager) m150639a(context, "activity");
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                j = memoryInfo.availMem;
                if (j == -1) {
                    FileInputStream fileInputStream2 = null;
                    fileInputStream = new FileInputStream("/proc/meminfo");
                    j = 1024 * ((long) m150637a("MemAvailable", fileInputStream));
                    m150641a(fileInputStream);
                }
                MethodCollector.m26664o(551);
                return j;
            }
        } catch (Exception unused) {
        }
        j = -1;
        FileInputStream fileInputStream22 = null;
        try {
            fileInputStream = new FileInputStream("/proc/meminfo");
            try {
                j = 1024 * ((long) m150637a("MemAvailable", fileInputStream));
                m150641a(fileInputStream);
            } catch (Exception unused2) {
                fileInputStream22 = fileInputStream;
                m150641a(fileInputStream22);
                MethodCollector.m26664o(551);
                return j;
            } catch (Throwable th2) {
                th = th2;
                m150641a(fileInputStream);
                MethodCollector.m26664o(551);
                throw th;
            }
        } catch (Exception unused3) {
            m150641a(fileInputStream22);
            MethodCollector.m26664o(551);
            return j;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            m150641a(fileInputStream);
            MethodCollector.m26664o(551);
            throw th;
        }
        MethodCollector.m26664o(551);
        return j;
    }

    /* renamed from: a */
    private static int m150637a(String str, FileInputStream fileInputStream) {
        MethodCollector.m26663i(911);
        byte[] bArr = new byte[1024];
        try {
            int read = fileInputStream.read(bArr);
            int i = 0;
            while (i < read) {
                if (bArr[i] == 10 || i == 0) {
                    if (bArr[i] == 10) {
                        i++;
                    }
                    int i2 = i;
                    while (i2 < read) {
                        int i3 = i2 - i;
                        if (bArr[i2] != str.charAt(i3)) {
                            continue;
                            break;
                        } else if (i3 == str.length() - 1) {
                            while (i2 < 1024 && bArr[i2] != 10) {
                                if (Character.isDigit(bArr[i2])) {
                                    int i4 = i2 + 1;
                                    while (i4 < 1024 && Character.isDigit(bArr[i4])) {
                                        i4++;
                                    }
                                    int parseInt = Integer.parseInt(new String(bArr, 0, i2, i4 - i2));
                                    MethodCollector.m26664o(911);
                                    return parseInt;
                                }
                                i2++;
                            }
                            MethodCollector.m26664o(911);
                            return -1;
                        } else {
                            i2++;
                        }
                    }
                    continue;
                }
                i++;
            }
        } catch (IOException | NumberFormatException unused) {
        }
        MethodCollector.m26664o(911);
        return -1;
    }

    /* renamed from: a */
    private static Object m150639a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(545);
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
                    MethodCollector.m26664o(545);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
