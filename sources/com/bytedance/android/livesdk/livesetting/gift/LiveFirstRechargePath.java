package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveFirstRechargePath {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveFirstRechargePath INSTANCE = new LiveFirstRechargePath();

    private LiveFirstRechargePath() {
    }

    static {
        Covode.recordClassIndex(10405);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveFirstRechargePath.class);
    }
}
