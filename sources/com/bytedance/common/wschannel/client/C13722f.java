package com.bytedance.common.wschannel.client;

import android.content.Intent;
import android.os.Message;
import android.os.Parcelable;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.client.C13717c;
import com.bytedance.common.wschannel.model.C13769a;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.common.wschannel.client.f */
public final class C13722f extends AbstractC13716b {
    static {
        Covode.recordClassIndex(15757);
    }

    public C13722f(C13717c.AbstractC13718a aVar) {
        super(aVar);
    }

    @Override // com.bytedance.common.wschannel.client.AbstractC13719d
    /* renamed from: a */
    public final void mo22079a(Intent intent, C13769a aVar) {
        intent.setExtrasClassLoader(WsChannelMsg.class.getClassLoader());
        WsChannelMsg wsChannelMsg = (WsChannelMsg) intent.getParcelableExtra("payload");
        if (!WsConstants.getOptLogic().mo21946a().booleanValue()) {
            Message message = new Message();
            message.getData().putParcelable("payload", wsChannelMsg);
            message.getData().setClassLoader(WsChannelMsg.class.getClassLoader());
            Parcelable parcelable = message.getData().getParcelable("payload");
            if (parcelable instanceof WsChannelMsg) {
                wsChannelMsg = (WsChannelMsg) parcelable;
            } else {
                return;
            }
        }
        if (wsChannelMsg != null) {
            Logger.debug();
            if (aVar != null) {
                wsChannelMsg.f33477o = aVar.f33490a;
            }
            this.f33354a.mo22069a(wsChannelMsg);
        }
    }
}
