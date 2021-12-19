package com.bytedance.vcloud.mlcomponent_api;

import com.C1764a;
import com.bytedance.covode.number.Covode;

public class MLComponentLog {
    public static int LogTurnOn = 112;

    /* renamed from: com_bytedance_vcloud_mlcomponent_api_MLComponentLog_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m44251xdd253eae(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_vcloud_mlcomponent_api_MLComponentLog_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m44252xdd253eaf(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_vcloud_mlcomponent_api_MLComponentLog_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m44253xdd253eb3(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_vcloud_mlcomponent_api_MLComponentLog_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m44254xdd253ec1(String str, String str2) {
        return 0;
    }

    /* renamed from: d */
    public static void m44256d(Throwable th) {
    }

    static {
        Covode.recordClassIndex(27607);
    }

    /* renamed from: d */
    public static final void m44255d(String str, String str2) {
        if (((LogTurnOn >> 1) & 1) == 1) {
            m44251xdd253eae("MLComponentLog", C1764a.m5928a("<%s>%s", new Object[]{str, str2}));
        }
    }

    /* renamed from: e */
    public static void m44257e(String str, String str2) {
        if (((LogTurnOn >> 6) & 1) == 1) {
            m44252xdd253eaf("MLComponentLog", C1764a.m5928a("<%s>%s", new Object[]{str, str2}));
        }
    }

    /* renamed from: i */
    public static final void m44258i(String str, String str2) {
        if (((LogTurnOn >> 2) & 1) == 1) {
            m44253xdd253eb3("MLComponentLog", C1764a.m5928a("<%s>%s", new Object[]{str, str2}));
        }
    }

    /* renamed from: k */
    public static final void m44259k(String str, String str2) {
        if (((LogTurnOn >> 4) & 1) == 1) {
            m44253xdd253eb3("MLComponentLog", C1764a.m5928a("<%s>%s", new Object[]{str, str2}));
        }
    }

    /* renamed from: t */
    public static final void m44260t(String str, String str2) {
        if (((LogTurnOn >> 3) & 1) == 1) {
            m44253xdd253eb3("MLComponentLog", C1764a.m5928a("<%s>%s", new Object[]{str, str2}));
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
    public static final void m44261w(String str, String str2) {
        if (((LogTurnOn >> 5) & 1) == 1) {
            m44254xdd253ec1("MLComponentLog", C1764a.m5928a("<%s>%s", new Object[]{str, str2}));
        }
    }
}
