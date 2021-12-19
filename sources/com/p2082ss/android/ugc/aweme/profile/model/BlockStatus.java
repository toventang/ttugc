package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: com.ss.android.ugc.aweme.profile.model.BlockStatus */
public final class BlockStatus extends BaseResponse {
    public int blockStatus = -1;
    public String userId;

    static {
        Covode.recordClassIndex(75156);
    }

    public BlockStatus(String str, int i) {
        this.userId = str;
        this.blockStatus = i;
    }
}
