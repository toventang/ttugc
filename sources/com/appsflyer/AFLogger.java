package com.appsflyer;

import com.C1764a;
import com.appsflyer.internal.C2306ai;
import com.bytedance.covode.number.Covode;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class AFLogger {

    /* renamed from: ι */
    private static long f6841 = System.currentTimeMillis();

    /* renamed from: com_appsflyer_AFLogger_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m6915xb1921818(String str, String str2) {
        return 0;
    }

    /* renamed from: com_appsflyer_AFLogger_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m6916xb1921819(String str, String str2, Throwable th) {
        return 0;
    }

    /* renamed from: com_appsflyer_AFLogger_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m6917xb192181d(String str, String str2) {
        return 0;
    }

    /* renamed from: com_appsflyer_AFLogger_com_ss_android_ugc_aweme_lancet_LogLancet_v */
    public static int m6918xb192182a(String str, String str2) {
        return 0;
    }

    /* renamed from: com_appsflyer_AFLogger_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m6919xb192182b(String str, String str2) {
        return 0;
    }

    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);
        

        /* renamed from: ɩ */
        private int f6843;

        public final int getLevel() {
            return this.f6843;
        }

        static {
            Covode.recordClassIndex(2491);
        }

        private LogLevel(int i) {
            this.f6843 = i;
        }
    }

    public static void resetDeltaTime() {
        f6841 = System.currentTimeMillis();
    }

    static {
        Covode.recordClassIndex(2490);
    }

    /* renamed from: ɩ */
    private static boolean m6923() {
        return AppsFlyerProperties.getInstance().isLogsDisabledCompletely();
    }

    public static void afWarnLog(String str) {
        m6925(str);
    }

    public static void afInfoLog(String str) {
        afInfoLog(str, true);
    }

    /* renamed from: Ι */
    private static boolean m6926(LogLevel logLevel) {
        if (logLevel.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            return true;
        }
        return false;
    }

    public static void afDebugLog(String str) {
        if (m6926(LogLevel.DEBUG)) {
            m6915xb1921818("AppsFlyer_5.4.1", m6921(str, false));
        }
        if (C2306ai.f6989 == null) {
            C2306ai.f6989 = new C2306ai();
        }
        C2306ai.f6989.mo6445(null, "D", m6921(str, true));
    }

    public static void afRDLog(String str) {
        if (m6926(LogLevel.VERBOSE)) {
            m6918xb192182a("AppsFlyer_5.4.1", m6921(str, false));
        }
        if (C2306ai.f6989 == null) {
            C2306ai.f6989 = new C2306ai();
        }
        C2306ai.f6989.mo6445(null, "V", m6921(str, true));
    }

    /* renamed from: ǃ */
    static void m6922(String str) {
        if (!m6923()) {
            m6915xb1921818("AppsFlyer_5.4.1", m6921(str, false));
        }
        if (C2306ai.f6989 == null) {
            C2306ai.f6989 = new C2306ai();
        }
        C2306ai.f6989.mo6445(null, "F", str);
    }

    /* renamed from: Ι */
    static void m6925(String str) {
        if (m6926(LogLevel.WARNING)) {
            m6919xb192182b("AppsFlyer_5.4.1", m6921(str, false));
        }
        if (C2306ai.f6989 == null) {
            C2306ai.f6989 = new C2306ai();
        }
        C2306ai.f6989.mo6445(null, "W", m6921(str, true));
    }

    /* renamed from: Ι */
    private static String m6924(long j) {
        long hours = TimeUnit.MILLISECONDS.toHours(j);
        long millis = j - TimeUnit.HOURS.toMillis(hours);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(millis);
        long millis2 = millis - TimeUnit.MINUTES.toMillis(minutes);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(millis2);
        long millis3 = TimeUnit.MILLISECONDS.toMillis(millis2 - TimeUnit.SECONDS.toMillis(seconds));
        return C1764a.m5929a(Locale.getDefault(), "%02d:%02d:%02d:%03d", new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(millis3)});
    }

    public static void afErrorLog(String str, Throwable th) {
        m6920(str, th, true);
    }

    public static void afInfoLog(String str, boolean z) {
        if (m6926(LogLevel.INFO)) {
            m6917xb192181d("AppsFlyer_5.4.1", m6921(str, false));
        }
        if (z) {
            if (C2306ai.f6989 == null) {
                C2306ai.f6989 = new C2306ai();
            }
            C2306ai.f6989.mo6445(null, "I", m6921(str, true));
        }
    }

    /* renamed from: ǃ */
    private static String m6921(String str, boolean z) {
        if (z || LogLevel.VERBOSE.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            return new StringBuilder("(").append(m6924(System.currentTimeMillis() - f6841)).append(") [").append(Thread.currentThread().getName()).append("] ").append(str).toString();
        }
        return str;
    }

    public static void afErrorLog(String str, Throwable th, boolean z) {
        m6920(str, th, z);
    }

    /* renamed from: ı */
    private static void m6920(String str, Throwable th, boolean z) {
        String message;
        StackTraceElement[] stackTrace;
        String[] strArr;
        if (m6926(LogLevel.ERROR) && z) {
            m6916xb1921819("AppsFlyer_5.4.1", m6921(str, false), th);
        }
        if (C2306ai.f6989 == null) {
            C2306ai.f6989 = new C2306ai();
        }
        C2306ai aiVar = C2306ai.f6989;
        Throwable cause = th.getCause();
        String simpleName = th.getClass().getSimpleName();
        if (cause == null) {
            message = th.getMessage();
            stackTrace = th.getStackTrace();
        } else {
            message = cause.getMessage();
            stackTrace = cause.getStackTrace();
        }
        if (stackTrace == null) {
            strArr = new String[]{message};
        } else {
            strArr = new String[(stackTrace.length + 1)];
            strArr[0] = message;
            for (int i = 1; i < stackTrace.length; i++) {
                strArr[i] = stackTrace[i].toString();
            }
        }
        aiVar.mo6445("exception", simpleName, strArr);
    }
}
