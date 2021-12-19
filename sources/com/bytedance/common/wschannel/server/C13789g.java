package com.bytedance.common.wschannel.server;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.C13743e;
import com.bytedance.common.wschannel.C13758l;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.channel.AbstractC13671a;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.client.C13717c;
import com.bytedance.common.wschannel.model.C13769a;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.p911a.C13645b;
import com.bytedance.common.wschannel.server.WsChannelService;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.common.wschannel.server.g */
public final class C13789g implements AbstractC13671a {

    /* renamed from: a */
    public C13772b f33530a;

    /* renamed from: b */
    private final Context f33531b;

    /* renamed from: c */
    private final C13771a f33532c;

    /* renamed from: d */
    private C13717c.AbstractC13718a f33533d = new C13743e();

    /* renamed from: e */
    private C13717c f33534e = new C13717c(this.f33533d);

    /* renamed from: f */
    private final AtomicInteger f33535f = new AtomicInteger(0);

    static {
        Covode.recordClassIndex(15837);
    }

    @Override // com.bytedance.common.wschannel.channel.AbstractC13671a
    /* renamed from: a */
    public final void mo21981a() {
    }

    @Override // com.bytedance.common.wschannel.channel.AbstractC13671a
    /* renamed from: a */
    public final void mo21986a(String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.common.wschannel.channel.AbstractC13671a
    /* renamed from: b */
    public final void mo21987b() {
        Intent intent = new Intent();
        intent.setAction("com.bytedance.article.wschannel.syncconnectstate");
        intent.putParcelableArrayListExtra("connection", new ArrayList<>(this.f33532c.f33496c.values()));
        this.f33534e.mo22079a(intent, (C13769a) null);
    }

    @Override // com.bytedance.common.wschannel.channel.AbstractC13671a
    /* renamed from: a */
    public final void mo21984a(SocketState socketState) {
        if (socketState != null) {
            this.f33532c.f33496c.put(Integer.valueOf(socketState.f33441d), socketState);
            try {
                Intent intent = new Intent();
                intent.setAction("com.bytedance.article.wschannel.receive.connection");
                intent.putExtra("connection", socketState);
                this.f33534e.mo22079a(intent, (C13769a) null);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.common.wschannel.channel.AbstractC13671a
    /* renamed from: a */
    public final void mo21985a(WsChannelMsg wsChannelMsg, boolean z) {
        this.f33533d.mo22070b(wsChannelMsg);
    }

    C13789g(Context context, C13771a aVar) {
        this.f33531b = context;
        this.f33532c = aVar;
    }

    @Override // com.bytedance.common.wschannel.channel.AbstractC13671a
    /* renamed from: a */
    public final void mo21982a(int i, byte[] bArr) {
        if (bArr != null) {
            WsChannelService.C13770a aVar = new WsChannelService.C13770a(i, bArr, 0);
            if (aVar.f33492b != null) {
                try {
                    byte[] bArr2 = aVar.f33492b;
                    Logger.debug();
                    WsChannelMsg a = C13645b.f33166a.mo21925a(bArr2);
                    if (a != WsChannelMsg.f33465c) {
                        a.f33475m = aVar.f33491a;
                        a.f33474l = new ComponentName(this.f33531b, WsChannelService.class);
                        Logger.debug();
                        if (this.f33532c.f33494a == null) {
                            return;
                        }
                        if (this.f33532c.f33494a.size() > 0) {
                            for (Map.Entry<Integer, IWsApp> entry : this.f33532c.f33494a.entrySet()) {
                                IWsApp value = entry.getValue();
                                if (value != null && value.mo21927a() == a.f33475m) {
                                    Intent intent = new Intent();
                                    intent.setAction("com.bytedance.article.wschannel.receive.payload");
                                    intent.putExtra("payload", a);
                                    if (Logger.debug()) {
                                        intent.putExtra("msg_count", this.f33535f.addAndGet(1));
                                    }
                                    this.f33534e.mo22079a(intent, (C13769a) null);
                                }
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.bytedance.common.wschannel.channel.AbstractC13671a
    /* renamed from: a */
    public final void mo21983a(IWsChannelClient iWsChannelClient, int i, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("channel_id", i);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            mo21984a(SocketState.m24814a(jSONObject));
            if (C13758l.m24811a(this.f33531b).mo22110b()) {
                this.f33530a.mo22174a(iWsChannelClient);
            }
        }
    }
}
