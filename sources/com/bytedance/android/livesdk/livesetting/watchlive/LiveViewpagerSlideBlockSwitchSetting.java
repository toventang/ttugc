package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveViewpagerSlideBlockSwitchSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveViewpagerSlideBlockSwitchSetting INSTANCE = new LiveViewpagerSlideBlockSwitchSetting();

    private LiveViewpagerSlideBlockSwitchSetting() {
    }

    static {
        Covode.recordClassIndex(10816);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveViewpagerSlideBlockSwitchSetting.class);
    }
}
