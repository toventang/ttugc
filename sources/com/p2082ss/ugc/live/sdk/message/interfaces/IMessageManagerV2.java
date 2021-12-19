package com.p2082ss.ugc.live.sdk.message.interfaces;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.msg.p4471b.AbstractC87079c;
import com.p2082ss.ugc.live.sdk.msg.p4471b.C87081e;

/* renamed from: com.ss.ugc.live.sdk.message.interfaces.IMessageManagerV2 */
public interface IMessageManagerV2 extends IMessageManager {
    static {
        Covode.recordClassIndex(102865);
    }

    boolean isWsConnected();

    void sendRequest(long j, C87081e eVar, AbstractC87079c cVar);
}
