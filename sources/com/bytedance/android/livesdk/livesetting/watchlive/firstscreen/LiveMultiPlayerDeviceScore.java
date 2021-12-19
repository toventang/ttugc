package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.covode.number.Covode;

public final class LiveMultiPlayerDeviceScore {
    @Group(isDefault = true, value = "default group")
    private static final C9337a DEFAULT = new C9337a((byte) 0);
    public static final LiveMultiPlayerDeviceScore INSTANCE = new LiveMultiPlayerDeviceScore();

    private LiveMultiPlayerDeviceScore() {
    }

    public final C9337a getDEFAULT() {
        return DEFAULT;
    }

    static {
        Covode.recordClassIndex(10838);
    }

    public final boolean isEnable() {
        C9337a aVar = (C9337a) SettingsManager.INSTANCE.getValueSafely(LiveMultiPlayerDeviceScore.class);
        if (aVar == null) {
            aVar = new C9337a((byte) 0);
        }
        float value = TTliveAnchorDeviceScoreSetting.INSTANCE.getValue();
        if (value < aVar.f22811b || value >= aVar.f22810a) {
            return false;
        }
        return true;
    }
}
