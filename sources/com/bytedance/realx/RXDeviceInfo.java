package com.bytedance.realx;

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
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;

public class RXDeviceInfo {
    private static final FileFilter CPU_FILTER = new FileFilter() {
        /* class com.bytedance.realx.RXDeviceInfo.C219641 */

        static {
            Covode.recordClassIndex(25633);
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

    /* renamed from: com_bytedance_realx_RXDeviceInfo_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m41306x85d1d2b6(String str, String str2, Throwable th) {
        return 0;
    }

    /* renamed from: com_bytedance_realx_RXDeviceInfo_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m41307x85d1d2ba(String str, String str2) {
        return 0;
    }

    static {
        Covode.recordClassIndex(25632);
    }

    public static String GetDeviceBrand() {
        if (Build.MANUFACTURER == null) {
            return "";
        }
        return Build.MANUFACTURER;
    }

    public static String GetDeviceModel() {
        if (Build.MODEL == null) {
            return "";
        }
        return Build.MODEL;
    }

    public static int getNumberOfCPUCores() {
        try {
            int coresFromFileInfo = getCoresFromFileInfo("/sys/devices/system/cpu/possible");
            if (coresFromFileInfo == -1) {
                coresFromFileInfo = getCoresFromFileInfo("/sys/devices/system/cpu/present");
            }
            if (coresFromFileInfo == -1) {
                return new File("/sys/devices/system/cpu/").listFiles(CPU_FILTER).length;
            }
            return coresFromFileInfo;
        } catch (NullPointerException | SecurityException unused) {
            return -1;
        }
    }

    public static int getCPUMaxFreqKHz() {
        MethodCollector.m26663i(85);
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < getNumberOfCPUCores(); i3++) {
            try {
                File file = new File("/sys/devices/system/cpu/cpu" + i3 + "/cpufreq/cpuinfo_max_freq");
                if (file.exists() && file.canRead()) {
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
                    } catch (NumberFormatException e) {
                        m41306x85d1d2b6("DeviceInfo", "getCPUMaxFreqKHz failed!", e);
                    } catch (Throwable th) {
                        fileInputStream.close();
                        MethodCollector.m26664o(85);
                        throw th;
                    }
                    fileInputStream.close();
                }
            } catch (IOException unused) {
            }
        }
        if (i2 == -1) {
            FileInputStream fileInputStream2 = new FileInputStream("/proc/cpuinfo");
            try {
                int parseFileForValue = parseFileForValue("cpu MHz", fileInputStream2) * 1000;
                if (parseFileForValue > i2) {
                    i2 = parseFileForValue;
                }
                fileInputStream2.close();
            } catch (Throwable th2) {
                fileInputStream2.close();
                MethodCollector.m26664o(85);
                throw th2;
            }
        }
        i = i2;
        MethodCollector.m26664o(85);
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009e A[SYNTHETIC, Splitter:B:33:0x009e] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b9 A[SYNTHETIC, Splitter:B:38:0x00b9] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d6 A[SYNTHETIC, Splitter:B:46:0x00d6] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f1 A[SYNTHETIC, Splitter:B:51:0x00f1] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String GetCpuModel() {
        /*
        // Method dump skipped, instructions count: 267
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.realx.RXDeviceInfo.GetCpuModel():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008e, code lost:
        r9 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a7 A[SYNTHETIC, Splitter:B:33:0x00a7] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c2 A[SYNTHETIC, Splitter:B:38:0x00c2] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int GetTotalMemSize() {
        /*
        // Method dump skipped, instructions count: 278
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.realx.RXDeviceInfo.GetTotalMemSize():int");
    }

    private static int getCoresFromFileString(String str) {
        if (str == null || !str.matches("0-[\\d]+$")) {
            return -1;
        }
        return Integer.valueOf(str.substring(2)).intValue() + 1;
    }

    private static int getTotalMemory(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) m41305x48e44859(context, "activity")).getMemoryInfo(memoryInfo);
        return (int) (memoryInfo.totalMem / 1024);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
        if (0 == 0) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int getCoresFromFileInfo(java.lang.String r4) {
        /*
            r3 = 151(0x97, float:2.12E-43)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
            r0 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0033, all -> 0x002e }
            r2.<init>(r4)     // Catch:{ IOException -> 0x0033, all -> 0x002e }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x002c, all -> 0x0027 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x002c, all -> 0x0027 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x002c, all -> 0x0027 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x002c, all -> 0x0027 }
            java.lang.String r0 = r1.readLine()     // Catch:{ IOException -> 0x002c, all -> 0x0027 }
            r1.close()     // Catch:{ IOException -> 0x002c, all -> 0x0027 }
            int r0 = getCoresFromFileString(r0)     // Catch:{ IOException -> 0x002c, all -> 0x0027 }
            r2.close()     // Catch:{ IOException -> 0x0023 }
        L_0x0023:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return r0
        L_0x0027:
            r0 = move-exception
            r2.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x002f
        L_0x002c:
            r0 = r2
            goto L_0x0035
        L_0x002e:
            r0 = move-exception
        L_0x002f:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            throw r0
        L_0x0033:
            if (r0 == 0) goto L_0x0038
        L_0x0035:
            r0.close()     // Catch:{ IOException -> 0x0038 }
        L_0x0038:
            r0 = -1
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.realx.RXDeviceInfo.getCoresFromFileInfo(java.lang.String):int");
    }

    private static int extractValue(byte[] bArr, int i) {
        while (i < bArr.length && bArr[i] != 10) {
            if (Character.isDigit(bArr[i])) {
                int i2 = i + 1;
                while (i2 < bArr.length && Character.isDigit(bArr[i2])) {
                    i2++;
                }
                return Integer.parseInt(new String(bArr, 0, i, i2 - i));
            }
            i++;
        }
        return -1;
    }

    /* renamed from: com_bytedance_realx_RXDeviceInfo_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m41305x48e44859(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(2755);
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
                    MethodCollector.m26664o(2755);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private static int parseFileForValue(String str, FileInputStream fileInputStream) {
        MethodCollector.m26663i(98);
        byte[] bArr = new byte[1024];
        try {
            int read = fileInputStream.read(bArr);
            int i = 0;
            while (i < read) {
                if (bArr[i] == 10 || i == 0) {
                    if (bArr[i] == 10) {
                        i++;
                    }
                    for (int i2 = i; i2 < read; i2++) {
                        int i3 = i2 - i;
                        if (bArr[i2] != str.charAt(i3)) {
                            continue;
                            break;
                        } else if (i3 == str.length() - 1) {
                            int extractValue = extractValue(bArr, i2);
                            MethodCollector.m26664o(98);
                            return extractValue;
                        }
                    }
                    continue;
                }
                i++;
            }
        } catch (IOException | NumberFormatException unused) {
        }
        MethodCollector.m26664o(98);
        return -1;
    }
}
