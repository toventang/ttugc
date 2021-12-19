package com.p2082ss.android.ugc.effectmanager.effect.model.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.p2082ss.android.ugc.effectmanager.effect.model.SearchEffectModel;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.net.SearchEffectResponseV2 */
public final class SearchEffectResponseV2 extends BaseNetResponse {
    private SearchEffectModel data;

    static {
        Covode.recordClassIndex(95614);
    }

    public final SearchEffectModel getData() {
        return this.data;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.model.BaseNetResponse
    public final boolean checkValue() {
        if (this.data != null) {
            return true;
        }
        return false;
    }

    public final void setData(SearchEffectModel searchEffectModel) {
        this.data = searchEffectModel;
    }
}
