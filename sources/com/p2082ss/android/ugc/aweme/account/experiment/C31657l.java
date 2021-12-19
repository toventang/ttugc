package com.p2082ss.android.ugc.aweme.account.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.account.experiment.l */
public final class C31657l {

    /* renamed from: a */
    public static final C31657l f75721a = new C31657l();

    /* renamed from: b */
    private static final boolean f75722b = true;

    private C31657l() {
    }

    static {
        Covode.recordClassIndex(38388);
    }

    /* renamed from: a */
    public static final boolean m65967a() {
        if (!SettingsManager.m29616a().mo25400a("new_user_email_verification_enabled", false) || !C16048b.m29633a().mo25421a(true, "new_user_email_verification", false)) {
            return false;
        }
        return true;
    }
}
