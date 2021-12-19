package com.p2082ss.ugc.live.sdk.message.interfaces;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;

/* renamed from: com.ss.ugc.live.sdk.message.interfaces.OnMessageListener */
public interface OnMessageListener {
    static {
        Covode.recordClassIndex(102870);
    }

    void onMessage(IMessage iMessage);
}
