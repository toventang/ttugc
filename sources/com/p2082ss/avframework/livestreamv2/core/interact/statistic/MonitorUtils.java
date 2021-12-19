package com.p2082ss.avframework.livestreamv2.core.interact.statistic;

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
import java.io.InputStreamReader;
import java.lang.reflect.Field;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.statistic.MonitorUtils */
public class MonitorUtils {
    static {
        Covode.recordClassIndex(100445);
    }

    public static boolean isProcStatCanRead() {
        File file = new File("/proc/stat");
        if (!file.exists() || !file.canRead()) {
            return false;
        }
        return true;
    }

    public static long getTotalCPUTime() {
        BufferedReader bufferedReader;
        Throwable th;
        MethodCollector.m26663i(2518);
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/stat")), 1000);
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[2]) + Long.parseLong(split[3]) + Long.parseLong(split[4]) + Long.parseLong(split[6]) + Long.parseLong(split[5]) + Long.parseLong(split[7]) + Long.parseLong(split[8]);
                close(bufferedReader);
                MethodCollector.m26664o(2518);
                return parseLong;
            } catch (Exception unused) {
                bufferedReader2 = bufferedReader;
                close(bufferedReader2);
                MethodCollector.m26664o(2518);
                return -1;
            } catch (Throwable th2) {
                th = th2;
                close(bufferedReader);
                MethodCollector.m26664o(2518);
                throw th;
            }
        } catch (Exception unused2) {
            close(bufferedReader2);
            MethodCollector.m26664o(2518);
            return -1;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            close(bufferedReader);
            MethodCollector.m26664o(2518);
            throw th;
        }
    }

    public static long getUsedCPUTime() {
        BufferedReader bufferedReader;
        Throwable th;
        MethodCollector.m26663i(2589);
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/stat")), 1000);
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[2]) + Long.parseLong(split[3]) + Long.parseLong(split[4]) + Long.parseLong(split[6]) + Long.parseLong(split[7]) + Long.parseLong(split[8]);
                close(bufferedReader);
                MethodCollector.m26664o(2589);
                return parseLong;
            } catch (Exception unused) {
                bufferedReader2 = bufferedReader;
                close(bufferedReader2);
                MethodCollector.m26664o(2589);
                return -1;
            } catch (Throwable th2) {
                th = th2;
                close(bufferedReader);
                MethodCollector.m26664o(2589);
                throw th;
            }
        } catch (Exception unused2) {
            close(bufferedReader2);
            MethodCollector.m26664o(2589);
            return -1;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            close(bufferedReader);
            MethodCollector.m26664o(2589);
            throw th;
        }
    }

    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static long getSysUsedMemory(Context context) {
        if (context == null) {
            return -1;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) m147783x8526ef67(context, "activity");
        if (activityManager == null) {
            return -1;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.availMem / 1024;
    }

    public static long getAppCPUTime(int i) {
        Throwable th;
        MethodCollector.m26663i(2612);
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + i + "/stat")), 1000);
            try {
                String readLine = bufferedReader2.readLine();
                bufferedReader2.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[13]) + Long.parseLong(split[14]) + Long.parseLong(split[15]) + Long.parseLong(split[16]);
                close(bufferedReader2);
                MethodCollector.m26664o(2612);
                return parseLong;
            } catch (Exception unused) {
                bufferedReader = bufferedReader2;
                close(bufferedReader);
                MethodCollector.m26664o(2612);
                return -1;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = bufferedReader2;
                close(bufferedReader);
                MethodCollector.m26664o(2612);
                throw th;
            }
        } catch (Exception unused2) {
            close(bufferedReader);
            MethodCollector.m26664o(2612);
            return -1;
        } catch (Throwable th3) {
            th = th3;
            close(bufferedReader);
            MethodCollector.m26664o(2612);
            throw th;
        }
    }

    public static int getPidMemorySize(int i, Context context) {
        if (context == null) {
            return -1;
        }
        try {
            ActivityManager activityManager = (ActivityManager) m147783x8526ef67(context, "activity");
            if (activityManager == null) {
                return -1;
            }
            return activityManager.getProcessMemoryInfo(new int[]{i})[0].getTotalPss();
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: com_ss_avframework_livestreamv2_core_interact_statistic_MonitorUtils_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m147783x8526ef67(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(2628);
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
                    MethodCollector.m26664o(2628);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
