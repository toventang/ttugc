package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.TopChatNoticeSourceType */
public enum TopChatNoticeSourceType {
    DM_CHAT("dm_chat"),
    INBOX("inbox");
    
    private final String type;

    public final String getType() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(63490);
    }

    private TopChatNoticeSourceType(String str) {
        this.type = str;
    }
}
