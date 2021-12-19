package com.p2082ss.android.ugc.effectmanager.effect.model.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.net.ProviderEffectListResponse */
public class ProviderEffectListResponse extends BaseNetResponse {
    private ProviderEffectModel data;

    static {
        Covode.recordClassIndex(95610);
    }

    public ProviderEffectModel getData() {
        return this.data;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.model.BaseNetResponse
    public boolean checkValue() {
        if (this.data != null) {
            return true;
        }
        return false;
    }

    public void setData(ProviderEffectModel providerEffectModel) {
        this.data = providerEffectModel;
    }
}
