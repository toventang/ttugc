package com.p2082ss.android.ugc.effectmanager.effect.model.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.model.BaseNetResponse;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.net.EffectCheckUpdateResponse */
public class EffectCheckUpdateResponse extends BaseNetResponse {
    private boolean updated;

    static {
        Covode.recordClassIndex(95604);
    }

    public boolean isUpdated() {
        return this.updated;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.model.BaseNetResponse
    public boolean checkValue() {
        return super.checkValue();
    }

    public void setUpdated(boolean z) {
        this.updated = z;
    }
}
