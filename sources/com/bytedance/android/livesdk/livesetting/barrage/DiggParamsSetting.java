package com.bytedance.android.livesdk.livesetting.barrage;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.chatroom.model.C7688h;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

public final class DiggParamsSetting {
    @Group(isDefault = true, value = "default group")
    private static final C7688h DEFAULT;
    public static final DiggParamsSetting INSTANCE = new DiggParamsSetting();

    private DiggParamsSetting() {
    }

    public final C7688h getValue() {
        C7688h hVar = (C7688h) SettingsManager.INSTANCE.getValueSafely(DiggParamsSetting.class);
        if (hVar == null) {
            return DEFAULT;
        }
        return hVar;
    }

    static {
        Covode.recordClassIndex(10261);
        C7688h hVar = new C7688h();
        hVar.f19049a = 0;
        hVar.f19050b = 500;
        hVar.f19051c = 15;
        hVar.f19052d = 15;
        hVar.f19053e = 80;
        hVar.f19054f = 1;
        hVar.f19055g = false;
        hVar.f19056h = 300;
        C89219l.m154716b(hVar, "");
        DEFAULT = hVar;
    }
}
