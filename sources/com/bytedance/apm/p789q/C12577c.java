package com.bytedance.apm.p789q;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import android.text.TextUtils;
import com.bytedance.apm.C12397c;
import com.bytedance.apm.C12478h;
import com.bytedance.apm.internal.C12509b;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.q.c */
public final class C12577c {

    /* renamed from: a */
    public boolean f30588a;

    /* renamed from: b */
    private boolean f30589b;

    /* renamed from: c */
    private boolean f30590c;

    /* renamed from: d */
    private String f30591d;

    /* renamed from: e */
    private int f30592e;

    /* renamed from: f */
    private String f30593f;

    /* renamed from: g */
    private int f30594g;

    /* renamed from: h */
    private long f30595h;

    /* renamed from: i */
    private boolean f30596i;

    /* renamed from: j */
    private long f30597j;

    /* renamed from: k */
    private long f30598k;

    /* renamed from: l */
    private String f30599l;

    /* renamed from: m */
    private boolean f30600m;

    /* renamed from: n */
    private long f30601n;

    /* renamed from: o */
    private long f30602o;

    /* renamed from: p */
    private double f30603p;

    /* renamed from: q */
    private long f30604q;

    /* renamed from: r */
    private long f30605r;

    /* renamed from: s */
    private double f30606s;

    /* renamed from: t */
    private long f30607t;

    /* renamed from: u */
    private long f30608u;

    /* renamed from: v */
    private double f30609v;

    /* renamed from: w */
    private boolean f30610w;

    /* renamed from: x */
    private boolean f30611x;

    static {
        Covode.recordClassIndex(14394);
    }

    /* renamed from: com.bytedance.apm.q.c$a */
    public static class C12579a {

        /* renamed from: a */
        public static final C12577c f30614a = new C12577c((byte) 0);

        static {
            Covode.recordClassIndex(14396);
        }
    }

