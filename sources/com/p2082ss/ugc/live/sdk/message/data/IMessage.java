package com.p2082ss.ugc.live.sdk.message.data;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ugc.live.sdk.message.data.IMessage */
public interface IMessage {
    static {
        Covode.recordClassIndex(102853);
    }

    int getGeneralMessageType();

    int getIntType();

    int getMessageFrom();

    long getMessageId();

    int getPriority();

    boolean needMonitor();
}
