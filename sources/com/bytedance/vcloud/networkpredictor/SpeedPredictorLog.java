package com.bytedance.vcloud.networkpredictor;

import com.C1764a;
import com.bytedance.covode.number.Covode;

public class SpeedPredictorLog {
    public static int LogTurnOn = 112;

    /* renamed from: com_bytedance_vcloud_networkpredictor_SpeedPredictorLog_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m44265xa1755700(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_vcloud_networkpredictor_SpeedPredictorLog_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m44266xa1755701(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_vcloud_networkpredictor_SpeedPredictorLog_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m44267xa1755705(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_vcloud_networkpredictor_SpeedPredictorLog_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m44268xa1755713(String str, String str2) {
        return 0;
    }

    /* renamed from: d */
    public static void m44270d(Throwable th) {
    }

    static {
        Covode.recordClassIndex(27626);
    }

    /* renamed from: d */
    public static final void m44269d(String str, String str2) {
        if (((LogTurnOn >> 1) & 1) == 1) {
            m44265xa1755700("SpeedPredictorLog", C1764a.m5928a("<%s>%s", new Object[]{str, str2}));
        }
    }

    /* renamed from: e */
    public static void m44271e(String str, String str2) {
        if (((LogTurnOn >> 6) & 1) == 1) {
            m44266xa1755701("SpeedPredictorLog", C1764a.m5928a("<%s>%s", new Object[]{str, str2}));
        }
    }

    /* renamed from: i */
    public static final void m44272i(String str, String str2) {
        if (((LogTurnOn >> 2) & 1) == 1) {
            m44267xa1755705("SpeedPredictorLog", C1764a.m5928a("<%s>%s", new Object[]{str, str2}));
        }
    }

    /* renamed from: k */
    public static final void m44273k(String str, String str2) {
        if (((LogTurnOn >> 4) & 1) == 1) {
            m44267xa1755705("SpeedPredictorLog", C1764a.m5928a("<%s>%s", new Object[]{str, str2}));
        }
    }

    /* renamed from: t */
    public static final void m44274t(String str, String str2) {
        if (((LogTurnOn >> 3) & 1) == 1) {
            m44267xa1755705("SpeedPredictorLog", C1764a.m5928a("<%s>%s", new Object[]{str, str2}));
        }
    }

    public static final void turnOn(int i, int i2) {
        int i3 = ((1 << i) ^ -1) & LogTurnOn;
        LogTurnOn = i3;
        int i4 = i3 | (i2 << i);
        LogTurnOn = i4;
        if (i == 1 && i2 == 1) {
            int i5 = i4 & -5;
            LogTurnOn = i5;
            LogTurnOn = i5 | 4;
        }
    }

    /* renamed from: w */
    public static final void m44275w(String str, String str2) {
        if (((LogTurnOn >> 5) & 1) == 1) {
            m44268xa1755713("SpeedPredictorLog", C1764a.m5928a("<%s>%s", new Object[]{str, str2}));
        }
    }
}
