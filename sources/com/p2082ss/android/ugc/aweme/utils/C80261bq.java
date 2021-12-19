package com.p2082ss.android.ugc.aweme.utils;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StatFs;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import p078c.p080b.C1756d;

/* renamed from: com.ss.android.ugc.aweme.utils.bq */
public final class C80261bq {

    /* renamed from: a */
    private static final FileFilter f179743a = new FileFilter() {
        /* class com.p2082ss.android.ugc.aweme.utils.C80261bq.C802621 */

        static {
            Covode.recordClassIndex(93530);
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

    /* renamed from: com.ss.android.ugc.aweme.utils.bq$a */
    public static class C80263a {

        /* renamed from: a */
        public String f179744a;

        /* renamed from: b */
        public int f179745b;

        /* renamed from: c */
        public int f179746c;

        static {
            Covode.recordClassIndex(93531);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.bq$b */
    public static class C80264b {

        /* renamed from: a */
        public long f179747a;

        /* renamed from: b */
        public long f179748b;

        static {
            Covode.recordClassIndex(93532);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.bq$c */
    public static class C80265c {

        /* renamed from: a */
        public int f179749a;

        /* renamed from: b */
        public int f179750b;

        /* renamed from: c */
        public int f179751c;

        /* renamed from: d */
        public float f179752d;

        /* renamed from: e */
        public float f179753e;

        static {
            Covode.recordClassIndex(93533);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.bq$d */
    public static class C80266d {

        /* renamed from: a */
        public long f179754a;

        /* renamed from: b */
        public long f179755b;

        /* renamed from: c */
        public long f179756c;

        /* renamed from: d */
        public long f179757d;

        /* renamed from: e */
        public long f179758e;

        /* renamed from: f */
        public int f179759f;

        static {
            Covode.recordClassIndex(93534);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.bq$e */
    public static class C80267e {

        /* renamed from: a */
        public static final C80268a f179760a;

        /* renamed from: com.ss.android.ugc.aweme.utils.bq$e$a */
        public static class C80268a {
            static {
                Covode.recordClassIndex(93536);
            }

            private C80268a() {
            }

            /* renamed from: a */
            public String mo123667a() {
                return Build.CPU_ABI + "_" + Build.CPU_ABI2;
            }

            /* synthetic */ C80268a(byte b) {
                this();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.utils.bq$e$b */
        static class C80269b extends C80268a {
            static {
                Covode.recordClassIndex(93537);
            }

            private C80269b() {
                super((byte) 0);
            }

            @Override // com.p2082ss.android.ugc.aweme.utils.C80261bq.C80267e.C80268a
            /* renamed from: a */
            public final String mo123667a() {
                String str = "";
                if (Build.VERSION.SDK_INT >= 21) {
                    if (Build.SUPPORTED_ABIS == null) {
                        return str;
                    }
                    String[] strArr = Build.SUPPORTED_ABIS;
                    for (int i = 0; i < strArr.length; i++) {
                        str = str + strArr[i] + "_";
                    }
                }
                return str;
            }

            /* synthetic */ C80269b(byte b) {
                this();
            }
        }

        static {
            Covode.recordClassIndex(93535);
            if (Build.VERSION.SDK_INT >= 21) {
                f179760a = new C80269b((byte) 0);
            } else {
                f179760a = new C80268a((byte) 0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.bq$f */
    public static class C80270f {

        /* renamed from: a */
        public long f179761a = -1;

        /* renamed from: b */
        public long f179762b = -1;

        /* renamed from: c */
        public long f179763c = -1;

        /* renamed from: d */
        public long f179764d = -1;

        /* renamed from: e */
        public int f179765e = -1;

        static {
            Covode.recordClassIndex(93538);
        }
    }

    static {
        Covode.recordClassIndex(93529);
    }

    /* renamed from: a */
    public static int m139114a() {
        int i = Build.VERSION.SDK_INT;
        try {
            int c = m139125c("/sys/devices/system/cpu/possible");
            if (c == -1) {
                c = m139125c("/sys/devices/system/cpu/present");
            }
            if (c == -1) {
                return new File("/sys/devices/system/cpu/").listFiles(f179743a).length;
            }
            return c;
        } catch (NullPointerException | SecurityException unused) {
            return -1;
        }
    }

    /* renamed from: e */
    public static boolean m139131e() {
        String str = Build.TAGS;
        if (str != null && str.contains("test-keys")) {
            return true;
        }
        try {
            if (new File("/system/app/Superuser.apk").exists()) {
                return true;
            }
        } catch (Exception unused) {
        }
        if (m139129d("/system/xbin/which su") || m139129d("/system/bin/which su") || m139129d("which su") || m139129d("busybox which su")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static C80270f m139128d() {
        File[] listFiles;
        C80270f fVar = new C80270f();
        try {
            fVar.f179761a = (long) m139132f();
            fVar.f179762b = (long) m139134g();
            File file = new File("/proc/" + Process.myPid() + "/fd");
            int i = -1;
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                i = listFiles.length;
            }
            fVar.f179764d = (long) i;
            fVar.f179765e = m139135h();
            fVar.f179763c = (long) m139136i();
            return fVar;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    private static int m139132f() {
        FileInputStream fileInputStream;
        Throwable th;
        int i;
        Exception e;
        MethodCollector.m26663i(5818);
        try {
            fileInputStream = new FileInputStream("/proc/" + Process.myPid() + "/status");
            try {
                i = m139115a("VmPeak", fileInputStream);
                m139120a(fileInputStream);
            } catch (Exception e2) {
                e = e2;
                try {
                    e.printStackTrace();
                    m139120a(fileInputStream);
                    i = -1;
                    MethodCollector.m26664o(5818);
                    return i;
                } catch (Throwable th2) {
                    th = th2;
                    m139120a(fileInputStream);
                    MethodCollector.m26664o(5818);
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
            e.printStackTrace();
            m139120a(fileInputStream);
            i = -1;
            MethodCollector.m26664o(5818);
            return i;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            m139120a(fileInputStream);
            MethodCollector.m26664o(5818);
            throw th;
        }
        MethodCollector.m26664o(5818);
        return i;
    }

    /* renamed from: g */
    private static int m139134g() {
        FileInputStream fileInputStream;
        Throwable th;
        int i;
        Exception e;
        MethodCollector.m26663i(5953);
        try {
            fileInputStream = new FileInputStream("/proc/" + Process.myPid() + "/status");
            try {
                i = m139115a("VmSize", fileInputStream);
                m139120a(fileInputStream);
            } catch (Exception e2) {
                e = e2;
                try {
                    e.printStackTrace();
                    m139120a(fileInputStream);
                    i = -1;
                    MethodCollector.m26664o(5953);
                    return i;
                } catch (Throwable th2) {
                    th = th2;
                    m139120a(fileInputStream);
                    MethodCollector.m26664o(5953);
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
            e.printStackTrace();
            m139120a(fileInputStream);
            i = -1;
            MethodCollector.m26664o(5953);
            return i;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            m139120a(fileInputStream);
            MethodCollector.m26664o(5953);
            throw th;
        }
        MethodCollector.m26664o(5953);
        return i;
    }

    /* renamed from: h */
    private static int m139135h() {
        FileInputStream fileInputStream;
        Throwable th;
        int i;
        Exception e;
        MethodCollector.m26663i(6110);
        try {
            fileInputStream = new FileInputStream("/proc/" + Process.myPid() + "/status");
            try {
                i = m139115a("Threads", fileInputStream);
                m139120a(fileInputStream);
            } catch (Exception e2) {
                e = e2;
                try {
                    e.printStackTrace();
                    m139120a(fileInputStream);
                    i = -1;
                    MethodCollector.m26664o(6110);
                    return i;
                } catch (Throwable th2) {
                    th = th2;
                    m139120a(fileInputStream);
                    MethodCollector.m26664o(6110);
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
            e.printStackTrace();
            m139120a(fileInputStream);
            i = -1;
            MethodCollector.m26664o(6110);
            return i;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            m139120a(fileInputStream);
            MethodCollector.m26664o(6110);
            throw th;
        }
        MethodCollector.m26664o(6110);
        return i;
    }

    /* renamed from: i */
    private static int m139136i() {
        FileInputStream fileInputStream;
        Throwable th;
        int i;
        Exception e;
        MethodCollector.m26663i(6112);
        try {
            fileInputStream = new FileInputStream("/proc/" + Process.myPid() + "/limits");
            try {
                i = m139115a("Max open files", fileInputStream);
                m139120a(fileInputStream);
            } catch (Exception e2) {
                e = e2;
                try {
                    e.printStackTrace();
                    m139120a(fileInputStream);
                    i = -1;
                    MethodCollector.m26664o(6112);
                    return i;
                } catch (Throwable th2) {
                    th = th2;
                    m139120a(fileInputStream);
                    MethodCollector.m26664o(6112);
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
            e.printStackTrace();
            m139120a(fileInputStream);
            i = -1;
            MethodCollector.m26664o(6112);
            return i;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            m139120a(fileInputStream);
            MethodCollector.m26664o(6112);
            throw th;
        }
        MethodCollector.m26664o(6112);
        return i;
    }

    /* renamed from: b */
    public static int m139121b() {
        MethodCollector.m26663i(5208);
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < m139114a(); i3++) {
            try {
                File file = new File("/sys/devices/system/cpu/cpu" + i3 + "/cpufreq/cpuinfo_max_freq");
                if (file.exists()) {
                    byte[] bArr = new byte[128];
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        fileInputStream.read(bArr);
                        int i4 = 0;
                        while (Character.isDigit(bArr[i4]) && i4 < 128) {
                            i4++;
                        }
                        Integer valueOf = Integer.valueOf(Integer.parseInt(new String(bArr, 0, i4)));
                        if (valueOf.intValue() > i2) {
                            i2 = valueOf.intValue();
                        }
                    } catch (NumberFormatException unused) {
                    } catch (Throwable th) {
                        fileInputStream.close();
                        MethodCollector.m26664o(5208);
                        throw th;
                    }
                    fileInputStream.close();
                }
            } catch (IOException unused2) {
            }
        }
        if (i2 == -1) {
            FileInputStream fileInputStream2 = new FileInputStream("/proc/cpuinfo");
            try {
                int a = m139115a("cpu MHz", fileInputStream2) * 1000;
                if (a > i2) {
                    i2 = a;
                }
                fileInputStream2.close();
            } catch (Throwable th2) {
                fileInputStream2.close();
                MethodCollector.m26664o(5208);
                throw th2;
            }
        }
        i = i2;
        if (String.valueOf(i).length() >= 6) {
            int i5 = i / 1000;
            MethodCollector.m26664o(5208);
            return i5;
        }
        MethodCollector.m26664o(5208);
        return i;
    }

    /* renamed from: c */
    public static String m139126c() {
        Throwable th;
        IOException e;
        MethodCollector.m26663i(5684);
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader("/proc/cpuinfo"));
            while (true) {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        m139120a(bufferedReader2);
                        break;
                    } else if (readLine.contains(":")) {
                        String[] split = readLine.split(":");
                        if (split[0].contains("Hardware")) {
                            String str = split[1];
                            m139120a(bufferedReader2);
                            MethodCollector.m26664o(5684);
                            return str;
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                    bufferedReader = bufferedReader2;
                    try {
                        e.printStackTrace();
                        m139120a(bufferedReader);
                        String str2 = Build.HARDWARE;
                        MethodCollector.m26664o(5684);
                        return str2;
                    } catch (Throwable th2) {
                        th = th2;
                        m139120a(bufferedReader);
                        MethodCollector.m26664o(5684);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = bufferedReader2;
                    m139120a(bufferedReader);
                    MethodCollector.m26664o(5684);
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            e.printStackTrace();
            m139120a(bufferedReader);
            String str22 = Build.HARDWARE;
            MethodCollector.m26664o(5684);
            return str22;
        }
        String str222 = Build.HARDWARE;
        MethodCollector.m26664o(5684);
        return str222;
    }

    /* renamed from: a */
    private static void m139120a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    public static long m139127d(Context context) {
        long b = C1756d.m5895b(context);
        if (b == -1) {
            return -1;
        }
        return b;
    }

    /* renamed from: a */
    public static long m139118a(String str) {
        try {
            StatFs statFs = new StatFs(str);
            int i = Build.VERSION.SDK_INT;
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static long m139123b(String str) {
        try {
            StatFs statFs = new StatFs(str);
            int i = Build.VERSION.SDK_INT;
            return statFs.getBlockSizeLong() * statFs.getBlockCountLong();
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static int m139124c(Context context) {
        try {
            if ((context.getApplicationInfo().flags & 262144) == 262144) {
                return 1;
            }
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: f */
    public static int m139133f(Context context) {
        try {
            return ((ActivityManager) m139119a(context, "activity")).getProcessMemoryInfo(new int[]{Process.myPid()})[0].getTotalPss();
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: d */
    private static boolean m139129d(String str) {
        MethodCollector.m26663i(6267);
        boolean z = false;
        Process process = null;
        try {
            Process exec = Runtime.getRuntime().exec(str);
            if (new BufferedReader(new InputStreamReader(exec.getInputStream())).readLine() != null) {
                z = true;
            }
            exec.destroy();
            MethodCollector.m26664o(6267);
            return z;
        } catch (Exception unused) {
            if (0 != 0) {
                process.destroy();
            }
            MethodCollector.m26664o(6267);
            return false;
        } catch (Throwable th) {
            if (0 != 0) {
                process.destroy();
            }
            MethodCollector.m26664o(6267);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
        if (r0 == -1) goto L_0x0023;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m139122b(android.content.Context r6) {
        /*
            r5 = 5435(0x153b, float:7.616E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r5)
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = -1
            r0 = 16
            android.app.ActivityManager$MemoryInfo r1 = new android.app.ActivityManager$MemoryInfo
            r1.<init>()
            java.lang.String r0 = "activity"
            java.lang.Object r0 = m139119a(r6, r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            if (r0 == 0) goto L_0x0025
            r0.getMemoryInfo(r1)
            long r0 = r1.availMem
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x004c
        L_0x0023:
            r3 = 0
            goto L_0x0028
        L_0x0025:
            r0 = -1
            goto L_0x0023
        L_0x0028:
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0049, all -> 0x003f }
            java.lang.String r2 = "/proc/meminfo"
            r4.<init>(r2)     // Catch:{ Exception -> 0x0049, all -> 0x003f }
            java.lang.String r2 = "MemAvailable"
            int r0 = m139115a(r2, r4)     // Catch:{ Exception -> 0x0048, all -> 0x003d }
            long r2 = (long) r0
            r0 = 1024(0x400, double:5.06E-321)
            long r0 = r0 * r2
            m139120a(r4)
            goto L_0x004c
        L_0x003d:
            r0 = move-exception
            goto L_0x0041
        L_0x003f:
            r0 = move-exception
            r4 = r3
        L_0x0041:
            m139120a(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            throw r0
        L_0x0048:
            r3 = r4
        L_0x0049:
            m139120a(r3)
        L_0x004c:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.utils.C80261bq.m139122b(android.content.Context):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0051, code lost:
        if (0 == 0) goto L_0x005b;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m139125c(java.lang.String r5) {
        /*
            r4 = 5131(0x140b, float:7.19E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)
            r3 = -1
            r0 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0051, all -> 0x004c }
            r2.<init>(r5)     // Catch:{ IOException -> 0x0051, all -> 0x004c }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x004a, all -> 0x0040 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x004a, all -> 0x0040 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x004a, all -> 0x0040 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x004a, all -> 0x0040 }
            java.lang.String r1 = r1.readLine()     // Catch:{ IOException -> 0x004a, all -> 0x0040 }
            if (r1 == 0) goto L_0x0034
            java.lang.String r0 = "0-[\\d]+$"
            boolean r0 = r1.matches(r0)     // Catch:{ IOException -> 0x004a, all -> 0x0040 }
            if (r0 != 0) goto L_0x0025
            goto L_0x0034
        L_0x0025:
            r0 = 2
            java.lang.String r0 = r1.substring(r0)     // Catch:{ IOException -> 0x004a, all -> 0x0040 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x004a, all -> 0x0040 }
            int r0 = r0.intValue()     // Catch:{ IOException -> 0x004a, all -> 0x0040 }
            int r3 = r0 + 1
        L_0x0034:
            r2.close()     // Catch:{ IOException -> 0x0038 }
            goto L_0x003c
        L_0x0038:
            r0 = move-exception
            r0.printStackTrace()
        L_0x003c:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return r3
        L_0x0040:
            r1 = move-exception
            r2.close()     // Catch:{ IOException -> 0x0045 }
            goto L_0x004d
        L_0x0045:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x004d
        L_0x004a:
            r0 = r2
            goto L_0x0053
        L_0x004c:
            r1 = move-exception
        L_0x004d:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            throw r1
        L_0x0051:
            if (r0 == 0) goto L_0x005b
        L_0x0053:
            r0.close()     // Catch:{ IOException -> 0x0057 }
            goto L_0x005b
        L_0x0057:
            r0 = move-exception
            r0.printStackTrace()
        L_0x005b:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.utils.C80261bq.m139125c(java.lang.String):int");
    }

    /* renamed from: e */
    public static long m139130e(Context context) {
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
            String parent = C58016d.f132221b.getParent();
            long j2 = 0;
            if (parent != null) {
                File file = new File(parent);
                if (!file.exists()) {
                    return -1;
                }
                j = m139117a(file);
            } else {
                j = 0;
            }
            File file2 = new File(C1756d.m5892a(context));
            if (file2.exists()) {
                j2 = m139117a(file2);
            }
            return j + j2;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
        if (r0 == -1) goto L_0x0023;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m139116a(android.content.Context r6) {
        /*
            r5 = 5224(0x1468, float:7.32E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r5)
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = -1
            r0 = 16
            android.app.ActivityManager$MemoryInfo r1 = new android.app.ActivityManager$MemoryInfo
            r1.<init>()
            java.lang.String r0 = "activity"
            java.lang.Object r0 = m139119a(r6, r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            if (r0 == 0) goto L_0x0025
            r0.getMemoryInfo(r1)
            long r0 = r1.totalMem
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x004c
        L_0x0023:
            r3 = 0
            goto L_0x0028
        L_0x0025:
            r0 = -1
            goto L_0x0023
        L_0x0028:
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0049, all -> 0x003f }
            java.lang.String r2 = "/proc/meminfo"
            r4.<init>(r2)     // Catch:{ Exception -> 0x0049, all -> 0x003f }
            java.lang.String r2 = "MemTotal"
            int r0 = m139115a(r2, r4)     // Catch:{ Exception -> 0x0048, all -> 0x003d }
            long r2 = (long) r0
            r0 = 1024(0x400, double:5.06E-321)
            long r0 = r0 * r2
            m139120a(r4)
            goto L_0x004c
        L_0x003d:
            r0 = move-exception
            goto L_0x0041
        L_0x003f:
            r0 = move-exception
            r4 = r3
        L_0x0041:
            m139120a(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            throw r0
        L_0x0048:
            r3 = r4
        L_0x0049:
            m139120a(r3)
        L_0x004c:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.utils.C80261bq.m139116a(android.content.Context):long");
    }

    /* renamed from: a */
    private static long m139117a(File file) {
        long length;
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles == null) {
            return 0;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                length = m139117a(file2);
            } else {
                length = file2.length();
            }
            j += length;
        }
        return j;
    }

    /* renamed from: a */
    private static int m139115a(String str, FileInputStream fileInputStream) {
        MethodCollector.m26663i(5551);
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
                                    MethodCollector.m26664o(5551);
                                    return parseInt;
                                }
                                i2++;
                            }
                            MethodCollector.m26664o(5551);
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
        MethodCollector.m26664o(5551);
        return -1;
    }

    /* renamed from: a */
    public static Object m139119a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(5244);
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
                    MethodCollector.m26664o(5244);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
