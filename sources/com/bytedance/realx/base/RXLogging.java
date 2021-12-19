package com.bytedance.realx.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.PrintWriter;
import java.io.StringWriter;

public class RXLogging {
    private static Severity loggableSeverity;
    private static volatile boolean loggingEnabled = true;

    private static native void nativeEnableLogThreads();

    private static native void nativeEnableLogTimeStamps();

    private static native void nativeEnableLogToDebugOutput(int i);

    private static native void nativeLog(int i, String str, String str2);

    static {
        Covode.recordClassIndex(25640);
    }

    public static void enableLogThreads() {
        MethodCollector.m26663i(1268);
        nativeEnableLogThreads();
        MethodCollector.m26664o(1268);
    }

    public static void enableLogTimeStamps() {
        MethodCollector.m26663i(1269);
        nativeEnableLogTimeStamps();
        MethodCollector.m26664o(1269);
    }

    public enum Severity {
        LS_VERBOSE,
        LS_DEBUG,
        LS_INFO,
        LS_WARNING,
        LS_ERROR,
        LS_NONE;

        static {
            Covode.recordClassIndex(25641);
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
            Covode.recordClassIndex(25642);
        }

        private TraceLevel(int i) {
            this.level = i;
        }
    }

    public static synchronized void enableLogToDebugOutput(Severity severity) {
        synchronized (RXLogging.class) {
            MethodCollector.m26663i(1652);
            nativeEnableLogToDebugOutput(severity.ordinal());
            loggingEnabled = true;
            MethodCollector.m26664o(1652);
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

    /* renamed from: d */
    public static void m41310d(String str, String str2) {
        log(Severity.LS_DEBUG, str, str2);
    }

    /* renamed from: e */
    public static void m41311e(String str, String str2) {
        log(Severity.LS_ERROR, str, str2);
    }

    /* renamed from: i */
    public static void m41313i(String str, String str2) {
        log(Severity.LS_INFO, str, str2);
    }

    /* renamed from: v */
    public static void m41314v(String str, String str2) {
        log(Severity.LS_VERBOSE, str, str2);
    }

    /* renamed from: w */
    public static void m41315w(String str, String str2) {
        log(Severity.LS_WARNING, str, str2);
    }

    /* renamed from: e */
    public static void m41312e(String str, String str2, Throwable th) {
        log(Severity.LS_ERROR, str, str2);
        log(Severity.LS_ERROR, str, th.toString());
        log(Severity.LS_ERROR, str, getStackTraceString(th));
    }

    /* renamed from: w */
    public static void m41316w(String str, String str2, Throwable th) {
        log(Severity.LS_WARNING, str, str2);
        log(Severity.LS_WARNING, str, th.toString());
        log(Severity.LS_WARNING, str, getStackTraceString(th));
    }

    public static void log(Severity severity, String str, String str2) {
        MethodCollector.m26663i(1757);
        if (str == null || str2 == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Logging tag or message may not be null.");
            MethodCollector.m26664o(1757);
            throw illegalArgumentException;
        } else if (loggingEnabled) {
            nativeLog(severity.ordinal(), str, str2);
            MethodCollector.m26664o(1757);
        } else {
            MethodCollector.m26664o(1757);
        }
    }
}
