package com.bytedance.p1435io.prefetcher;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.bytedance.io.prefetcher.IoPrefetcher */
public class IoPrefetcher {

    /* renamed from: A */
    private static String f47698A = "produce_step";

    /* renamed from: B */
    private static int f47699B = 10;

    /* renamed from: C */
    private static String f47700C = "skip_threshhold";

    /* renamed from: D */
    private static String f47701D = "threshhold";

    /* renamed from: E */
    private static String f47702E = "step_size";

    /* renamed from: F */
    private static String f47703F = "step_sleep_duration";

    /* renamed from: G */
    private static long f47704G = 524288;

    /* renamed from: H */
    private static long f47705H = 15000;

    /* renamed from: a */
    public static String f47706a = "IoPrefetcher";

    /* renamed from: b */
    public static Handler f47707b;

    /* renamed from: c */
    public static int f47708c = -1;

    /* renamed from: d */
    public static int f47709d = -2;

    /* renamed from: e */
    public static int f47710e = -3;

    /* renamed from: f */
    public static String f47711f = "prefetcher";

    /* renamed from: g */
    public static String f47712g = "dex";

    /* renamed from: h */
    public static String f47713h = "aot";

    /* renamed from: i */
    public static String f47714i = "aot_7";

    /* renamed from: j */
    public static String f47715j = "smaps.txt";

    /* renamed from: k */
    public static String f47716k = "file_open_record";

    /* renamed from: l */
    public static boolean f47717l;

    /* renamed from: m */
    public static boolean f47718m = true;

    /* renamed from: n */
    public static int f47719n = 50;

    /* renamed from: o */
    public static int f47720o;

    /* renamed from: p */
    public static long f47721p = 1572864;

    /* renamed from: q */
    public static long f47722q;

    /* renamed from: r */
    public static long f47723r;

    /* renamed from: s */
    public static long f47724s;

    /* renamed from: t */
    private static volatile IoPrefetcher f47725t;

    /* renamed from: u */
    private static String f47726u = "art_debug";

    /* renamed from: v */
    private static String f47727v = "hook";

    /* renamed from: w */
    private static String f47728w = "/data/local/tmp/profile";

    /* renamed from: x */
    private static int f47729x = 1;

    /* renamed from: y */
    private static int f47730y = 2;

    /* renamed from: z */
    private static String f47731z = "io_preference";

    public static native int closePagemap();

    public static native byte[] hasPhysicalPage(long j, int i);

    public static native int hookMethod(String str, int i);

    public static native int openPagemap(String str);

    public static native int unhookMethod(int i);

    public native int prefetch(String str, String str2, long j, long j2, long j3, long j4);

    private IoPrefetcher() {
    }

    /* renamed from: a */
    public static IoPrefetcher m37997a() {
        MethodCollector.m26663i(9086);
        if (f47725t == null) {
            synchronized (IoPrefetcher.class) {
                try {
                    if (f47725t == null) {
                        f47725t = new IoPrefetcher();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9086);
                    throw th;
                }
            }
        }
        IoPrefetcher ioPrefetcher = f47725t;
        MethodCollector.m26664o(9086);
        return ioPrefetcher;
    }

    static {
        Covode.recordClassIndex(23565);
    }

