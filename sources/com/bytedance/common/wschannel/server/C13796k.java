package com.bytedance.common.wschannel.server;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.C13607d;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.C13758l;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.channel.AbstractC13671a;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.client.WsClientService;
import com.bytedance.common.wschannel.model.NewMsgTimeHolder;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.p911a.C13645b;
import com.bytedance.common.wschannel.p921e.C13746c;
import com.bytedance.common.wschannel.server.WsChannelService;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.common.wschannel.server.k */
public final class C13796k implements AbstractC13671a {

    /* renamed from: a */
    public static AtomicBoolean f33545a = new AtomicBoolean(true);

    /* renamed from: b */
    final Context f33546b;

    /* renamed from: c */
    final C13771a f33547c;

    /* renamed from: d */
    public C13772b f33548d;

    /* renamed from: e */
    public BlockingQueue<WsChannelService.C13770a> f33549e = new LinkedBlockingQueue();

    /* renamed from: f */
    private final C13776c f33550f;

    /* renamed from: g */
    private final boolean f33551g;

    /* renamed from: h */
    private ExecutorService f33552h;

    /* renamed from: i */
    private Runnable f33553i;

    /* renamed from: j */
    private Future<?> f33554j;

    /* renamed from: e */
    private Runnable m24898e() {
        return new Runnable() {
            /* class com.bytedance.common.wschannel.server.C13796k.RunnableC137971 */

            static {
                Covode.recordClassIndex(15845);
            }

            public final void run() {
                try {
                    Thread.currentThread().setName("MessageDispatcher");
                    while (true) {
                        Thread.currentThread();
                        if (Thread.interrupted()) {
                            break;
                        }
                        C13796k.f33545a.getAndSet(true);
                        WsChannelService.C13770a take = C13796k.this.f33549e.take();
                        try {
                            C13796k kVar = C13796k.this;
                            if (take != null) {
                                if (take.f33492b != null) {
                                    byte[] bArr = take.f33492b;
                                    Logger.debug();
                                    long c = kVar.mo22204c();
                                    WsChannelMsg a = C13645b.f33166a.mo21925a(bArr);
                                    long c2 = kVar.mo22204c();
                                    if (a != WsChannelMsg.f33465c) {
                                        a.f33476n = new NewMsgTimeHolder(take.f33493c, c, c2);
                                        a.f33475m = take.f33491a;
                                        a.f33474l = new ComponentName(kVar.f33546b, WsChannelService.class);
                                        Logger.debug();
                                        if (kVar.f33547c.f33494a != null) {
                                            if (kVar.f33547c.f33494a.size() > 0) {
                                                for (Map.Entry<Integer, IWsApp> entry : kVar.f33547c.f33494a.entrySet()) {
                                                    IWsApp value = entry.getValue();
                                                    if (value != null && value.mo21927a() == a.f33475m) {
                                                        try {
                                                            Intent intent = new Intent();
                                                            intent.setAction("com.bytedance.article.wschannel.receive.payload");
                                                            intent.setComponent(new ComponentName(kVar.f33546b, WsClientService.class));
                                                            intent.putExtra("payload", a);
                                                            kVar.mo22203a(intent);
                                                        } catch (Throwable unused) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                } catch (Throwable unused3) {
                }
                C13796k.f33545a.getAndSet(false);
            }
        };
    }

    @Override // com.bytedance.common.wschannel.channel.AbstractC13671a
    /* renamed from: a */
    public final void mo21981a() {
        this.f33550f.f33512a.mo22186a();
    }

    static {
        Covode.recordClassIndex(15844);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final long mo22204c() {
        if (this.f33551g) {
            return C13746c.m24777a();
        }
        return 0;
    }

    /* renamed from: d */
    private void m24897d() {
        if (this.f33553i == null) {
            this.f33553i = m24898e();
        }
        try {
            this.f33554j = this.f33552h.submit(this.f33553i);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.common.wschannel.channel.AbstractC13671a
    /* renamed from: b */
    public final void mo21987b() {
        try {
            Intent intent = new Intent();
            intent.setAction("com.bytedance.article.wschannel.syncconnectstate");
            intent.setComponent(new ComponentName(this.f33546b, WsClientService.class));
            intent.putParcelableArrayListExtra("connection", new ArrayList<>(this.f33547c.f33496c.values()));
            mo22203a(intent);
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22203a(Intent intent) {
        this.f33550f.mo22185a(intent);
    }

    @Override // com.bytedance.common.wschannel.channel.AbstractC13671a
    /* renamed from: a */
    public final void mo21984a(SocketState socketState) {
        if (socketState != null) {
            this.f33547c.f33496c.put(Integer.valueOf(socketState.f33441d), socketState);
            try {
                Intent intent = new Intent();
                intent.setAction("com.bytedance.article.wschannel.receive.connection");
                intent.setComponent(new ComponentName(this.f33546b, WsClientService.class));
                intent.putExtra("connection", socketState);
                mo22203a(intent);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.common.wschannel.channel.AbstractC13671a
    /* renamed from: a */
    public final void mo21982a(int i, byte[] bArr) {
        if (bArr != null) {
            try {
                this.f33549e.offer(new WsChannelService.C13770a(i, bArr, mo22204c()));
                f33545a.getAndSet(true);
                m24897d();
            } catch (Throwable unused) {
            }
        }
    }

    C13796k(Context context, C13771a aVar) {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        this.f33552h = C40780g.m82242a(a.mo70028a());
        this.f33553i = m24898e();
        this.f33554j = null;
        this.f33546b = context;
        this.f33547c = aVar;
        this.f33550f = new C13776c(context, WsClientService.class);
        this.f33551g = true;
        m24897d();
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName m24896a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.server.C13796k.m24896a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    @Override // com.bytedance.common.wschannel.channel.AbstractC13671a
    /* renamed from: a */
    public final void mo21985a(WsChannelMsg wsChannelMsg, boolean z) {
        ComponentName componentName = wsChannelMsg.f33474l;
        if (componentName != null) {
            try {
                byte[] a = wsChannelMsg.mo22159a();
                if (a == null) {
                    a = new byte[1];
                }
                Intent intent = new Intent();
                intent.setAction("com.bytedance.article.wschannel.send.payload");
                intent.setComponent(componentName);
                intent.putExtra("send_result", z);
                intent.putExtra("payload_md5", C13607d.m24443b(a));
                Logger.debug();
                m24896a(this.f33546b, intent);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.common.wschannel.channel.AbstractC13671a
    /* renamed from: a */
    public final void mo21986a(String str, JSONObject jSONObject) {
        try {
            jSONObject.put("link_progress", str);
            Intent intent = new Intent();
            intent.setAction("com.bytedance.article.wschannel.receive.progress");
            intent.setComponent(new ComponentName(this.f33546b, WsClientService.class));
            intent.putExtra("link_progress", jSONObject.toString());
            mo22203a(intent);
        } catch (Throwable unused) {
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
            if (C13758l.m24811a(this.f33546b).mo22110b()) {
                this.f33548d.mo22174a(iWsChannelClient);
            }
            Logger.debug();
        }
    }
}
