package com.p2082ss.ttuploader;

import com.C1764a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ttuploader.TTUploadLog */
public class TTUploadLog {
    public static int LogTurnOn = 112;

    /* renamed from: com_ss_ttuploader_TTUploadLog_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m148560x2697e4a7(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_ttuploader_TTUploadLog_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m148561x2697e4a8(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_ttuploader_TTUploadLog_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m148562x2697e4ac(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_ttuploader_TTUploadLog_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m148563x2697e4ba(String str, String str2) {
        return 0;
    }

    static {
        Covode.recordClassIndex(101485);
    }

    public static final void turnOn(int i, int i2) {
        int i3 = ((1 << i) ^ -1) & LogTurnOn;
        LogTurnOn = i3;
        LogTurnOn = (i2 << i) | i3;
    }

    /* renamed from: d */
    public static final void m148564d(String str, String str2) {
        if (((LogTurnOn >> 1) & 1) == 1) {
            m148560x2697e4a7("TTUploadLog", C1764a.m5928a("<%s>%s", new Object[]{str, str2}));
        }
    }

    /* renamed from: e */
    public static void m148565e(String str, String str2) {
        if (((LogTurnOn >> 6) & 1) == 1) {
            m148561x2697e4a8("TTUploadLog", C1764a.m5928a("<%s>%s", new Object[]{str, str2}));
        }
    }

    /* renamed from: i */
    public static final void m148566i(String str, String str2) {
        if (((LogTurnOn >> 2) & 1) == 1) {
            m148562x2697e4ac("TTUploadLog", C1764a.m5928a("<%s>%s", new Object[]{str, str2}));
        }
    }

    /* renamed from: k */
    public static final void m148567k(String str, String str2) {
        if (((LogTurnOn >> 4) & 1) == 1) {
            m148562x2697e4ac("TTUploadLog", C1764a.m5928a("<%s>%s", new Object[]{str, str2}));
        }
    }

    /* renamed from: t */
    public static final void m148568t(String str, String str2) {
        if (((LogTurnOn >> 3) & 1) == 1) {
            m148562x2697e4ac("TTUploadLog", C1764a.m5928a("<%s>%s", new Object[]{str, str2}));
        }
    }

    /* renamed from: w */
    public static final void m148569w(String str, String str2) {
        if (((LogTurnOn >> 5) & 1) == 1) {
            m148563x2697e4ba("TTUploadLog", C1764a.m5928a("<%s>%s", new Object[]{str, str2}));
        }
    }
}
