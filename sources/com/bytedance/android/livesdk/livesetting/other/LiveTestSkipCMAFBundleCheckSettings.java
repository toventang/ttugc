package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveTestSkipCMAFBundleCheckSettings {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveTestSkipCMAFBundleCheckSettings INSTANCE = new LiveTestSkipCMAFBundleCheckSettings();

    private LiveTestSkipCMAFBundleCheckSettings() {
    }

    static {
        Covode.recordClassIndex(10615);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveTestSkipCMAFBundleCheckSettings.class);
    }
}
