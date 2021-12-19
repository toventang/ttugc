package com.p2082ss.ugc.live.sdk.message.interfaces;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.data.Configuration;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;

/* renamed from: com.ss.ugc.live.sdk.message.interfaces.IMessageManager */
public interface IMessageManager {
    static {
        Covode.recordClassIndex(102864);
    }

    void addInterceptor(IInterceptor iInterceptor);

    void addMessageListener(int i, OnMessageListener onMessageListener);

    void addOnInterceptListener(OnInterceptListener onInterceptListener);

    void insertMessage(IMessage iMessage);

    void insertMessage(IMessage iMessage, boolean z);

    void refresh(Configuration configuration);

    void release();

    void removeInterceptor(IInterceptor iInterceptor);

    void removeMessageListener(int i, OnMessageListener onMessageListener);

    void removeMessageListener(OnMessageListener onMessageListener);

    void removeOnInterceptListener(OnInterceptListener onInterceptListener);

    void reset();

    void startMessage();

    void stopMessage(boolean z);
}
