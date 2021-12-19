package com.bytedance.common.wschannel.channel;

import android.content.Context;
import android.os.Handler;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.wschannel.channel.p916a.p917a.C13672a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.common.wschannel.channel.b */
public final class C13712b implements IWsChannelClient {

    /* renamed from: a */
    private static String f33337a = "";

    /* renamed from: h */
    private static boolean f33338h = true;

    /* renamed from: b */
    private final int f33339b;

    /* renamed from: c */
    private final Handler f33340c;

    /* renamed from: d */
    private List<String> f33341d;

    /* renamed from: e */
    private boolean f33342e = true;

    /* renamed from: f */
    private IWsChannelClient f33343f;

    /* renamed from: g */
    private AbstractC13671a f33344g;

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void stopConnection() {
        IWsChannelClient iWsChannelClient = this.f33343f;
        if (iWsChannelClient != null) {
            iWsChannelClient.stopConnection();
        }
    }

    static {
        Covode.recordClassIndex(15746);
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final boolean isConnected() {
        IWsChannelClient iWsChannelClient = this.f33343f;
        if (iWsChannelClient != null) {
            return iWsChannelClient.isConnected();
        }
        return false;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void destroy() {
        String str;
        MethodCollector.m26663i(12319);
        synchronized (this) {
            try {
                IWsChannelClient iWsChannelClient = this.f33343f;
                if (iWsChannelClient != null) {
                    iWsChannelClient.destroy();
                    if (!(this.f33343f instanceof C13672a)) {
                        JSONObject jSONObject = new JSONObject();
                        List<String> list = this.f33341d;
                        if (list == null || list.size() <= 0) {
                            str = "";
                        } else {
                            str = this.f33341d.get(0);
                        }
                        try {
                            jSONObject.put(StringSet.type, 0);
                            jSONObject.put("state", 3);
                            jSONObject.put("url", str);
                            jSONObject.put("channel_type", 1);
                            m24715a(jSONObject);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            } finally {
                MethodCollector.m26664o(12319);
            }
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onAppStateChanged(int i) {
        IWsChannelClient iWsChannelClient = this.f33343f;
        if (iWsChannelClient != null) {
            iWsChannelClient.onAppStateChanged(i);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onNetworkStateChanged(int i) {
        IWsChannelClient iWsChannelClient = this.f33343f;
        if (iWsChannelClient != null) {
            iWsChannelClient.onNetworkStateChanged(i);
        }
    }

    /* renamed from: a */
    private static Class<?> m24714a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onMessage(byte[] bArr) {
        AbstractC13671a aVar = this.f33344g;
        if (aVar != null) {
            aVar.mo21982a(this.f33339b, bArr);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final boolean sendMessage(byte[] bArr) {
        IWsChannelClient iWsChannelClient = this.f33343f;
        if (iWsChannelClient != null) {
            return iWsChannelClient.sendMessage(bArr);
        }
        return false;
    }

    /* renamed from: a */
    private void m24715a(JSONObject jSONObject) {
        AbstractC13671a aVar = this.f33344g;
        if (aVar != null) {
            aVar.mo21983a(this, this.f33339b, jSONObject);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0032 */
    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onConnection(org.json.JSONObject r6) {
        /*
            r5 = this;
            r4 = 10263(0x2817, float:1.4382E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)
            monitor-enter(r5)
            r5.m24715a(r6)     // Catch:{ all -> 0x003c }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0032 }
            r3.<init>()     // Catch:{ Exception -> 0x0032 }
            java.lang.String r0 = "state"
            int r2 = r6.optInt(r0)     // Catch:{ Exception -> 0x0032 }
            r1 = 2
            r0 = 99
            if (r1 != r2) goto L_0x001b
            r1 = 1
            goto L_0x001f
        L_0x001b:
            r0 = 4
            if (r0 != r2) goto L_0x0032
            r1 = 0
        L_0x001f:
            java.lang.String r0 = "lp_status"
            r3.put(r0, r1)     // Catch:{ Exception -> 0x0032 }
            com.bytedance.common.wschannel.channel.a r1 = r5.f33344g     // Catch:{ Exception -> 0x0032 }
            java.lang.String r0 = "WSCHANNEL_CLIENT_ON_CONNECTION"
            r1.mo21986a(r0, r3)     // Catch:{ Exception -> 0x0032 }
            com.bytedance.common.wschannel.d.b r1 = com.bytedance.common.wschannel.p920d.C13740b.C13741a.f33382a     // Catch:{ Exception -> 0x0032 }
            java.lang.String r0 = "LP_WSCHANNEL_CLIENT_ON_CONNECTION_DIRECT"
            r1.mo21943a(r0, r3)     // Catch:{ Exception -> 0x0032 }
        L_0x0032:
            com.bytedance.common.wschannel.d.a r0 = com.bytedance.common.wschannel.p920d.C13738a.C13739a.f33380a     // Catch:{ Exception -> 0x0037 }
            r0.mo21942a(r6)     // Catch:{ Exception -> 0x0037 }
        L_0x0037:
            monitor-exit(r5)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return
        L_0x003c:
            r0 = move-exception
            monitor-exit(r5)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.channel.C13712b.onConnection(org.json.JSONObject):void");
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onParameterChange(Map<String, Object> map, List<String> list) {
        IWsChannelClient iWsChannelClient = this.f33343f;
        if (iWsChannelClient != null) {
            iWsChannelClient.onParameterChange(map, list);
        }
        this.f33341d = list;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void openConnection(Map<String, Object> map, List<String> list) {
        IWsChannelClient iWsChannelClient = this.f33343f;
        if (iWsChannelClient != null) {
            iWsChannelClient.openConnection(map, list);
        }
        this.f33341d = list;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void init(Context context, IWsChannelClient iWsChannelClient) {
        IWsChannelClient iWsChannelClient2 = this.f33343f;
        if (iWsChannelClient2 != null) {
            try {
                iWsChannelClient2.init(context, iWsChannelClient);
            } catch (Throwable th) {
                if (!(this.f33343f instanceof C13672a)) {
                    C13672a aVar = new C13672a(this.f33339b, this.f33340c);
                    this.f33343f = aVar;
                    aVar.init(context, iWsChannelClient);
                    return;
                }
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static C13712b m24713a(int i, AbstractC13671a aVar, Handler handler) {
        return new C13712b(i, aVar, handler);
    }

    private C13712b(int i, AbstractC13671a aVar, Handler handler) {
        Class<?> cls;
        this.f33339b = i;
        this.f33344g = aVar;
        this.f33340c = handler;
        if (f33338h) {
            try {
                if (this.f33343f == null) {
                    if (C13627m.m24498a(f33337a) || (cls = m24714a(f33337a)) == null) {
                        cls = m24714a("org.chromium.wschannel.MySelfChannelImpl");
                        this.f33342e = true;
                        if (cls == null) {
                            cls = m24714a("com.b.c.ws.MySelfChannelImpl");
                            this.f33342e = false;
                            if (cls == null) {
                                throw new ClassNotFoundException("plugin class not found");
                            }
                        }
                    }
                    Object newInstance = cls.newInstance();
                    if (newInstance instanceof IWsChannelClient) {
                        this.f33343f = (IWsChannelClient) newInstance;
                    }
                }
                if (!this.f33342e) {
                    f33338h = false;
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        if (this.f33343f == null) {
            this.f33343f = new C13672a(i, handler);
        }
    }
}
