package com.p2082ss.avframework.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.avframework.engine.MediaEngineFactory;
import com.p2082ss.avframework.utils.EarlyAVLog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.avframework.utils.AVLog */
public class AVLog {
    private static boolean mDisableLogFile = false;
    private static boolean mDisableLogIODevice = false;
    private static ILogFilter mLogConsoleFilter;
    private static ILogFilter mLogIODeviceFilter;
    private static ILogFilter mLogKibanaDeviceFilter;
    private static int mLogLevel = 5;
    private static Map<String, RedunancyChecker> sRedundancyCheckerMap = new ConcurrentHashMap();

    /* renamed from: com.ss.avframework.utils.AVLog$ILogFilter */
    public interface ILogFilter {
        static {
            Covode.recordClassIndex(100722);
        }

        void print(int i, String str, String str2, String str3, Throwable th);

        void print(int i, String str, String str2, Throwable th);
    }

    /* renamed from: com_ss_avframework_utils_AVLog_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m147800x3ce0521e(String str, String str2, Throwable th) {
        return 0;
    }

    /* renamed from: com_ss_avframework_utils_AVLog_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m147801x3ce0521f(String str, String str2, Throwable th) {
        return 0;
    }

    /* renamed from: com_ss_avframework_utils_AVLog_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m147802x3ce05223(String str, String str2, Throwable th) {
        return 0;
    }

    /* renamed from: com_ss_avframework_utils_AVLog_com_ss_android_ugc_aweme_lancet_LogLancet_v */
    public static int m147803x3ce05230(String str, String str2, Throwable th) {
        return 0;
    }

    /* renamed from: com_ss_avframework_utils_AVLog_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m147804x3ce05231(String str, String str2, Throwable th) {
        return 0;
    }

    public static void debugTrace(Object... objArr) {
    }

    private static native void nativePrintln(int i, String str, String str2);

    private static native void nativeSetPrintLevel(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.utils.AVLog$RedunancyChecker */
    public static class RedunancyChecker {
        long lastPrintTime;
        int redundantCount;

        static {
            Covode.recordClassIndex(100723);
        }

        RedunancyChecker() {
        }
    }

    public static ILogFilter getConsoleFilter() {
        return mLogConsoleFilter;
    }

    public static int getLevel() {
        return mLogLevel;
    }

    public static ILogFilter getLogIODevice() {
        return mLogIODeviceFilter;
    }

    public static ILogFilter getLogKibanaDevice() {
        return mLogKibanaDeviceFilter;
    }

    public static boolean isDisableLogFile() {
        boolean isDisableLogFile = Monitor.isDisableLogFile();
        mDisableLogFile = isDisableLogFile;
        return isDisableLogFile;
    }

    public static boolean isLogConsoleSet() {
        if (mLogConsoleFilter != null) {
            return true;
        }
        return false;
    }

    public static boolean isLogIODeviceSet() {
        if (mLogIODeviceFilter != null) {
            return true;
        }
        return false;
    }

    public static boolean isLogKibanaDeviceSet() {
        if (mLogKibanaDeviceFilter != null) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(100720);
        MediaEngineFactory.loadLibrary();
        final EarlyAVLog.IEarlyLogPrint earlyLogPrint = EarlyAVLog.getEarlyLogPrint();
        if (earlyLogPrint != null) {
            mLogIODeviceFilter = new ILogFilter() {
                /* class com.p2082ss.avframework.utils.AVLog.C860421 */

                static {
                    Covode.recordClassIndex(100721);
                }

                @Override // com.p2082ss.avframework.utils.AVLog.ILogFilter
                public final void print(int i, String str, String str2, Throwable th) {
                    earlyLogPrint.print(i, str, str2, th);
                }

                @Override // com.p2082ss.avframework.utils.AVLog.ILogFilter
                public final void print(int i, String str, String str2, String str3, Throwable th) {
                    earlyLogPrint.print(i, str, str2 + " " + str3, th);
                }
            };
        }
    }

    public static String getLogDeRedundancyString() {
        try {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            return stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber();
        } catch (Exception unused) {
            return null;
        }
    }

    public static ILogFilter setupConsole(ILogFilter iLogFilter) {
        ILogFilter iLogFilter2 = mLogConsoleFilter;
        mLogConsoleFilter = iLogFilter;
        return iLogFilter2;
    }

    public static ILogFilter setupLogIODevice(ILogFilter iLogFilter) {
        ILogFilter iLogFilter2 = mLogIODeviceFilter;
        mLogIODeviceFilter = iLogFilter;
        return iLogFilter2;
    }

    public static ILogFilter setupLogKibanaDevice(ILogFilter iLogFilter) {
        ILogFilter iLogFilter2 = mLogKibanaDeviceFilter;
        mLogKibanaDeviceFilter = iLogFilter;
        return iLogFilter2;
    }

    public static void setLevel(int i) {
        MethodCollector.m26663i(2934);
        mLogLevel = i;
        nativeSetPrintLevel(i);
        MethodCollector.m26664o(2934);
    }

    public static void disableLogIODevice(boolean z) {
        ILogFilter iLogFilter = mLogKibanaDeviceFilter;
        if (iLogFilter != null) {
            iLogFilter.print(5, "AVLog", "disableLogIODevice : ".concat(String.valueOf(z)), null);
        }
        mDisableLogIODevice = z;
    }

    public static void disableLogFile(boolean z) {
        if (z && !mDisableLogFile) {
            Exception exc = new Exception("Disable log file with record call path.");
            Monitor.writeLog("AVLog", 3, "Cause: " + exc.getMessage() + "\n" + Log.getStackTraceString(exc));
        }
        Monitor.disableLogFile(z);
        mDisableLogFile = z;
    }

