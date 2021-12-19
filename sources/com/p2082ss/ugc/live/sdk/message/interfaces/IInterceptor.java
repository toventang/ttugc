package com.p2082ss.ugc.live.sdk.message.interfaces;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;

/* renamed from: com.ss.ugc.live.sdk.message.interfaces.IInterceptor */
public interface IInterceptor {
    static {
        Covode.recordClassIndex(102859);
    }

    boolean onMessage(IMessage iMessage);
}
