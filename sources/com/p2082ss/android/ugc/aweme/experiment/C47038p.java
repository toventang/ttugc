package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.experiment.p */
public final class C47038p {

    /* renamed from: a */
    public static final C47038p f109588a = new C47038p();

    private C47038p() {
    }

    static {
        Covode.recordClassIndex(55639);
    }

    /* renamed from: a */
    public static final ClaCrowdsourcingEntrypoints m90297a() {
        try {
            return (ClaCrowdsourcingEntrypoints) SettingsManager.m29616a().mo25396a("cla_crowdsourcing_entry_points", ClaCrowdsourcingEntrypoints.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}
