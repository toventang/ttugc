package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.experiment.cf */
public final class C46789cf {

    /* renamed from: a */
    public static final C46789cf f109009a = new C46789cf();

    private C46789cf() {
    }

    static {
        Covode.recordClassIndex(55390);
    }

    /* renamed from: a */
    public static boolean m90135a() {
        try {
            return SettingsManager.m29616a().mo25400a("enable_income_plus_reauth", false);
        } catch (Throwable unused) {
            return false;
        }
    }
}
