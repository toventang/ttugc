package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.C9898o;
import com.bytedance.covode.number.Covode;

public final class LiveFeedPreloadSetting {
    @Group(isDefault = true, value = "default group")
    private static final C9898o DEFAULT = new C9898o();
    public static final LiveFeedPreloadSetting INSTANCE = new LiveFeedPreloadSetting();

    private LiveFeedPreloadSetting() {
    }

    public final C9898o getValue() {
        C9898o oVar = (C9898o) SettingsManager.INSTANCE.getValueSafely(LiveFeedPreloadSetting.class);
        if (oVar == null) {
            return DEFAULT;
        }
        return oVar;
    }

    static {
        Covode.recordClassIndex(10589);
    }
}
