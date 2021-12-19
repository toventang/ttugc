package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.C9529am;
import com.bytedance.covode.number.Covode;

public final class LiveRankAnchorConfigSetting {
    @Group(isDefault = true, value = "default group")
    private static final C9529am DEFAULT = new C9529am();
    public static final LiveRankAnchorConfigSetting INSTANCE = new LiveRankAnchorConfigSetting();

    private LiveRankAnchorConfigSetting() {
    }

    public final C9529am getValue() {
        C9529am amVar = (C9529am) SettingsManager.INSTANCE.getValueSafely(LiveRankAnchorConfigSetting.class);
        if (amVar == null) {
            return DEFAULT;
        }
        return amVar;
    }

    static {
        Covode.recordClassIndex(10706);
    }
}
