package com.p2082ss.android.ugc.effectmanager.common.logger;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.common.logger.DefaultLogger */
public final class DefaultLogger implements ILogger {
    public static final DefaultLogger INSTANCE = new DefaultLogger();

    /* renamed from: com_ss_android_ugc_effectmanager_common_logger_DefaultLogger_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m141890x6ecee628(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_android_ugc_effectmanager_common_logger_DefaultLogger_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m141891x6ecee629(String str, String str2, Throwable th) {
        return 0;
    }

    /* renamed from: com_ss_android_ugc_effectmanager_common_logger_DefaultLogger_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m141892x6ecee62d(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_android_ugc_effectmanager_common_logger_DefaultLogger_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m141893x6ecee63b(String str, String str2) {
        return 0;
    }

    private DefaultLogger() {
    }

    static {
        Covode.recordClassIndex(95476);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.logger.ILogger
    /* renamed from: d */
    public final void mo101723d(String str) {
        C89219l.m154719c(str, "");
        if (EPLog.INSTANCE.getSEnableLog()) {
            m141890x6ecee628("DefaultEPLog", str);
        }
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.logger.ILogger
    /* renamed from: i */
    public final void mo101725i(String str) {
        C89219l.m154719c(str, "");
        if (EPLog.INSTANCE.getSEnableLog()) {
            m141892x6ecee62d("DefaultEPLog", str);
        }
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.logger.ILogger
    /* renamed from: w */
    public final void mo101726w(String str) {
        C89219l.m154719c(str, "");
        if (EPLog.INSTANCE.getSEnableLog()) {
            m141893x6ecee63b("DefaultEPLog", str);
        }
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.logger.ILogger
    /* renamed from: e */
    public final void mo101724e(String str, Throwable th) {
        m141891x6ecee629("DefaultEPLog", str, th);
    }
}
