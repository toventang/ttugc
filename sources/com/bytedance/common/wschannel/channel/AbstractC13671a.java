package com.bytedance.common.wschannel.channel;

import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.common.wschannel.channel.a */
public interface AbstractC13671a {
    static {
        Covode.recordClassIndex(15705);
    }

    /* renamed from: a */
    void mo21981a();

    /* renamed from: a */
    void mo21982a(int i, byte[] bArr);

    /* renamed from: a */
    void mo21983a(IWsChannelClient iWsChannelClient, int i, JSONObject jSONObject);

    /* renamed from: a */
    void mo21984a(SocketState socketState);

    /* renamed from: a */
    void mo21985a(WsChannelMsg wsChannelMsg, boolean z);

    /* renamed from: a */
    void mo21986a(String str, JSONObject jSONObject);

    /* renamed from: b */
    void mo21987b();
}
