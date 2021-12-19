package com.p2082ss.android.ugc.aweme.specialplus;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.specialplus.b */
public final class C75204b {

    /* renamed from: a */
    public static final C75204b f169107a = new C75204b();

    private C75204b() {
    }

    static {
        Covode.recordClassIndex(88087);
    }

    /* renamed from: a */
    public static final boolean m131950a() {
        try {
            return SettingsManager.m29616a().mo25400a("enable_special_plus", false);
        } catch (Throwable unused) {
            return false;
        }
    }
}
