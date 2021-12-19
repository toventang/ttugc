package com.kakao.util.helper.log;

import android.util.Log;
import com.C1764a;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.kakao.util.helper.log.LoggerConfig;
import java.util.HashSet;
import java.util.Locale;

public class Logger {
    private static final LoggerConfig loggerConfig = initLogConfig();
    private static boolean withStack = false;

    /* renamed from: com_kakao_util_helper_log_Logger_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m56192xac99494d(String str, String str2) {
        return 0;
    }

    /* renamed from: com_kakao_util_helper_log_Logger_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m56193xac99494e(String str, String str2) {
        return 0;
    }

    /* renamed from: com_kakao_util_helper_log_Logger_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m56194xac994952(String str, String str2) {
        return 0;
    }

    /* renamed from: com_kakao_util_helper_log_Logger_com_ss_android_ugc_aweme_lancet_LogLancet_v */
    public static int m56195xac99495f(String str, String str2) {
        return 0;
    }

    /* renamed from: com_kakao_util_helper_log_Logger_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m56196xac994960(String str, String str2) {
        return 0;
    }

    private Logger() {
    }

    static {
        Covode.recordClassIndex(34064);
    }

    private static LoggerConfig initLogConfig() {
        LoggerConfig.Builder printLoggerLevel = new LoggerConfig.Builder().setDefaultTag(Tag.DEFAULT).setStackPrefix("com.kakao.sdk").setPrintLoggerLevel(5);
        HashSet hashSet = new HashSet();
        hashSet.add(Logger.class.getName());
        printLoggerLevel.setIgnoreSet(hashSet);
        return printLoggerLevel.build();
    }

    /* renamed from: d */
    public static int m56197d(String str) {
        return m56201dt(loggerConfig.getDefaultTag(), str);
    }

    public static int dev(String str) {
        return devt(loggerConfig.getDefaultTag(), str);
    }

    /* renamed from: e */
    public static int m56205e(String str) {
        return m56209et(loggerConfig.getDefaultTag(), str);
    }

