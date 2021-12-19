package com.p2082ss.bytertc.engine.utils;

import android.content.Context;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.ss.bytertc.engine.utils.LogUtil */
public class LogUtil {
    private static String sDeviceID = null;
    private static String sLogDir = null;
    private static IRTCEngineEventHandler.LogLevel sLogLevel = IRTCEngineEventHandler.LogLevel.LOG_LEVEL_INFO;
    private static AtomicReference<LoggerSink> sLoggerSink = new AtomicReference<>();

    /* renamed from: com.ss.bytertc.engine.utils.LogUtil$LoggerSink */
    public interface LoggerSink {
        static {
            Covode.recordClassIndex(101155);
        }

        void onLoggerMessage(IRTCEngineEventHandler.LogLevel logLevel, String str, Throwable th);
    }

    public static void setDebug(boolean z) {
    }

    public static String getDeviceID() {
        return sDeviceID;
    }

    public static IRTCEngineEventHandler.LogLevel getLogLevel() {
        return sLogLevel;
    }

    private static LoggerSink getLoggerSink() {
        return sLoggerSink.get();
    }

    static {
        Covode.recordClassIndex(101154);
    }

    private static String getTraceInfo() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[ThreadName:").append(Thread.currentThread().getName()).append("] [").append(new Throwable().getStackTrace()[2].getFileName()).append(":").append(new Throwable().getStackTrace()[2].getLineNumber()).append("] [Func:").append(new Throwable().getStackTrace()[2].getMethodName()).append("]");
        return stringBuffer.toString();
    }

    public static void setDeviceID(String str) {
        sDeviceID = str;
    }

    public static void setLogLevel(IRTCEngineEventHandler.LogLevel logLevel) {
        sLogLevel = logLevel;
    }

    public static void setLogDir(String str) {
        sLogDir = str + File.separator + "logs";
    }

    public static void setLoggerSink(LoggerSink loggerSink) {
        if (loggerSink != null) {
            sLoggerSink.set(loggerSink);
        } else {
            sLoggerSink.compareAndSet(getLoggerSink(), null);
        }
    }

    public static String getLogDir(Context context) {
        String str = sLogDir;
        if (str != null) {
            return str;
        }
        String str2 = m147884x50dac3b4(context, null) + File.separator + "RTCEngine" + File.separator + "Log" + File.separator + "logs";
        sLogDir = str2;
        return str2;
    }

    /* renamed from: com_ss_bytertc_engine_utils_LogUtil_com_ss_android_ugc_aweme_lancet_ContextLancet_getExternalFilesDir */
    public static File m147884x50dac3b4(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            return context.getExternalFilesDir(str);
        }
        if (C58016d.f132223d != null && C58016d.f132224e) {
            return C58016d.f132223d;
        }
        File externalFilesDir = context.getExternalFilesDir(str);
        C58016d.f132223d = externalFilesDir;
        return externalFilesDir;
    }

    /* renamed from: d */
    public static void m147885d(String str, String str2) {
        if (IRTCEngineEventHandler.LogLevel.LOG_LEVEL_DEBUG.compareTo((Enum) sLogLevel) >= 0) {
            String a = C1764a.m5928a("[%s] %s [msg:%s]", new Object[]{"DEBUG", getTraceInfo(), str2});
            notifyLoggerSinks(IRTCEngineEventHandler.LogLevel.LOG_LEVEL_DEBUG, C1764a.m5928a("[%s:%s]:%s", new Object[]{"ByteRTC", str, a}), null);
        }
    }

    /* renamed from: e */
    public static void m147886e(String str, String str2) {
        if (IRTCEngineEventHandler.LogLevel.LOG_LEVEL_ERROR.compareTo((Enum) sLogLevel) >= 0) {
            String a = C1764a.m5928a("[%s] %s [msg:%s]", new Object[]{"ERROR", getTraceInfo(), str2});
            notifyLoggerSinks(IRTCEngineEventHandler.LogLevel.LOG_LEVEL_ERROR, C1764a.m5928a("[%s:%s]:%s", new Object[]{"ByteRTC", str, a}), null);
        }
    }

    /* renamed from: i */
    public static void m147888i(String str, String str2) {
        if (IRTCEngineEventHandler.LogLevel.LOG_LEVEL_INFO.compareTo((Enum) sLogLevel) >= 0) {
            String a = C1764a.m5928a("[%s] %s [msg:%s]", new Object[]{"INFO", getTraceInfo(), str2});
            notifyLoggerSinks(IRTCEngineEventHandler.LogLevel.LOG_LEVEL_INFO, C1764a.m5928a("[%s:%s]:%s", new Object[]{"ByteRTC", str, a}), null);
        }
    }

    /* renamed from: w */
    public static void m147889w(String str, String str2) {
        if (IRTCEngineEventHandler.LogLevel.LOG_LEVEL_WARNING.compareTo((Enum) sLogLevel) >= 0) {
            String a = C1764a.m5928a("[%s] %s [msg:%s]", new Object[]{"WARNING", getTraceInfo(), str2});
            notifyLoggerSinks(IRTCEngineEventHandler.LogLevel.LOG_LEVEL_WARNING, C1764a.m5928a("[%s:%s]:%s", new Object[]{"ByteRTC", str, a}), null);
        }
    }

    private static void notifyLoggerSinks(IRTCEngineEventHandler.LogLevel logLevel, String str, Throwable th) {
        LoggerSink loggerSink;
        if (sLoggerSink != null && (loggerSink = getLoggerSink()) != null) {
            loggerSink.onLoggerMessage(logLevel, str, th);
        }
    }

    /* renamed from: e */
    public static void m147887e(String str, String str2, Throwable th) {
        if (IRTCEngineEventHandler.LogLevel.LOG_LEVEL_ERROR.compareTo((Enum) sLogLevel) >= 0) {
            String a = C1764a.m5928a("[%s][msg:%s]", new Object[]{"ERROR", str2});
            notifyLoggerSinks(IRTCEngineEventHandler.LogLevel.LOG_LEVEL_ERROR, C1764a.m5928a("[%s:%s]:%s", new Object[]{"ByteRTC", str, a}), th);
        }
    }

    /* renamed from: w */
    public static void m147890w(String str, String str2, Throwable th) {
        if (IRTCEngineEventHandler.LogLevel.LOG_LEVEL_WARNING.compareTo((Enum) sLogLevel) >= 0) {
            String a = C1764a.m5928a("[%s][msg:%s]", new Object[]{"WARNING", str2});
            notifyLoggerSinks(IRTCEngineEventHandler.LogLevel.LOG_LEVEL_WARNING, C1764a.m5928a("[%s:%s]:%s", new Object[]{"ByteRTC", str, a}), th);
        }
    }
}
