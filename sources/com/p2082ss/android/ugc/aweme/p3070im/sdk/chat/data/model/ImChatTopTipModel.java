package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.ImChatTopTipModel */
public final class ImChatTopTipModel extends BaseResponse {
    @AbstractC27891c(mo46611a = "data")
    private IMNoticeMsgStruct noticeMsgStruct;

    static {
        Covode.recordClassIndex(63444);
    }

    public final IMNoticeMsgStruct getNoticeMsgStruct() {
        return this.noticeMsgStruct;
    }

    public final void setNoticeMsgStruct(IMNoticeMsgStruct iMNoticeMsgStruct) {
        this.noticeMsgStruct = iMNoticeMsgStruct;
    }
}
