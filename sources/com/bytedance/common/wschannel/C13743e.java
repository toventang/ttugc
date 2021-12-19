package com.bytedance.common.wschannel;

import com.bytedance.common.wschannel.client.C13717c;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.p912b.C13654b;
import com.bytedance.common.wschannel.p912b.EnumC13655c;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.common.wschannel.e */
public final class C13743e implements C13717c.AbstractC13718a {
    static {
        Covode.recordClassIndex(15778);
    }

    @Override // com.bytedance.common.wschannel.client.C13717c.AbstractC13718a
    /* renamed from: b */
    public final void mo22070b(WsChannelMsg wsChannelMsg) {
        C13756k.m24806a(wsChannelMsg.f33475m);
    }

    @Override // com.bytedance.common.wschannel.client.C13717c.AbstractC13718a
    /* renamed from: a */
    public final void mo22069a(WsChannelMsg wsChannelMsg) {
        C13751i a;
        if (wsChannelMsg != null && (a = C13756k.m24806a(wsChannelMsg.f33475m)) != null && a.f33389b != null) {
            a.f33389b.mo21945a(wsChannelMsg);
        }
    }

    @Override // com.bytedance.common.wschannel.client.C13717c.AbstractC13718a
    /* renamed from: a */
    public final void mo22068a(C13654b bVar, JSONObject jSONObject) {
        C13751i a = C13756k.m24806a(bVar.f33174c);
        if (a != null && a.f33389b != null) {
            a.f33389b.mo21944a(bVar, jSONObject);
        }
    }

    @Override // com.bytedance.common.wschannel.client.C13717c.AbstractC13718a
    /* renamed from: a */
    public final void mo22067a(int i, EnumC13655c cVar) {
        C13751i a = C13756k.m24806a(i);
        if (a != null) {
            a.f33393f = cVar;
            if (cVar == EnumC13655c.CONNECT_CLOSED && a.f33394g.get()) {
                C13756k.f33409b.remove(Integer.valueOf(a.f33388a.f33148a));
            }
        }
    }
}
