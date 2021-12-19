package com.p2082ss.android.ugc.aweme.profile.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.profile.experiment.b */
public final class C63736b {

    /* renamed from: a */
    public static final C63736b f144489a = new C63736b();

    private C63736b() {
    }

    static {
        Covode.recordClassIndex(75064);
    }

    /* renamed from: a */
    public static final boolean m115266a() {
        try {
            return SettingsManager.m29616a().mo25400a("enable_profile_add_nonprofit", false);
        } catch (Throwable unused) {
            return false;
        }
    }
}
