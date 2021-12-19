package com.bytedance.android.live.effect.model;

import com.bytedance.android.livesdk.livesetting.effect.LiveNewEffectPanelSetting;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.effect.model.c */
public final class C4313c extends C4309a {

    /* renamed from: b */
    private String f11860b;

    static {
        Covode.recordClassIndex(4885);
    }

    /* renamed from: a */
    public final void mo9992a() {
        if (this.f11846a != null) {
            this.f11846a.mo8999a((String) null, 1.0f);
        }
    }

    /* renamed from: a */
    public final void mo9993a(String str, float f) {
        this.f11860b = str;
        if (this.f11846a == null) {
            return;
        }
        if (LiveNewEffectPanelSetting.INSTANCE.useNewPanel()) {
            this.f11846a.mo8999a(this.f11860b, f);
        } else {
            this.f11846a.mo8999a(this.f11860b, 1.0f);
        }
    }
}
