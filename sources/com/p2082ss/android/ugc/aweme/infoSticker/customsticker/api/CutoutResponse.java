package com.p2082ss.android.ugc.aweme.infoSticker.customsticker.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.model.BaseNetResponse;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.api.CutoutResponse */
public final class CutoutResponse extends BaseNetResponse {
    private CutoutResult data;

    static {
        Covode.recordClassIndex(66567);
    }

    public final CutoutResult getData() {
        return this.data;
    }

    public final void setData(CutoutResult cutoutResult) {
        this.data = cutoutResult;
    }
}
