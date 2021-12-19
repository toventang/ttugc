package com.p2082ss.ugc.live.sdk.message.interfaces;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;

/* renamed from: com.ss.ugc.live.sdk.message.interfaces.IMessageConverter */
public interface IMessageConverter {
    static {
        Covode.recordClassIndex(102863);
    }

    IMessage convert(String str, String str2, long j);
}
