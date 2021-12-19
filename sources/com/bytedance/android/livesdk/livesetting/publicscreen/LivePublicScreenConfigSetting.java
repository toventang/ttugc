package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.chatroom.model.C7692l;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

public final class LivePublicScreenConfigSetting {
    @Group(isDefault = true, value = "default group")
    private static final C7692l DEFAULT;
    public static final LivePublicScreenConfigSetting INSTANCE = new LivePublicScreenConfigSetting();

    private LivePublicScreenConfigSetting() {
    }

    public static final C7692l getValue() {
        C7692l lVar = (C7692l) SettingsManager.INSTANCE.getValueSafely(LivePublicScreenConfigSetting.class);
        if (lVar == null) {
            return DEFAULT;
        }
        return lVar;
    }

    static {
        Covode.recordClassIndex(10679);
        C7692l lVar = new C7692l();
        C89219l.m154716b(lVar, "");
        DEFAULT = lVar;
    }
}
