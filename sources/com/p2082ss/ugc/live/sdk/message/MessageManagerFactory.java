package com.p2082ss.ugc.live.sdk.message;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.data.Configuration;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;

/* renamed from: com.ss.ugc.live.sdk.message.MessageManagerFactory */
public class MessageManagerFactory {
    static {
        Covode.recordClassIndex(102846);
    }

    public static IMessageManager get(Configuration configuration) {
        return new MessageManager(configuration);
    }

    public static IMessageManager getV2(Configuration configuration) {
        return new MessageManagerV2(configuration);
    }
}
