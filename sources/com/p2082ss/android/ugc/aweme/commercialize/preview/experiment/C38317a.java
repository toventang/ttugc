package com.p2082ss.android.ugc.aweme.commercialize.preview.experiment;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.commercialize.preview.experiment.a */
public final class C38317a {

    /* renamed from: a */
    public static final PreviewConfiguration f90552a = new PreviewConfiguration(LiveNetAdaptiveHurryTimeSetting.DEFAULT, 20);

    /* renamed from: b */
    public static final C38317a f90553b = new C38317a();

    private C38317a() {
    }

    static {
        Covode.recordClassIndex(45806);
    }

    /* renamed from: a */
    public static PreviewConfiguration m77706a() {
        try {
            SettingsManager a = SettingsManager.m29616a();
            PreviewConfiguration previewConfiguration = f90552a;
            PreviewConfiguration previewConfiguration2 = (PreviewConfiguration) a.mo25397a("ads_preview_configuration", PreviewConfiguration.class, previewConfiguration);
            return previewConfiguration2 == null ? previewConfiguration : previewConfiguration2;
        } catch (Throwable unused) {
            return f90552a;
        }
    }
}
