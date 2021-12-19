package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveCoverCropCustomStyleSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveCoverCropCustomStyleSetting INSTANCE = new LiveCoverCropCustomStyleSetting();

    private LiveCoverCropCustomStyleSetting() {
    }

    static {
        Covode.recordClassIndex(10295);
    }

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveCoverCropCustomStyleSetting.class);
    }
}