    public static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        return Log.getStackTraceString(th);
    }

    /* renamed from: w */
    public static int m56227w(String str) {
        return m56231wt(loggerConfig.getDefaultTag(), str);
    }

    /* renamed from: i */
    public static int m56215i(Throwable th) {
        return m56219it(loggerConfig.getDefaultTag(), th);
    }

    /* renamed from: v */
    public static int m56222v(Throwable th) {
        return m56226vt(loggerConfig.getDefaultTag(), th);
    }

    /* renamed from: d */
    public static int m56200d(Throwable th) {
        return m56204dt(loggerConfig.getDefaultTag(), th);
    }

    public static int dev(Throwable th) {
        return devt(loggerConfig.getDefaultTag(), th);
    }

    /* renamed from: e */
    public static int m56208e(Throwable th) {
        return m56212et(loggerConfig.getDefaultTag(), th);
    }

    public static String getCallerTraceInfo(Class cls) {
        if (!loggerConfig.isPrintLoggable(3)) {
            return "unknown caller";
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Thread.currentThread().getName();
        String name2 = cls.getName();
        boolean z = false;
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (stackTraceElement.getClassName().startsWith(name2)) {
                z = true;
            } else if (z) {
                return C1764a.m5929a(Locale.US, "{%s}-[%s.%s():%d]", new Object[]{name, stackTraceElement.getClassName(), stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber())});
            }
        }
        return "";
    }

    /* renamed from: w */
    public static int m56230w(Throwable th) {
        return m56234wt(loggerConfig.getDefaultTag(), th);
    }

    public static int devt(Tag tag, String str) {
        return printLog(tag, 0, str);
    }

    /* renamed from: dt */
    public static int m56201dt(Tag tag, String str) {
        return printLog(tag, 3, str);
    }

    /* renamed from: et */
    public static int m56209et(Tag tag, String str) {
        return printLog(tag, 6, str);
    }

    /* renamed from: it */
    public static int m56216it(Tag tag, String str) {
        return printLog(tag, 4, str);
    }

    /* renamed from: vt */
    public static int m56223vt(Tag tag, String str) {
        return printLog(tag, 2, str);
    }

    /* renamed from: wt */
    public static int m56231wt(Tag tag, String str) {
        return printLog(tag, 5, str);
    }

    public static int devt(Tag tag, Throwable th) {
        return devt(tag, getStackTraceString(th));
    }

    /* renamed from: dt */
    public static int m56204dt(Tag tag, Throwable th) {
        return m56201dt(tag, getStackTraceString(th));
    }

    /* renamed from: et */
    public static int m56212et(Tag tag, Throwable th) {
        return m56209et(tag, getStackTraceString(th));
    }

    /* renamed from: i */
    public static int m56213i(String str, Throwable th) {
        return m56217it(loggerConfig.getDefaultTag(), str, th);
    }

    /* renamed from: it */
    public static int m56219it(Tag tag, Throwable th) {
        return m56216it(tag, getStackTraceString(th));
    }

    /* renamed from: v */
    public static int m56220v(String str, Throwable th) {
        return m56224vt(loggerConfig.getDefaultTag(), str, th);
    }

    /* renamed from: vt */
    public static int m56226vt(Tag tag, Throwable th) {
        return m56223vt(tag, getStackTraceString(th));
    }

    /* renamed from: wt */
    public static int m56234wt(Tag tag, Throwable th) {
        return m56231wt(tag, getStackTraceString(th));
    }

    /* renamed from: d */
    public static int m56198d(String str, Throwable th) {
        return m56202dt(loggerConfig.getDefaultTag(), str, th);
    }

    public static int dev(String str, Throwable th) {
        return devt(loggerConfig.getDefaultTag(), str, th);
    }

    /* renamed from: e */
    public static int m56206e(String str, Throwable th) {
        return m56210et(loggerConfig.getDefaultTag(), str, th);
    }

    /* renamed from: i */
    public static int m56214i(String str, Object... objArr) {
        return m56218it(loggerConfig.getDefaultTag(), str, objArr);
    }

    /* renamed from: v */
    public static int m56221v(String str, Object... objArr) {
        return m56225vt(loggerConfig.getDefaultTag(), str, objArr);
    }

    /* renamed from: w */
    public static int m56228w(String str, Throwable th) {
        return m56232wt(loggerConfig.getDefaultTag(), str, th);
    }

    /* renamed from: d */
    public static int m56199d(String str, Object... objArr) {
        return m56203dt(loggerConfig.getDefaultTag(), str, objArr);
    }

    public static int dev(String str, Object... objArr) {
        return devt(loggerConfig.getDefaultTag(), str, objArr);
    }

    /* renamed from: e */
    public static int m56207e(String str, Object... objArr) {
        return m56211et(loggerConfig.getDefaultTag(), str, objArr);
    }

    /* renamed from: w */
    public static int m56229w(String str, Object... objArr) {
        return m56233wt(loggerConfig.getDefaultTag(), str, objArr);
    }

    public static int devt(Tag tag, String str, Throwable th) {
        return devt(tag, "%s\n%s", str, getStackTraceString(th));
    }

    /* renamed from: dt */
    public static int m56202dt(Tag tag, String str, Throwable th) {
        return m56203dt(tag, "%s\n%s", str, getStackTraceString(th));
    }

    /* renamed from: et */
    public static int m56210et(Tag tag, String str, Throwable th) {
        return m56211et(tag, "%s\n%s", str, getStackTraceString(th));
    }

    /* renamed from: it */
    public static int m56217it(Tag tag, String str, Throwable th) {
        return m56218it(tag, "%s\n%s", str, getStackTraceString(th));
    }

    /* renamed from: vt */
    public static int m56224vt(Tag tag, String str, Throwable th) {
        return m56225vt(tag, "%s\n%s", str, getStackTraceString(th));
    }

    /* renamed from: wt */
    public static int m56232wt(Tag tag, String str, Throwable th) {
        return m56233wt(tag, "%s\n%s", str, getStackTraceString(th));
    }

    private static int devt(Tag tag, String str, Object... objArr) {
        if (!loggerConfig.isPrintLoggable(0)) {
            return 0;
        }
        if (objArr != null && objArr.length > 0) {
            str = C1764a.m5928a(str, objArr);
        }
        return printLog(tag, 0, str);
    }

    /* renamed from: dt */
    private static int m56203dt(Tag tag, String str, Object... objArr) {
        if (!loggerConfig.isPrintLoggable(3)) {
            return 0;
        }
        if (objArr != null && objArr.length > 0) {
            str = C1764a.m5928a(str, objArr);
        }
        return printLog(tag, 3, str);
    }

    /* renamed from: et */
    private static int m56211et(Tag tag, String str, Object... objArr) {
        if (!loggerConfig.isPrintLoggable(6)) {
            return 0;
        }
        if (objArr != null && objArr.length > 0) {
            str = C1764a.m5928a(str, objArr);
        }
        return printLog(tag, 6, str);
    }

    /* renamed from: it */
    private static int m56218it(Tag tag, String str, Object... objArr) {
        if (!loggerConfig.isPrintLoggable(4)) {
            return 0;
        }
        if (objArr != null && objArr.length > 0) {
            str = C1764a.m5928a(str, objArr);
        }
        return printLog(tag, 4, str);
    }

    /* renamed from: vt */
    private static int m56225vt(Tag tag, String str, Object... objArr) {
        if (!loggerConfig.isPrintLoggable(2)) {
            return 0;
        }
        if (objArr != null && objArr.length > 0) {
            str = C1764a.m5928a(str, objArr);
        }
        return printLog(tag, 2, str);
    }

    /* renamed from: wt */
    private static int m56233wt(Tag tag, String str, Object... objArr) {
        if (loggerConfig.isPrintLoggable(5)) {
            return printLog(tag, 5, C1764a.m5928a(str, objArr));
        }
        return 0;
    }

    private static int printLog(Tag tag, int i, String str) {
        int i2 = 0;
        if (str == null) {
            return 0;
        }
        LoggerConfig loggerConfig2 = loggerConfig;
        String message = loggerConfig2.getMessage(withStack, str);
        if (!loggerConfig2.isPrintLoggable(i)) {
            return 0;
        }
        if (message == null && (message = loggerConfig2.getMessage(withStack, str)) == null) {
            return 0;
        }
        String tag2 = tag.tag();
        int length = message.length();
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int i5 = length - i2;
            if (i5 > 2000) {
                i5 = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
            }
            int i6 = i5 + i2;
            i3 += printLogPartially(i, tag2, message.substring(i2, i6), i4);
            i2 = i6;
            i4++;
        }
        return i3;
    }

    private static int printLogPartially(int i, String str, String str2, int i2) {
        String str3;
        int length = str2.length();
        if (i2 > 0) {
            str3 = C1764a.m5929a(Locale.getDefault(), "Cont(%d) ", new Object[]{Integer.valueOf(i2)});
        } else {
            str3 = "";
        }
        if (length > 2000) {
            str2 = str2.substring(0, LiveNetAdaptiveHurryTimeSetting.DEFAULT);
        }
        if (i == 0) {
            return m56192xac99494d(str, str3 + str2);
        }
        if (i == 2) {
            return m56195xac99495f(str, str3 + str2);
        }
        if (i == 3) {
            return m56192xac99494d(str, str3 + str2);
        }
        if (i == 4) {
            return m56194xac994952(str, str3 + str2);
        }
        if (i == 5) {
            return m56196xac994960(str, str3 + str2);
        }
        if (i != 6) {
            return 0;
        }
        return m56193xac99494e(str, str3 + str2);
    }
}
