package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.chatroom.model.C7690j;
import com.bytedance.covode.number.Covode;

public final class LiveExternalConfigSetting {
    @Group(isDefault = true, value = "default group")
    private static final C7690j DEFAULT = new C7690j();
    public static final LiveExternalConfigSetting INSTANCE = new LiveExternalConfigSetting();

    private LiveExternalConfigSetting() {
    }

    public final C7690j getValue() {
        C7690j jVar = (C7690j) SettingsManager.INSTANCE.getValueSafely(LiveExternalConfigSetting.class);
        if (jVar == null) {
            return DEFAULT;
        }
        return jVar;
    }

    static {
        Covode.recordClassIndex(10676);
    }
}
