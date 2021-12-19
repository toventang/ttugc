package com.p2082ss.android.ugc.aweme.compliance.privacy.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.utils.UseOldApiSetting */
public final class UseOldApiSetting {
    public static final boolean DEFAULT = false;
    public static final UseOldApiSetting INSTANCE = new UseOldApiSetting();

    private UseOldApiSetting() {
    }

    static {
        Covode.recordClassIndex(47809);
    }

    public final boolean useOldApiSource() {
        return SettingsManager.m29616a().mo25400a("privacy_data_use_old_api", false);
    }
}
