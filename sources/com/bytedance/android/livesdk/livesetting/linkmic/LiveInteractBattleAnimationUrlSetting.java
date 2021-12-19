package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.live.model.BattleResource;
import com.bytedance.covode.number.Covode;

public final class LiveInteractBattleAnimationUrlSetting {
    @Group(isDefault = true, value = "default group")
    private static final BattleResource DEFAULT = BattleResource.C9299a.m17574a();
    public static final LiveInteractBattleAnimationUrlSetting INSTANCE = new LiveInteractBattleAnimationUrlSetting();

    private LiveInteractBattleAnimationUrlSetting() {
    }

    public final BattleResource getDEFAULT() {
        return DEFAULT;
    }

    public final BattleResource getValue() {
        return (BattleResource) SettingsManager.INSTANCE.getValueSafely(LiveInteractBattleAnimationUrlSetting.class);
    }

    static {
        Covode.recordClassIndex(10498);
    }
}
