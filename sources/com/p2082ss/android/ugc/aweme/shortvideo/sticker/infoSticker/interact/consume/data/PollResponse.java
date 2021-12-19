package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.PollResponse */
public final class PollResponse extends BaseResponse {
    @AbstractC27891c(mo46611a = "option_id")
    private int optionId = -1;

    static {
        Covode.recordClassIndex(85598);
    }

    public final int getOptionId() {
        return this.optionId;
    }

    public final void setOptionId(int i) {
        this.optionId = i;
    }
}
