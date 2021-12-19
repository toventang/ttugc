package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.C9586f;
import com.bytedance.covode.number.Covode;

public final class WebcastAssetAnimIdMapSetting {
    @Group(isDefault = true, value = "default group")
    private static final C9586f DEFAULT = new C9586f();
    public static final WebcastAssetAnimIdMapSetting INSTANCE = new WebcastAssetAnimIdMapSetting();

    private WebcastAssetAnimIdMapSetting() {
    }

    public final C9586f getValue() {
        C9586f fVar = (C9586f) SettingsManager.INSTANCE.getValueSafely(WebcastAssetAnimIdMapSetting.class);
        if (fVar == null) {
            return DEFAULT;
        }
        return fVar;
    }

    static {
        Covode.recordClassIndex(10635);
    }
}
