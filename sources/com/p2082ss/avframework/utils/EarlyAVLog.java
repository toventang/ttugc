package com.p2082ss.avframework.utils;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.avframework.utils.EarlyAVLog */
public class EarlyAVLog {
    private static IEarlyLogPrint sEarlyLogPrint;

    /* renamed from: com.ss.avframework.utils.EarlyAVLog$IEarlyLogPrint */
    public interface IEarlyLogPrint {
        static {
            Covode.recordClassIndex(100726);
        }

        void print(int i, String str, String str2, Throwable th);
    }

    static {
        Covode.recordClassIndex(100725);
    }

    /* renamed from: com_ss_avframework_utils_EarlyAVLog_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m147810xff10dfb8(String str, String str2, Throwable th) {
        return 0;
    }

    public static IEarlyLogPrint getEarlyLogPrint() {
        return sEarlyLogPrint;
    }

    public static void setEarlyLogPrint(IEarlyLogPrint iEarlyLogPrint) {
        sEarlyLogPrint = iEarlyLogPrint;
    }

    public static void println(int i, String str, String str2, Throwable th) {
        IEarlyLogPrint iEarlyLogPrint = sEarlyLogPrint;
        if (iEarlyLogPrint != null) {
            iEarlyLogPrint.print(i, str + "-EarlyAVLog", str2, th);
        } else {
            m147810xff10dfb8(str + "-EarlyAVLog", "[" + i + "] " + str2, th);
        }
    }
}
