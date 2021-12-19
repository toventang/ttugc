package com.p2082ss.android.ugc.effectmanager.common.logger;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.common.logger.EPLog */
public final class EPLog {
    public static final EPLog INSTANCE = new EPLog();
    private static boolean sEnableLog = true;
    private static ILogger sLogger = DefaultLogger.INSTANCE;
    private static String sdkTag = "EffectPlatform";

    private EPLog() {
    }

    public final boolean getSEnableLog() {
        return sEnableLog;
    }

    static {
        Covode.recordClassIndex(95477);
    }

    public static final void setEnableLog(boolean z) {
        sEnableLog = z;
    }

    public final void setSEnableLog(boolean z) {
        sEnableLog = z;
    }

    public static final void setLogger(ILogger iLogger) {
        C89219l.m154719c(iLogger, "");
        sLogger = iLogger;
    }

    public static final void addSDKTagString(String str) {
        sdkTag += '-' + str;
    }

    private final String getSDKTag(String str) {
        return "[" + sdkTag + '#' + str + "]:";
    }

    /* renamed from: d */
    public static final void m141898d(String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        sLogger.mo101723d(INSTANCE.getSDKTag(str) + "  " + str2);
    }

    /* renamed from: e */
    public static final void m141899e(String str, String str2) {
        C89219l.m154719c(str, "");
        sLogger.mo101724e(INSTANCE.getSDKTag(str) + "  " + str2, null);
    }

    /* renamed from: i */
    public static final void m141901i(String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        sLogger.mo101725i(INSTANCE.getSDKTag(str) + "  " + str2);
    }

    /* renamed from: w */
    public static final void m141902w(String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        sLogger.mo101726w(INSTANCE.getSDKTag(str) + "  " + str2);
    }

    /* renamed from: e */
    public static final void m141900e(String str, String str2, Throwable th) {
        C89219l.m154719c(str, "");
        sLogger.mo101724e(INSTANCE.getSDKTag(str) + "  " + str2, th);
    }
}
