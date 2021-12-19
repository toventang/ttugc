package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.TopChatNoticePushStatus */
public enum TopChatNoticePushStatus {
    PUSH_STATUS_UNKNOWN(0),
    PUSH_STATUS_ON(1),
    PUSH_STATUS_OFF(2);
    
    private final int status;

    public final int getStatus() {
        return this.status;
    }

    static {
        Covode.recordClassIndex(63489);
    }

    private TopChatNoticePushStatus(int i) {
        this.status = i;
    }
}