    /* renamed from: d */
    private static String m22652d() {
        boolean a;
        File file = new File("/system/lib/libc.so");
        if (!file.exists()) {
            return "unknown";
        }
        try {
            C12594o oVar = new C12594o(file);
            if (Math.max(oVar.f30626a, oVar.f30627b) <= 200000) {
                a = oVar.mo20412b("je_malloc");
            } else {
                a = oVar.mo20411a("je_malloc");
            }
            oVar.mo20410a();
            if (a) {
                return "jemalloc";
            }
            return "dlmalloc";
        } catch (IOException unused) {
            return "unknown";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m22648b() {
        /*
            r7 = this;
            r4 = 0
            r6 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x004d, all -> 0x004b }
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ Exception -> 0x004d, all -> 0x004b }
            java.lang.String r0 = "/proc/cpuinfo"
            r1.<init>(r0)     // Catch:{ Exception -> 0x004d, all -> 0x004b }
            r3.<init>(r1)     // Catch:{ Exception -> 0x004d, all -> 0x004b }
            r5 = 0
        L_0x000f:
            java.lang.String r1 = r3.readLine()     // Catch:{ Exception -> 0x0042, all -> 0x0046 }
            if (r1 == 0) goto L_0x003e
            java.lang.String r0 = ":"
            java.lang.String[] r2 = r1.split(r0)     // Catch:{ Exception -> 0x0042, all -> 0x0046 }
            int r1 = r2.length     // Catch:{ Exception -> 0x0042, all -> 0x0046 }
            r0 = 2
            if (r1 != r0) goto L_0x000f
            r1 = r2[r6]     // Catch:{ Exception -> 0x0042, all -> 0x0046 }
            java.lang.String r0 = "Hardware"
            boolean r0 = r1.startsWith(r0)     // Catch:{ Exception -> 0x0042, all -> 0x0046 }
            if (r0 == 0) goto L_0x0031
            r0 = 1
            r0 = r2[r0]     // Catch:{ Exception -> 0x0042, all -> 0x0046 }
            java.lang.String r4 = r0.trim()     // Catch:{ Exception -> 0x0042, all -> 0x0046 }
            goto L_0x000f
        L_0x0031:
            r1 = r2[r6]     // Catch:{ Exception -> 0x0042, all -> 0x0046 }
            java.lang.String r0 = "processor"
            boolean r0 = r1.startsWith(r0)     // Catch:{ Exception -> 0x0042, all -> 0x0046 }
            if (r0 == 0) goto L_0x000f
            int r5 = r5 + 1
            goto L_0x000f
        L_0x003e:
            r3.close()     // Catch:{ Exception -> 0x004e }
            goto L_0x004e
        L_0x0042:
            r3.close()     // Catch:{ Exception -> 0x004e }
            goto L_0x004e
        L_0x0046:
            r0 = move-exception
            r3.close()     // Catch:{ Exception -> 0x004c }
            goto L_0x004c
        L_0x004b:
            r0 = move-exception
        L_0x004c:
            throw r0
        L_0x004d:
            r5 = 0
        L_0x004e:
            r7.f30591d = r4
            r7.f30592e = r5
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x0062
            boolean r0 = com.bytedance.apm.p789q.C12596p.m22715b()
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = android.os.Build.HARDWARE
            r7.f30591d = r0
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.p789q.C12577c.m22648b():void");
    }

    /* renamed from: c */
    private static String m22650c() {
        String str = null;
        Process exec = Runtime.getRuntime().exec("mount");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
        try {
            m22647a(exec, TimeUnit.SECONDS);
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                } else if (readLine.contains("/data ")) {
                    String[] split = readLine.split(" ");
                    int length = split.length;
                    for (int i = 0; i < length - 1; i++) {
                        if (split[i].equals("/data")) {
                            int i2 = i + 1;
                            if (split[i2].equals(StringSet.type)) {
                                int i3 = i + 2;
                                if (i3 < length) {
                                    str = split[i3];
                                }
                            } else {
                                str = split[i2];
                            }
                        }
                    }
                }
            }
            exec.destroy();
            try {
                bufferedReader.close();
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            bufferedReader.close();
        } catch (Throwable th) {
            try {
                bufferedReader.close();
                throw th;
            } catch (IOException unused3) {
                throw th;
            }
        }
        return str;
    }

    /* renamed from: a */
    private void m22645a() {
        String str = C12397c.f29931a.getApplicationInfo().nativeLibraryDir;
        if (!TextUtils.isEmpty(str) && str.endsWith("arm64")) {
            this.f30589b = true;
        }
        StringBuilder sb = new StringBuilder();
        if (Build.VERSION.SDK_INT < 21 || Build.SUPPORTED_ABIS.length <= 0) {
            sb = new StringBuilder(Build.CPU_ABI);
        } else {
            for (int i = 0; i < Build.SUPPORTED_ABIS.length; i++) {
                sb.append(Build.SUPPORTED_ABIS[i]);
                if (i != Build.SUPPORTED_ABIS.length - 1) {
                    sb.append(", ");
                }
            }
        }
        String sb2 = sb.toString();
        if (sb2 != null && sb2.contains("64")) {
            this.f30590c = true;
        }
        C12509b bVar = C12509b.C12510a.f30379a;
        String a = bVar.mo20339a("sp_cpu_model");
        int i2 = bVar.f30378a.getInt("sp_cpu_core_num", -1);
        if (!TextUtils.isEmpty(a)) {
            this.f30591d = a;
            this.f30592e = i2;
            return;
        }
        m22648b();
        if (TextUtils.isEmpty(this.f30591d)) {
            this.f30591d = "unknown";
        }
        bVar.mo20341a("sp_cpu_model", this.f30591d);
        bVar.f30378a.edit().putInt("sp_cpu_core_num", this.f30592e).apply();
    }

    private C12577c() {
        File file;
        if (C12599s.m22724a()) {
            final Throwable th = new Throwable("Don't use DeviceInfoUtil on main thread.");
            C12560b.C12564a.f30567a.mo20387a(new Runnable() {
                /* class com.bytedance.apm.p789q.C12577c.RunnableC125781 */

                static {
                    Covode.recordClassIndex(14395);
                }

                public final void run() {
                    C12478h.C12481b.f30317a.mo20297b(th, "apm_error");
                }
            });
        }
        boolean z = C12397c.f29944n;
        this.f30588a = z;
        if (z) {
            try {
                m22645a();
                C12509b bVar = C12509b.C12510a.f30379a;
                String a = bVar.mo20339a("sp_fs_type");
                long b = bVar.mo20342b("sp_fs_check_time");
                long currentTimeMillis = System.currentTimeMillis();
                if (TextUtils.isEmpty(a) || currentTimeMillis - b >= 604800000) {
                    String c = m22650c();
                    this.f30593f = c;
                    if (TextUtils.isEmpty(c)) {
                        this.f30593f = "unknown";
                    }
                    bVar.mo20341a("sp_fs_type", this.f30593f);
                    bVar.mo20340a("sp_fs_check_time", currentTimeMillis);
                } else {
                    this.f30593f = a;
                }
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) m22644a(C12397c.f29931a, "activity")).getMemoryInfo(memoryInfo);
                int i = Build.VERSION.SDK_INT;
                this.f30594g = (int) (memoryInfo.totalMem / 536870912);
                if (Build.VERSION.SDK_INT < 21) {
                    this.f30599l = "dlmalloc";
                } else if (Build.VERSION.SDK_INT >= 24) {
                    this.f30599l = "jemalloc";
                } else {
                    String a2 = C12509b.C12510a.f30379a.mo20339a("sp_malloc_impl");
                    if (a2 == null) {
                        a2 = m22652d();
                        C12509b.C12510a.f30379a.mo20341a("sp_malloc_impl", a2);
                    }
                    this.f30599l = a2;
                }
                int i2 = Build.VERSION.SDK_INT;
                this.f30600m = true;
                StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
                if (this.f30600m) {
                    this.f30602o = statFs.getAvailableBytes();
                    this.f30601n = statFs.getBlockSizeLong() * statFs.getBlockCountLong();
                } else {
                    this.f30602o = ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
                    this.f30601n = ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount());
                }
                this.f30603p = m22643a(this.f30602o, this.f30601n);
                try {
                    Context context = C12397c.f29931a;
                    if (C58016d.f132222c == null || !C58016d.f132224e) {
                        file = context.getFilesDir();
                        C58016d.f132222c = file;
                    } else {
                        file = C58016d.f132222c;
                    }
                    StatFs statFs2 = new StatFs(file.getAbsolutePath());
                    if (this.f30600m) {
                        this.f30605r = statFs2.getAvailableBytes();
                        this.f30604q = statFs2.getBlockSizeLong() * statFs2.getBlockCountLong();
                    } else {
                        this.f30605r = ((long) statFs2.getBlockSize()) * ((long) statFs2.getAvailableBlocks());
                        this.f30604q = ((long) statFs2.getBlockSize()) * ((long) statFs2.getBlockCount());
                    }
                    this.f30606s = m22643a(this.f30605r, this.f30604q);
                } catch (Throwable unused) {
                }
                String str = null;
                try {
                    str = Environment.getExternalStorageState();
                } catch (Exception unused2) {
                }
                boolean equals = TextUtils.equals(str, "mounted");
                this.f30610w = equals;
                if (equals) {
                    try {
                        StatFs statFs3 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
                        if (this.f30600m) {
                            this.f30608u = statFs3.getAvailableBytes();
                            this.f30607t = statFs3.getBlockSizeLong() * statFs3.getBlockCountLong();
                        } else {
                            this.f30608u = ((long) statFs3.getBlockSize()) * ((long) statFs3.getAvailableBlocks());
                            this.f30607t = ((long) statFs3.getBlockSize()) * ((long) statFs3.getBlockCount());
                        }
                        this.f30609v = m22643a(this.f30608u, this.f30607t);
                    } catch (Throwable unused3) {
                    }
                } else {
                    this.f30607t = 0;
                }
                this.f30611x = Environment.isExternalStorageRemovable();
            } catch (Throwable unused4) {
            }
        }
    }

    /* synthetic */ C12577c(byte b) {
        this();
    }

    /* renamed from: b */
    private void m22649b(JSONObject jSONObject) {
        if (jSONObject != null && this.f30588a) {
            jSONObject.put("apm_fs_type", this.f30593f);
        }
    }

    /* renamed from: c */
    private void m22651c(JSONObject jSONObject) {
        if (jSONObject != null && this.f30588a) {
            jSONObject.put("apm_physical_mem", this.f30594g);
            jSONObject.put("apm_malloc_impl", this.f30599l);
        }
    }

    /* renamed from: a */
    private void m22646a(JSONObject jSONObject) {
        if (jSONObject != null && this.f30588a) {
            jSONObject.put("apm_is_app_64", this.f30589b);
            jSONObject.put("apm_is_device_64", this.f30590c);
            jSONObject.put("apm_cpu_model", this.f30591d);
            int i = this.f30592e;
            if (i > 0) {
                jSONObject.put("apm_cpu_core_num", i);
            }
        }
    }

    /* renamed from: d */
    private void m22653d(JSONObject jSONObject) {
        boolean z;
        if (jSONObject != null && this.f30588a) {
            this.f30595h = Debug.getNativeHeapAllocatedSize() / 1048576;
            Runtime runtime = Runtime.getRuntime();
            long maxMemory = runtime.maxMemory();
            long freeMemory = runtime.freeMemory();
            long j = runtime.totalMemory();
            this.f30597j = maxMemory / 1048576;
            long j2 = j - freeMemory;
            this.f30598k = j2 / 1048576;
            if (((float) j2) > ((float) maxMemory) * 0.95f) {
                z = true;
            } else {
                z = false;
            }
            this.f30596i = z;
            jSONObject.put("apm_native_heap_size", this.f30595h);
            jSONObject.put("apm_java_heap_leak", this.f30596i);
            jSONObject.put("apm_java_heap_used", this.f30598k);
            jSONObject.put("apm_java_heap_max", this.f30597j);
        }
    }

    /* renamed from: e */
    private void m22654e(JSONObject jSONObject) {
        if (jSONObject != null && this.f30588a) {
            if (this.f30601n != 0) {
                jSONObject.put("apm_sys_avail_size", this.f30602o / 1048576);
                jSONObject.put("apm_sys_avail_ratio", this.f30603p);
            }
            if (this.f30604q != 0) {
                jSONObject.put("apm_data_avail_size", this.f30605r / 1073741824);
                jSONObject.put("apm_data_avail_ratio", this.f30606s);
            }
            if (this.f30607t != 0) {
                jSONObject.put("apm_sd_avail_size", this.f30608u / 1073741824);
                jSONObject.put("apm_sd_avail_ratio", this.f30609v);
            }
            if (this.f30610w) {
                jSONObject.put("apm_external_removable", this.f30611x);
            }
        }
    }

    /* renamed from: a */
    public final void mo20404a(JSONObject jSONObject, boolean z) {
        if (this.f30588a || z) {
            try {
                C12579a.f30614a.m22653d(jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    private static double m22643a(long j, long j2) {
        if (j2 == 0) {
            return 0.0d;
        }
        double d = (double) j;
        double d2 = (double) j2;
        Double.isNaN(d);
        Double.isNaN(d2);
        double round = (double) Math.round((d / d2) * 100.0d);
        Double.isNaN(round);
        return round / 100.0d;
    }

    /* renamed from: b */
    public final void mo20405b(JSONObject jSONObject, boolean z) {
        if (this.f30588a || z) {
            try {
                C12579a.f30614a.m22646a(jSONObject);
                C12579a.f30614a.m22651c(jSONObject);
                C12579a.f30614a.m22649b(jSONObject);
                C12579a.f30614a.m22654e(jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    private static Object m22644a(Context context, String str) {
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

    /* renamed from: a */
    private static boolean m22647a(Process process, TimeUnit timeUnit) {
        if (Build.VERSION.SDK_INT >= 26) {
            return process.waitFor(2, timeUnit);
        }
        long nanoTime = System.nanoTime();
        long nanos = timeUnit.toNanos(2);
        do {
            try {
                process.exitValue();
                return true;
            } catch (IllegalThreadStateException unused) {
                if (nanos > 0) {
                    Thread.sleep(Math.min(TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 100L));
                }
                nanos = timeUnit.toNanos(2) - (System.nanoTime() - nanoTime);
                if (nanos <= 0) {
                    return false;
                }
            }
        } while (nanos <= 0);
        return false;
    }
}
