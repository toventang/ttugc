package com.p2082ss.android.ugc.effectmanager.effect.repository.newrepo;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;

/* renamed from: com.ss.android.ugc.effectmanager.effect.repository.newrepo.EffectListStore */
public final class EffectListStore {
    private EffectChannelResponse currentEffectList;

    static {
        Covode.recordClassIndex(95646);
    }

    public final EffectChannelResponse getCurrentEffectList() {
        EffectChannelResponse effectChannelResponse = this.currentEffectList;
        if (effectChannelResponse != null) {
            return effectChannelResponse;
        }
        return new EffectChannelResponse(null, 1, null);
    }

    public final void setCurrentEffectList(EffectChannelResponse effectChannelResponse) {
        this.currentEffectList = effectChannelResponse;
    }
}
