package com.bytedance.android.livesdk.livesetting.redenvelope;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.model.C9333b;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

public final class RedEnvelopeURLConfig {
    @Group(isDefault = true, value = "default group")
    private static C9333b DEFAULT = new C9333b();
    public static final RedEnvelopeURLConfig INSTANCE = new RedEnvelopeURLConfig();

    private RedEnvelopeURLConfig() {
    }

    public final C9333b getDEFAULT() {
        return DEFAULT;
    }

    static {
        Covode.recordClassIndex(10718);
    }

    public final String getSendUrl() {
        C9333b bVar = (C9333b) SettingsManager.INSTANCE.getValueSafely(RedEnvelopeURLConfig.class);
        if (bVar != null) {
            return bVar.f22788b;
        }
        return null;
    }

    public final String getShortTouchUrl() {
        C9333b bVar = (C9333b) SettingsManager.INSTANCE.getValueSafely(RedEnvelopeURLConfig.class);
        if (bVar != null) {
            return bVar.f22787a;
        }
        return null;
    }

    public final void setDEFAULT(C9333b bVar) {
        C89219l.m154721d(bVar, "");
        DEFAULT = bVar;
    }
}
