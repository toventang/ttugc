package com.p2082ss.ttm.p4406a;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Locale;

/* renamed from: com.ss.ttm.a.c */
public final class C86220c {

    /* renamed from: a */
    public static int f192436a;

    /* renamed from: b */
    public static int[] f192437b = new int[3];

    /* renamed from: b */
    private static boolean m148189b() {
        int i = Build.VERSION.SDK_INT;
        return true;
    }

    static {
        Covode.recordClassIndex(101365);
    }

    /* renamed from: a */
    public static int[] m148185a() {
        MethodCollector.m26663i(7797);
        try {
            FileInputStream fileInputStream = new FileInputStream("/proc/cpuinfo");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split = readLine.replaceAll("\t", "").toLowerCase(Locale.US).split(":");
                    if (split.length == 2) {
                        String trim = split[0].trim();
                        String trim2 = split[1].trim();
                        if (!(trim2 == null || trim == null)) {
                            if (trim.compareTo("processor") == 0) {
                                if (trim2.contains("armv") || trim2.contains("aarch64")) {
                                    f192437b[0] = 1;
                                } else if (trim2.contains("intel")) {
                                    f192437b[0] = 2;
                                    break;
                                }
                            } else if (trim.compareToIgnoreCase("features") == 0) {
                                if (trim2.contains("neon") || trim2.contains("thumb") || trim2.contains("vfpv") || trim2.contains("asimd") || trim2.contains("simd")) {
                                    f192437b[0] = 1;
                                }
                            } else if (trim.compareToIgnoreCase("model name") != 0) {
                                continue;
                            } else if (trim2.contains("intel")) {
                                f192437b[0] = 2;
                                break;
                            } else if (trim2.contains("arm")) {
                                f192437b[0] = 1;
                                break;
                            }
                        }
                    }
                } catch (Throwable th) {
                    bufferedReader.close();
                    inputStreamReader.close();
                    fileInputStream.close();
                    MethodCollector.m26664o(7797);
                    throw th;
                }
            }
            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        int[] iArr = f192437b;
        MethodCollector.m26664o(7797);
        return iArr;
    }

    /* renamed from: a */
    public static long[] m148186a(Context context) {
        long[] jArr = new long[2];
        if ("mounted".equals(Environment.getExternalStorageState())) {
            long d = m148191d(context);
            jArr[0] = m148187b(context);
            jArr[1] = d;
        }
        return jArr;
    }

    /* renamed from: b */
    private static long m148187b(Context context) {
        if (context == null || Environment.getDataDirectory() == null) {
            return -1;
        }
        return m148188b(m148190c(context).getParent());
    }

    /* renamed from: c */
    private static File m148190c(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    /* renamed from: d */
    private static long m148191d(Context context) {
        if (context == null || Environment.getDataDirectory() == null) {
            return -1;
        }
        return m148184a(m148190c(context).getParent());
    }

    /* renamed from: a */
    private static long m148184a(String str) {
        long j;
        long j2;
        try {
            StatFs statFs = new StatFs(str);
            if (m148189b()) {
                j = statFs.getBlockSizeLong();
                j2 = statFs.getAvailableBlocksLong();
            } else {
                j = (long) statFs.getBlockSize();
                j2 = (long) statFs.getAvailableBlocks();
            }
            return j * j2;
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }

    /* renamed from: b */
    private static long m148188b(String str) {
        long j;
        long j2;
        try {
            StatFs statFs = new StatFs(str);
            if (m148189b()) {
                j = statFs.getBlockSizeLong();
                j2 = statFs.getBlockCountLong();
            } else {
                j = (long) statFs.getBlockSize();
                j2 = (long) statFs.getBlockCount();
            }
            return j * j2;
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }
}
