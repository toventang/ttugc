package com.bytedance.common.wschannel.client;

import android.content.Intent;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.app.AbstractC13651e;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.p912b.C13654b;
import com.bytedance.common.wschannel.p912b.EnumC13655c;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import org.json.JSONObject;

public class WsClientService extends AbstractServiceC13713a {
    static {
        Covode.recordClassIndex(15747);
    }

    @Override // com.bytedance.common.wschannel.client.C13717c.AbstractC13718a
    /* renamed from: b */
    public final void mo22070b(WsChannelMsg wsChannelMsg) {
    }

    @Override // com.bytedance.common.wschannel.client.AbstractServiceC13713a
    public int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    @Override // com.bytedance.common.wschannel.client.AbstractServiceC13713a, com.bytedance.common.wschannel.client.C13717c.AbstractC13718a
    /* renamed from: a */
    public final void mo22069a(WsChannelMsg wsChannelMsg) {
        if (wsChannelMsg != null) {
            try {
                AbstractC13651e listener = WsConstants.getListener(wsChannelMsg.f33475m);
                if (listener != null) {
                    listener.mo21945a(wsChannelMsg);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.common.wschannel.client.C13717c.AbstractC13718a
    /* renamed from: a */
    public final void mo22067a(int i, EnumC13655c cVar) {
        WsConstants.setConnectionState(i, cVar);
    }

    @Override // com.bytedance.common.wschannel.client.C13717c.AbstractC13718a
    /* renamed from: a */
    public final void mo22068a(C13654b bVar, JSONObject jSONObject) {
        AbstractC13651e listener = WsConstants.getListener(bVar.f33174c);
        if (listener != null) {
            listener.mo21944a(bVar, jSONObject);
        }
    }
}
