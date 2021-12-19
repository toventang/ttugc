package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.p522f.C8467b;
import com.bytedance.covode.number.Covode;

public final class LiveCommerceBannerSetting {
    @Group(isDefault = true, value = "default group")
    private static final C8467b DEFAULT = new C8467b();
    public static final LiveCommerceBannerSetting INSTANCE = new LiveCommerceBannerSetting();

    private LiveCommerceBannerSetting() {
    }

    public final C8467b getValue() {
        C8467b bVar = (C8467b) SettingsManager.INSTANCE.getValueSafely(LiveCommerceBannerSetting.class);
        if (bVar == null) {
            return DEFAULT;
        }
        return bVar;
    }

    static {
        Covode.recordClassIndex(10579);
    }
}
