package com.bytedance.android.livesdk.livesetting.slot;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import p4600h.p4601a.C89041ag;

public final class LiveBarrageShowMapSetting {
    @Group(isDefault = true, value = "default group")
    private static final Map<String, Boolean> DEFAULT = C89041ag.m154415a();
    public static final LiveBarrageShowMapSetting INSTANCE = new LiveBarrageShowMapSetting();

    private LiveBarrageShowMapSetting() {
    }

    public final Map<String, Boolean> getValue() {
        Map<String, Boolean> map = (Map) SettingsManager.INSTANCE.getValueSafely(LiveBarrageShowMapSetting.class);
        if (map == null) {
            return DEFAULT;
        }
        return map;
    }

    static {
        Covode.recordClassIndex(10744);
    }
}
