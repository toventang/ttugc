package com.bytedance.android.live.core.p213c;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableALogSetting;
import com.bytedance.covode.number.Covode;
import com.p2082ss.p2083a.p2084a.AbstractC29335a;

/* renamed from: com.bytedance.android.live.core.c.a */
public final class C3854a {
    static {
        Covode.recordClassIndex(4383);
    }

    /* renamed from: a */
    public static void m9456a(String str) {
        m9453a(3, "ALogger", str);
    }

    /* renamed from: b */
    public static void m9459b(String str) {
        m9453a(6, "ALogger", str);
    }

    /* renamed from: a */
    public static void m9458a(String str, Throwable th) {
        m9454a(6, str, null, th);
    }

    /* renamed from: a */
    public static void m9455a(int i, String str, StackTraceElement[] stackTraceElementArr) {
        if (LiveEnableALogSetting.INSTANCE.isEnable()) {
            AbstractC29335a.m58727a(i, str, stackTraceElementArr);
        }
    }

    /* renamed from: b */
    public static void m9460b(String str, String str2, Throwable th) {
        m9454a(6, str, str2, th);
    }

    /* renamed from: a */
    public static void m9457a(String str, String str2, Throwable th) {
        m9454a(5, str, str2, th);
    }

    /* renamed from: a */
    public static void m9453a(int i, String str, String str2) {
        if (!LiveEnableALogSetting.INSTANCE.isDisable()) {
            if (i == 2) {
                AbstractC29335a.m58729a(str, str2);
            } else if (i == 3) {
                AbstractC29335a.m58732b(str, str2);
            } else if (i == 4) {
                AbstractC29335a.m58735c(str, str2);
            } else if (i == 5) {
                AbstractC29335a.m58736d(str, str2);
            } else if (i == 6) {
                AbstractC29335a.m58737e(str, str2);
            }
        }
    }

    /* renamed from: a */
    public static void m9454a(int i, String str, String str2, Throwable th) {
        if (!LiveEnableALogSetting.INSTANCE.isDisable()) {
            boolean isEmpty = TextUtils.isEmpty(str2);
            if (i != 5) {
                if (i == 6) {
                    if (isEmpty) {
                        AbstractC29335a.m58734b(str, th);
                    } else {
                        AbstractC29335a.m58733b(str, str2, th);
                    }
                }
            } else if (isEmpty) {
                AbstractC29335a.m58731a(str, th);
            } else {
                AbstractC29335a.m58730a(str, str2, th);
            }
        }
    }
}
