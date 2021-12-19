package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.gift.model.C8858v;
import com.bytedance.covode.number.Covode;

public final class LiveWishlistPermissionSetting {
    @Group(isDefault = true, value = "default group")
    private static final C8858v DEFAULT = new C8858v((byte) 0);
    public static final LiveWishlistPermissionSetting INSTANCE = new LiveWishlistPermissionSetting();

    private LiveWishlistPermissionSetting() {
    }

    public final C8858v getValue() {
        C8858v vVar = (C8858v) SettingsManager.INSTANCE.getValueSafely(LiveWishlistPermissionSetting.class);
        if (vVar == null) {
            return DEFAULT;
        }
        return vVar;
    }

    static {
        Covode.recordClassIndex(10435);
    }
}
