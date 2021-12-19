package com.bytedance.common.wschannel.server;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.C13758l;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.channel.AbstractC13671a;
import com.bytedance.common.wschannel.channel.C13712b;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.p911a.C13645b;
import com.bytedance.common.wschannel.p920d.C13742c;
import com.bytedance.common.wschannel.server.AbstractC13783d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.notice.api.p3514e.C61575ac;
import com.p2082ss.android.ugc.aweme.notice.api.p3514e.C61594p;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* renamed from: com.bytedance.common.wschannel.server.b */
public class C13772b implements WeakHandler.IHandler, AbstractC13783d.AbstractC13784a {

    /* renamed from: a */
    final WeakHandler f33497a;

    /* renamed from: b */
    final Context f33498b;

    /* renamed from: c */
    final Object f33499c = new Object();

    /* renamed from: d */
    public final AbstractC13785e f33500d;

    /* renamed from: e */
    final AbstractC13671a f33501e;

    /* renamed from: f */
    final C13771a f33502f;

    /* renamed from: g */
    AtomicLong f33503g = new AtomicLong(0);

    /* renamed from: h */
    public boolean f33504h = false;

    /* renamed from: i */
    private AbstractC13783d f33505i;

    static {
        Covode.recordClassIndex(15820);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22173a(IWsApp iWsApp) {
        m24835a(this, iWsApp);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo22180b(IWsApp iWsApp) {
        m24838b(this, iWsApp);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo22181b() {
        return this.f33505i.mo22197b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final byte[] mo22179a() {
        String str;
        WsChannelMsg.C13768a a = WsChannelMsg.C13768a.m24830a(Integer.MAX_VALUE);
        a.f33482c = 4;
        a.f33481b = 9000;
        a.f33480a = 1008601;
        a.f33483d = new byte[0];
        a.f33485f = "pb";
        a.f33484e = "pb";
        if (this.f33504h) {
            str = "0";
        } else {
            str = "1";
        }
        return C13645b.f33166a.mo21926a(a.mo22170a("IsBackground", str).mo22171a());
    }

    /* renamed from: a */
    private void m24836a(Runnable runnable) {
        this.f33497a.post(runnable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22174a(final IWsChannelClient iWsChannelClient) {
        this.f33497a.post(new Runnable() {
            /* class com.bytedance.common.wschannel.server.C13772b.RunnableC137753 */

            static {
                Covode.recordClassIndex(15823);
            }

            public final void run() {
                iWsChannelClient.sendMessage(C13772b.this.mo22179a());
            }
        });
    }

    /* renamed from: a */
    private void m24837a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("param_name", str);
        C13742c.m24769a(this.f33498b, "wschannel_param_null", bundle);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        final Message obtain = Message.obtain(message);
        if (message.what == 1 || this.f33505i.mo22197b()) {
            m24836a(new Runnable() {
                /* class com.bytedance.common.wschannel.server.C13772b.RunnableC137742 */

                static {
                    Covode.recordClassIndex(15822);
                }

                /* JADX WARNING: Code restructure failed: missing block: B:106:0x0201, code lost:
                    if (r8 == false) goto L_0x020e;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                    // Method dump skipped, instructions count: 537
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.server.C13772b.RunnableC137742.run():void");
                }
            });
        } else if (message.what == 0) {
            mo22175a("CM_HANDLEMSH_DISABLE", 1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22176a(Collection<IWsChannelClient> collection) {
        if (C13758l.m24811a(this.f33498b).mo22110b()) {
            byte[] a = mo22179a();
            for (IWsChannelClient iWsChannelClient : collection) {
                try {
                    iWsChannelClient.sendMessage(a);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: c */
    private Map<String, Object> m24839c(IWsApp iWsApp) {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("app_key", iWsApp.mo21934h());
        hashMap.put("fpid", Integer.valueOf(iWsApp.mo21935i()));
        hashMap.put("sdk_version", 2);
        hashMap.put("platform", 0);
        hashMap.put("app_version", Integer.valueOf(iWsApp.mo21931e()));
        hashMap.put("aid", Integer.valueOf(iWsApp.mo21928b()));
        hashMap.put("device_id", iWsApp.mo21929c());
        hashMap.put("iid", iWsApp.mo21930d());
        hashMap.put("channel_id", Integer.valueOf(iWsApp.mo21927a()));
        String j = iWsApp.mo21936j();
        if (j == null) {
            m24837a("extra");
            j = "";
        }
        if (C13758l.m24811a(this.f33498b).mo22110b()) {
            String[] split = j.split("&");
            StringBuilder sb = new StringBuilder("is_background=");
            if (this.f33504h) {
                str = "0";
            } else {
                str = "1";
            }
            String sb2 = sb.append(str).toString();
            if (split.length <= 0 || TextUtils.isEmpty(split[0])) {
                j = sb2;
            } else {
                j = j + "&" + sb2;
            }
        }
        hashMap.put("extra", j);
        if (iWsApp.mo21929c() == null) {
            m24837a("device_id");
        }
        if (iWsApp.mo21930d() == null) {
            m24837a("install_id");
        }
        if (C13627m.m24498a(iWsApp.mo21934h())) {
            m24837a("app_key");
        }
        return hashMap;
    }

    /* renamed from: d */
    private void m24840d(IWsApp iWsApp) {
        IWsChannelClient iWsChannelClient;
        MethodCollector.m26663i(12373);
        Logger.debug();
        synchronized (this.f33499c) {
            try {
                iWsChannelClient = this.f33502f.f33495b.get(Integer.valueOf(iWsApp.mo21927a()));
                if (iWsChannelClient == null) {
                    iWsChannelClient = C13712b.m24713a(iWsApp.mo21927a(), this.f33501e, this.f33497a);
                    iWsChannelClient.init(this.f33498b, iWsChannelClient);
                    this.f33502f.f33495b.put(Integer.valueOf(iWsApp.mo21927a()), iWsChannelClient);
                }
            } finally {
                MethodCollector.m26664o(12373);
            }
        }
        int i = 99;
        if (iWsChannelClient.isConnected()) {
            SocketState socketState = this.f33502f.f33496c.get(Integer.valueOf(iWsApp.mo21927a()));
            if (socketState != null) {
                try {
                    this.f33501e.mo21984a(socketState);
                    if (2 == socketState.f33439b) {
                        i = 1;
                    } else if (4 == socketState.f33439b) {
                        i = 0;
                    }
                    mo22175a("CM_TRYOPENCONNECTION_HAS_CONNECT", i);
                } catch (Throwable unused) {
                    MethodCollector.m26664o(12373);
                    return;
                }
            }
            return;
        }
        try {
            Logger.debug();
            iWsChannelClient.openConnection(m24839c(iWsApp), iWsApp.mo21937k());
            mo22175a("CM_TRYOPENCONNECTION_OPEN", 99);
            MethodCollector.m26664o(12373);
        } catch (Throwable unused2) {
            MethodCollector.m26664o(12373);
        }
    }

    /* renamed from: a */
    public final void mo22177a(Map<Integer, IWsApp> map) {
        C13758l a;
        Context context = this.f33498b;
        if ((context == null || (a = C13758l.m24811a(context)) == null || !a.f33414a.mo21919a("key_enable_offline_detect", false) || C13790h.m24889a(this.f33498b)) && this.f33505i.mo22197b() && map != null) {
            for (IWsApp iWsApp : map.values()) {
                if (iWsApp != null) {
                    m24838b(this, iWsApp);
                    mo22175a("CM_TRYCONNECT_DOREGISTER", 98);
                }
            }
        }
    }

    @Override // com.bytedance.common.wschannel.server.AbstractC13783d.AbstractC13784a
    /* renamed from: a */
    public final void mo22178a(boolean z) {
        MethodCollector.m26663i(12496);
        if (z) {
            mo22177a(this.f33500d.mo22198a());
            MethodCollector.m26664o(12496);
            return;
        }
        try {
            synchronized (this.f33499c) {
                try {
                    for (Map.Entry<Integer, IWsChannelClient> entry : this.f33502f.f33495b.entrySet()) {
                        IWsChannelClient value = entry.getValue();
                        if (value != null) {
                            value.destroy();
                        }
                    }
                    this.f33502f.f33495b.clear();
                } catch (Throwable th) {
                    MethodCollector.m26664o(12496);
                    throw th;
                }
            }
            this.f33502f.f33494a.clear();
            MethodCollector.m26664o(12496);
        } catch (Throwable unused) {
            MethodCollector.m26664o(12496);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22175a(String str, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("lp_status", i);
            this.f33501e.mo21986a(str, jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static void m24835a(C13772b bVar, IWsApp iWsApp) {
        MethodCollector.m26663i(12114);
        C61575ac.m111523a("5.2->doOnParamChange");
        Logger.debug();
        int a = WsChannelService.m24833a(iWsApp);
        if (bVar.mo22181b()) {
            try {
                IWsChannelClient iWsChannelClient = bVar.f33502f.f33495b.get(Integer.valueOf(iWsApp.mo21927a()));
                synchronized (WsChannelService.class) {
                    try {
                        IWsApp iWsApp2 = bVar.f33502f.f33494a.get(Integer.valueOf(a));
                        if (iWsChannelClient == null) {
                            bVar.mo22175a("CM_DOONPARAMECHANGE_CLIENT_NULL", 1);
                        } else if (!iWsApp.equals(iWsApp2) || !iWsChannelClient.isConnected()) {
                            bVar.f33502f.f33494a.put(Integer.valueOf(a), iWsApp);
                            bVar.f33500d.mo22199a(bVar.f33502f.f33494a);
                            iWsChannelClient.onParameterChange(bVar.m24839c(iWsApp), iWsApp.mo21937k());
                            bVar.mo22175a("CM_DOONPARAMECHANGE_CHANGE", 99);
                            MethodCollector.m26664o(12114);
                            return;
                        } else {
                            bVar.mo22175a("CM_DOONPARAMECHANGE_HAS_CONNECT", 0);
                        }
                        return;
                    } finally {
                        MethodCollector.m26664o(12114);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        MethodCollector.m26664o(12114);
    }

    /* renamed from: b */
    private static void m24838b(C13772b bVar, IWsApp iWsApp) {
        boolean z;
        MethodCollector.m26663i(12256);
        C61575ac.m111523a("5.0->doRegisterChannel");
        int a = WsChannelService.m24833a(iWsApp);
        boolean z2 = true;
        if (!bVar.mo22181b()) {
            bVar.mo22175a("CM_DOREGISTERCHANNEL_DISABLE", 1);
            MethodCollector.m26664o(12256);
            return;
        }
        synchronized (WsChannelService.class) {
            try {
                IWsApp iWsApp2 = bVar.f33502f.f33494a.get(Integer.valueOf(a));
                IWsChannelClient iWsChannelClient = bVar.f33502f.f33495b.get(Integer.valueOf(a));
                if (iWsApp2 != null) {
                    if (!iWsApp.equals(iWsApp2)) {
                        z = true;
                    } else if (iWsChannelClient != null) {
                        z = false;
                    }
                    z2 = false;
                } else {
                    bVar.f33502f.f33494a.put(Integer.valueOf(a), iWsApp);
                    bVar.f33500d.mo22199a(bVar.f33502f.f33494a);
                }
                z = false;
            } catch (Throwable th) {
                MethodCollector.m26664o(12256);
                throw th;
            }
        }
        if (z2) {
            C61594p.m111543a(iWsApp.mo21936j());
            C61575ac.m111523a("5.1->tryOpenConnection");
            bVar.m24840d(iWsApp);
            MethodCollector.m26664o(12256);
        } else if (z) {
            m24835a(bVar, iWsApp);
            MethodCollector.m26664o(12256);
        } else {
            bVar.mo22175a("CM_DOREGISTERCHANNEL_HAS_CONNECT", 0);
            MethodCollector.m26664o(12256);
        }
    }

    C13772b(Context context, Looper looper, AbstractC13785e eVar, C13771a aVar, AbstractC13671a aVar2, final AbstractC13783d dVar) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f33498b = applicationContext;
        this.f33497a = new WeakHandler(looper, this);
        this.f33500d = eVar;
        this.f33502f = aVar;
        this.f33501e = aVar2;
        this.f33505i = dVar;
        dVar.mo22196a(this);
        m24836a(new Runnable() {
            /* class com.bytedance.common.wschannel.server.C13772b.RunnableC137731 */

            static {
                Covode.recordClassIndex(15821);
            }

            public final void run() {
                dVar.mo22195a();
                C13772b bVar = C13772b.this;
                bVar.mo22177a(bVar.f33500d.mo22198a());
            }
        });
    }
}
