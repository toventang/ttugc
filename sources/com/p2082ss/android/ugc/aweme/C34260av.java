package com.p2082ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.av */
public final class C34260av {

    /* renamed from: a */
    public static final boolean f81026a = true;

    /* renamed from: b */
    public static final C34260av f81027b = new C34260av();

    private C34260av() {
    }

    /* renamed from: a */
    public static boolean m70043a() {
        try {
            return SettingsManager.m29616a().mo25400a("enable_cqrcode_intercept", true);
        } catch (Throwable unused) {
            return f81026a;
        }
    }

    static {
        Covode.recordClassIndex(41197);
    }
}
