package com.p2082ss.android.ugc.aweme.profile.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.profile.experiment.a */
public final class C63735a {

    /* renamed from: a */
    public static final C63735a f144488a = new C63735a();

    private C63735a() {
    }

    static {
        Covode.recordClassIndex(75063);
    }

    /* renamed from: a */
    public static BioLinkReportConfig m115265a() {
        try {
            return (BioLinkReportConfig) SettingsManager.m29616a().mo25396a("bio_link_report_config", BioLinkReportConfig.class);
        } catch (Exception unused) {
            return null;
        }
    }
}
