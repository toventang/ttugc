package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class I18nZhibozhongAnimationTagSetting {
    @Group(isDefault = true, value = "true:show")
    public static final boolean DEFAULT = true;
    public static final I18nZhibozhongAnimationTagSetting INSTANCE = new I18nZhibozhongAnimationTagSetting();
    @Group("false:gone")

    /* renamed from: v1 */
    public static final boolean f22764v1 = false;

    private I18nZhibozhongAnimationTagSetting() {
    }

    static {
        Covode.recordClassIndex(10380);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(I18nZhibozhongAnimationTagSetting.class);
    }
}
