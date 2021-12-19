package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.chatroom.model.p494a.C7652a;
import com.bytedance.covode.number.Covode;

public final class BackRoomListSettingConfigSetting {
    @Group(isDefault = true, value = "default group")
    private static final C7652a DEFAULT = new C7652a();
    public static final BackRoomListSettingConfigSetting INSTANCE = new BackRoomListSettingConfigSetting();

    private BackRoomListSettingConfigSetting() {
    }

    public final C7652a getDEFAULT() {
        return DEFAULT;
    }

    public final C7652a getValue() {
        C7652a aVar = (C7652a) SettingsManager.INSTANCE.getValueSafely(BackRoomListSettingConfigSetting.class);
        if (aVar == null) {
            return DEFAULT;
        }
        return aVar;
    }

    static {
        Covode.recordClassIndex(10767);
    }
}
