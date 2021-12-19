package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.C9902r;
import com.bytedance.covode.number.Covode;

public final class FirstChargeSetting {
    @Group(isDefault = true, value = "default group")
    private static final C9902r DEFAULT = new C9902r();
    public static final FirstChargeSetting INSTANCE = new FirstChargeSetting();

    private FirstChargeSetting() {
    }

    public final C9902r getDEFAULT() {
        return DEFAULT;
    }

    public final C9902r getValue() {
        C9902r rVar = (C9902r) SettingsManager.INSTANCE.getValueSafely(FirstChargeSetting.class);
        if (rVar == null) {
            return DEFAULT;
        }
        return rVar;
    }

    static {
        Covode.recordClassIndex(10747);
    }
}
