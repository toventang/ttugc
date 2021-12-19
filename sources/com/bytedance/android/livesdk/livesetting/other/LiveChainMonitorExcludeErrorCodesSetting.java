package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4601a.C89086z;

public final class LiveChainMonitorExcludeErrorCodesSetting {
    @Group(isDefault = true, value = "default group")
    private static final List<Integer> DEFAULT = C89086z.INSTANCE;
    public static final LiveChainMonitorExcludeErrorCodesSetting INSTANCE = new LiveChainMonitorExcludeErrorCodesSetting();

    private LiveChainMonitorExcludeErrorCodesSetting() {
    }

    public final List<Integer> getValue() {
        List<Integer> list = (List) SettingsManager.INSTANCE.getValueSafely(LiveChainMonitorExcludeErrorCodesSetting.class);
        if (list == null) {
            return DEFAULT;
        }
        return list;
    }

    static {
        Covode.recordClassIndex(10578);
    }
}
