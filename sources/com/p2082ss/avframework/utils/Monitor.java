package com.p2082ss.avframework.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.engine.MediaEngineFactory;

/* renamed from: com.ss.avframework.utils.Monitor */
public class Monitor {
    private static boolean sEnableCPULoadWithTop = false;
    private static boolean sInitLogDone = false;
    private static TEBundle sMonitorDataBase = new TEBundle();

    protected static void initLogFile(Context context, int i) {
    }

    protected static native void nativeDisableLogFile(boolean z);

    protected static native double nativeGetAppPrecentageOnCPU();

    protected static native long nativeGetAppRSSKB();

    protected static native long nativeGetAppVSSKB();

    protected static native double nativeGetCPUPrecentage();

    protected static native double nativeGetSystemPrecentageOnCPU();

    protected static native double nativeGetUserPrecentageOnCPU();

    protected static native boolean nativeInitLogFile(String str, int i);

    protected static native boolean nativeIsDisableLogFile();

    protected static native void nativeWriteLog(String str, int i, String str2);

    public Monitor() {
        MediaEngineFactory.getVersion();
    }

    protected static boolean isDisableLogFile() {
        MethodCollector.m26663i(1783);
        boolean nativeIsDisableLogFile = nativeIsDisableLogFile();
        MethodCollector.m26664o(1783);
        return nativeIsDisableLogFile;
    }

    public double getAppPrecentageOnCPU() {
        MethodCollector.m26663i(1761);
        double nativeGetAppPrecentageOnCPU = nativeGetAppPrecentageOnCPU() * 100.0d;
        MethodCollector.m26664o(1761);
        return nativeGetAppPrecentageOnCPU;
    }

    public long getAppRSSKB() {
        MethodCollector.m26663i(1764);
        long nativeGetAppRSSKB = nativeGetAppRSSKB();
        MethodCollector.m26664o(1764);
        return nativeGetAppRSSKB;
    }

    public long getAppVSSKB() {
        MethodCollector.m26663i(1762);
        long nativeGetAppVSSKB = nativeGetAppVSSKB();
        MethodCollector.m26664o(1762);
        return nativeGetAppVSSKB;
    }

    public double getCPUPrecentage() {
        MethodCollector.m26663i(1751);
        double nativeGetCPUPrecentage = nativeGetCPUPrecentage() * 100.0d;
        MethodCollector.m26664o(1751);
        return nativeGetCPUPrecentage;
    }

    public double getSystemPrecentageOnCPU() {
        MethodCollector.m26663i(1755);
        double nativeGetSystemPrecentageOnCPU = nativeGetSystemPrecentageOnCPU() * 100.0d;
        MethodCollector.m26664o(1755);
        return nativeGetSystemPrecentageOnCPU;
    }

    public double getUserPrecentageOnCPU() {
        MethodCollector.m26663i(1758);
        double nativeGetUserPrecentageOnCPU = nativeGetUserPrecentageOnCPU() * 100.0d;
        MethodCollector.m26664o(1758);
        return nativeGetUserPrecentageOnCPU;
    }

    static {
        Covode.recordClassIndex(100734);
    }

    public static void enableCPULoadStaticsWithTop(boolean z) {
        sEnableCPULoadWithTop = z;
    }

    private static TEBundle staticsCPUInfoOnTop(long j) {
        return sMonitorDataBase;
    }

    protected static void disableLogFile(boolean z) {
        MethodCollector.m26663i(1766);
        nativeDisableLogFile(z);
        MethodCollector.m26664o(1766);
    }

    public static void writeLog(String str, int i, String str2) {
        MethodCollector.m26663i(1789);
        nativeWriteLog(str, i, str2);
        MethodCollector.m26664o(1789);
    }
}
