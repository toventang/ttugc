package com.p2082ss.ugc.live.sdk.message.interfaces;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;

/* renamed from: com.ss.ugc.live.sdk.message.interfaces.OnInterceptListener */
public interface OnInterceptListener {
    static {
        Covode.recordClassIndex(102869);
    }

    void onIntercept(IMessage iMessage);
}
