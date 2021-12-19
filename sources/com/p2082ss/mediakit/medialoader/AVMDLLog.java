package com.p2082ss.mediakit.medialoader;

import com.C1764a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.mediakit.medialoader.AVMDLLog */
public class AVMDLLog {
    public static int LogTurnOn = 112;

    /* renamed from: com_ss_mediakit_medialoader_AVMDLLog_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m147901xcc35afcc(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_mediakit_medialoader_AVMDLLog_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m147902xcc35afcd(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_mediakit_medialoader_AVMDLLog_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m147903xcc35afd1(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_mediakit_medialoader_AVMDLLog_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m147904xcc35afdf(String str, String str2) {
        return 0;
    }

    static {
        Covode.recordClassIndex(101212);
    }

    public static final void turnOn(int i, int i2) {
        int i3 = ((1 << i) ^ -1) & LogTurnOn;
        LogTurnOn = i3;
        LogTurnOn = (i2 << i) | i3;
    }

    /* renamed from: d */
    public static final void m147905d(String str, String str2) {
        if (((LogTurnOn >> 1) & 1) == 1) {
            m147901xcc35afcc("AVMDLLog", C1764a.m5928a("<%s>%s", new Object[]{str, str2}));
        }
    }

    /* renamed from: e */
    public static void m147906e(String str, String str2) {
        if (((LogTurnOn >> 6) & 1) == 1) {
            m147902xcc35afcd("AVMDLLog", C1764a.m5928a("<%s>%s", new Object[]{str, str2}));
        }
    }

    /* renamed from: i */
    public static final void m147907i(String str, String str2) {
        if (((LogTurnOn >> 2) & 1) == 1) {
            m147903xcc35afd1("AVMDLLog", C1764a.m5928a("<%s>%s", new Object[]{str, str2}));
        }
    }

    /* renamed from: k */
    public static final void m147908k(String str, String str2) {
        if (((LogTurnOn >> 4) & 1) == 1) {
            m147903xcc35afd1("AVMDLLog", C1764a.m5928a("<%s>%s", new Object[]{str, str2}));
        }
    }

    /* renamed from: t */
    public static final void m147909t(String str, String str2) {
        if (((LogTurnOn >> 3) & 1) == 1) {
            m147903xcc35afd1("AVMDLLog", C1764a.m5928a("<%s>%s", new Object[]{str, str2}));
        }
    }

    /* renamed from: w */
    public static final void m147910w(String str, String str2) {
        if (((LogTurnOn >> 5) & 1) == 1) {
            m147904xcc35afdf("AVMDLLog", C1764a.m5928a("<%s>%s", new Object[]{str, str2}));
        }
    }
}
