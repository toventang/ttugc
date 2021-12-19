package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.experiment.o */
public final class C47037o {

    /* renamed from: a */
    public static final C47037o f109587a = new C47037o();

    private C47037o() {
    }

    static {
        Covode.recordClassIndex(55638);
    }

    /* renamed from: a */
    public static final boolean m90296a() {
        try {
            return SettingsManager.m29616a().mo25400a("cla_crowdsourcing_feature_switch", true);
        } catch (Throwable unused) {
            return false;
        }
    }
}
