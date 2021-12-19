package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.model.C9332a;
import com.bytedance.covode.number.Covode;

public final class LiveBannerExperiment {
    @Group(isDefault = true, value = "default group")
    private static final C9332a DEFAULT = new C9332a(false, 1, null);
    public static final LiveBannerExperiment INSTANCE = new LiveBannerExperiment();

    private LiveBannerExperiment() {
    }

    public final C9332a getDEFAULT() {
        return DEFAULT;
    }

    public static final boolean isNewBannerEnable() {
        return INSTANCE.getValue().getEnableNewBanner();
    }

    public final C9332a getValue() {
        C9332a aVar = (C9332a) SettingsManager.INSTANCE.getValueSafely(LiveBannerExperiment.class);
        if (aVar == null) {
            return DEFAULT;
        }
        return aVar;
    }

    static {
        Covode.recordClassIndex(10255);
    }
}
