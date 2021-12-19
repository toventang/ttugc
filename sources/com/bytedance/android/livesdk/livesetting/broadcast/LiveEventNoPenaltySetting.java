package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveEventNoPenaltySetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveEventNoPenaltySetting INSTANCE = new LiveEventNoPenaltySetting();

    private LiveEventNoPenaltySetting() {
    }

    static {
        Covode.recordClassIndex(10304);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEventNoPenaltySetting.class);
    }
}
