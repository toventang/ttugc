package com.p2082ss.android.ugc.effectmanager.effect.model.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelModel;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.net.EffectNetListResponse */
public class EffectNetListResponse extends BaseNetResponse {
    private EffectChannelModel data;

    static {
        Covode.recordClassIndex(95606);
    }

    public EffectChannelModel getData() {
        return this.data;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.model.BaseNetResponse
    public boolean checkValue() {
        EffectChannelModel effectChannelModel = this.data;
        if (effectChannelModel == null || !effectChannelModel.checkValued()) {
            return false;
        }
        return true;
    }

    public void setData(EffectChannelModel effectChannelModel) {
        this.data = effectChannelModel;
    }
}
