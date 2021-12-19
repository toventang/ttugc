package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.C9915w;
import com.bytedance.covode.number.Covode;

public final class GiftPlayerAutoReleaseSwitchSetting {
    @Group(isDefault = true, value = "default group")
    private static final C9915w DEFAULT = new C9915w();
    public static final GiftPlayerAutoReleaseSwitchSetting INSTANCE = new GiftPlayerAutoReleaseSwitchSetting();

    private GiftPlayerAutoReleaseSwitchSetting() {
    }

    public final C9915w getValue() {
        C9915w wVar = (C9915w) SettingsManager.INSTANCE.getValueSafely(GiftPlayerAutoReleaseSwitchSetting.class);
        if (wVar == null) {
            return DEFAULT;
        }
        return wVar;
    }

    static {
        Covode.recordClassIndex(10395);
    }
}
