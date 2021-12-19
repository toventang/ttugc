package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.C9536at;
import com.bytedance.covode.number.Covode;

public final class RanklistInfoSetting {
    @Group(isDefault = true, value = "default group")
    private static final C9536at DEFAULT = new C9536at();
    public static final RanklistInfoSetting INSTANCE = new RanklistInfoSetting();

    private RanklistInfoSetting() {
    }

    public final C9536at getValue() {
        C9536at atVar = (C9536at) SettingsManager.INSTANCE.getValueSafely(RanklistInfoSetting.class);
        if (atVar == null) {
            return DEFAULT;
        }
        return atVar;
    }

    static {
        Covode.recordClassIndex(10709);
    }
}
