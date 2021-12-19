package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.model.BlockResponse */
public class BlockResponse extends BaseResponse {
    @AbstractC27891c(mo46611a = "block_status")
    int blockStaus;

    static {
        Covode.recordClassIndex(65024);
    }

    public int getBlockStaus() {
        return this.blockStaus;
    }

    public void setBlockStaus(int i) {
        this.blockStaus = i;
    }
}
