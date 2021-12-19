package com.bytedance.apm.p789q;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StatFs;
import android.system.Os;
import android.system.OsConstants;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.apm.C12397c;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.monitor.p1546a.C21454c;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.apm.q.b */
public final class C12576b {

    /* renamed from: a */
    public static int f30584a;

    /* renamed from: b */
    private static int f30585b;

    /* renamed from: c */
    private static long f30586c = -1;

    /* renamed from: d */
    private static long f30587d = -1;

    static {
        Covode.recordClassIndex(14393);
    }

    /* renamed from: f */
    public static long m22639f() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                return m22628a(C12581e.m22659a(C12397c.f29931a));
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: g */
    public static long m22640g() {
        long i;
        if (f30586c == -1) {
            long j = 100;
            if (Build.VERSION.SDK_INT >= 21) {
                i = Os.sysconf(OsConstants._SC_CLK_TCK);
            } else {
                int i2 = Build.VERSION.SDK_INT;
                i = m22642i();
            }
            if (i > 0) {
                j = i;
            }
            f30586c = j;
        }
        return f30586c;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: h */
    private static synchronized int m22641h() {
        synchronized (C12576b.class) {
            int i = f30585b;
            if (i != 0) {
                return i;
            }
            int i2 = 0;
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"), 50);
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        try {
                            break;
                        } catch (Throwable unused) {
                        }
                    } else if (readLine.startsWith("processor")) {
                        i2++;
                    }
                } catch (Throwable th) {
                    bufferedReader.close();
                    throw th;
                }
            }
            bufferedReader.close();
            f30585b = i2;
            return f30585b;
        }
    }

    /* renamed from: a */
    public static long m22626a() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/stat")), 1000);
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[2]) + Long.parseLong(split[3]) + Long.parseLong(split[4]) + Long.parseLong(split[6]) + Long.parseLong(split[5]) + Long.parseLong(split[7]) + Long.parseLong(split[8]);
                C21454c.m40295a(bufferedReader);
                return parseLong;
            } catch (Throwable unused) {
                C21454c.m40295a(bufferedReader);
                return -1;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
            C21454c.m40295a(bufferedReader);
            return -1;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.close();
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        if (r4 >= r5) goto L_0x005b;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m22633b() {
        /*
            int r5 = m22641h()
            r6 = -1
            if (r5 > 0) goto L_0x0009
            return r6
        L_0x0009:
            r4 = 0
        L_0x000a:
            r0 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0055 }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ all -> 0x0055 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = "/sys/devices/system/cpu/cpu"
            r1.<init>(r0)     // Catch:{ all -> 0x0055 }
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = "/cpufreq/stats/time_in_state"
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0055 }
            r2.<init>(r0)     // Catch:{ all -> 0x0055 }
            r0 = 50
            r3.<init>(r2, r0)     // Catch:{ all -> 0x0055 }
        L_0x002c:
            java.lang.String r1 = r3.readLine()     // Catch:{ all -> 0x0053 }
            if (r1 == 0) goto L_0x004b
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0053 }
            if (r0 != 0) goto L_0x004b
            java.lang.String r0 = "\\s+"
            java.lang.String[] r2 = r1.split(r0)     // Catch:{ all -> 0x0053 }
            int r1 = r2.length     // Catch:{ all -> 0x0053 }
            r0 = 2
            if (r1 != r0) goto L_0x002c
            r0 = 1
            r0 = r2[r0]     // Catch:{ all -> 0x0053 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x0053 }
            long r6 = r6 + r0
            goto L_0x002c
        L_0x004b:
            r3.close()     // Catch:{ all -> 0x005b }
            int r4 = r4 + 1
            if (r4 >= r5) goto L_0x005b
            goto L_0x000a
        L_0x0053:
            r0 = move-exception
            goto L_0x0057
        L_0x0055:
            r0 = move-exception
            goto L_0x005a
        L_0x0057:
            r3.close()
        L_0x005a:
            throw r0
        L_0x005b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.p789q.C12576b.m22633b():long");
    }

    /* renamed from: c */
    public static long m22636c() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/stat")), 1000);
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[13]) + Long.parseLong(split[14]) + Long.parseLong(split[15]) + Long.parseLong(split[16]);
                C21454c.m40295a(bufferedReader);
                return parseLong;
            } catch (Throwable unused) {
                C21454c.m40295a(bufferedReader);
                return -1;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
            C21454c.m40295a(bufferedReader);
            return -1;
        }
    }

    /* renamed from: d */
    public static long m22637d() {
        Throwable th;
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/stat")), 1000);
            try {
                String readLine = bufferedReader2.readLine();
                bufferedReader2.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[13]) + Long.parseLong(split[14]);
                C21454c.m40295a(bufferedReader2);
                return parseLong;
            } catch (Exception unused) {
                bufferedReader = bufferedReader2;
                C21454c.m40295a(bufferedReader);
                return -1;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = bufferedReader2;
                C21454c.m40295a(bufferedReader);
                throw th;
            }
        } catch (Exception unused2) {
            C21454c.m40295a(bufferedReader);
            return -1;
        } catch (Throwable th3) {
            th = th3;
            C21454c.m40295a(bufferedReader);
            throw th;
        }
    }

    /* renamed from: e */
    public static long m22638e() {
        try {
            String[] split = m22632a(C1764a.m5928a("/proc/%s/status", new Object[]{Integer.valueOf(Process.myPid())})).trim().split("\n");
            for (String str : split) {
                if (str.startsWith("VmSize")) {
                    Matcher matcher = Pattern.compile("\\d+").matcher(str);
                    if (matcher.find()) {
                        return Long.parseLong(matcher.group());
                    }
                }
            }
            if (split.length > 12) {
                Matcher matcher2 = Pattern.compile("\\d+").matcher(split[12]);
                if (matcher2.find()) {
                    return Long.parseLong(matcher2.group());
                }
            }
        } catch (Exception unused) {
        }
        return -1;
    }

    /* renamed from: i */
    private static long m22642i() {
        try {
            int i = Class.forName("libcore.io.OsConstants").getField("_SC_CLK_TCK").getInt(null);
            Class<?> cls = Class.forName("libcore.io.Libcore");
            Class<?> cls2 = Class.forName("libcore.io.Os");
            Object obj = cls.getField("os").get(null);
            return ((Long) cls2.getMethod("sysconf", Integer.TYPE).invoke(obj, Integer.valueOf(i))).longValue();
        } catch (Exception unused) {
            return 100;
        }
    }

    /* renamed from: a */
    public static long m22628a(File file) {
        try {
            StatFs statFs = new StatFs(file.getPath());
            int i = Build.VERSION.SDK_INT;
            return statFs.getTotalBytes();
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: b */
    private static long m22635b(File file) {
        long length;
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles == null) {
            return 0;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                length = m22635b(file2);
            } else {
                length = file2.length();
            }
            j += length;
        }
        return j;
    }

    /* renamed from: a */
    public static long m22627a(Context context) {
        File file;
        if (context == null) {
            return -1;
        }
        try {
            if (C58016d.f132222c == null || !C58016d.f132224e) {
                C58016d.f132222c = context.getFilesDir();
            }
            File file2 = new File(C58016d.f132222c.getParent());
            if (!file2.exists()) {
                return -1;
            }
            long b = m22635b(file2);
            if (!TextUtils.isEmpty(null)) {
                file = context.getExternalFilesDir(null);
            } else {
                if (C58016d.f132223d == null || !C58016d.f132224e) {
                    C58016d.f132223d = context.getExternalFilesDir(null);
                }
                file = C58016d.f132223d;
            }
            if (file != null) {
                File parentFile = file.getParentFile();
                long j = 0;
                if (parentFile.exists()) {
                    j = m22635b(parentFile);
                }
                return b + j;
            }
            return -1;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static long m22634b(Context context) {
        long j;
        if (context == null) {
            return -1;
        }
        try {
            if (TextUtils.isEmpty(context.getPackageName())) {
                return -1;
            }
            if (C58016d.f132221b == null || !C58016d.f132224e) {
                C58016d.f132221b = context.getCacheDir();
            }
            File file = C58016d.f132221b;
            long j2 = 0;
            if (file.exists()) {
                j = m22635b(file);
            } else {
                j = 0;
            }
            Context context2 = C12397c.f29931a;
            if (C58016d.f132220a == null || !C58016d.f132224e) {
                C58016d.f132220a = context2.getExternalCacheDir();
            }
            File file2 = C58016d.f132220a;
            if (file2.exists()) {
                j2 = m22635b(file2);
            }
            return j + j2;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m22631a(java.io.InputStream r4) {
        /*
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x002b }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x002b }
            r0.<init>(r4)     // Catch:{ all -> 0x002b }
            r2.<init>(r0)     // Catch:{ all -> 0x002b }
        L_0x0010:
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0020
            java.lang.StringBuilder r1 = r3.append(r0)     // Catch:{ all -> 0x0028 }
            r0 = 10
            r1.append(r0)     // Catch:{ all -> 0x0028 }
            goto L_0x0010
        L_0x0020:
            r2.close()
            java.lang.String r0 = r3.toString()
            return r0
        L_0x0028:
            r0 = move-exception
            r1 = r2
            goto L_0x002c
        L_0x002b:
            r0 = move-exception
        L_0x002c:
            if (r1 == 0) goto L_0x0031
            r1.close()
        L_0x0031:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.p789q.C12576b.m22631a(java.io.InputStream):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0019  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m22632a(java.lang.String r2) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            r2 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0015 }
            r1.<init>(r0)     // Catch:{ all -> 0x0015 }
            java.lang.String r0 = m22631a(r1)     // Catch:{ all -> 0x0013 }
            r1.close()
            return r0
        L_0x0013:
            r0 = move-exception
            goto L_0x0017
        L_0x0015:
            r0 = move-exception
            r1 = r2
        L_0x0017:
            if (r1 == 0) goto L_0x001c
            r1.close()
        L_0x001c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.p789q.C12576b.m22632a(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static Debug.MemoryInfo m22629a(int i, Context context) {
        if (context == null) {
            return null;
        }
        try {
            ActivityManager activityManager = (ActivityManager) m22630a(context, "activity");
            if (activityManager == null) {
                return null;
            }
            return activityManager.getProcessMemoryInfo(new int[]{i})[0];
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Object m22630a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!C58027i.f132246a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                    } catch (Exception e) {
                        C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                    }
                }
                C58027i.f132246a = false;
            }
            return systemService;
        }
    }
}
