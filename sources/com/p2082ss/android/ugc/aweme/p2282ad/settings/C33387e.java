package com.p2082ss.android.ugc.aweme.p2282ad.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.ad.settings.e */
public final class C33387e {

    /* renamed from: a */
    public static final boolean f79336a = true;

    /* renamed from: b */
    public static final C33387e f79337b = new C33387e();

    private C33387e() {
    }

    /* renamed from: a */
    public static boolean m68470a() {
        try {
            return SettingsManager.m29616a().mo25400a("modify_xrw", true);
        } catch (Throwable unused) {
            return f79336a;
        }
    }

    static {
        Covode.recordClassIndex(40235);
    }
}
