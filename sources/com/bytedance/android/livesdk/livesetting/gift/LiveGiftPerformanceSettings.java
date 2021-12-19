package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveGiftPerformanceSettings {
    @Group(isDefault = true, value = "default group")
    private static final C9327b DEFAULT = new C9327b(0, 0, 14);
    public static final LiveGiftPerformanceSettings INSTANCE = new LiveGiftPerformanceSettings();

    private LiveGiftPerformanceSettings() {
    }

    public final int getHotQueueSize() {
        return getConfig().f22769c;
    }

    public final int getSelfHotQueueSize() {
        return getConfig().f22770d;
    }

    public final boolean useNewQueue() {
        return getConfig().f22767a;
    }

    public final boolean useNewSelfQueue() {
        return getConfig().f22768b;
    }

    private final C9327b getConfig() {
        C9327b bVar = (C9327b) SettingsManager.INSTANCE.getValueSafely(LiveGiftPerformanceSettings.class);
        if (bVar == null) {
            return DEFAULT;
        }
        return bVar;
    }

    static {
        Covode.recordClassIndex(10418);
    }
}
