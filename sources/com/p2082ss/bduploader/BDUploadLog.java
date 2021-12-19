package com.p2082ss.bduploader;

import com.C1764a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bduploader.BDUploadLog */
public class BDUploadLog {
    public static int LogTurnOn = 112;

    /* renamed from: com_ss_bduploader_BDUploadLog_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m147832x49a2e9e7(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_bduploader_BDUploadLog_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m147833x49a2e9e8(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_bduploader_BDUploadLog_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m147834x49a2e9ec(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_bduploader_BDUploadLog_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m147835x49a2e9fa(String str, String str2) {
        return 0;
    }

    static {
        Covode.recordClassIndex(100798);
    }

    public static final void turnOn(int i, int i2) {
        int i3 = ((1 << i) ^ -1) & LogTurnOn;
        LogTurnOn = i3;
        LogTurnOn = (i2 << i) | i3;
    }

    /* renamed from: d */
    public static final void m147836d(String str, String str2) {
        if (((LogTurnOn >> 1) & 1) == 1) {
            m147832x49a2e9e7("BDUploadLog", C1764a.m5928a("<%s>%s", new Object[]{str, str2}));
        }
    }

    /* renamed from: e */
    public static void m147837e(String str, String str2) {
        if (((LogTurnOn >> 6) & 1) == 1) {
            m147833x49a2e9e8("BDUploadLog", C1764a.m5928a("<%s>%s", new Object[]{str, str2}));
        }
    }

    /* renamed from: i */
    public static final void m147838i(String str, String str2) {
        if (((LogTurnOn >> 2) & 1) == 1) {
            m147834x49a2e9ec("BDUploadLog", C1764a.m5928a("<%s>%s", new Object[]{str, str2}));
        }
    }

    /* renamed from: k */
    public static final void m147839k(String str, String str2) {
        if (((LogTurnOn >> 4) & 1) == 1) {
            m147834x49a2e9ec("BDUploadLog", C1764a.m5928a("<%s>%s", new Object[]{str, str2}));
        }
    }

    /* renamed from: t */
    public static final void m147840t(String str, String str2) {
        if (((LogTurnOn >> 3) & 1) == 1) {
            m147834x49a2e9ec("BDUploadLog", C1764a.m5928a("<%s>%s", new Object[]{str, str2}));
        }
    }

    /* renamed from: w */
    public static final void m147841w(String str, String str2) {
        if (((LogTurnOn >> 5) & 1) == 1) {
            m147835x49a2e9fa("BDUploadLog", C1764a.m5928a("<%s>%s", new Object[]{str, str2}));
        }
    }
}
