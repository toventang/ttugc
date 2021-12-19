package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.chatroom.model.C7689i;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

public final class LiveCommentTranslationConfigSetting {
    @Group(isDefault = true, value = "default group")
    private static final C7689i DEFAULT;
    public static final LiveCommentTranslationConfigSetting INSTANCE = new LiveCommentTranslationConfigSetting();

    private LiveCommentTranslationConfigSetting() {
    }

    public final C7689i getValue() {
        C7689i iVar = (C7689i) SettingsManager.INSTANCE.getValueSafely(LiveCommentTranslationConfigSetting.class);
        if (iVar == null) {
            return DEFAULT;
        }
        return iVar;
    }

    static {
        Covode.recordClassIndex(10675);
        C7689i iVar = new C7689i();
        iVar.f19057a = false;
        iVar.f19058b = 1;
        iVar.f19059c = 3;
        iVar.f19060d = 5;
        C89219l.m154716b(iVar, "");
        DEFAULT = iVar;
    }
}
