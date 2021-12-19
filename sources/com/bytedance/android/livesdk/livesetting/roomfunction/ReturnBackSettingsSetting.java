package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.chatroom.model.p494a.C7653b;
import com.bytedance.covode.number.Covode;

public final class ReturnBackSettingsSetting {
    @Group(isDefault = true, value = "default group")
    private static final C7653b DEFAULT = new C7653b();
    public static final ReturnBackSettingsSetting INSTANCE = new ReturnBackSettingsSetting();

    private ReturnBackSettingsSetting() {
    }

    public final C7653b getDEFAULT() {
        return DEFAULT;
    }

    public final C7653b getValue() {
        C7653b bVar = (C7653b) SettingsManager.INSTANCE.getValueSafely(ReturnBackSettingsSetting.class);
        if (bVar == null) {
            return DEFAULT;
        }
        return bVar;
    }

    static {
        Covode.recordClassIndex(10742);
    }
}
