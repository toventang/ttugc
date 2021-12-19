package org.webrtc;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;

public class RXPerformanceMonitorAndroid {
    private static final FileFilter CPU_FILTER = new FileFilter() {
        /* class org.webrtc.RXPerformanceMonitorAndroid.C902971 */

        static {
            Covode.recordClassIndex(106681);
        }

        public final boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (name.charAt(i) < '0' || name.charAt(i) > '9') {
                    return false;
                }
            }
            return true;
        }
    };
    private static Intent batteryStatus;
    private static Context context;
    private static IntentFilter ifilter;
    private static BatteryManager manager;

    /* renamed from: pm */
    private static PowerManager f205062pm = ((PowerManager) m157050x40026a0(context, "power"));
    private static long sClkTck = -1;

    public static int getThreadCount() {
        return Thread.activeCount();
    }

    public static int getBatterySaveStatus() {
        if (Build.VERSION.SDK_INT >= 21) {
            return f205062pm.isPowerSaveMode() ? 1 : 0;
        }
        return -1;
    }

    public static int getBatteryTemperature() {
        return batteryStatus.getIntExtra("temperature", -1) / 10;
    }

    public static int getChargeStatus() {
        if (batteryStatus.getIntExtra("status", -1) == 2) {
            return 1;
        }
        return 0;
    }

    public static int getBatteryLevel() {
        double intExtra = (double) batteryStatus.getIntExtra("level", -1);
        double intExtra2 = (double) batteryStatus.getIntExtra("scale", -1);
        Double.isNaN(intExtra);
        Double.isNaN(intExtra2);
        return (int) ((intExtra / intExtra2) * 100.0d);
    }

    public static int getCpuCores() {
        int i = Build.VERSION.SDK_INT;
        try {
            return new File("/sys/devices/system/cpu/").listFiles(CPU_FILTER).length;
        } catch (NullPointerException | SecurityException unused) {
            return -1;
        }
    }

    static {
        Covode.recordClassIndex(106680);
        Context applicationContext = ContextUtils.getApplicationContext();
        context = applicationContext;
        manager = (BatteryManager) m157050x40026a0(applicationContext, "batterymanager");
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        ifilter = intentFilter;
        batteryStatus = m157051x1008445c(context, null, intentFilter);
    }

    public static int getCurrentPidMemorySize() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return 0;
        }
        try {
            ActivityManager activityManager = (ActivityManager) m157050x40026a0(applicationContext, "activity");
            if (activityManager == null) {
                return 0;
            }
            return activityManager.getProcessMemoryInfo(new int[]{Process.myPid()})[0].getTotalPss();
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int getThermalState() {
        if (Build.VERSION.SDK_INT < 29) {
            return 4;
        }
        int currentThermalStatus = f205062pm.getCurrentThermalStatus();
        switch (currentThermalStatus) {
            case 0:
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return 3;
            default:
                return currentThermalStatus;
        }
    }

    public static float getCurrentAppCPUTime() {
        Throwable th;
        MethodCollector.m26663i(2306);
        String[] strArr = new String[0];
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/stat")), 1000);
            try {
                String readLine = bufferedReader2.readLine();
                bufferedReader2.close();
                if (readLine != null) {
                    strArr = readLine.split(" ");
                }
                if (strArr.length > 17) {
                    float parseFloat = Float.parseFloat(strArr[13]) + Float.parseFloat(strArr[14]) + Float.parseFloat(strArr[15]) + Float.parseFloat(strArr[16]);
                    close(bufferedReader2);
                    MethodCollector.m26664o(2306);
                    return parseFloat;
                }
                close(bufferedReader2);
                MethodCollector.m26664o(2306);
                return 0.0f;
            } catch (Exception unused) {
                bufferedReader = bufferedReader2;
                close(bufferedReader);
                MethodCollector.m26664o(2306);
                return 0.0f;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = bufferedReader2;
                close(bufferedReader);
                MethodCollector.m26664o(2306);
                throw th;
            }
        } catch (Exception unused2) {
            close(bufferedReader);
            MethodCollector.m26664o(2306);
            return 0.0f;
        } catch (Throwable th3) {
            th = th3;
            close(bufferedReader);
            MethodCollector.m26664o(2306);
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

    public static int getPidMemorySize(int i, Context context2) {
        if (context2 == null) {
            return 0;
        }
        try {
            ActivityManager activityManager = (ActivityManager) m157050x40026a0(context2, "activity");
            if (activityManager == null) {
                return 0;
            }
            return activityManager.getProcessMemoryInfo(new int[]{i})[0].getTotalPss();
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: org_webrtc_RXPerformanceMonitorAndroid_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m157050x40026a0(Context context2, String str) {
        Object obj;
        MethodCollector.m26663i(93);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context2.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context2.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context2.getSystemService(str);
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
                    MethodCollector.m26664o(93);
                }
            }
        } else {
            obj = context2.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: org_webrtc_RXPerformanceMonitorAndroid_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver */
    public static Intent m157049xdc2e0ff8(Context context2, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context2.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* renamed from: org_webrtc_RXPerformanceMonitorAndroid_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent m157051x1008445c(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m157049xdc2e0ff8(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.RXPerformanceMonitorAndroid.m157051x1008445c(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
