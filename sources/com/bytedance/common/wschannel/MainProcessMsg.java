package com.bytedance.common.wschannel;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.covode.number.Covode;

final class MainProcessMsg extends WsChannelMsg {

    /* renamed from: a */
    public final WsChannelMsg f33129a;

    /* renamed from: b */
    public final AbstractC13748f f33130b = null;

    static {
        Covode.recordClassIndex(15667);
    }

    MainProcessMsg(WsChannelMsg wsChannelMsg, AbstractC13748f fVar) {
        super(wsChannelMsg);
        this.f33129a = wsChannelMsg;
    }
}