    public static void initLogFile(Context context, int i) {
        Monitor.initLogFile(context, i);
    }

    public static void iod(String str, String str2) {
        logToIODevice(3, str, str2, null);
    }

    public static void ioe(String str, String str2) {
        logToIODevice(6, str, str2, null);
    }

    public static void ioi(String str, String str2) {
        logToIODevice(4, str, str2, null);
    }

    public static void iov(String str, String str2) {
        logToIODevice(2, str, str2, null);
    }

    public static void iow(String str, String str2) {
        logToIODevice(5, str, str2, null);
    }

    /* renamed from: d */
    public static void m147805d(String str, String str2) {
        MethodCollector.m26663i(3016);
        nativePrintln(3, str, str2);
        MethodCollector.m26664o(3016);
    }

    /* renamed from: e */
    public static void m147806e(String str, String str2) {
        MethodCollector.m26663i(3018);
        nativePrintln(6, str, str2);
        MethodCollector.m26664o(3018);
    }

    /* renamed from: i */
    public static void m147807i(String str, String str2) {
        MethodCollector.m26663i(3013);
        nativePrintln(4, str, str2);
        MethodCollector.m26664o(3013);
    }

    /* renamed from: v */
    public static void m147808v(String str, String str2) {
        MethodCollector.m26663i(3010);
        nativePrintln(2, str, str2);
        MethodCollector.m26664o(3010);
    }

    /* renamed from: w */
    public static void m147809w(String str, String str2) {
        MethodCollector.m26663i(3017);
        nativePrintln(5, str, str2);
        MethodCollector.m26664o(3017);
    }

    private static int checkRedundancy(String str, int i) {
        if (TextUtils.isEmpty(str) || i <= 0) {
            return -1;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!sRedundancyCheckerMap.containsKey(str)) {
            sRedundancyCheckerMap.put(str, new RedunancyChecker());
        }
        RedunancyChecker redunancyChecker = sRedundancyCheckerMap.get(str);
        if (redunancyChecker == null) {
            return -1;
        }
        redunancyChecker.redundantCount++;
        if (currentTimeMillis - redunancyChecker.lastPrintTime < ((long) i)) {
            return -1;
        }
        int i2 = redunancyChecker.redundantCount;
        redunancyChecker.redundantCount = 0;
        redunancyChecker.lastPrintTime = currentTimeMillis;
        return i2;
    }

    public static void ioe(String str, String str2, Throwable th) {
        logToIODevice(6, str, str2, th);
    }

    public static void logKibana(int i, String str, String str2, Throwable th) {
        ILogFilter iLogFilter = mLogKibanaDeviceFilter;
        if (iLogFilter != null) {
            iLogFilter.print(i, str, str2, th);
        }
        logToIODevice(i, str, str2, th);
    }

    public static void logToConsole(int i, String str, String str2, Throwable th) {
        if (i >= mLogLevel) {
            ILogFilter iLogFilter = mLogConsoleFilter;
            if (iLogFilter != null) {
                iLogFilter.print(i, str, str2, th);
                return;
            }
            switch (i) {
                case 2:
                    m147803x3ce05230(str, str2, th);
                    return;
                case 3:
                    m147800x3ce0521e(str, str2, th);
                    return;
                case 4:
                    m147802x3ce05223(str, str2, th);
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    m147804x3ce05231(str, str2, th);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    m147801x3ce0521f(str, str2, th);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    Log.wtf(str, str2, th);
                    return;
                default:
                    return;
            }
        }
    }

    public static void logToIODevice(int i, String str, String str2, Throwable th) {
        String str3;
        if (!mDisableLogFile) {
            StringBuilder append = new StringBuilder().append(str2);
            if (th != null) {
                str3 = Log.getStackTraceString(th);
            } else {
                str3 = "";
            }
            Monitor.writeLog(str, i, append.append(str3).toString());
        }
        if (!mDisableLogIODevice) {
            ILogFilter iLogFilter = mLogIODeviceFilter;
            if (iLogFilter != null) {
                iLogFilter.print(5, str, "[" + i + "] " + str2, th);
            } else {
                logToConsole(i, str, str2, th);
            }
        }
    }

    public static void logKibanaEvent(int i, String str, String str2, String str3, Throwable th) {
        ILogFilter iLogFilter = mLogKibanaDeviceFilter;
        if (iLogFilter != null) {
            iLogFilter.print(i, str, str2, str3, th);
        }
        logToIODeviceEvent(i, str, str2, str3, th);
    }

    public static void logToConsoleEvent(int i, String str, String str2, String str3, Throwable th) {
        logToConsole(i, str, str2 + " " + str3, th);
    }

    public static void logToIODeviceEvent(int i, String str, String str2, String str3, Throwable th) {
        String str4;
        if (!mDisableLogFile) {
            StringBuilder append = new StringBuilder().append(str3);
            if (th != null) {
                str4 = Log.getStackTraceString(th);
            } else {
                str4 = "";
            }
            Monitor.writeLog(str, i, append.append(str4).toString());
        }
        if (!mDisableLogIODevice) {
            ILogFilter iLogFilter = mLogIODeviceFilter;
            if (iLogFilter != null) {
                iLogFilter.print(5, str, "[" + i + "] " + str2 + " " + str3, th);
            } else {
                logToConsole(i, str, str3, th);
            }
        }
    }

    public static boolean logToIODevice2(int i, String str, String str2, Throwable th, String str3, int i2) {
        int checkRedundancy = checkRedundancy(str3, i2);
        if (checkRedundancy < 0) {
            return false;
        }
        if (checkRedundancy > 0) {
            str2 = "[repeat " + checkRedundancy + " times] " + str2;
        }
        logToIODevice(i, str, str2, th);
        return true;
    }
}
