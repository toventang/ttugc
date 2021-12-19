package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.config.C8209a;
import com.bytedance.covode.number.Covode;

public final class LiveGameFloatMsgPanelConfigSetting {
    @Group(isDefault = true, value = "default group")
    private static final C8209a DEFAULT = new C8209a();
    public static final LiveGameFloatMsgPanelConfigSetting INSTANCE = new LiveGameFloatMsgPanelConfigSetting();

    private LiveGameFloatMsgPanelConfigSetting() {
    }

    public final C8209a getValue() {
        C8209a aVar = (C8209a) SettingsManager.INSTANCE.getValueSafely(LiveGameFloatMsgPanelConfigSetting.class);
        if (aVar == null) {
            return DEFAULT;
        }
        return aVar;
    }

    static {
        Covode.recordClassIndex(10677);
    }
}