    /* renamed from: a */
    private static File m37998a(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    /* renamed from: b */
    private static String m38000b(Context context) {
        try {
            return context.getPackageName() + "_" + context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.HashMap<java.lang.Long, java.util.ArrayList<java.lang.Boolean>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static long m37996a(C20062a[] aVarArr) {
        long j = 0;
        for (int i = 0; i < aVarArr.length; i++) {
            ArrayList<Pair<Long, Long>> arrayList = aVarArr[i].f47739a;
            ArrayList<Long> arrayList2 = aVarArr[i].f47740b;
            if (arrayList != null) {
                HashMap<Long, ArrayList<Boolean>> hashMap = aVarArr[i].f47741c;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    int longValue = (int) ((((Long) arrayList.get(i2).second).longValue() - ((Long) arrayList.get(i2).first).longValue()) / 4096);
                    if (hashMap.get(arrayList.get(i2).first) == null) {
                        ArrayList arrayList3 = new ArrayList(longValue);
                        hashMap.put(arrayList.get(i2).first, arrayList3);
                        for (int i3 = 0; i3 < longValue; i3++) {
                            arrayList3.add(i3, false);
                        }
                    }
                    new StringBuilder("path:").append(aVarArr[i].f47742d).append(" vmaStart:").append(arrayList.get(i2).first).append(" vmaEnd:").append(arrayList.get(i2).second).append(" vmafileoffset:").append(arrayList2.get(i2));
                    long a = m37995a(i, arrayList2.get(i2).longValue(), ((Long) arrayList.get(i2).first).longValue(), ((Long) arrayList.get(i2).second).longValue(), hashMap);
                    if (a == -1) {
                        return -1;
                    }
                    j += a;
                }
                continue;
            }
        }
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004c, code lost:
        if (r2 == null) goto L_0x0056;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0058 A[SYNTHETIC, Splitter:B:40:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0068 A[SYNTHETIC, Splitter:B:48:0x0068] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0081  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m37999a(java.io.File r6, java.io.File r7) {
        /*
        // Method dump skipped, instructions count: 133
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1435io.prefetcher.IoPrefetcher.m37999a(java.io.File, java.io.File):void");
    }

    /* renamed from: a */
    public final int mo33416a(final Context context, String str) {
        File file;
        MethodCollector.m26663i(9235);
        if (TextUtils.isEmpty(str)) {
            file = new File(m37998a(context), f47711f);
        } else {
            file = new File(str);
            if (!file.exists()) {
                file = new File(m37998a(context), f47711f);
            }
        }
        if (file.exists() || file.mkdirs()) {
            String packageCodePath = context.getPackageCodePath();
            int indexOf = packageCodePath.indexOf("base.apk");
            if (indexOf < 0) {
                int i = f47708c;
                MethodCollector.m26664o(9235);
                return i;
            }
            String b = m38000b(context);
            final File file2 = new File(file, f47712g + "_" + b + "_" + Build.CPU_ABI);
            String substring = packageCodePath.substring(0, indexOf);
            File file3 = new File(substring + "oat/arm/");
            if (!file3.exists() || "armeabi-v7a".equals(Build.CPU_ABI)) {
                if (!file3.exists()) {
                    file3 = new File(substring + "oat/arm64/");
                }
                if (new File(file3, "base.vdex").exists()) {
                    file2 = new File(file, f47713h + "_" + b + "_" + Build.CPU_ABI);
                } else if (Build.VERSION.SDK_INT < 26 && new File(file3, "base.odex").exists()) {
                    file2 = new File(file, f47714i + "_" + b + "_" + Build.CPU_ABI);
                }
                if (!file2.exists() || !file2.canRead()) {
                    if (new File(f47728w).exists()) {
                        String absolutePath = file2.getAbsolutePath();
                        if (!TextUtils.isEmpty(absolutePath) && !absolutePath.contains(f47712g)) {
                            file2.getAbsolutePath();
                            final C20062a[] a = C20062a.m38004a(file3, packageCodePath);
                            if (a != null) {
                                IoProfileFile.m38002a(a, file, file2);
                                openPagemap("/proc/" + Process.myPid() + "/pagemap");
                                final long currentTimeMillis = System.currentTimeMillis();
                                final int i2 = C34822d.m71158a(context, f47731z, 0).getInt(f47698A, f47699B);
                                f47707b.postDelayed(new Runnable() {
                                    /* class com.bytedance.p1435io.prefetcher.IoPrefetcher.RunnableC200612 */

                                    static {
                                        Covode.recordClassIndex(23567);
                                    }

                                    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d8, code lost:
                                        if (r2 == null) goto L_0x00e2;
                                     */
                                    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f4 A[SYNTHETIC, Splitter:B:53:0x00f4] */
                                    /* JADX WARNING: Removed duplicated region for block: B:58:0x00fe  */
                                    /* JADX WARNING: Removed duplicated region for block: B:64:0x011d  */
                                    /* Code decompiled incorrectly, please refer to instructions dump. */
                                    public final void run() {
                                        /*
                                        // Method dump skipped, instructions count: 365
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1435io.prefetcher.IoPrefetcher.RunnableC200612.run():void");
                                    }
                                }, 0);
                            }
                        }
                    }
                    file2.getAbsolutePath();
                    int i3 = f47709d;
                    MethodCollector.m26664o(9235);
                    return i3;
                }
                file2.getAbsolutePath();
                int i4 = f47708c;
                try {
                    i4 = prefetch(file2.getAbsolutePath(), packageCodePath, 524288, f47722q, f47723r, f47724s);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                MethodCollector.m26664o(9235);
                return i4;
            }
            int i5 = f47710e;
            MethodCollector.m26664o(9235);
            return i5;
        }
        int i6 = f47708c;
        MethodCollector.m26664o(9235);
        return i6;
    }

    /* renamed from: a */
    private static long m37995a(int i, long j, long j2, long j3, HashMap<Long, ArrayList<Boolean>> hashMap) {
        byte[] hasPhysicalPage;
        MethodCollector.m26663i(9389);
        long j4 = 4096;
        int i2 = (int) ((j3 - j2) / 4096);
        if (i2 >= 4096) {
            i2 = 4096;
        }
        int i3 = i2 * 4096;
        ArrayList<Boolean> arrayList = hashMap.get(Long.valueOf(j2));
        long j5 = -1;
        if (arrayList == null) {
            MethodCollector.m26664o(9389);
            return -1;
        }
        long j6 = j2;
        long j7 = -1;
        long j8 = 0;
        long j9 = 0;
        while (j6 < j3 && (hasPhysicalPage = hasPhysicalPage(j6, i2)) != null) {
            int i4 = 0;
            while (i4 < i2) {
                int i5 = (int) (((j6 - j2) / j4) + ((long) i4));
                if (i5 >= arrayList.size() || !arrayList.get(i5).booleanValue()) {
                    if (hasPhysicalPage[i4] == f47729x) {
                        if (i5 >= arrayList.size()) {
                            arrayList.add(true);
                        } else {
                            arrayList.set(i5, true);
                        }
                        if (j7 == -1) {
                            j7 = j + ((long) (i5 * 4096));
                            j9 = 4096;
                        } else {
                            j4 = 4096;
                            j9 += 4096;
                        }
                    } else {
                        j4 = 4096;
                        if (hasPhysicalPage[i4] == f47730y) {
                            MethodCollector.m26664o(9389);
                            return -1;
                        } else if (j7 != -1) {
                            if (!f47718m) {
                                IoProfileFile.addFileOffsetToPathmap(i, j7, j9);
                            }
                            j8 += j9;
                            j9 = 0;
                            j7 = -1;
                        }
                    }
                    i4++;
                    j5 = -1;
                } else if (j7 != j5) {
                    if (!f47718m) {
                        IoProfileFile.addFileOffsetToPathmap(i, j7, j9);
                    }
                    j8 += j9;
                    j7 = -1;
                    j9 = 0;
                }
                j4 = 4096;
                i4++;
                j5 = -1;
            }
            if (j7 != j5) {
                if (!f47718m) {
                    IoProfileFile.addFileOffsetToPathmap(i, j7, j9);
                }
                j8 += j9;
                j7 = -1;
                j9 = 0;
            }
            j6 += (long) i3;
            j4 = 4096;
        }
        MethodCollector.m26664o(9389);
        return j8;
    }
}
