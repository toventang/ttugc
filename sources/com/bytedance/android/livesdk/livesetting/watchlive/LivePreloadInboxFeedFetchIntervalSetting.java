package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LivePreloadInboxFeedFetchIntervalSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 60000;
    public static final LivePreloadInboxFeedFetchIntervalSetting INSTANCE = new LivePreloadInboxFeedFetchIntervalSetting();

    private LivePreloadInboxFeedFetchIntervalSetting() {
    }

    static {
        Covode.recordClassIndex(10810);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LivePreloadInboxFeedFetchIntervalSetting.class);
    }
}
