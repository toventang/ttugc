package org.webrtc;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.EnumSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Logging {
    private static final Logger fallbackLogger = createFallbackLogger();
    private static Loggable loggable;
    private static Severity loggableSeverity;
    private static volatile boolean loggingEnabled;

    public static void deleteInjectedLoggable() {
        loggable = null;
    }

    public static void enableTracing(String str, EnumSet<TraceLevel> enumSet) {
    }

    private static native void nativeEnableLogThreads();

    private static native void nativeEnableLogTimeStamps();

    private static native void nativeEnableLogToDebugOutput(int i);

    private static native void nativeLog(int i, String str, String str2);

    static {
        Covode.recordClassIndex(106660);
    }

    private static Logger createFallbackLogger() {
        Logger logger = Logger.getLogger("org.webrtc.Logging");
        logger.setLevel(Level.ALL);
        return logger;
    }

    public static void enableLogThreads() {
        MethodCollector.m26663i(590);
        nativeEnableLogThreads();
        MethodCollector.m26664o(590);
    }

    public static void enableLogTimeStamps() {
        MethodCollector.m26663i(591);
        nativeEnableLogTimeStamps();
        MethodCollector.m26664o(591);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: org.webrtc.Logging$1 */
    public static /* synthetic */ class C902951 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$Logging$Severity;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        static {
            /*
                r0 = 106661(0x1a0a5, float:1.49464E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                org.webrtc.Logging$Severity[] r0 = org.webrtc.Logging.Severity.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                org.webrtc.Logging.C902951.$SwitchMap$org$webrtc$Logging$Severity = r2
                org.webrtc.Logging$Severity r0 = org.webrtc.Logging.Severity.LS_ERROR     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = org.webrtc.Logging.C902951.$SwitchMap$org$webrtc$Logging$Severity     // Catch:{ NoSuchFieldError -> 0x0023 }
                org.webrtc.Logging$Severity r0 = org.webrtc.Logging.Severity.LS_WARNING     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = org.webrtc.Logging.C902951.$SwitchMap$org$webrtc$Logging$Severity     // Catch:{ NoSuchFieldError -> 0x002e }
                org.webrtc.Logging$Severity r0 = org.webrtc.Logging.Severity.LS_INFO     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.Logging.C902951.<clinit>():void");
        }
    }

    public enum Severity {
        LS_VERBOSE,
        LS_DEBUG,
        LS_INFO,
        LS_WARNING,
        LS_ERROR,
        LS_NONE;

        static {
            Covode.recordClassIndex(106662);
        }
    }

    public enum TraceLevel {
        TRACE_NONE(0),
        TRACE_STATEINFO(1),
        TRACE_WARNING(2),
        TRACE_ERROR(4),
        TRACE_CRITICAL(8),
        TRACE_APICALL(16),
        TRACE_DEFAULT(255),
        TRACE_MODULECALL(32),
        TRACE_MEMORY(256),
        TRACE_TIMER(512),
        TRACE_STREAM(1024),
        TRACE_DEBUG(2048),
        TRACE_INFO(4096),
        TRACE_TERSEINFO(8192),
        TRACE_ALL(65535);
        
        public final int level;

        static {
            Covode.recordClassIndex(106663);
        }

        private TraceLevel(int i) {
            this.level = i;
        }
    }

    private static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static synchronized void enableLogToDebugOutput(Severity severity) {
        synchronized (Logging.class) {
            MethodCollector.m26663i(592);
            if (loggable == null) {
                nativeEnableLogToDebugOutput(severity.ordinal());
                loggingEnabled = true;
                MethodCollector.m26664o(592);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("Logging to native debug output not supported while Loggable is injected. Delete the Loggable before calling this method.");
                MethodCollector.m26664o(592);
                throw illegalStateException;
            }
        }
    }

    /* renamed from: d */
    public static void m157041d(String str, String str2) {
        log(Severity.LS_DEBUG, str, str2);
    }

    /* renamed from: e */
    public static void m157042e(String str, String str2) {
        log(Severity.LS_ERROR, str, str2);
    }

    /* renamed from: i */
    public static void m157044i(String str, String str2) {
        log(Severity.LS_INFO, str, str2);
    }

    public static void injectLoggable(Loggable loggable2, Severity severity) {
        if (loggable2 != null) {
            loggable = loggable2;
            loggableSeverity = severity;
        }
    }

    /* renamed from: v */
    public static void m157045v(String str, String str2) {
        log(Severity.LS_VERBOSE, str, str2);
    }

    /* renamed from: w */
    public static void m157046w(String str, String str2) {
        log(Severity.LS_WARNING, str, str2);
    }

    /* renamed from: e */
    public static void m157043e(String str, String str2, Throwable th) {
        log(Severity.LS_ERROR, str, str2);
        log(Severity.LS_ERROR, str, th.toString());
        log(Severity.LS_ERROR, str, getStackTraceString(th));
    }

    /* renamed from: w */
    public static void m157047w(String str, String str2, Throwable th) {
        log(Severity.LS_WARNING, str, str2);
        log(Severity.LS_WARNING, str, th.toString());
        log(Severity.LS_WARNING, str, getStackTraceString(th));
    }

    public static void log(Severity severity, String str, String str2) {
        Level level;
        MethodCollector.m26663i(597);
        if (str == null || str2 == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Logging tag or message may not be null.");
            MethodCollector.m26664o(597);
            throw illegalArgumentException;
        } else if (loggable != null) {
            if (severity.ordinal() < loggableSeverity.ordinal()) {
                MethodCollector.m26664o(597);
                return;
            }
            loggable.onLogMessage(str2, severity, str);
            MethodCollector.m26664o(597);
        } else if (loggingEnabled) {
            nativeLog(severity.ordinal(), str, str2);
            MethodCollector.m26664o(597);
        } else {
            int i = C902951.$SwitchMap$org$webrtc$Logging$Severity[severity.ordinal()];
            if (i == 1) {
                level = Level.SEVERE;
            } else if (i == 2) {
                level = Level.WARNING;
            } else if (i != 3) {
                level = Level.FINE;
            } else {
                level = Level.INFO;
            }
            fallbackLogger.log(level, str + ": " + str2);
            MethodCollector.m26664o(597);
        }
    }
}
