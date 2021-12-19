package com.p2082ss.android.ugc.aweme.setting.serverpush.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.api.SocialRelationDataCheckResponse */
public final class SocialRelationDataCheckResponse extends BaseResponse {
    @AbstractC27891c(mo46611a = "has_remaining_data")
    private boolean hasRemainingData;

    static {
        Covode.recordClassIndex(80576);
    }

    public final boolean getHasRemainingData() {
        return this.hasRemainingData;
    }

    public final void setHasRemainingData(boolean z) {
        this.hasRemainingData = z;
    }
}
