package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveGiftAssetsStorageLimit {
    @Group(isDefault = true, value = "default")
    private static final C9326a DEFAULT = new C9326a();
    public static final LiveGiftAssetsStorageLimit INSTANCE = new LiveGiftAssetsStorageLimit();

    private LiveGiftAssetsStorageLimit() {
    }

    public final C9326a getDEFAULT() {
        return DEFAULT;
    }

    public final long getThreshold() {
        return getConfig().f22765a;
    }

    public final boolean isCheckEnable() {
        return getConfig().f22766b;
    }

    private final C9326a getConfig() {
        C9326a aVar = (C9326a) SettingsManager.INSTANCE.getValueSafely(LiveGiftAssetsStorageLimit.class);
        if (aVar == null) {
            return DEFAULT;
        }
        return aVar;
    }

    static {
        Covode.recordClassIndex(10411);
    }
}
